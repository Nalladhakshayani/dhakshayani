package com.example.dhakshayani.springpractice.repository;

import com.example.dhakshayani.springpractice.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Integer>{
}
