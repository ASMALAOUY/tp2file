package tp2m1;


import java.io.File;

public class Exercice3c {
    public static void main(String[] args) {
        File dossier = new File("C:\\Windows\\System32");

        FiltreFichier filtre =
                new FiltreFichier(".exe", 100000);

        String[] fichiers = dossier.list(filtre);

        if (fichiers != null) {
            for (String nom : fichiers) {
                System.out.println(nom);
            }
        }
    }
}

