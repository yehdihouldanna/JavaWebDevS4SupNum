package com.example.session3_dynamic_data_modelview.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.session3_dynamic_data_modelview.models.Student;
import com.example.session3_dynamic_data_modelview.repositories.StudentRepo;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepo repo;

    public List<Student> getStudents() {
        return repo.getStudents();
      }
}
