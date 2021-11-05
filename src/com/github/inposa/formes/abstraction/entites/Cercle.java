package com.github.inposa.formes.abstraction.entites;

public class Cercle extends Forme {

    private float rayon;

    public Cercle(float rayon) {
        this.rayon = rayon;
    }

    @Override
    public float calculerSurface() {
        return (float) (Math.pow(this.rayon, 2) * Math.PI);
    }

    @Override
    public float calculerPerimetre() {
        return (float) (2 * Math.PI * this.rayon);
    }
}
