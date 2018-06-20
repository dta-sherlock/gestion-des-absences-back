package dev.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Absence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private java.sql.Date dateDebut;
    private java.sql.Date dateFin;
    private String motif;
    private String type;
    private String statut;
    private int idUtilisateur;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public java.sql.Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(java.sql.Date dateDebut) {
        this.dateDebut = dateDebut;
    }


    public java.sql.Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(java.sql.Date dateFin) {
        this.dateFin = dateFin;
    }


    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }


    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

}
