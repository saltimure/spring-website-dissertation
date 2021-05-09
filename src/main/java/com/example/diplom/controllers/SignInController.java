package com.example.diplom.controllers;

import com.example.diplom.database.User;
import com.example.diplom.database.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        repo.save(user);
        return "reg_success";
    }

    @Controller
    public class UsersController {
        @GetMapping("/list_users")
        public String viewUserList(Model model) {
            List<User> listUsers = repo.findAll();
            model.addAttribute("listUsers", listUsers);
            return "users";
        }
    }

}
