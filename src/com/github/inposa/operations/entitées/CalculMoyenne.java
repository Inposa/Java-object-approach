package com.github.inposa.operations.entitées;

import java.util.Arrays;

public class CalculMoyenne {
    private double[] values;

    public CalculMoyenne() {
        this.values = new double[0];
    }

    public void addValue(double newValue) {
        // Agrandir taille tableau
        this.values = Arrays.copyOf(this.values, this.values.length + 1);

        //ajouter valeur
        this.values[this.values.length - 1] = newValue;
    }

    public void addValues(double... values) {
        //Pour ajouter plusieurs valeurs dans le tableau en une seule méthode
        if (values.length > 0) {
            for (double value : values) {
                this.addValue(value);
            }
        }
    }

    public double calculMoyenne() {
        double sum = 0;
        for (double value : this.values) {
            sum += value;
        }

        return sum / this.values.length;
    }

    @Override
    public String toString() {
        return "CalculMoyenne{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
