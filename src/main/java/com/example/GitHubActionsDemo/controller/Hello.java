package com.example.GitHubActionsDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Hello {

    @GetMapping("/test")
    public String Test(){
        return "Say Hello to java world";
    }
}
