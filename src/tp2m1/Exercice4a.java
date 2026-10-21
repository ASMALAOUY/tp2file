package tp2m1;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercice4a {
    public static void main(String[] args) {
    	String source = "src/tp2m1/source.pdf";
    	String destination = "src/tp2m1/copie.pdf";

        try (FileInputStream fis =
                     new FileInputStream(source);
             FileOutputStream fos =
                     new FileOutputStream(destination)) {

            int octet;

            while ((octet = fis.read()) != -1) {
                fos.write(octet);
            }

            System.out.println("Copie terminée.");

        } catch (IOException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}

