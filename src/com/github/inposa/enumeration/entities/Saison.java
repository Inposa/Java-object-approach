package com.github.inposa.enumeration.entities;

public enum Saison {
    HIVER("Hiver", 1),
    PRINTEMPS("Printemps", 2),
    ETE("Eté", 3),
    AUTOMNE("Automne", 4);

    private String nom;
    private int nbOrdre;

    private Saison(String nom, int nbOrdre) {
        this.nom = nom;
        this.nbOrdre = nbOrdre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public static Saison searchInstance(String nom) {
        Saison[] values = Saison.values();
        Saison retour = null;

        boolean isFound = false;
        int i = 0;
        while (!isFound && i < values.length) {
            if (values[i].getNom().equals(nom)) {
                isFound = true;
                retour = values[i];
            }
            i++;
        }

        return retour;

    }

    @Override
    public String toString() {
        return "Saison{" +
                "nom='" + nom + '\'' +
                ", nbOrdre=" + nbOrdre +
                '}';
    }
}
