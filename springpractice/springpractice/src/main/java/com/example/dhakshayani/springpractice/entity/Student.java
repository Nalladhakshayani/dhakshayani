package com.example.dhakshayani.springpractice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name ="student_table")
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @Column(name ="ID")
    @GeneratedValue
    private int id;

    @Column(name ="NAME")
    private String name;

    @Column(name= "MARKS")
    private int marks;



}
