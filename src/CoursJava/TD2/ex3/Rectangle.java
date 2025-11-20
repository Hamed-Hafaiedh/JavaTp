package TD2.ex3;

public class Rectangle {
    // Attributs privés
    private float longueur;
    private float largeur;

    // Constructeur avec paramètres
    public Rectangle(float lar, float lon) {
        this.largeur = lar;
        this.longueur = lon;
    }

    // Constructeur sans paramètres (valeurs par défaut)
    public Rectangle() {
        this.largeur = 10;
        this.longueur = 5;
    }

    public float getPerimetre() {
        return 2 * (this.longueur + this.largeur);
    }

    public float getSurface() {
        return this.longueur * this.largeur;
    }

    public void afficher() {
        System.out.println("Longueur : " + this.longueur);
        System.out.println("Largeur  : " + this.largeur);
        System.out.println("Périmètre : " + getPerimetre());
        System.out.println("Surface   : " + getSurface());
        System.out.println("-----------------------------");
    }

    public void modifierRectangle(float lar, float lon) {
        this.largeur = lar;
        this.longueur = lon;
    }
}