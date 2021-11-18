package com.github.inposa.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ManipulationFichier {
    public static void main(String[] args) throws IOException {

        String originPath = "C:/Users/Inposa/IdeaProjects/approche-objet/files/";

        Path inPath = Paths.get(originPath + "recensement.csv");
        Path outPath = Paths.get(inPath.getParent()+"/recensementOUT.csv");

        if (Files.exists(inPath) && Files.isReadable(inPath)) {
            List<String> content = Files.readAllLines(inPath, StandardCharsets.UTF_8);

            AbstractSet<String> set = new HashSet<String>();
            for (int i = 1; i < content.size(); i++) {
                Ville ville = ManipulationFichier.stringToVille(content.get(i));
                if (ville.getPopulationTotale() > 25_000) {
                    //Files.write(outPath,ville.getSimpleFormat(), StandardOpenOption.APPEND);
                    set.add(ville.getSimpleFormat());
                }
            }
            Files.write(outPath, set);

            //Ville villeTest = ManipulationFichier.stringToVille(content.get(1));

            //System.out.println(villeTest.toString());
        }
    }

    public static Ville stringToVille(String str) {
        String str2 = str.replaceAll(" ", "");
        str2 = str2.replaceAll("null", "-1");
        //str2 = str2.toLowerCase();
        String[] array = str2.split(";");

        System.out.println(Arrays.toString(array));
        return new Ville(Integer.parseInt(array[0]), array[1], array[2], array[3],
                Integer.parseInt(array[4]), Integer.parseInt(array[5]), array[6], Long.parseLong(array[7]),
                Long.parseLong(array[8]), Long.parseLong(array[9]));
    }
}
