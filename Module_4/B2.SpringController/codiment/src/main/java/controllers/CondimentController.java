package controllers;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping({"","/condiment"})
public class CondimentController {

    @GetMapping
    public String showChoiceForm(){
        return "/condiment/choice";
    }

    @PostMapping("/save")
    public String save(HttpServletRequest request, Model model){
        String[] s = request.getParameterValues("condiment");
        String b = "";
        for (String a:s) {
           b = b +" "+ a;
        }
        model.addAttribute("condiment",b);
        return "/condiment/showChoice";
    }

}
