package com.example.gitproject.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = SEQUENCE)
    int id;
}
