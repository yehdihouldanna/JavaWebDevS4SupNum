package com.example.session3_dynamic_data_modelview.models;

import org.springframework.stereotype.Component;

@Component
public class Student {
    
    private String nom;
    private String classe;
    private int matricule;
    
    public Student(){
        
    }

    public Student(String nom, String classe, int matricule) {
        this.nom = nom;
        this.classe = classe;
        this.matricule = matricule;
    }
    // public Student(Student student) {
    //     this.nom = student.getNom();
    //     this.classe = student.getClasse();
    //     this.matricule = student.getMatricule();
    // }

    @Override
    public String toString() {
        return "Student [nom=" + nom + ", classe=" + classe + ", matricule=" + matricule + "]";
    }
    public String getNom() {
        return nom;
    }
    public String getClasse() {
        return classe;
    }
    public int getMatricule() {
        return matricule;
    }

    

    


    
}
