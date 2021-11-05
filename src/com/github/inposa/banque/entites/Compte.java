package com.github.inposa.banque.entites;

public class Compte {
    private int idCompte;
    private int solde;

    public Compte(int idCompte, int solde) {
        this.idCompte = idCompte;
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "idCompte=" + idCompte +
                ", solde=" + solde +
                '}';
    }
}
