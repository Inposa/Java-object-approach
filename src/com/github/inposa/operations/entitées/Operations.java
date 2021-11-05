package com.github.inposa.operations.entitées;

public class Operations {
    public static double calcul(double a, double b, char operator) {
        double answer = 0;
        if (operator == '+') {
            answer = a + b;
        } else if (operator == '-') {
            answer = a - b;
        } else if (operator == '/') {
            answer = a / b;
        } else if (operator == '*') {
            answer = a * b;
        }
        return answer;
    }
}
