package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/yourcourses")
public class YourCoursesController {

    @GetMapping
    public String getYourCoursesPage(Model model) {
        model.addAttribute("bodyContent", "yourcourses");
        return "master-template";
    }

}
