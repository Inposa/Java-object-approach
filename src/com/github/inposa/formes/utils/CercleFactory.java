package com.github.inposa.formes.utils;

import com.github.inposa.formes.entities.Cercle;

public class CercleFactory {

    public static Cercle createCircle(double rayon){
        return new Cercle(rayon);
    }
}
