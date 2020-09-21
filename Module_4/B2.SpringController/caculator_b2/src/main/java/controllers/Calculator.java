package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping({"","/calculator"})
public class Calculator {
    @GetMapping
    public String showCalculator(){
        return "/calculator";
    }

    @PostMapping
    public String calculate(@RequestParam int param1, int param2, String calculation, Model model){
        int result;
      switch (calculation){
          case "add": {
              result = param1 + param2;
              model.addAttribute("result",result);
              model.addAttribute("param1",param1);
              model.addAttribute("param2",param2);
              model.addAttribute("calculation",calculation);
              break;
          }
          case "sub": {
              result = param1 - param2;
              model.addAttribute("result",result);
              model.addAttribute("param1",param1);
              model.addAttribute("param2",param2);
              model.addAttribute("calculation",calculation);
              break;
          }
          case "mul": {
              result = param1 * param2;
              model.addAttribute("result",result);
              model.addAttribute("param1",param1);
              model.addAttribute("param2",param2);
              model.addAttribute("calculation",calculation);
              break;
          }
          case "div": {
              result = param1 / param2;
              model.addAttribute("result",result);
              model.addAttribute("param1",param1);
              model.addAttribute("param2",param2);
              model.addAttribute("calculation",calculation);
              break;
          }
      }
      return "/calculator";
    }
}
