package com.github.inposa.chaines.manipulation.entites;

public class Salarie {
    private String firstname;
    private String lastname;
    private float salaire;

    public Salarie(String firstname, String lastname, float salaire) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Salarie{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
