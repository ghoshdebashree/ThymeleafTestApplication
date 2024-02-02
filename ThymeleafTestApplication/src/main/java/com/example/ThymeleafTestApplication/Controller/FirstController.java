package com.example.ThymeleafTestApplication.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class FirstController {

    @GetMapping("/hello")
    public String index(Model model){
        model.addAttribute("pageTitle", "ThymeLeaf Introduction");
        model.addAttribute("message","Hello Thymeleaf !!");
       return "index";
    }
}
