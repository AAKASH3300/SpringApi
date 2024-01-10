package com.api.demo.Controller;

import com.api.demo.Entity.Student;
import com.api.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student postDetails(@RequestBody Student student){

        return studentService.saveDetails(student);
    }

    @GetMapping("/getStudent/{id}")
    public Student getDetails(@PathVariable int id){

        return  studentService.getStudentDetailsById(id);
    }

    @GetMapping("/getDetails")
    public List<Student> getDetails(Student student){

        return studentService.getAllDetails();
    }
}
