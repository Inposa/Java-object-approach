package com.github.inposa.jdr.src;

import com.github.inposa.jdr.src.entities.Entity;
import com.github.inposa.jdr.src.entities.Player;
import com.github.inposa.jdr.src.entities.builders.*;
import com.github.inposa.jdr.utils.Utils;

import java.util.Scanner;

public class Menu {

    private Player currentPlayer;
    private I_EntityBuilder[] monstersToFight;

    private final Scanner scanner;

    public Menu() {
        this.currentPlayer = null;
        this.scanner = new Scanner(System.in);
        this.initCreaturesTab();
    }

    private void initCreaturesTab() {
        this.monstersToFight = new I_EntityBuilder[3];
        this.monstersToFight[0] = new LoupBuilder();
        this.monstersToFight[1] = new GobelinBuilder();
        this.monstersToFight[2] = new TrollBuilder();
        //this.monstersToFight[3] = new BehemothBuilder();
    }

    private Entity chooseMonster() {
        int index = Utils.getRandomNumber(0, this.monstersToFight.length);
        return this.monstersToFight[index].buildEntity();
    }

    public int displayMainMenu() {
        System.out.println(
                "---------------------------------\n" +
                        "Menu principal :\n" +
                        "\t- 1 Créer un personnage\n" +
                        "\t- 2 Combattre un monstre\n" +
                        "\t- 3 Afficher le score\n" +
                        "\t- 4 Quitter l'application\n" +
                        "---------------------------------");
        return this.scanner.nextInt();
    }

    public Player createPlayer() {
        if (currentPlayer != null && currentPlayer.isAlive()) {
            System.err.println("Un joueur encore en vie existe déjà !");
            return this.currentPlayer;
        } else {
            System.out.println("Création d'un nouveau joueur !");
            this.currentPlayer = new Player();
            return this.currentPlayer;
        }
    }

    public void menuChoice() {
        int playerChoice;
        do {
            playerChoice = displayMainMenu();

            //Le switch est moche, mais ça marche
            switch (playerChoice) {
                case 1:
                    //Creation personnage
                    createPlayer();
                    System.out.println(this.currentPlayer.toString());
                    break;
                case 2:
                    //Combattre un monstre
                    if (currentPlayer == null) {
                        //Coucou, crée un personnage stp
                        System.err.println("Merci de bien vouloir créer un personnage avant toute chose !");
                    } else {
                        //si perso vivant
                        if (currentPlayer.isAlive()) {
                            //On combat un monstre
                            Entity monster = this.chooseMonster();
                            System.out.println("On va combattre un " + monster.getClass().getSimpleName() + " !");
                            Fight currentFight = new Fight(this.currentPlayer, monster);

                            Entity winner = currentFight.playFight();
                            System.out.println(winner.getClass().getSimpleName() + " a gagné ce combat !");

                        } else {
                            //Coucou, ton personnage est mort
                            System.out.println("Le personnage est mort \uD83D\uDC80" +
                                    "\nIl a tout de même gagné " + currentPlayer.getScore() + " !\nFélicitations !");
                        }
                    }
                    break;
                case 3:
                    //affichage du score
                    if (currentPlayer == null) {
                        System.err.println("Merci de bien vouloir créer un personnage avant toute chose !");
                    } else {
                        System.out.println(this.currentPlayer.getScore());
                    }
                    break;
            }
        } while (playerChoice < 4);
        endGame();
    }

    private void endGame() {
        System.out.println("Au revoir !");
        System.exit(0);
    }
}
