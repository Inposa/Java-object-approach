package com.github.inposa.recensement.display;

import com.github.inposa.recensement.entities.Recensement;
import com.github.inposa.recensement.utils.Utils;

import java.util.Scanner;

public class RecherchePopulationVille implements MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez le nom de la ville à chercher : ");
        String nomVille = scanner.nextLine();

        //TODO gérer les valeur null d

        int villePopulation = recensement.getPopulationVille(nomVille);

        String formatedPopulation = Utils.decimalFormat(villePopulation);
        System.out.println(nomVille + " possède " + formatedPopulation + " habitants.");
    }
}
