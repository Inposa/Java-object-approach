package com.github.inposa.recensement.entities;

import com.github.inposa.recensement.utils.Utils;
import jdk.jshell.execution.Util;

public class Region {
    private int codeRegion;
    private String nomRegion;
    private int populationRegion;

    public Region(int codeRegion, String nomRegion) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
    }

    public int getPopulationRegion() {
        return populationRegion;
    }

    public void setPopulationRegion(int populationRegion) {
        this.populationRegion = populationRegion;
    }

    public int getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(int codeRegion) {
        this.codeRegion = codeRegion;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    @Override
    public String toString() {
        return
                '[' + nomRegion + ", code région: " + codeRegion + ", population: " + Utils.decimalFormat(populationRegion) + ']';
    }
}
