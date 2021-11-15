package com.github.inposa.listes.tests;

import java.util.ArrayList;
import java.util.List;

public class TestListeInt {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<Integer>();

        liste.add(-1);
        liste.add(5);
        liste.add(7);
        liste.add(3);
        liste.add(-2);
        liste.add(4);
        liste.add(8);
        liste.add(5);

        System.out.println("Eléments :\n" + liste.toString());
        System.out.println("Taille : " + liste.size());
        System.out.println("Max val : " + TestListeInt.max(liste));
        System.out.println("All negatives into postive : \n" + TestListeInt.inverseNegatives(liste).toString());

    }

    public static int max(List<Integer> liste) {
        int max = liste.get(0);
        for (int i : liste) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }

    public static List<Integer> removeMin(List<Integer> liste) {
        int indexMinVal = 0;
        for (int i = 1; i < liste.size(); i++) {
            if (liste.get(i) < liste.get(indexMinVal)) {
                indexMinVal = i;
            }
        }
        liste.remove(indexMinVal);
        return liste;
    }

    public static List<Integer> inverseNegatives(List<Integer> liste) {
        for (int i = 0; i < liste.size(); i++) {
            int current = liste.get(i);
            if (current < 0) {
                liste.set(i, Math.abs(current));
            }
        }
        return liste;
    }
}
