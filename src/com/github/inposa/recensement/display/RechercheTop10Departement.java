package com.github.inposa.recensement.display;

import com.github.inposa.recensement.entities.Departement;
import com.github.inposa.recensement.entities.Recensement;

import java.util.List;
import java.util.Scanner;

public class RechercheTop10Departement implements MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        List<Departement> listeDepartement = recensement.getTop10Departements();
        for (Departement departement : listeDepartement) {
            System.out.println(departement.toString());
        }
    }
}
