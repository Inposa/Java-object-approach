package com.github.inposa.recensement.entities;

import java.util.Comparator;

public class ComparatorPopulationDepartement implements Comparator<Departement> {
    @Override
    public int compare(Departement departement1, Departement departement2) {
        return Integer.compare(departement1.getPopulationDepartement(), departement2.getPopulationDepartement()) * -1;
    }
}
