package com.github.inposa.recensement.entities;

public class Departement {
    private String codeDepartement;
    private int populationDepartement;

    public Departement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public int getPopulationDepartement() {
        return this.populationDepartement;
    }

    public void setPopulationDepartement(int populationDepartement) {
        this.populationDepartement = populationDepartement;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }
}
