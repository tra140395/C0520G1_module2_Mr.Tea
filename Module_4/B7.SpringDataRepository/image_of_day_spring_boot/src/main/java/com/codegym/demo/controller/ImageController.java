package com.codegym.demo.controller;
import com.codegym.demo.model.Comment;
import com.codegym.demo.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
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

    @GetMapping("")
    public String getImagePage(Model model, @PageableDefault(value = 3, sort = "id" ,direction = Sort.Direction.DESC) Pageable pageable) {
        model.addAttribute("comment", new Comment());
        model.addAttribute("comments", imageService.findAll(pageable));
        return "views/image";
    }

    @PostMapping("/save")
    public String saveComment(Comment comment) {
        imageService.save(comment);
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
    public String delete(@PathVariable Integer id, Model model){
        imageService.remove(id);
        model.addAttribute("comments",imageService.findAll());
        return "redirect:/image";
    }
}
