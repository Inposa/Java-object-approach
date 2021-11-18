package com.github.inposa.recensement.display;

import com.github.inposa.recensement.entities.Departement;
import com.github.inposa.recensement.entities.Recensement;
import com.github.inposa.recensement.entities.Ville;

import java.util.List;
import java.util.Scanner;

public class RechercheTop10VilleFromDepartement implements MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez un code département: ");

        String codeDepartement = scanner.nextLine();

        List<Ville> listeVille = recensement.getTop10VilleFromDepartementName(codeDepartement);
        for (Ville ville : listeVille) {
            System.out.println(ville.toString());
        }
    }
}
