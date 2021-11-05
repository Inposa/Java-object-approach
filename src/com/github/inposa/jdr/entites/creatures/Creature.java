package com.github.inposa.jdr.entites.creatures;

import com.github.inposa.jdr.entites.Entity;

public abstract class Creature extends Entity {
    private static int winningScore;

    public Creature(int strength, int health) {
        super(strength, health);
    }

    public int getWinningScore() {
        return this.winningScore;
    }
}
