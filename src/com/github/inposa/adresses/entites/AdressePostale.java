package com.github.inposa.adresses.entites;

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

    public AdressePostale() {
        //this(0, "", 0, "");
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
