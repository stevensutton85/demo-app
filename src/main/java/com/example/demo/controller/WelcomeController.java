package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class WelcomeController {
    @GetMapping("/hello")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    @GetMapping("/")
    public String welcome() {
        return "Welcome to Spring Boot!1";
    }

}
