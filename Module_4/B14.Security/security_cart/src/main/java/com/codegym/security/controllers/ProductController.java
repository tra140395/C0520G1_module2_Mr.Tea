package com.codegym.security.controllers;

import com.codegym.security.model.Account;
import com.codegym.security.model.Product;
import com.codegym.security.service.AccountService;
import com.codegym.security.service.Impl.UserDetailServiceImpl;
import com.codegym.security.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping()
public class ProductController {
    @Autowired
    UserDetailsService userDetailServiceImp;
    @Autowired
    ProductService productService;

    @Autowired
    private AccountService accountService;

    @GetMapping({"/", "/product"})
    public ModelAndView showListPage() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = passwordEncoder.encode("1");
        accountService.save(new Account("a", password, "USER", true));
        accountService.save(new Account("b", password, "CREATOR", true));
        return new ModelAndView("product/list","productList",productService.findAll());
    }

//    @GetMapping
//    public ModelAndView showListPage(){
//        return new ModelAndView("product/list","productList",productService.findAll());
//    }

    @GetMapping("/detail/{id}")
    public ModelAndView showDetailPage(@PathVariable long id){
        return new ModelAndView("product/detail","product",productService.findById(id));
    }

    @GetMapping("/create")
    public ModelAndView showCreatePage(){
        return new ModelAndView("product/create", "product", new Product());
    }

    @PostMapping("/create")
    public String createProduct(@ModelAttribute Product product, RedirectAttributes redirectAttributes){
        productService.save(product);
        redirectAttributes.addFlashAttribute("success","Create new product name: " + product.getName());
        return "redirect:/product";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable long id){
        productService.removeById(id);
        return "redirect:/product";
    }
}
