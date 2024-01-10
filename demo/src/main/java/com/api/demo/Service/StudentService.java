package com.api.demo.Service;

import com.api.demo.Entity.Student;
import com.api.demo.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student saveDetails(Student student){

        return studentRepo.save(student);
    }

    public Student getStudentDetailsById(int id){

        return  studentRepo.findById(id).orElse(null);

    }

    public List<Student> getAllDetails(){

        return studentRepo.findAll();
    }
}
