package com.github.inposa.theatre.tests;

import com.github.inposa.theatre.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre1 = new Theatre("Moulin rouge",60);
        Theatre theatre2 = new Theatre("Mogador",50);
        Theatre theatre3 = new Theatre("Châtelet",20);

        theatre1.inscrire(50,40);
        theatre1.inscrire(50,40);




    }
}
