package com.github.inposa.recensement.utils;

import java.text.NumberFormat;

public class Utils {
    public static String decimalFormat(int nbr) {
        NumberFormat format = NumberFormat.getInstance();
        format.setGroupingUsed(true);

        return format.format(nbr);
    }

    /**
     * Permet de formater un string pour qu'il soit comparable quel que soit sa case ou les espace qu'il contient
     * @param str le string à formater
     * @return retourne le string formaté
     */
    public static String formatString(String str) {
        String str2 = str.toLowerCase();
        str2 = str2.trim();

        return str2;
    }

}
