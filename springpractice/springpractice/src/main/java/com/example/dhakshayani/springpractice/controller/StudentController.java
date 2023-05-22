package com.example.dhakshayani.springpractice.controller;

import com.example.dhakshayani.springpractice.entity.Student;
import com.example.dhakshayani.springpractice.repository.StudentRepository;
import com.example.dhakshayani.springpractice.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;
//    @Autowired
//    private StudentRepository studentRepository;

    @GetMapping("/getallstudents")
    public List<Student> getStudents(){
        return studentService.getAllStudents();
    }
    @PostMapping("/addstudent")
    public Student addPostDetailes(@RequestBody Student student){
        return studentService.saveDetails(student);
    }
    @DeleteMapping("/deletestudent/{id}")
    public String deleteStudent(@PathVariable int id){
        return studentService.deleteDetails(id);
    }
    @GetMapping("/getstudentbyid/{id}")
    public Student getStudentById(@PathVariable int id)
    {
        return studentService.getStudentDetailsById(id);
    }
    @PutMapping("/updatestudent")
    public Student updateDetailes(@RequestBody Student student){
        return studentService.updateDetails(student);
    }
}
