package com.github.inposa.collections.tri.tests;

import com.github.inposa.collections.tri.entities.ComparatorHabitant;
import com.github.inposa.collections.tri.entities.ComparatorNom;
import com.github.inposa.collections.tri.entities.Ville;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTriVilles {
    public static void main(String[] args) {

        List<Ville> villes = new ArrayList<Ville>();

        villes.add(new Ville("Nice", 343_000));
        villes.add(new Ville("Carcassonne", 47_800));
        villes.add(new Ville("Narbonne", 53_400));
        villes.add(new Ville("Lyon", 484_000));
        villes.add(new Ville("Foix", 9_700));
        villes.add(new Ville("Paux", 77_200));
        villes.add(new Ville("Marseille", 850_700));
        villes.add(new Ville("Tarbes", 40_600));

        Collections.shuffle(villes);

        System.out.println(villes.toString());

        //Collections.sort(villes);

        Collections.sort(villes, new ComparatorHabitant());
        System.out.println(villes.toString());

        Collections.sort(villes, new ComparatorNom());
        System.out.println(villes.toString());




    }
}
