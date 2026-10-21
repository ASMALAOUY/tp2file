package tp2m1;


import java.io.File;
import java.io.FilenameFilter;

public class FiltreFichier implements FilenameFilter {

    private String extension;
    private long size;

    public FiltreFichier(String extension, long size) {
        this.extension = extension;
        this.size = size;
    }

    @Override
    public boolean accept(File dossier, String nom) {
        File fichier = new File(dossier, nom);

        return fichier.isFile()
                && nom.toLowerCase().endsWith(
                        extension.toLowerCase())
                && fichier.length() >= size;
    }
}

