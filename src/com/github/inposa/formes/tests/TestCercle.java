package com.github.inposa.formes.tests;

import com.github.inposa.formes.entities.Cercle;
import com.github.inposa.formes.utils.CercleFactory;

public class TestCercle {
    public static void main(String[] args) {

        Cercle cercle1 = CercleFactory.createCircle(30);
        Cercle cercle2 = CercleFactory.createCircle(10);
        Cercle cercle3 = CercleFactory.createCircle(5.5);

        System.out.println(cercle1.toString());
        System.out.println(cercle2.toString());
        System.out.println(cercle3.toString());
    }
}
