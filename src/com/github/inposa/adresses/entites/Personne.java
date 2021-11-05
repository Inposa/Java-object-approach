package com.github.inposa.adresses.entites;

public class Personne {
    private String firstname;
    private String lastname;
    private AdressePostale adressePostale;

    public Personne() {
    }

    public Personne(String firstname, String lastname, AdressePostale adressePostale) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.adressePostale = adressePostale;
    }

    public Personne(String firstname, String lastname) {
        this(firstname, lastname, new AdressePostale());
    }

    @Override
    public String toString() {
        return "Personne[" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", adressePostale=" + adressePostale.toString() +
                ']';
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public AdressePostale getAdressePostale() {
        return adressePostale;
    }

    public void setAdressePostale(AdressePostale adressePostale) {
        this.adressePostale = adressePostale;
    }

    public String getNamesCapital() {
        return firstname.toUpperCase() + " " + lastname.toUpperCase();
    }

    public void displayNamesCapital() {
        System.out.println(this.getNamesCapital());
    }
}
