package com.github.inposa.recensement.display;

import com.github.inposa.recensement.entities.Recensement;
import com.github.inposa.recensement.entities.Ville;

import java.util.List;
import java.util.Scanner;

public class RechercheTop10VilleFromRegion implements MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez un nom de région: ");

        String nomRegion = scanner.nextLine();

        List<Ville> listeVille = recensement.getTop10VilleFromRegionName(nomRegion);
        for (Ville ville : listeVille) {
            System.out.println(ville.toString());
        }
    }
}
