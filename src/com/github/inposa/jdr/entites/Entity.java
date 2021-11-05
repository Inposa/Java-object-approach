package com.github.inposa.jdr.entites;

import com.github.inposa.jdr.utils.Utils;

public abstract class Entity {
    private int strength;
    private int health;
    private boolean isAlive;

    public Entity(int strength, int health) {
        this.strength = strength;
        this.health = health;
        this.isAlive = true;
    }

    public int getBaseStrength() {
        return strength;
    }

    public int getCalculatedStrength() {
        return strength + Utils.getRandomNumber(1, 10);
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    private void setHealth(int health) {
        this.health = health;
    }

    public void modifyHealth(int modif) {
        this.setHealth(modif);
    }

    public boolean isAlive() {
        return this.isAlive;
    }

    public void setAliveStatut(boolean statut) {
        this.isAlive = statut;
    }

    public void killEntity() {
        this.setAliveStatut(false);
    }
}
