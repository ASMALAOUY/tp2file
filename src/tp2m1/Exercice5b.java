
package tp2m1;

import java.io.*;

public class Exercice5b {

    public static void SavePersonneToFile(Personne p) {
        try (ObjectOutputStream oos =
                 new ObjectOutputStream(
                     new FileOutputStream("personne.ser"))) {

            oos.writeObject(p);
            System.out.println("Personne enregistrée.");

        } catch (IOException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }

    public static Personne getPersonneFromFile() {
        try (ObjectInputStream ois =
                 new ObjectInputStream(
                     new FileInputStream("personne.ser"))) {

            return (Personne) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erreur : " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        Personne p1 = new Personne("Asma", 22);

        SavePersonneToFile(p1);

        Personne p2 = getPersonneFromFile();

        if (p2 != null) {
            System.out.println(p2);
        }
    }
}
