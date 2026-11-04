package com.example.spring_boot_learning;

import com.example.spring_boot_learning.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.spring_boot_learning.models.StudentEntity;

@Component
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentEntity createStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    public StudentEntity getStudentById(Long id) {
        return studentRepository.getReferenceById(id);
    }

}
