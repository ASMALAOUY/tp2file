package tp2m1;


import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double somme = 0;
        int compteur = 0;
        double nombre;

        System.out.print("Donner les nombres (terminer par -1) : ");

        while (true) {
            nombre = sc.nextDouble();

            if (nombre == -1) {
                break;
            }

            if (nombre >= 0) {
                somme += nombre;
                compteur++;
            }
        }

        if (compteur > 0) {
            double moyenne = somme / compteur;
            System.out.println("Moyenne : " + moyenne);
        } else {
            System.out.println("Aucun nombre valide.");
        }

        sc.close();
    }
}
