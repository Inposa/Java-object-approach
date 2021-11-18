package com.github.inposa.recensement.tests;

import com.github.inposa.recensement.entities.FileParser;
import com.github.inposa.recensement.entities.Ville;

import java.io.IOException;
import java.util.List;

public class TestHashVilles {
    public static void main(String[] args) {
        FileParser parser = new FileParser("C:\\Users\\Inposa\\IdeaProjects\\" +
                "approche-objet\\files\\recensement.csv");

        try {
            List<Ville> testHashVille = parser.parseFile();

        } catch (IOException exception) {
            System.err.println(exception);
        }
    }
}
