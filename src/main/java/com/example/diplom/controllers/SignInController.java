package com.example.diplom.controllers;

import com.example.diplom.database.User;
import com.example.diplom.database.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignInController {

    @Autowired
    private UserRepository repo;

    @GetMapping("/signin")
    public String signin(Model model){
        model.addAttribute("user",new User());
        return "signin";
    }

    @PostMapping("/process_register")
    public String processRgistration(User user) {
        repo.save(user);
        return "reg_success";
    }
}
