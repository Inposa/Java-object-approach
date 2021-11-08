package com.github.inposa.jdr.src.creatures;

public class Gobelin extends Creature {
    public Gobelin() {
        super();
        this.baseStrength = 5;
        this.maxStrength = 10;

        this.baseHealth = 10;
        this.maxHealth = 15;

        generateStats();
    }
}
