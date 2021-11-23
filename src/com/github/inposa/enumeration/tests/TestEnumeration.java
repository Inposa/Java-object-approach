package com.github.inposa.enumeration.tests;

import com.github.inposa.enumeration.entities.Saison;

public class TestEnumeration {
    public static void main(String[] args) {
        for (Saison saison : Saison.values()) {
            System.out.println(saison.toString());
        }
        Saison ete = Saison.valueOf("ETE");
        System.out.println(ete.toString());

        String label = "Hiver";
        Saison hiver = Saison.searchInstance(label);
        System.out.println(hiver.equals(Saison.HIVER));
    }
}
