package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello") // Base URL: http://localhost:8080/hello
public class HelloController {

    // Default GET request (http://localhost:8080/hello)
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz!";
    }

    // GET request with a query parameter (http://localhost:8080/hello/query?name=Mark)
    @GetMapping("/query")
    public String greetUser(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz!";
    }
}
