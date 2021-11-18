package com.github.inposa.recensement.display;

import com.github.inposa.recensement.entities.Recensement;
import com.github.inposa.recensement.utils.Utils;

import java.util.Scanner;

public class RecherchePopulationRegion implements MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez un nom de région : ");
        String nomRegion = scanner.nextLine();

        //TODO gérer les valeur null

        int regionPopulation = recensement.getPopulationRegion(nomRegion);
        if (regionPopulation <= 0) {
            System.err.println("La région que vous avez entré n'existe pas ou vous avez mal entré son nom.\n" +
                    "Veuillez réessayer.");
        } else {
            String formatedPopulation = Utils.decimalFormat(regionPopulation);
            System.out.println("La région " + nomRegion + " possède " + formatedPopulation + " habitants.");
        }

    }
}
