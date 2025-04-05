package com.example.session3_dynamic_data_modelview.Dto;

import com.example.session3_dynamic_data_modelview.models.Student;

public class StudentDto {
    
    private int matricule;

    private String nom;
    private String classe;

    private int age; 

    public StudentDto(){
        
    }

    public StudentDto(Student student) {
        this.matricule = student.getMatricule();
        this.nom = student.getNom();
        this.classe = student.getClasse();
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
}
