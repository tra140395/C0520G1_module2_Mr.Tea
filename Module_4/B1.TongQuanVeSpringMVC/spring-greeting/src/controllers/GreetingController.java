package controllers;

import model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam String name, Model model) {
        model.addAttribute("name",name);
        return "index";
    }

    @GetMapping("/hello2")
    public String getHelloPage1(Model model){
        model.addAttribute("name","hai");
        return "hello";
    }

    @GetMapping("/hello3")
    public String getHelloPage2(ModelMap modelMap){
        modelMap.addAttribute("name","Hai");
        modelMap.addAttribute("age","18");
        return "hello";
    }

    @GetMapping("/hello4")
    public ModelAndView getHelloPage3(){
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("name","hai");
        modelAndView.addObject("age","20");
        return modelAndView;
    }
    @GetMapping("/hello5")
    public ModelAndView getHelloPage4() {
        return new ModelAndView("hello","student",new Student("hai",90));
    }
}
