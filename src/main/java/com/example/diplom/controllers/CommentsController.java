package com.example.diplom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommentsController {
    @GetMapping("/comments")
    public String comments(Model model){
        model.addAttribute("title", "Комментарии");
        return "comments";
    }
}