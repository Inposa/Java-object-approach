package com.github.inposa.banque.entites;

public class CompteTaux extends Compte {
    private int tauxRemuneration;

    public CompteTaux(int idCompte, int solde, int tauxRemuneration) {
        super(idCompte, solde);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String toString() {
        return "CompteTaux{" +
                "numeroCompte=" + super.getIdCompte() + ", " +
                "solde" + super.getSolde() + ", " +
                "tauxRemuneration=" + tauxRemuneration +
                '}';
    }
}
