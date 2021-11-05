package com.github.inposa.banque.entites;

public class Credit extends Operation {
    public Credit() {
    }

    public Credit(String date, int montant) {
        super(date, montant);
    }

    @Override
    public String getType() {
        return "CREDIT";
    }
}
