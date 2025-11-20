package TD2.ex3;

public class EssaiRectangle {
    public static void main(String[] args) {
        // Création du premier rectangle avec constructeur à 2 paramètres
        Rectangle r1 = new Rectangle(8, 4);

        // Création du deuxième rectangle avec constructeur sans paramètre
        Rectangle r2 = new Rectangle();

        System.out.println("=== Rectangle r1 ===");
        r1.afficher();

        System.out.println("=== Rectangle r2 ===");
        r2.afficher();

        // Modification des dimensions de r1
        r1.modifierRectangle(12, 6);
        System.out.println("=== Après modification de r1 ===");
        r1.afficher();
    }
}

