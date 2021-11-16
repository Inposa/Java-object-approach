package com.github.inposa.tri.entities;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

    @Override
    public int compare(Ville ville1, Ville ville2) {
        int value = 0;
        if (ville1.getNbHabitants() > ville2.getNbHabitants()) {
            value = 1;
        } else if (ville1.getNbHabitants() < ville2.getNbHabitants()) {
            value = -1;
        }
        return value;
    }
}
