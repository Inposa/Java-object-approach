package com.github.inposa.adresses.entites.utils;

import java.util.Random;

public class TestMethodeStatic {
    public static void main(String[] args) {
        String chaine = "12";
        int nombre = Integer.parseInt(chaine);

        Random random = new Random();
        int a = random.nextInt(30);
        int b = random.nextInt(30);
        System.out.println("Entre " + a + " et " + b + " le nombre "
                + Integer.max(a, b) + " est le plus grand !");
    }
}
