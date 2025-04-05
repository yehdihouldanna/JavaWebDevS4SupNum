package com.example.session3_dynamic_data_modelview.models;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component
@Entity
public class Student {

    @Id()
    @GeneratedValue(strategy = GenerationType.SEQUENCE) 
    private int matricule;

    private String nom;
    private String classe;

    private String dob; // Date Of Birth - (date de naissance) / JJ/MM/AAAA

    public Student(){
        
    }
    public Student(String nom, String classe, int matricule, String dob) {
        this.nom = nom;
        this.classe = classe;
        this.matricule = matricule;
        this.dob = dob;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student [matricule=" + matricule + ", nom=" + nom + ", classe=" + classe + ", dob=" + dob + "]";
    }

}
