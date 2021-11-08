package com.github.inposa.jdr.src;

import com.github.inposa.jdr.src.entities.Entity;
import com.github.inposa.jdr.utils.Utils;

public class Fight {
    private Entity opponent1;
    private Entity opponent2;

    private int nbOfTurns;

    public Fight(Entity opponent1, Entity opponent2) {
        this.opponent1 = opponent1;
        this.opponent2 = opponent2;
        this.nbOfTurns = 0;
    }

    public Entity playFight() {
        do {
            this.nbOfTurns++;
            System.out.println("Tour: " + this.nbOfTurns);

            System.out.println("Etat des entités: \n" +
                    "\t-  " + this.opponent1.toString() + "\n" +
                    "\t-  " + this.opponent2.toString());

            int opponent1InitRoll = Utils.getRandomNumber(1, 20);
            int opponent2InitRoll = Utils.getRandomNumber(1, 20);
            System.out.println("Roll d'initiative:\n" +
                    "\t" + this.opponent1.getClass().getSimpleName() + " a roll a tiré un " + opponent1InitRoll + "\n" +
                    "\t" + this.opponent2.getClass().getSimpleName() + " a roll a tiré un " + opponent2InitRoll);
            //Roll d'initiative pour déterminer qui attaque en premier

            if (opponent1InitRoll >= opponent2InitRoll) {
                playTurn(this.opponent1, this.opponent2);
            } else {
                playTurn(this.opponent2, this.opponent1);
            }

        } while (this.opponent1.isAlive() && this.opponent2.isAlive());

        //Retourner l'entité encore en vie
        return this.opponent1.isAlive() ? opponent1 : opponent2;
    }

    public void playTurn(Entity firstToAct, Entity secondToAct) {
        if (firstToAct.isAlive() && secondToAct.isAlive()) {
            //L'opponent 1 attaque l'opponent 2
            System.out.println(firstToAct.getClass().getSimpleName() + " Attaque " + secondToAct.getClass().getSimpleName());

            int damageValue = firstToAct.getAttackValue();
            System.out.println("Et lui inflige " + damageValue + " dégats !");
            secondToAct.takeDamage(damageValue);
        }

        // Check pour voir si opponent2 n'est pas mort entre temps
        if (firstToAct.isAlive() && secondToAct.isAlive()) {
            //L'opponent 2 attaque l'opponent 1
            System.out.println(secondToAct.getClass().getSimpleName() + " Attaque " + firstToAct.getClass().getSimpleName());

            int damageValue = firstToAct.getAttackValue();
            System.out.println("Et lui inflige " + damageValue + " dégats !");
            secondToAct.takeDamage(damageValue);
        }


    }

}
