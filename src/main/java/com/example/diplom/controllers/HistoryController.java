package com.example.diplom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HistoryController {

    @GetMapping("/history")
    public String history(Model model){
        model.addAttribute("title", "История школы");
        return "history";
    }

}