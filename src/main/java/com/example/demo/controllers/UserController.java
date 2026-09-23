package com.example.demo.controllers;

import com.example.demo.dto.UserDto;
import com.example.demo.services.UtilisateurService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/u")
public class UserController {
    private final UtilisateurService utilisateurService;

    public UserController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @GetMapping("/login")
    public String loginPage(Model model) {
        model.addAttribute("user", new UserDto());
        return "u/login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") UserDto userDto) {
        return "redirect:/";
    }

    @GetMapping("/register")
    public String registerPage(Model model) {
        model.addAttribute("user", new UserDto());
        return "u/register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute("user") UserDto userDto) {
        utilisateurService.addUser(userDto);
        return "redirect:/";
    }
}
