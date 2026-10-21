package tp2m1;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Exercice4e {
    public static void main(String[] args) {
    	String lien = "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf";
    	String destination = "telechargement.pdf";

        try {
            URL url = new URL(lien);
            URLConnection connexion = url.openConnection();

            try (BufferedInputStream bis =
                         new BufferedInputStream(
                                 connexion.getInputStream());
                 BufferedOutputStream bos =
                         new BufferedOutputStream(
                                 new FileOutputStream(destination))) {

                int a;

                while ((a = bis.read()) != -1) {
                    bos.write(a);
                }
            }

            System.out.println("Téléchargement terminé.");

        } catch (IOException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}


