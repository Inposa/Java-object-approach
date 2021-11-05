package com.github.inposa.formes.cercles.utils;

import com.github.inposa.formes.cercles.entities.Cercle;

public class CercleFactory {

    public static Cercle createCircle(double rayon){
        return new Cercle(rayon);
    }
}
