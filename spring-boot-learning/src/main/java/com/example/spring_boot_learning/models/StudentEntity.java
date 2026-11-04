package com.example.spring_boot_learning.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class StudentEntity {
    @Id
    @GeneratedValue
    long id;
    String name;
    String rollNo;
    String gender;
    boolean isPassed;
}
