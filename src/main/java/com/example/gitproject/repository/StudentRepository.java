package com.example.gitproject.repository;

import com.example.gitproject.model.Student;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    Optional<Student> findById(int id);
}
