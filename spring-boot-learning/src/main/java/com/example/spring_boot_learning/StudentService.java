package com.example.spring_boot_learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String getStudentDetails() {
        return studentRepository.getStudents();
    }

}
