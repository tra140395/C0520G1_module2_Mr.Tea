package com.codegym.casestudy.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller")
public class FuramaController {

    @GetMapping("")
    public String getHomePage(){
        return "/views/home";
    }

}
