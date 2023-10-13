package com.luv2code.ecommerce.controller;

import com.luv2code.ecommerce.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@CrossOrigin("http://localhost:4200")
public class AddUserController {

        @GetMapping("/user/new")
        public String addNewUser(Model model) {
            model.addAttribute("user", new User());
            return "/user/new";
        }

    }




