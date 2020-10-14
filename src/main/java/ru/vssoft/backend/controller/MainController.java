package ru.vssoft.backend.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Value("${application.profile}")
    private String profile;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("isDev", "dev".equals(profile));
        return "index";
    }
    
}