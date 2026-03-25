package com.practice.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private studentService studentService;
    @GetMapping("/students")
    public List<students> getStudents(){
        return studentService.getStudents();
    }
    @GetMapping("/students/{StuId}")
    public students getStudentById(@PathVariable int StuId) {
        return studentService.getStudentById(StuId);
    }

    @PostMapping("/students")
    public void addStudents(@RequestBody students student){
        studentService.addStudents(student);
    }
    @PutMapping("/students")
    public void updateStudent(@RequestBody students student){
        studentService.updateStudent(student);
    }
    @DeleteMapping("/students/{StuId}")
    public String deleteStudent(@PathVariable int StuId){
        return studentService.deleteStudent(StuId);
    }
}
