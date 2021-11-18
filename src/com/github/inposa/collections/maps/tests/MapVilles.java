package com.github.inposa.collections.maps.tests;

import com.github.inposa.collections.maps.entities.Ville;

import java.util.HashMap;
import java.util.Iterator;

public class MapVilles {
    public static void main(String[] args) {
        HashMap<String, Ville> mapVilles = new HashMap<String, Ville>();

        mapVilles.put("Nice", new Ville("Nice", 343_000));
        mapVilles.put("Carcassonne", new Ville("Carcassonne", 47_800));
        mapVilles.put("Narbonne", new Ville("Narbonne", 53_400));
        mapVilles.put("Lyon", new Ville("Lyon", 484_000));
        mapVilles.put("Foix", new Ville("Foix", 9_700));
        mapVilles.put("Paux", new Ville("Paux", 77_200));
        mapVilles.put("Marseille", new Ville("Marseille", 850_700));
        mapVilles.put("Tarbes", new Ville("Tarbes", 40_600));

        Iterator<Ville> iteratorVille = mapVilles.values().iterator();

        Ville villeMin = iteratorVille.next();

        while (iteratorVille.hasNext()) {
            Ville current = iteratorVille.next();
            if (current.getNbHabitants() < villeMin.getNbHabitants()) {
                villeMin = current;
            }
        }
        System.out.println("Remove "+ villeMin.getNom());
        mapVilles.remove(villeMin.getNom());

        System.out.println(mapVilles.toString());
    }
}
