package com.codegym.blog.controller;

import com.codegym.blog.model.Account;
import com.codegym.blog.service.AccountService;
import com.codegym.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private BlogService blogService;

    @GetMapping({"/", "/list"})
    public String getHomepage(Model model, @PageableDefault(value = 3,sort = "id",direction = Sort.Direction.DESC) Pageable pageable) {
        model.addAttribute("blogList",blogService.findAll(pageable));
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = passwordEncoder.encode("1");
//        accountService.save(new Account("hai", password, "USER", true));
//        accountService.save(new Account("tea", password, "CREATOR", true));
        return "/views/list";
    }


}
