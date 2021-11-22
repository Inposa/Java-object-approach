package com.github.inposa.chaines.manipulation;

import com.github.inposa.chaines.manipulation.entites.Salarie;

import java.util.Arrays;

public class ManipulationChaine {
    public static void main(String[] args) {
        String chaine1 = "Hippo;Pech;2 523.5";
        System.out.println("Chaine de charactères: " + chaine1);

        char premierChar = chaine1.charAt(0);
        System.out.println("Premier char: " + premierChar);

        int longueurChaine = chaine1.length();
        System.out.println("Longueur chaine: " + longueurChaine);

        int indexFirstSemiColon = chaine1.indexOf(';');
        System.out.println("Index du premier point virgule: " + indexFirstSemiColon);

        int indexSecondSemiColon = chaine1.indexOf(';', indexFirstSemiColon + 1);
        String lastname = chaine1.substring(indexFirstSemiColon + 1, indexSecondSemiColon);
        System.out.println("Nom de famille : [Normal: " + lastname + ", Majuscule: " + lastname.toUpperCase() + ", Minuscule: " + lastname.toLowerCase() + "]");

        chaine1 = chaine1.replace(" ", "");

        String[] chaineSplit = chaine1.split(";");
        System.out.println("Chaine splitée : " + Arrays.toString(chaineSplit));

        Salarie salarie = new Salarie(chaineSplit[0], chaineSplit[1], Float.parseFloat(chaineSplit[2]));
        System.out.println(salarie.toString());

    }
}
