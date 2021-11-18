package com.github.inposa.recensement.display;

import com.github.inposa.recensement.entities.Recensement;
import com.github.inposa.recensement.utils.Utils;

import java.util.Scanner;

public class RecherchePopulationDepartement implements MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez un code de département : ");
        String codeDepartement = scanner.nextLine();

        //TODO gérer les valeur null

        int departementPopulation = recensement.getPopulationDepartement(codeDepartement);
        if (departementPopulation <= 0) {
            System.err.println("Le département que vous avez entré n'existe pas ou vous avez mal entré son code.\nù" +
                    "Veuillez réessayer.");
        } else {
            String formatedPopulation = Utils.decimalFormat(departementPopulation);
            System.out.println("Le département " + codeDepartement + " possède " + formatedPopulation + " habitants.");
        }

    }
}
