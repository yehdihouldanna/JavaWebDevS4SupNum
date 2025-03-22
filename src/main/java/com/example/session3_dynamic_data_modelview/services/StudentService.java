package com.example.session3_dynamic_data_modelview.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.session3_dynamic_data_modelview.models.Student;
import com.example.session3_dynamic_data_modelview.repositories.StudentRepo;
import com.example.session3_dynamic_data_modelview.repositories.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    
    @Autowired
    private StudentRepository repository;

    public List<Student> getStudents() {
        //return repo.getStudents();
        return repository.findAll();
        
    }

    public Student addStudent(Student student) {
        //return repo.addStudent(student);
        return repository.save(student);
    }

    public Student getStudent(int matricule) {
        return repository.findByMatricule(matricule);
        
    }



    

        

        


    
}
