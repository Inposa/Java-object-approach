package com.github.inposa.enumeration.tests;

import com.github.inposa.enumeration.entities.Continent;
import com.github.inposa.enumeration.entities.Ville;

import java.util.ArrayList;
import java.util.List;

public class TestContinent {
    public static void main(String[] args) {

        List<Ville> villeList = new ArrayList<>();

        villeList.add(new Ville("New York", 10, Continent.Amerique));
        villeList.add(new Ville("Paris", 10, Continent.Europe));
        villeList.add(new Ville("Pékin", 10, Continent.Asie));
        villeList.add(new Ville("Moscou", 10, Continent.Asie));
        villeList.add(new Ville("Berlin", 10, Continent.Europe));
        villeList.add(new Ville("Sydney", 10, Continent.Oceanie));
        villeList.add(new Ville("Sao Paulo", 10, Continent.Amerique));
        villeList.add(new Ville("Dakar", 10, Continent.Afrique));

        for (Ville ville : villeList){
            System.out.println(ville.toString());
        }
    }
}