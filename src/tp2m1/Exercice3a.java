package tp2m1;


import java.io.File;

public class Exercice3a {
    public static void main(String[] args) {
        File dossier = new File("C:\\Windows\\System32");

        File[] fichiers = dossier.listFiles();

        if (fichiers != null) {
            for (File f : fichiers) {
                if (f.isFile()
                        && f.getName().toLowerCase().endsWith(".exe")) {
                    System.out.println(f.getName());
                }
            }
        }
    }
}

