package com.github.inposa.formes.cercles.entities;

public class Cercle {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public float getPerimetre() {
        return (float) (2 * Math.PI * this.rayon);
    }

    public float getSurface() {
        return (float) (Math.pow(this.rayon, 2) * Math.PI);
    }

    @Override
    public String toString() {
        return "Rayon: " + this.rayon + ", Périmètre:" + this.getPerimetre() + ", Surface: " + this.getSurface();
    }
}
