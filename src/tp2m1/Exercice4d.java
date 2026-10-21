package tp2m1;


import java.io.*;

public class Exercice4d {
    public static void main(String[] args) {
        try (BufferedReader br =
                     new BufferedReader(
                             new FileReader("src/tp2m1/source.txt"));
             BufferedWriter bw =
                     new BufferedWriter(
                             new FileWriter("src/tp2m1/copie.txt"))) {

            String ligne;

            while ((ligne = br.readLine()) != null) {
                bw.write(ligne.toUpperCase());
                bw.newLine();
            }

            System.out.println("Copie modifiée terminée.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

