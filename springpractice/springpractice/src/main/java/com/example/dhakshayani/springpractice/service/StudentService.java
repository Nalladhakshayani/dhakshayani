package com.example.dhakshayani.springpractice.service;

import com.example.dhakshayani.springpractice.entity.Student;
import com.example.dhakshayani.springpractice.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student saveDetails(Student student){
        return studentRepository.save(student);
    }

    public String deleteDetails(int id){

         studentRepository.deleteById(id);
         return "deleted";
    }
    public Student getStudentDetailsById(int id)
    {
         return studentRepository.findById(id).orElse(null);
    }
    public Student updateDetails(Student student)
    {

        Student updatestudent= studentRepository.findById(student.getId()).orElse(null);
        if(updatestudent!=null)
        {
            updatestudent.setMarks(student.getMarks());
            updatestudent.setName(student.getName());
            studentRepository.save(updatestudent);
            return updatestudent;
        }
        return null;
    }
}
