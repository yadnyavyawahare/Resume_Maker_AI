package com.example.resume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.resume.model.Resume;
import com.example.resume.service.ResumeService;


@Controller
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("resume", new Resume());
        return "index";
    }

    @PostMapping("/generate")
    public String generate(@ModelAttribute Resume resume, Model model) {
        resumeService.save(resume);
        model.addAttribute("resume", resume);
        return "resume";
    }
}