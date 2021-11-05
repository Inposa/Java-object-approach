package com.github.inposa.salaire.entites;

public class Salarie extends Intervenant {

    private float salaireMensuel;

    public Salarie(String firstname, String lastname, float salaireMensuel) {
        super(firstname, lastname);
        this.salaireMensuel = salaireMensuel;
    }

    @Override
    public float getSalaire() {
        return salaireMensuel;
    }
}
