package com.example.gitproject.controller;

import com.example.gitproject.model.Student;
import com.example.gitproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/student")
public class RestStudent {
    @Autowired
    public StudentService studentService;

    @GetMapping("/get/{id}")
    public Optional<Student> getone(@PathVariable int id) {
        return studentService.get(id);
    }
}
