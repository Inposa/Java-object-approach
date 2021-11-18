package com.github.inposa.recensement.entities;

public class Ville {
    private Region region;
    private Departement departement;

    private int codeCommune;
    private String nomCommune;

    private int population;

    public Ville() {
    }

    public Ville(Region region, Departement departement, int codeCommune, String nomCommune, int population) {
        this.region = region;
        this.departement = departement;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
        this.population = population;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public int getCodeCommune() {
        return codeCommune;
    }

    public void setCodeCommune(int codeCommune) {
        this.codeCommune = codeCommune;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public void setNomCommune(String nomCommune) {
        this.nomCommune = nomCommune;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "[" + this.nomCommune + ", " + this.population + "]";
    }
}
