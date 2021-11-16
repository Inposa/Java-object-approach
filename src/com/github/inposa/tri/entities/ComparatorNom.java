package com.github.inposa.tri.entities;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville> {
    @Override
    public int compare(Ville ville1, Ville ville2) {
        return ville1.getNom().compareTo(ville2.getNom());
    }
}