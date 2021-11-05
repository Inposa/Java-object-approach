package com.github.inposa.banque;

import com.github.inposa.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte1 = new Compte(1,69420);
        System.out.println(compte1.toString());
    }

}
