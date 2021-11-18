package com.github.inposa.recensement.display;

import com.github.inposa.recensement.entities.FileParser;
import com.github.inposa.recensement.entities.Recensement;

import java.util.Scanner;

public class MenuFillRecensement implements MenuService {
    private FileParser fileParser;
    //private String pathName;

    public MenuFillRecensement(String pathName) {
        this.fileParser = new FileParser(pathName);
    }

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {

    }
}
