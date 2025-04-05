package com.example.session3_dynamic_data_modelview.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.session3_dynamic_data_modelview.Dto.StudentDto;
import com.example.session3_dynamic_data_modelview.models.Student;
import com.example.session3_dynamic_data_modelview.repositories.StudentRepository;


@Service
public class StudentService {
    
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

    public Student updateStudent(int matricule, Student data) {
        Student s = repository.findByMatricule(matricule);

        String newName = data.getNom();
        if ( newName != null) {
            s.setNom(newName);
        }

        String newClasse = data.getClasse();
        if ( newClasse != null) {
            s.setClasse(newClasse);
        }

        repository.save(s);
        return s;

    }

    public String deleteStudent(int matricule) {
        Student student = repository.findByMatricule(matricule);
        repository.delete(student);
        return "Student with matricule : " + matricule + " deleted";
    }

    public List<Student> findStudents(String name) {
            
        List<Student> students =repository.findAllByNom(name);
        return students;
            
    }

    public StudentDto getStudentDto(int matricule) {
        // get student,
    
        // calcul d'age;
        // dob, (date)
        // date du jour
        //age = today - dob

        Student student = repository.findByMatricule(matricule);

        try {
            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        
            Date dobDate = dateFormatter.parse(student.getDob());
            Date todayDate = new Date();

            long diffInMillies = Math.abs(todayDate.getTime() - dobDate.getTime());
            long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

            int age = (int)(diff/365.25);

            StudentDto dto = new StudentDto(student);
            dto.setAge(age);
            return dto;
        } catch (Exception e) {
        }

        return null;
    }





}