package com.codegym.casestudy.controller;

import com.codegym.casestudy.model.Employee;
import com.codegym.casestudy.service.DivisionService;
import com.codegym.casestudy.service.EducationDegreeService;
import com.codegym.casestudy.service.EmployeeService;
import com.codegym.casestudy.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @Autowired
    PositionService positionService;
    @Autowired
    DivisionService divisionService;
    @Autowired
    EducationDegreeService educationDegreeService;

    @GetMapping()
    public String getEmployeePage(Model model, @PageableDefault(value = 3) Pageable pageable,
                                  @RequestParam(value = "inputSearch",defaultValue = "") String inputSearch){
        Page<Employee> employeeList;
        if("".equals(inputSearch)){
            employeeList = employeeService.findAll(pageable);
        }else {
            employeeList = employeeService.findByNameOrBirthdayContaining(inputSearch,pageable);
        }
        model.addAttribute("employeeList",employeeList);
        model.addAttribute("inputSearch",inputSearch);
        return "/views/list_employee";
    }

    @GetMapping("/create")
    public String getCreatePage(Model model){
        model.addAttribute("employee",new Employee());
        model.addAttribute("divisionList",divisionService.findAll());
        model.addAttribute("positionList",positionService.findAll());
        model.addAttribute("educationDegreeList",educationDegreeService.findAll());
        return "/views/create_employee";
    }

    @PostMapping("/create")
    public String createNewEmployee(@ModelAttribute Employee employee){
        employeeService.save(employee);
        return "redirect:/employee";
    }

    @PostMapping("/delete")
    public ModelAndView getDeleted(@RequestParam int[] ids, RedirectAttributes redirectAttributes){
        ModelAndView modelAndView = new ModelAndView("redirect:/employee");
        for(Integer id : ids){
            employeeService.remove(id);
        }
        redirectAttributes.addFlashAttribute("ok", "delete done!");
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public String editEmployee(@PathVariable int id,Model model){
        model.addAttribute("employee",employeeService.findById(id));
        model.addAttribute("divisionList",divisionService.findAll());
        model.addAttribute("positionList",positionService.findAll());
        model.addAttribute("educationDegreeList",educationDegreeService.findAll());
        return "/views/edit_employee";
    }

    @PostMapping("/update")
    public String updateCustomer(@ModelAttribute Employee employee){
        employeeService.save(employee);
        return "redirect:/employee";
    }

}
