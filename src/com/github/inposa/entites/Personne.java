package com.github.inposa.entites;

public class Personne {
    private String firstname;
    private String lastname;
    private AdressePostale adressePostale;

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
}
