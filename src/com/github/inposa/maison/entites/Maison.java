package com.github.inposa.maison.entites;

import com.github.inposa.maison.utils.Utils;

import java.util.Arrays;

public class Maison {
    private Piece[] pieces;

    public Maison() {
        this.pieces = new Piece[0];
    }

    public void ajouterPiece(Piece newPiece) {
        //Détection des données incohérentes (valeur null, étage ou superficie négative)
        if (!(newPiece == null || newPiece.getEtage() < 0 || newPiece.getSuperficie() <= 0)) {
            this.pieces = Arrays.copyOf(this.pieces, this.pieces.length + 1);
            this.pieces[this.pieces.length - 1] = newPiece;
        }
    }

    public float getSuperficieTotale() {
        float sum = 0;
        for (Piece piece : this.pieces) {
            sum += piece.getSuperficie();
        }

        return sum;
    }

    public float getSuperficieByEtage(int etage) {
        float sum = 0;
        for (Piece piece : this.pieces) {
            if (piece.getEtage() == etage) {
                sum += piece.getSuperficie();
            }
        }
        return sum;
    }

    public float getSuperficieByPieceType(String pieceName) {
        String name = Utils.nameFormat(pieceName);

        float sum = 0;
        for (Piece piece : this.pieces) {
            if (Utils.nameFormat(piece.getPieceType()).equals(name)) {
                sum += piece.getSuperficie();
            }
        }
        return sum;
    }

    public int getPieceNumberByType(String pieceName) {
        String name = Utils.nameFormat(pieceName);
        int nbr = 0;
        for (Piece piece : this.pieces) {
            if (Utils.nameFormat(piece.getPieceType()).equals(name)) {
                nbr++;
            }
        }
        return nbr;
    }

}
