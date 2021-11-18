package com.github.inposa.recensement.entities;

public class Commune {
    private int codeCommune;
    private String nomCommune;

    public Commune(int codeCommune, String nomCommune) {
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
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
}
