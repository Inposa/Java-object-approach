package com.github.inposa.listes.tests;

import java.util.ArrayList;
import java.util.List;

public class CreationListe {
    public static void main(String[] args) {
        List liste = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            liste.add(i + 1);
        }

        System.out.println(liste.toString());

    }
}
