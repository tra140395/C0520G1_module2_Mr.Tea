package com.codegym.demo.controller;
import com.codegym.demo.model.Blog;
import com.codegym.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("")
    public String getBlogPage(Model model, @PageableDefault(value = 3,sort = "id",direction = Sort.Direction.DESC)Pageable pageable){
        model.addAttribute("blogList",blogService.findAll(pageable));
        return "/views/list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("blog",new Blog());
        return "/views/create";
    }

    @PostMapping("/create")
    public String createNewBlog(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("ok","Done!");
        return "redirect:/blog";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("/views/edit");
        modelAndView.addObject("blog",new Blog());
        modelAndView.addObject("blog",blogService.findById(id));
        return modelAndView;
    }

    @PostMapping("/edit")
    public String editBlog(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("ok","done!");
        return "redirect:/blog";
    }

    @GetMapping("/show/{id}")
    public String showContentBlog(@PathVariable int id,Model model){
        model.addAttribute("blog", blogService.findById(id));
        return "/views/show";
    }

    @PostMapping("/delete")
    public ModelAndView getDeleted(@RequestParam int[] ids, RedirectAttributes redirectAttributes){
        ModelAndView modelAndView = new ModelAndView("redirect:/blog");
        for(Integer id : ids){
            blogService.remove(id);
        }
        redirectAttributes.addFlashAttribute("ok", "delete done!");
        return modelAndView;
    }

}
