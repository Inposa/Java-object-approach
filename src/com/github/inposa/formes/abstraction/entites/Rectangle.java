package com.github.inposa.formes.abstraction.entites;

public class Rectangle extends Forme {

    private float longueur;
    private float largeur;

    public Rectangle(float longueur, float largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public float calculerSurface() {
        return this.longueur * this.largeur;
    }

    @Override
    public float calculerPerimetre() {
        return (this.longueur * 2) + (this.largeur * 2);
    }
}
