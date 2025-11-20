package TD3.ex1;

import java.awt.Color;

public class Cercle {
    private Point2D centre;
    private double rayon;
    private Color couleur;

    // Constructeur 1 : valeurs par défaut
    public Cercle() {
        this.centre = new Point2D(); // (0,0)
        this.rayon = 2.0;
        this.couleur = Color.RED;
    }

    // Constructeur 2 : avec rayon et couleur
    public Cercle(double r, Color c) {
        this.centre = new Point2D();
        this.rayon = r;
        this.couleur = c;
    }

    // Constructeur 3 : avec rayon, couleur et centre
    public Cercle(double r, Color c, Point2D centre) {
        this.centre = centre;
        this.rayon = r;
        this.couleur = c;
    }

    // Méthode move
    public void move(double dx, double dy) {
        double newX = centre.getX() + dx;
        double newY = centre.getY() + dy;
        centre.setX(newX);
        centre.setY(newY);
    }

    // Version 1 de affiche() : en réutilisant la méthode affiche() de Point2D
    public void affiche() {
        System.out.println("Cercle : ");
        centre.affiche();
        System.out.println("Rayon : " + rayon);
        System.out.println("Couleur : " + couleur);
    }

    // Version 2 de affiche() : sans réutiliser Point2D.affiche()
    public void afficheV2() {
        System.out.println("Cercle [Centre=(" + centre.getX() + ", " + centre.getY() + "),"
                + " Rayon=" + rayon + ", Couleur=" + couleur + "]");
    }
}

