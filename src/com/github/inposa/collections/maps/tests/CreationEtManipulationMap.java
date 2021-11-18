package com.github.inposa.collections.maps.tests;

import java.util.HashMap;

public class CreationEtManipulationMap {
    public static void main(String[] args) {
        HashMap<Integer, String> mapVilles = new HashMap<Integer, String>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");

        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        for (int key : mapVilles.keySet()) {
            System.out.print(key + ", ");
        }
        System.out.print("\n");

        for (String value : mapVilles.values()) {
            System.out.print(value + ", ");
        }
        System.out.print("\n");

        System.out.println("Taille: " + mapVilles.size());
    }
}
