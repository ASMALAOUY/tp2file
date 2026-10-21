
package tp2m1;

import java.io.Serializable;

public class Personne implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nom;
    private int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Nom : " + nom + ", Age : " + age;
    }
}
