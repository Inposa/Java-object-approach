package com.github.inposa.salaire.tests;

import com.github.inposa.salaire.entites.Pigiste;
import com.github.inposa.salaire.entites.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {
        Salarie salarie = new Salarie("Michel","Jean",1200);

        Pigiste pigiste = new Pigiste("Pierre","Popol",30);
        pigiste.setNbJoursTravail(20);

        System.out.println(salarie.getSalaire());
        System.out.println(pigiste.getSalaire());

        System.out.println(salarie.getDonnees());
        System.out.println(pigiste.getDonnees());

    }
}
