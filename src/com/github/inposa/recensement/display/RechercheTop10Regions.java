package com.github.inposa.recensement.display;

import com.github.inposa.recensement.entities.Recensement;
import com.github.inposa.recensement.entities.Region;

import java.util.List;
import java.util.Scanner;

public class RechercheTop10Regions implements MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        List<Region> listeRegion = recensement.getTop10Regions();
        for(Region region : listeRegion){
            System.out.println(region.toString());
        }
    }
}
