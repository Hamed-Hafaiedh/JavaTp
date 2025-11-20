package TD1;

import java.util.Scanner;

public class ex5 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Demander le nombre de lignes
            System.out.print("Entrez le nombre de lignes du triangle : ");
            int lignes = input.nextInt();

            // Boucles imbriquées pour construire le triangle
            for (int i = 1; i <= lignes; i++) {
                // Afficher les espaces avant les étoiles
                for (int j = i; j < lignes; j++) {
                    System.out.print(" ");
                }

                // Afficher les étoiles
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }

                // Aller à la ligne suivante
                System.out.println();
            }

            input.close();
        }
    }

