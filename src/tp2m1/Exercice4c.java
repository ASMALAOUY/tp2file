package tp2m1;


import java.io.*;

public class Exercice4c {
    public static void main(String[] args) {
        try (BufferedInputStream bis =
                     new BufferedInputStream(
                             new FileInputStream("src/tp2m1/source.pdf"));
             BufferedOutputStream bos =
                     new BufferedOutputStream(
                             new FileOutputStream("src/tp2m1/cop ie.pdf"))) {

            int a;

            while ((a = bis.read()) != -1) {
                bos.write(a);
            }

            System.out.println("Copie terminée.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

