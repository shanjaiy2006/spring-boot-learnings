package com.example.spring_boot_learning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/student")
@RestController
public class HelloWorldController {
    @GetMapping("/api")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/{id}")
    public String getStudentById(@PathVariable Long id) {
        return "Hii I am Student with id: " + id;
    }

    @GetMapping
    public String searchStudent(@RequestParam(name = "nam") String name) {
        return "Searching student: " + name;
    }

    @PostMapping
    public String addStudent(@RequestBody String body) {
        return body;
    }

}
