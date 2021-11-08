package com.github.inposa.jdr.src.entities;

import com.github.inposa.jdr.utils.Utils;

public abstract class Entity {
    protected int baseStrength;
    protected int maxStrength;

    protected int baseHealth;
    protected int maxHealth;

    private int strength;
    private int health;
    private boolean isAlive;

    public Entity() {
        this.isAlive = true;
    }

    public void generateStats() {
        this.health = Utils.getRandomNumber(this.baseHealth, this.maxHealth);
        this.strength = Utils.getRandomNumber(this.baseStrength, this.maxStrength);
    }

    protected void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damagesTaken) {
        if (this.health - damagesTaken <= 0) {
            //l'entité est morte, appel à la fonction de mort d'entité
            this.killEntity();
        } else {
            this.setHealth(this.health - damagesTaken);
        }
    }

    public boolean isAlive() {
        return this.isAlive;
    }

    private void setAliveStatut(boolean statut) {
        this.isAlive = statut;
    }

    public void killEntity() {
        System.out.println(this.getClass().getSimpleName() + " est mort !");
        this.setAliveStatut(false);
    }

    public int getAttackValue() {
        return this.strength + Utils.getRandomNumber(1, 10);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "\n" +
                "\tStats : \n" +
                "\t\t- PV: " + this.health + "\n" +
                "\t\t- STR: " + this.strength + "\n" +
                "\t\t- isAlive:" + this.isAlive;
    }
}
