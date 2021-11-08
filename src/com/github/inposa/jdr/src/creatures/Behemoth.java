package com.github.inposa.jdr.src.creatures;

public class Behemoth extends Creature {
    public Behemoth() {
        super();
        this.baseStrength = 15;
        this.maxStrength = 20;

        this.baseHealth = 25;
        this.maxHealth = 30;

        generateStats();
    }
}
