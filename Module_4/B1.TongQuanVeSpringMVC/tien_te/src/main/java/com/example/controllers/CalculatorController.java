package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping({"","/calculator"})
public class CalculatorController {


    @GetMapping()
    public String calculator() {
        return "calculator";
    }

    @PostMapping()
    public String callCalculator(@RequestParam double usd, double tigia, Model model) {
        double vnd = usd * tigia;
        model.addAttribute("vnd",vnd);
        model.addAttribute("usd",usd);
        return "calculator";
    }

}
