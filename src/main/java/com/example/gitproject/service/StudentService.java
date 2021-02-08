package com.example.gitproject.service;

import com.example.gitproject.model.Student;
import com.example.gitproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class StudentService {
    @Autowired
    public StudentRepository studentRepository;
    public Optional<Student> get(int id){
       return( studentRepository.findById(id));
    }
}
