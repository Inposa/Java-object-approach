package com.github.inposa.operations.tests;

import com.github.inposa.operations.entitées.Operations;

public class TestOperations {
    public static void main(String[] args) {
        double A = 10.5;
        double B = 5;

        System.out.println(A + " + " + B + " = " + Operations.calcul(A, B, '+'));
        System.out.println(A + " - " + B + " = " + Operations.calcul(A, B, '-'));
        System.out.println(A + " / " + B + " = " + Operations.calcul(A, B, '/'));
        System.out.println(A + " x " + B + " = " + Operations.calcul(A, B, '*'));
    }
}
