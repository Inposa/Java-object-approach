package com.github.inposa.recensement.entities;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FileParser {

    private Path path;

    public FileParser(String pathName) {
        this.path = Paths.get(pathName);
    }

    public List<Ville> parseFile() throws IOException {
        List<Ville> listVille = new ArrayList<>();

        if (Files.exists(this.path)) {
            List<String> lines = Files.readAllLines(this.path, StandardCharsets.UTF_8);
            String[] labels = lines.get(0).split(";");
            for (int i = 1; i < lines.size(); i++) {
                Ville ville = parseStringIntoVille(lines.get(i));
                if (ville.getNomCommune().equals("Paris")) {
                    System.out.println("Extracted from file " + ville.toString());
                }
                //hashmap.put(ville.getNomCommune(), ville);
                listVille.add(ville);
            }
        }
        return listVille;
    }

    private Ville parseStringIntoVille(String str) {
        String str2 = str.replaceAll("null", "-1");

        String[] array = str2.split(";");

        //this is crap
        return new Ville(new Region(Integer.parseInt(array[0].replaceAll("\\s+", "")), array[1]),
                new Departement(array[2]), Integer.parseInt(array[5].replaceAll("\\s+", "")),
                array[6], Integer.parseInt(array[9].replaceAll("\\s+", "")));
    }

}
