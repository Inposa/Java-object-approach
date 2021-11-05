package com.github.inposa.maison.entites;

public abstract class Piece {
    private int etage;
    private float superficie;

    public Piece(int etage, float superficie) {
        this.etage = etage;
        this.superficie = superficie;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public String getPieceType(){
        return this.getClass().getSimpleName();
    }
}
