package com.github.inposa.theatre.entites;

public class Theatre {
    private String name;
    private int capaciteMax;
    private int totalClientsInscrits;
    private float recetteTotale;

    public Theatre(String name, int capaciteMax) {
        this.name = name;
        this.capaciteMax = capaciteMax;
        this.totalClientsInscrits = 0;
        this.recetteTotale = 0;
    }

    public void inscrire(int nbClients, float prixPlace) {
        if ((this.totalClientsInscrits + nbClients) < capaciteMax) {
            //On fait des trucs car c'est oké
            this.totalClientsInscrits += nbClients;
            this.recetteTotale = nbClients * prixPlace;
            System.out.println("[" + this.name + "] " + nbClients + " clients ajoutés" +
                    ", Nouvelle capacité : " + this.totalClientsInscrits);
            System.out.println("[" + this.name + "] Recette actuelle: " + recetteTotale);
        } else {
            System.err.println("[" + this.name + "] " + "Attention ! La capacité maximale a été atteinte !");
        }
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "name='" + name + '\'' +
                ", capaciteMax=" + capaciteMax +
                ", totalClientsInscrits=" + totalClientsInscrits +
                ", recetteTotale=" + recetteTotale +
                '}';
    }
}
