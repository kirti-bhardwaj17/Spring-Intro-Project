package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") // Base URL: http://localhost:8080/hello
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz!";
    }
}
