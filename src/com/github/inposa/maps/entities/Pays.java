package com.github.inposa.maps.entities;

public class Pays {
    private String nom;
    private int nbHabitant;
    private Continent continent;

    public Pays(String nom, int nbHabitant, Continent continent) {
        this.nom = nom;
        this.nbHabitant = nbHabitant;
        this.continent = continent;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitant() {
        return nbHabitant;
    }

    public void setNbHabitant(int nbHabitant) {
        this.nbHabitant = nbHabitant;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }
}
