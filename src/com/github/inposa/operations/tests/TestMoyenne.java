package com.github.inposa.operations.tests;

import com.github.inposa.operations.entitées.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne calculMoyenne1 = new CalculMoyenne();

        calculMoyenne1.addValues(1, 5.5, 10, 17, 15.7);

        System.out.println(calculMoyenne1.toString());
        System.out.println("Valeur moyenne : " + calculMoyenne1.calculMoyenne());


        CalculMoyenne calculMoyenne2 = new CalculMoyenne();

        calculMoyenne2.addValues(19.9, 6.9, 20, 14, 17);

        System.out.println(calculMoyenne2.toString());
        System.out.println("Valeur moyenne : " + calculMoyenne2.calculMoyenne());
    }
}
