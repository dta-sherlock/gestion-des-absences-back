package dev.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String mdp;
    private String grade;
    private int soldeConges;
    private int soldeRtt;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }


    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


    public int getSoldeConges() {
        return soldeConges;
    }

    public void setSoldeConges(int soldeConges) {
        this.soldeConges = soldeConges;
    }


    public int getSoldeRtt() {
        return soldeRtt;
    }

    public void setSoldeRtt(int soldeRtt) {
        this.soldeRtt = soldeRtt;
    }

}
