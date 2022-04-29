package com.example.demo.web.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping({"/courses", "/"})
public class CoursesController {

    @GetMapping
    public String getCoursesPage(Model model) {
        model.addAttribute("bodyContent", "courses");
        return "master-template";
    }
}