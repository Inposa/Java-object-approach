package com.github.inposa.enumeration.entities;

public enum Continent {
    Europe("Europe"),
    Asie("Asie"),
    Oceanie("Oceanie"),
    Amerique("Amerique"),
    Afrique("Afrique");

    private String nom;

    private Continent(String nom){
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}
