package com.codegym.casestudy.controller;

import com.codegym.casestudy.model.Customer;
import com.codegym.casestudy.service.CustomerService;
import com.codegym.casestudy.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerTypeService customerTypeService;

    @GetMapping
    public String getCustomerPage(Model model, @PageableDefault(value = 5,sort = "customerId",direction = Sort.Direction.DESC) Pageable pageable,
      @RequestParam(value = "inputSearch",defaultValue = "") String inputSearch){
        Page<Customer> customerList;
        if("".equals(inputSearch)){
            customerList=customerService.findAll(pageable);
        }else {
            customerList=customerService.findByNameOrAddressContain(inputSearch,pageable);
        }
        model.addAttribute("customerList",customerList);
        model.addAttribute("inputSearch",inputSearch);
        return "/views/list_customer";
    }

    @GetMapping("/create")
    public String getCreatePage( Model model){

        model.addAttribute("customer",new Customer());
        model.addAttribute("customerTypeList",customerTypeService.findAll());
        return "/views/create_customer";
    }

    @PostMapping("/create")
    public String createNewCustomer(@Validated @ModelAttribute Customer customer , BindingResult bindingResult,Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("customerTypeList",customerTypeService.findAll());
            return "views/create_customer";
        }else {
            customerService.save(customer);
            return "redirect:/customer";
        }

    }

    @PostMapping("/delete")
    public ModelAndView getDeleted(@RequestParam String[] ids, RedirectAttributes redirectAttributes){
        ModelAndView modelAndView = new ModelAndView("redirect:/customer");
        for(String id : ids){
            customerService.remove(id);
        }
        redirectAttributes.addFlashAttribute("ok", "delete done!");
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable String id,Model model){
        customerService.remove(id);
        return "redirect:/customer";
    }

    @GetMapping("/edit/{id}")
    public String editCustomer(@PathVariable String id,Model model){
        model.addAttribute("customer",customerService.findById(id));
        model.addAttribute("customerTypeList",customerTypeService.findAll());
        return "/views/edit_customer";
    }

    @PostMapping("/update")
    public String updateCustomer(@ModelAttribute Customer customer){
        customerService.save(customer);
        return "redirect:/customer";
    }

}
