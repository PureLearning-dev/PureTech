package com.purelearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello and welcome to Spring Boot!";
    }

    @GetMapping("/api/status")
    public String status() {
        return "Application is running...";
    }
}

