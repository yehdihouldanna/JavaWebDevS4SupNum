package com.example.session3_dynamic_data_modelview.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.session3_dynamic_data_modelview.Dto.StudentDto;
import com.example.session3_dynamic_data_modelview.models.Student;
import com.example.session3_dynamic_data_modelview.services.StudentService;


// @Controller
@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return service.getStudents();
    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    @GetMapping("/student/{matricule}")
    public Student getStudent(@PathVariable int matricule) {
        return service.getStudent(matricule);
    }

    @PutMapping("updateStudent/{matricule}")
    public Student updateStudent(@PathVariable int matricule, @RequestBody Student student) {
        return service.updateStudent(matricule, student);
    }

    @DeleteMapping("deleteStudent/{matricule}")
    public String deleteStudent(@PathVariable int matricule) {
        return service.deleteStudent(matricule);
    }

    @GetMapping("findStudents/{name}")
    public List<Student> findStudents(@PathVariable String name) {
        return service.findStudents(name);
    }

    @GetMapping("/student_with_age/{matricule}")
    public StudentDto getStudentDto(@PathVariable int matricule) {
        return service.getStudentDto(matricule);
    }
    
    // @PostMapping("/addStudent")
    // public Student addStudent(@RequestBody Student student) {
    //     return service.addStudent(student);
    //     // return student ;
    // }
}
