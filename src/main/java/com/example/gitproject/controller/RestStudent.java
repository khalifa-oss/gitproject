package com.example.gitproject.controller;

import com.example.gitproject.model.Student;
import com.example.gitproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/save")
    public void create(@RequestBody Student student){
        studentService.save(student);
    }
}
