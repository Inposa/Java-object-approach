package com.github.inposa.salaire.entites;

public abstract class Intervenant {
    private String firstname;
    private String lastname;

    public Intervenant(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDonnees() {
        return this.getFirstname() + ", " + this.getLastname() + ", " +
                this.getSalaire() + ", " + getClass().getSimpleName();

    }

    public abstract float getSalaire();
}
