package com.example.session3_dynamic_data_modelview.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.session3_dynamic_data_modelview.models.Student;



public interface StudentRepository extends JpaRepository<Student, Integer> {

    public Student findByMatricule(int matricule); 

    // @Query("SELECT s FROM Student s WHERE s.matricule = ?1")
    // public Student myMethod(int matricule);

    public List<Student> findAllByNom(String name);

    @Query("SELECT s FROM Student s WHERE LOWER(s.nom) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<Student> searchByName(@Param("name") String name);


    
}
