package com.github.inposa.salaire.entites;

public class Pigiste extends Intervenant {

    private int nbJoursTravail;
    private float salaireJournalier;

    public Pigiste(String firstname, String lastname, float salaireJournalier) {
        super(firstname, lastname);
        this.salaireJournalier = salaireJournalier;
        this.nbJoursTravail = 0;
    }

    public Pigiste(String firstname, String lastname, float salaireJournalier, int nbJoursTravail) {
        this(firstname, lastname, salaireJournalier);
        this.nbJoursTravail = nbJoursTravail;
    }

    public void setNbJoursTravail(int nbJoursTravail) {
        this.nbJoursTravail = nbJoursTravail;
    }

    @Override
    public float getSalaire() {
        return nbJoursTravail * salaireJournalier;
    }
}
