package com.codegym.controller;

import com.codegym.model.MailBox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mail")
public class MailBoxController {

    @GetMapping
    public String getMailPage(Model model){
       model.addAttribute("mail_box",new MailBox());
       List<String> languages = new ArrayList<>();
       languages.add("Vietnamese");
       languages.add("Chinese");
       languages.add("Japanese");
       languages.add("Laos");
       model.addAttribute("languages",languages);
       List<Integer> sizeList = new ArrayList<>();
       sizeList.add(5);
       sizeList.add(10);
       sizeList.add(15);
       sizeList.add(25);
       sizeList.add(50);
       model.addAttribute("sizeList",sizeList);
       return "/mail_box";
    }

    @PostMapping
   public String getUpdate(@ModelAttribute MailBox mailBox,Model model){
       model.addAttribute("mail_box",mailBox);
        List<String> languages = new ArrayList<>();
        languages.add("Vietnamese");
        languages.add("Chinese");
        languages.add("Japanese");
        languages.add("Laos");
        model.addAttribute("languages",languages);
        List<Integer> sizeList = new ArrayList<>();
        sizeList.add(5);
        sizeList.add(10);
        sizeList.add(15);
        sizeList.add(25);
        sizeList.add(50);
        model.addAttribute("sizeList",sizeList);
       return "/mail_box";
    }

}
