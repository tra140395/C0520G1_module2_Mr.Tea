package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import com.codegym.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
public class ProductController {

    ProductService productService = new ProductServiceImpl();

    @GetMapping("/")
    public String showList(Model model){
        model.addAttribute("products",productService.findAll());
        return "/list_product";
    }

    @GetMapping("/product/create")
    public String showCreateForm(Model model){
        model.addAttribute("product",new Product());
        return "/create";
    }

    @PostMapping("/product/save")
    public String save(Product product, RedirectAttributes redirectAttributes){
        product.setId((int)(Math.random()*1000));
        productService.save(product);
        redirectAttributes.addFlashAttribute("success","done!");
        return "redirect:/";
    }

    @GetMapping("/product/{id}/edit")
    public String showEditForm(@PathVariable int id,Model model){
        model.addAttribute("product",productService.findById(id));
        return "/edit";
    }

    @PostMapping("/product/update")
    public String update(Product product, RedirectAttributes redirectAttributes){
        productService.update(product.getId(),product);
        redirectAttributes.addFlashAttribute("success","done!");
        return "redirect:/";
    }

    @GetMapping("/product/{id}/delete")
    public String showDeleteForm(@PathVariable int id, Model model){
        model.addAttribute("product",productService.findById(id));
        return "/delete";
    }

    @PostMapping("/product/delete")
    public String delete(Product product,RedirectAttributes redirectAttributes){
        productService.remove(product.getId());
        redirectAttributes.addFlashAttribute("success","done!");
        return "redirect:/";
    }

    @GetMapping("/product/{id}/view")
    public String showViewForm(@PathVariable int id, Model model){
        model.addAttribute("product",productService.findById(id));
        return "/view";
    }

}
