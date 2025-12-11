package TD3.ex1;

import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // 1er cercle : constructeur par défaut
        Cercle c1 = new Cercle();

        // 2e cercle : constructeur avec rayon et couleur
        Cercle c2 = new Cercle(5.0, Color.BLUE);

        // 3e cercle : constructeur complet
        Point2D p = new Point2D(3.0, 4.0);
        Cercle c3 = new Cercle(10.0, Color.GREEN, p);

        // Affichage initial
        System.out.println("=== Avant déplacement ===");
        c1.affiche();
        c2.affiche();
        c3.affiche();

        // Déplacement des cercles
        c1.move(2, 3);
        c2.move(-1, 2);
        c3.move(5, -2);

        // Affichage après déplacement
        System.out.println("\n=== Après déplacement ===");
        c1.afficheV2();
        c2.afficheV2();
        c3.afficheV2();
    }
}

