
package tp2m1;

import java.io.*;
import java.util.ArrayList;

public class Exercice5aRead {
    public static void main(String[] args) {
        try (ObjectInputStream ois =
                 new ObjectInputStream(
                     new FileInputStream("liste.ser"))) {

            ArrayList<String> liste =
                (ArrayList<String>) ois.readObject();

            for (String s : liste) {
                System.out.println(s);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
