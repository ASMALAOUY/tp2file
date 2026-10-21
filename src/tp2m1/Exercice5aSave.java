
package tp2m1;

import java.io.*;
import java.util.*;

public class Exercice5aSave {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();

        liste.add("Java");
        liste.add("Python");
        liste.add("C++");
        liste.add("PHP");

        try (ObjectOutputStream oos =
                 new ObjectOutputStream(
                     new FileOutputStream("liste.ser"))) {

            oos.writeObject(liste);

            System.out.println("Liste enregistrée.");

        } catch (IOException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
