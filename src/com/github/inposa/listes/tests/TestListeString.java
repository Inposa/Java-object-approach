package com.github.inposa.listes.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeString {
    public static void main(String[] args) {
        List<String> villes = new ArrayList<String>();

        villes.add("Nice");
        villes.add("Carcasonne");
        villes.add("Narbonne");
        villes.add("Lyon");
        villes.add("Foix");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");

        System.out.println("Ville au nom le plus long : " + TestListeString.maxCharStr(villes));
        System.out.println("All majuscules : " + TestListeString.allCaps(villes).toString());
        System.out.println("All N word cities get rekt : "+TestListeString.removeNCities(villes).toString());

    }

    public static String maxCharStr(List<String> list) {
        String maxStr = "";
        for (String str : list) {
            if (str.length() > maxStr.length()) {
                maxStr = str;
            }
        }
        return maxStr;
    }

    public static List<String> allCaps(List<String> list) {
        List<String> listCopy = new ArrayList<>(list);

        for (int i = 0; i < listCopy.size(); i++) {
            listCopy.set(i, listCopy.get(i).toUpperCase());
        }
        return listCopy;
    }

    public static List<String> removeNCities(List<String> list) {
        List<String> listCopy = new ArrayList<>(list);

        Iterator<String> iterator = listCopy.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().charAt(0) == 'N') {
                iterator.remove();
            }
        }

        return listCopy;
    }
}
