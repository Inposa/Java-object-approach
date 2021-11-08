package com.github.inposa.jdr.src.creatures;

public class Loup extends Creature {
    public Loup() {
        super();
        this.baseStrength = 3;
        this.maxStrength = 8;

        this.baseHealth = 5;
        this.maxHealth = 10;

        generateStats();
    }
}
