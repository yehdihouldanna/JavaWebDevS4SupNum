package com.example.session3_dynamic_data_modelview;

public class Student {
    
    private String nom;
    private String classe;
    private int matricule;
    
    public Student(String nom, String classe, int matricule) {
        this.nom = nom;
        this.classe = classe;
        this.matricule = matricule;
    }

    @Override
    public String toString() {
        return "Student [nom=" + nom + ", classe=" + classe + ", matricule=" + matricule + "]";
    }

    


    
}
