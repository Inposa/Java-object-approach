package com.github.inposa.equals.entities;

public class Ville {
    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
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
    public String toString() {
        return '[' + nom + '\'' +
                "," + nbHabitants +
                ']';
    }

    //Checker si les deux instances possèdent toutes les deux les mêmes attributs même si elles n'ont pas le
    //même hashcode.
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Ville)) {
            return false;
        }
        Ville other = (Ville) object;
        return (this.nom.equals((other.getNom()))) && (this.nbHabitants == other.getNbHabitants());
    }
}
