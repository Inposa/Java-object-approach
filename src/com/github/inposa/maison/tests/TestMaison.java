package com.github.inposa.maison.tests;

import com.github.inposa.maison.entites.Maison;
import com.github.inposa.maison.entites.SalleDeBain;
import com.github.inposa.maison.entites.Salon;
import com.github.inposa.maison.entites.WC;

public class TestMaison {
    public static void main(String[] args) {
        Maison maison = new Maison();

        maison.ajouterPiece(new Salon(0, 20));
        maison.ajouterPiece(new WC(0, 50));
        maison.ajouterPiece(new SalleDeBain(2, 10));
        maison.ajouterPiece(new SalleDeBain(2, 10));
        maison.ajouterPiece(new SalleDeBain(2, 10));
        maison.ajouterPiece(new SalleDeBain(2, 10));
        maison.ajouterPiece(new SalleDeBain(2, 10));

        System.out.println(maison.getSuperficieByEtage(0) + ", " + maison.getSuperficieTotale());

        System.out.println(maison.getPieceNumberByType("Salle De Bain")+", "+maison.getSuperficieByPieceType("salle de bain"));


    }
}
