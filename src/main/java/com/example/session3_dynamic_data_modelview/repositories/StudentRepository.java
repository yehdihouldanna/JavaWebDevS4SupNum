package com.example.session3_dynamic_data_modelview.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.session3_dynamic_data_modelview.models.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    
}
