package com.github.inposa.collections.maps.entities;

public class Ville implements Comparable<Ville> {

    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public Ville(String nom) {
        this(nom, 0);
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
        return '{' + nom + '\'' +
                "," + nbHabitants +
                '}';
    }
}
