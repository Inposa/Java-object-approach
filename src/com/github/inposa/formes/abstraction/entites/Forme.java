package com.github.inposa.formes.abstraction.entites;

public abstract class Forme {
    public abstract float calculerSurface();
    public abstract float calculerPerimetre();

    @Override
    public String toString() {
        return "Périmètre: "+calculerPerimetre()+", Surface: "+calculerSurface();
    }
}
