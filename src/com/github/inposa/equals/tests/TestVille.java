package com.github.inposa.equals.tests;

import com.github.inposa.equals.entities.Ville;

import java.util.ArrayList;
import java.util.List;

public class TestVille {
    public static void main(String[] args) {

        List<Ville> listVilles = new ArrayList<Ville>();

        listVilles.add(new Ville("Nice", 343_000));
        listVilles.add(new Ville("Marseille", 850_700));
        listVilles.add(new Ville("Tarbes", 40_600));
        listVilles.add(new Ville("Nice", 343_000));
        listVilles.add(new Ville("Nice2", 40_600));
        listVilles.add(new Ville("Nice", 0));

        for (Ville ville : listVilles) {
            /*
            if (listVilles.get(0).equals(ville)) {
                System.out.println(ville.toString() + " EGAL à " + listVilles.get(0));
            } else {
                System.out.println(ville.toString() + " non égal à " + listVilles.get(0));
            }
             */
            if (listVilles.get(0) == (ville)) {
                System.out.println(ville.toString() + " EGAL à " + listVilles.get(0));
            } else {
                System.out.println(ville.toString() + " non égal à " + listVilles.get(0));
            }
        }
    }
}
