package com.github.inposa.banque.entites.test;

import com.github.inposa.banque.entites.Compte;
import com.github.inposa.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte1 = new Compte(1,69420);
        //System.out.println(compte1.toString());

        Compte compte2 = new CompteTaux(2,900,5);
        Compte[] arrayComptes = {compte1,compte2};

        for(Compte compte : arrayComptes){
            System.out.println(compte.toString());
        }

    }

}
