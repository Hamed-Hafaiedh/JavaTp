package TD1;

public class ex2 {
        public static void main(String[] args) {
            // 1. Créer un tableau de 5 entiers
            int[] nombres = new int[5];

            // 2. Remplir le tableau avec des valeurs || int[] nombres = {10, 20, 30, 40, 50};
            nombres[0] = 10;
            nombres[1] = 20;
            nombres[2] = 30;
            nombres[3] = 40;
            nombres[4] = 50;

            // 3. Afficher le contenu du tableau de deux manières différentes

            // Méthode 1 : Boucle for classique
            System.out.println("Affichage avec une boucle for :");
            for (int i = 0; i < nombres.length; i++) {
                System.out.println("Élément " + i + " : " + nombres[i]);
            }

            // Méthode 2 : Boucle for-each
            System.out.println("\nAffichage avec une boucle for-each :");
            for (int valeur : nombres) {
                System.out.println(valeur);
            }
            //4. calculer la somme des element du tableau
            int sum=0;
            // 5. Trouver le plus grand et le plus petit élément
            int max = nombres[0];
            int min = nombres[0];
            for (int valeur : nombres) {
                sum+=valeur;
                if (valeur > max) max = valeur;
                if (valeur < min) min = valeur;
            }
            System.out.println("Plus grand élément : " + max);
            System.out.println("Plus petit élément : " + min);
            System.out.println("la somme est : "+sum);
        }
    }

