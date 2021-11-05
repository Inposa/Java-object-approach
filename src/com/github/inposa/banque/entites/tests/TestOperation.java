package com.github.inposa.banque.entites.tests;

import com.github.inposa.banque.entites.Credit;
import com.github.inposa.banque.entites.Debit;
import com.github.inposa.banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {
        Operation operation1 = new Credit("01/01/1964", 69);
        Operation operation2 = new Credit("02/12/1995", 420);
        Operation operation3 = new Debit("5/08/2000", 90);
        Operation operation4 = new Debit("27/04/1998", 600);
        Operation operation5 = new Credit("05/11/2021", 1000);

        Operation[] operationsArray = {operation1, operation2, operation3, operation4, operation5};

        int montantTotal = 0;
        for (Operation operation : operationsArray) {
            System.out.println(operation.toString());
            if (operation.getType().equals("CREDIT")) {
                montantTotal += operation.getMontantOperation();
            } else if (operation.getType().equals("DEBIT")) {
                montantTotal -= operation.getMontantOperation();
            }
        }

        System.out.println("Montant total des opération : " + montantTotal);

    }
}
