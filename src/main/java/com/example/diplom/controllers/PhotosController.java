package com.example.diplom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PhotosController {

    @GetMapping("/photos")
    public String history(Model model){
        model.addAttribute("title", "Фотографии");
        return "photos";
    }

}
