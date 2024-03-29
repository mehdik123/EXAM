package com.example.demo3.exemple3;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Emplo_SKILLS")
public class Emplo_Skills {

    @Id
    @Column(name = "Emplo_ID")
    private Long emploId;

    @Column(name = "SKILLS")  // Modifier le nom de la colonne ici
    private String skills;  // Renommer la propriété en conséquence


    // Constructeurs, getters et setters

    public Emplo_Skills() {
    }

    public Emplo_Skills(Long emploId, String skill) {
        this.emploId = emploId;
        this.skills = skill;
    }

    public Long getEmploId() {
        return emploId;
    }

    public void setEmploId(Long emploId) {
        this.emploId = emploId;
    }

    public String getSkill() {
        return skills;
    }

    public void setSkill(String skill) {
        this.skills = skill;
    }
}
