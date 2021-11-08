package com.github.inposa.jdr.src.creatures;

public class Troll extends Creature {
    public Troll() {
        super();
        this.baseStrength = 10;
        this.maxStrength = 15;

        this.baseHealth = 20;
        this.maxHealth = 30;

        generateStats();
    }
}
