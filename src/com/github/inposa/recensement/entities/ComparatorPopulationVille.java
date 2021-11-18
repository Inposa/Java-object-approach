package com.github.inposa.recensement.entities;

import java.util.Comparator;

public class ComparatorPopulationVille implements Comparator<Ville> {

    @Override
    public int compare(Ville ville1, Ville ville2) {
        return Integer.compare(ville1.getPopulation(), ville2.getPopulation()) * -1;
    }
}
