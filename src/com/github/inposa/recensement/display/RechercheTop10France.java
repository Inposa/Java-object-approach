package com.github.inposa.recensement.display;

import com.github.inposa.recensement.entities.Recensement;

import java.util.Scanner;

public class RechercheTop10France implements MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println(recensement.getTop10VillesFrance().toString());
    }
}
