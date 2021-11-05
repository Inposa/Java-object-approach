package com.github.inposa.jdr.entites;

public class Menu {

    public Joueur currentPlayer;

    public Menu() {
        this.currentPlayer = null;
    }

    public void displayMainMenu(){
        /* TODO main menu */
    }

    public void createPlayer() {
        if (currentPlayer != null && currentPlayer.isAlive() == true) {
            System.err.println("Un joueur encore en vie existe déjà !");
        } else {
            System.out.println("Création d'un nouveau joueur !");
            this.currentPlayer = new Joueur();
        }
    }

    public void fightMonster() {
        if (currentPlayer == null) {
            //Coucou, crée un personnage stp
            System.err.println("Merci de bien vouloir créer un personnage avant de commencer à combattre !");
        }
        if (currentPlayer.getHealth() <= 0) {
            //Coucou, ton personnage est mort
            System.out.println("Le personnage est mort \uD83D\uDC80" +
                    "\nIl a tout de même gagné " + currentPlayer.getScore()+" !\nFélicitations !");
        } else {
            //On combat un monstre
            //TODO

        }
    }


}
