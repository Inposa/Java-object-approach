package com.github.inposa.entites;

public class AdressePostale {
    private int numeroRue;
    private String libelleRue;
    private int codePostal;
    private String nomVille;

    public AdressePostale(int numeroRue, String libelleRue, int codePostal, String nomVille) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.nomVille = nomVille;
    }

    @Override
    public String toString() {
        return "numeroRue={" + numeroRue +
                ", libelleRue='" + libelleRue + '\'' +
                ", codePostal=" + codePostal +
                ", nomVille='" + nomVille + '\'' +
                '}';
    }
}
