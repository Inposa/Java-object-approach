package com.github.inposa.recensement.entities;

import java.util.Comparator;

public class ComparatorPopulationRegion implements Comparator<Region> {

    @Override
    public int compare(Region region1, Region region2) {
        return Integer.compare(region1.getPopulationRegion(), region2.getPopulationRegion()) * -1;
    }
}
