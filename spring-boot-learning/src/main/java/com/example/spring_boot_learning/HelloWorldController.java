package com.example.spring_boot_learning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/api")
    public String sayHello() {
        return "Hello World";
    }
}
