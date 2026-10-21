package tp2m1;


import java.io.File;
import java.io.FilenameFilter;

public class Exercice3b {
    public static void main(String[] args) {
        File dossier = new File("C:\\Windows\\System32");

        FilenameFilter filtre = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String nom) {
                return nom.toLowerCase().endsWith(".exe");
            }
        };

        String[] fichiers = dossier.list(filtre);

        if (fichiers != null) {
            for (String nom : fichiers) {
                System.out.println(nom);
            }
        }
    }
}

