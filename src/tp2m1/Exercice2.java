package tp2m1;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercice2 {

    public static void lister(String chemin) {
        File dossier = new File(chemin);

        if (!dossier.exists() || !dossier.isDirectory()) {
            System.out.println("Répertoire invalide !");
            return;
        }

        File[] fichiers = dossier.listFiles();

        if (fichiers == null) {
            return;
        }

        SimpleDateFormat format =
                new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        for (File f : fichiers) {
            if (f.isDirectory()) {
                System.out.println("[Dossier] " + f.getName());
                lister(f.getAbsolutePath());
            } else {
                String date = format.format(
                        new Date(f.lastModified()));

                System.out.println(
                        f.getName()
                        + " | Date : " + date
                        + " | Taille : " + f.length() + " octets");
            }
        }
    }

    public static void main(String[] args) {
        lister("C:\\Users\\X1 YOGA\\Desktop\\master isi\\poo\\tp2");
    }
}

