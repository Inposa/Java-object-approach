package com.github.inposa.jdr.tests;

import com.github.inposa.jdr.src.entities.Entity;
import com.github.inposa.jdr.src.entities.Player;
import com.github.inposa.jdr.src.creatures.Loup;
import com.github.inposa.jdr.src.creatures.Troll;

public class TestJDR {
    public static void main(String[] args) {
        System.out.println("Tests sur les entités jdr");

        Entity joueur1 = new Player();
        Entity monstre1 = new Loup();
        Entity monstre2 = new Troll();

        System.out.println(joueur1.toString());
        System.out.println(monstre1.toString());
        System.out.println(monstre2.toString());

    }
}
