package com.github.inposa.recensement.display;

import com.github.inposa.jdr.src.Menu;
import com.github.inposa.recensement.entities.FileParser;
import com.github.inposa.recensement.entities.Recensement;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    private static String PATH = Paths.get("").toAbsolutePath() + "\\files\\recensement.csv";

    public static void main(String[] args) {
        //TODO Affichage du menu pricipal et du switch présentant les différentes options présentes dans les controller
        Scanner scanner = new Scanner(System.in);
        FileParser fileParser = new FileParser(PATH);
        Recensement recensement;

        try {
            //Lecture de rescensement.csv et population de la hashmap des villes
            recensement = new Recensement(fileParser.parseFile());
        } catch (IOException e) {
            System.err.println(e.getMessage());
            recensement = new Recensement();
        }

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Bonjour, faites un choix:\n" +
                    "\t- 1 Population d'une ville donnée\n" +
                    "\t- 2 Population d'un département donné\n" +
                    "\t- 3 Population d'une région donnée\n" +
                    "\t- 4 Top 10 des régions les plus peuplées\n" +
                    "\t- 5 Top 10 des départements les plus peuplés \n" +
                    "\t- 6 Top 10 des villes les plus peuplées\n" +
                    "\t- 7 Top 10 des villes les plus peuplées d'une région\n" +
                    "\t- 8 Top 10 des villes lees plus peuplées en France\n" +
                    "\t- 9 Quitter l'application\n"
            );
            int choix = 0;
            try {
                // Comme scanner.nextInt() n'efface pas le \n de l'input lors de son appel, il faut y faire appel
                // maintenant pour pouvoir ensuite faire appel à scanner.nextLine();
                choix = scanner.nextInt();
                scanner.nextLine();

                MenuService menuService;
                switch (choix) {
                    case 1:
                        //TODO Population d'une ville donnée PENSER À GERER LES NULL SI L'USER EST PAS FUTE
                        menuService = menuService = new RecherchePopulationVille();
                        menuService.traiter(recensement, scanner);
                        break;
                    case 2:
                        //Population d'un département donné
                        menuService = new RecherchePopulationDepartement();
                        menuService.traiter(recensement, scanner);
                        break;
                    case 3:
                        //Population d'une région donnée
                        menuService = new RecherchePopulationRegion();
                        menuService.traiter(recensement, scanner);
                        break;
                    case 4:
                        //Top 10 des régions les plus peuplées
                        menuService = new RechercheTop10Regions();
                        menuService.traiter(recensement, scanner);
                        break;
                    case 5:
                        //Top 10 des départements les plus peuplés
                        menuService = new RechercheTop10Departement();
                        menuService.traiter(recensement, scanner);
                        break;
                    case 6:
                        //Top 10 des villes les plus peuplées d'un département
                        menuService = new RechercheTop10VilleFromDepartement();
                        menuService.traiter(recensement, scanner);
                        break;
                    case 7:
                        //Top 10 des villes les plus peuplées d'une région
                        menuService = new RechercheTop10VilleFromRegion();
                        menuService.traiter(recensement, scanner);
                    case 8:
                        //Top 10 des Villes les plus peuplées de France (on exclu les DOM/TOM ?)
                        menuService = new RechercheTop10France();
                        menuService.traiter(recensement, scanner);
                        break;
                    case -1:
                    case 9:
                        isRunning = false;
                        break;
                    default:

                }

            } catch (InputMismatchException e) {
                System.err.println("Veuillez saisir un nombre parmis les choix proposés.");
                scanner.nextLine();
            }
        }
    }
}