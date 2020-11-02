package com.codegym.test.controller;

import com.codegym.test.model.Product;
import com.codegym.test.service.ProductService;
import com.codegym.test.service.ProductTypeService;
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
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    ProductTypeService productTypeService;

    @GetMapping
    public String getCustomerPage(Model model, @PageableDefault(value = 3, sort = "idProduct", direction = Sort.Direction.DESC)
            Pageable pageable, @RequestParam(value = "inputSearch",defaultValue = "") String inputSearch) {
        Page<Product> productList;
        if("".equals(inputSearch)){
            productList = productService.findAll(pageable);
        }else {
            productList = productService.findByName(inputSearch,pageable);
        }
        model.addAttribute("productList",productList);
        model.addAttribute("inputSearch",inputSearch);
        return "/views/list_product";
    }

    @PostMapping("/delete")
    public ModelAndView getDeleted(@RequestParam int[] ids, RedirectAttributes redirectAttributes) {
        ModelAndView modelAndView = new ModelAndView("redirect:/product");
        for (int id : ids) {
            productService.remove(id);
        }
        redirectAttributes.addFlashAttribute("ok", "delete done!");
        return modelAndView;
    }

    @GetMapping("/create")
    public String getCreatePage( Model model){

        model.addAttribute("product",new Product());
        model.addAttribute("productTypeList",productTypeService.findAll());
        return "/views/create_product";
    }

    @PostMapping("/create")
    public String createNewCustomer(@Validated @ModelAttribute Product product , BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("productTypeList",productTypeService.findAll());
            return "views/create_product";
        }else {
            productService.save(product);
            return "redirect:/product";
        }

    }
}
