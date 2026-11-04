package com.example.spring_boot_learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_boot_learning.models.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

}
