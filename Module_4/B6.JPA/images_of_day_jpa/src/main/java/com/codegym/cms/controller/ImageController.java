package com.codegym.cms.controller;

import com.codegym.cms.model.Comment;
import com.codegym.cms.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/image")
public class ImageController {

    @Autowired
    private ImageService imageService;

    @GetMapping
    public String getImagePage(Model model) {
        model.addAttribute("comment", new Comment());
        model.addAttribute("comments", imageService.findAll());
        return "/image";
    }

    @PostMapping("/save")
    public String saveComment(Comment comment, Model model) {
        imageService.save(comment);
        model.addAttribute("image", imageService.findAll());
        return "redirect:/image";
    }

    @GetMapping("/{id}/update")
    public String update(@PathVariable Integer id, Model model) {
        Comment comment = imageService.findById(id);
        comment.setLike(comment.getLike() + 1);
        imageService.update(comment);
        model.addAttribute("comments", imageService.findAll());
        return "redirect:/image";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Integer id,Model model){
        imageService.remove(id);
        model.addAttribute("comments",imageService.findAll());
        return "redirect:/image";
    }
}
