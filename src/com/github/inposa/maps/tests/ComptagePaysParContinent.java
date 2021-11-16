package com.github.inposa.maps.tests;

import com.github.inposa.maps.entities.Continent;
import com.github.inposa.maps.entities.Pays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        List<Pays> paysList = new ArrayList<Pays>();

        Collections.addAll(paysList,
                new Pays("France", 65_000_000, Continent.Europe),
                new Pays("Allemagne", 80_000_000, Continent.Europe),
                new Pays("Belgique", 10_000_000, Continent.Europe),
                new Pays("Russie", 150_000_000, Continent.Asie),
                new Pays("Chine", 1_400_000_000, Continent.Asie),
                new Pays("Indonésie", 220_000_000, Continent.Oceanie),
                new Pays("Australie", 20_000_000, Continent.Oceanie)
        );

        HashMap<Continent, Integer> comptageContinent = new HashMap<Continent, Integer>();
        comptageContinent.put(Continent.Europe, 0);
        comptageContinent.put(Continent.Asie, 0);
        comptageContinent.put(Continent.Oceanie, 0);
        comptageContinent.put(Continent.Afrique, 0);
        comptageContinent.put(Continent.Amerique, 0);

        for (Pays pays : paysList) {
            //Pour chaque continent de la liste pays on incrémente la valeur de la hasmap
            comptageContinent.put(pays.getContinent(), comptageContinent.get(pays.getContinent()) + 1);
        }

        System.out.println(comptageContinent.toString());
    }
}
