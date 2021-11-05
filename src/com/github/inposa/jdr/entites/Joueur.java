package com.github.inposa.jdr.entites;


import com.github.inposa.jdr.utils.Utils;

public class Joueur extends Entity {
    private int score;

    private static Joueur currentPlayer = null;

    public Joueur() {
        super(Utils.getRandomNumber(12, 18), Utils.getRandomNumber(20, 50));
        this.score = 0;
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
}
