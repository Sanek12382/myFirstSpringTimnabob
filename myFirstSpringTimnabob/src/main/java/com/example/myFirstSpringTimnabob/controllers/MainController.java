package com.example.myFirstSpringTimnabob.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String home( Model model) {
        model.addAttribute("title", "Main Page");
        return "home";
    }

    @GetMapping("/images")
    public String images( Model model) {
        model.addAttribute("title", "Images");
        return "images";
    }

    @GetMapping("/download")
    public String download( Model model) {
        model.addAttribute("title", "Download");
        return "download";
    }



    @GetMapping("/videos")
    public String videos( Model model) {
        model.addAttribute("title", "Videos");
        return "videos";
    }
}