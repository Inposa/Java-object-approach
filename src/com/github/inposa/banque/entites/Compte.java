package com.github.inposa.banque.entites;

public class Compte {
    private int idCompte;
    private int solde;

    public Compte(){

    }

    public Compte(int idCompte, int solde) {
        this.idCompte = idCompte;
        this.solde = solde;
    }

    public int getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
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
