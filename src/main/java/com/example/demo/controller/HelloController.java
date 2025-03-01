package com.example.demo.controller;
import com.example.demo.UserDTO;

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
    public String greetUserByQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz!";
    }

    @GetMapping("/param/{name}")
    public String greetUserByPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz!";
    }
    @PostMapping("/post")
    public String greetUserByPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!";
    }
}
