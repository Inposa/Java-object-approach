package com.github.inposa.jdr.src.entities;

public class Player extends Entity {
    private int score;

    public Player() {
        this.baseStrength = 12;
        this.maxStrength = 18;

        this.baseHealth = 20;
        this.maxHealth = 50;

        this.score = 0;
        generateStats();
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void modifyScore(int scoreToAdd) {
        this.setScore(this.getScore() + scoreToAdd);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "\t\t- Score: " + this.score + "\n";
    }
}
