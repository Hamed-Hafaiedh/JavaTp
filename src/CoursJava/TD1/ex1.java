package TD1;

public class ex1 {
    public static void main(String[] args) {
        // 1. Affichage du prénom, nom et âge
        System.out.println("Prénom: Marie");
        System.out.println("Nom: Dupont");
        System.out.println("Âge: 25");

        // 2. Opérations avec deux variables
        int entier = 15;
        double decimal = 4.5;

        System.out.println("\n--- Opérations de base ---");
        System.out.println("Somme: " + String.format("%.2f", entier + decimal));
        System.out.println("Différence: " + String.format("%.2f", entier - decimal));
        System.out.println("Produit: " + String.format("%.2f", entier * decimal));
        System.out.println("Division: " + String.format("%.2f", entier / decimal));

        // 3. Variables de différents types
        int a = 10, b = 3;
        double x = 2.5, y = 4.8, z = 3.1;

        System.out.println("\n--- Calculs divers ---");
        // Somme de deux entiers
        System.out.println("Résultat: " + (a + b));

        // Moyenne de trois doubles
        double moyenne = (x + y + z) / 3;
        System.out.println("Moyenne: " + String.format("%.2f", moyenne));

        // Vérification pair/impair
        int nombreTest = a;
        if (nombreTest % 2 == 0) {
            System.out.println("Le nombre " + nombreTest + " est pair");
        } else {
            System.out.println("Le nombre " + nombreTest + " est impair");
        }
    }
}