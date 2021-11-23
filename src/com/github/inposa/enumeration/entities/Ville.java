package com.github.inposa.enumeration.entities;

public class Ville implements Comparable<Ville> {

    private String nom;
    private int nbHabitants;
    private Continent continent;

    public Ville(String nom, int nbHabitants, Continent continent) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.continent = continent;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    @Override
    public int compareTo(Ville other) {
        int value = 0;
        if (this.nbHabitants > other.getNbHabitants()) {
            value = 1;
        } else if (this.nbHabitants < other.getNbHabitants()) {
            value = -1;
        }
        return value;
    }

    @Override
    public String toString() {
        return '{' + this.nom +
                ", " + this.nbHabitants +
                ", " + this.continent.getNom() + '}';
    }
}
