package com.github.inposa.jdr.src.creatures;

import com.github.inposa.jdr.src.entities.Entity;

public abstract class Creature extends Entity {
    protected int winningScore;
    protected float spawnRate;

    public Creature() {
        super();
    }

    public void setWinningScore(int value) {
        this.winningScore = value;
    }

    public int getWinningScore() {
        return this.winningScore;
    }

//    public float getSpawnRate() {
//        return spawnRate;
//    }

//    public void setSpawnRate(float spawnRate) {
//        this.spawnRate = spawnRate;
//    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "\t\tScore to earn: " + this.winningScore;
    }
}
