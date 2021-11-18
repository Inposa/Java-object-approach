package com.github.inposa.recensement.display;

import com.github.inposa.recensement.entities.Recensement;
import java.util.Scanner;

public interface MenuService {
    void traiter(Recensement recensement, Scanner scanner);
}
