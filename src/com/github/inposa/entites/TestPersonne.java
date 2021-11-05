package com.github.inposa.entites;

public class TestPersonne {
    public static void main(String[] args) {

        AdressePostale adresse1 = new AdressePostale(1, "Rue des rosiers", 34080, "Montpellier");
        AdressePostale adresse2 = new AdressePostale(2, "Rue de la ciboulette", 80081, "Toulouse");

        Personne personne1 = new Personne("Hippo", "Pech", adresse1);
        Personne personne2 = new Personne("Léo", "Sol", adresse2);

        Personne personne3 = new Personne("Michel", "Pech");

        System.out.println(personne1.toString());
        System.out.println(personne2.toString());
        System.out.println(personne3.toString());

        personne3.setAdressePostale(adresse1);
        System.out.println(personne3.toString());
    }
}
