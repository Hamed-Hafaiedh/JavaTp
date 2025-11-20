package TD1;

import java.util.Random;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Générer un nombre aléatoire entre 0 et 10
        int nombreAleatoire = rand.nextInt(11);

        // Demander à l'utilisateur de saisir un nombre
        int nombreUtilisateur;
        do {
            System.out.print("Devine un nombre entre 0 et 10 : ");
            nombreUtilisateur = input.nextInt();
        }while (nombreUtilisateur<0 || nombreUtilisateur>10);

        // Comparer les deux valeurs
        if (nombreUtilisateur == nombreAleatoire) {
            System.out.println("🎉 Vous avez gagné !");
        } else {
            System.out.println("😢 Vous avez perdu !");
            System.out.println("Le nombre à deviner était : " + nombreAleatoire);
        }

        input.close();
    }
}
