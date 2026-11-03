package com.example.spring_boot_learning;

import org.springframework.stereotype.Component;

@Component
public class StudentRepository {
    String getStudents() {
        return "Students Details Fetched";
    }
}
