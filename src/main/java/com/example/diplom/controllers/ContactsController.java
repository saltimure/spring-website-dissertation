package com.example.diplom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactsController {
    @GetMapping("/contacts")
    public String conctacts(Model model){
        model.addAttribute("title", "Контакты");
        return "contacts";
    }
}
