package com.github.inposa.formes.abstraction.tests;

import com.github.inposa.formes.abstraction.entites.Carre;
import com.github.inposa.formes.abstraction.entites.Cercle;
import com.github.inposa.formes.abstraction.entites.Rectangle;

public class TestForme {
    public static void main(String[] args) {
        Cercle cercle1 = new Cercle(10);
        Rectangle rectangle1 = new Rectangle(10,5);
        Carre carre1 = new Carre(5);

        AffichageForme.afficher(cercle1);
        AffichageForme.afficher(rectangle1);
        AffichageForme.afficher(carre1);
    }
}
