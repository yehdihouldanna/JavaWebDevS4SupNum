package com.example.session3_dynamic_data_modelview.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.session3_dynamic_data_modelview.models.Student;

@Repository
public class StudentRepo {

    public List<Student> students = new ArrayList<>();


    public StudentRepo() {
        this.students.add(new Student("Mohamed", "S4", 250001));
        this.students.add(new Student("Ahmed", "S4", 250002));
        this.students.add(new Student("Mariem", "S4", 250003));
        this.students.add(new Student("Amadou", "S4", 250004));
        this.students.add(new Student("Fatma", "S4", 250005));

        for (Student student : students){
            System.out.print(student);
        }
    }


    public List<Student> getStudents() {
        return this.students;
    }

}
