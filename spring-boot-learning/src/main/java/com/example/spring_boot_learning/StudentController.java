package com.example.spring_boot_learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.micrometer.observation.autoconfigure.ObservationProperties.Http;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_boot_learning.models.StudentEntity;

import io.micrometer.core.ipc.http.HttpSender.Response;

@RequestMapping("/student")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public ResponseEntity<StudentEntity> createStudent(@RequestBody StudentEntity studentEntity) {
        return new ResponseEntity<>(studentService.createStudent(studentEntity), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentEntity> getStudentById(@PathVariable Long id) {
        return new ResponseEntity<>(studentService.getStudentById(id), HttpStatus.OK);
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
