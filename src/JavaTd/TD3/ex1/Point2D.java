package TD3.ex1;

public class Point2D {
    private double x;
    private double y;

    // Constructeur par défaut
    public Point2D() {
        this.x = 0.0;
        this.y = 0.0;
    }

    // Constructeur avec paramètres
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Méthode d'affichage
    public void affiche() {
        System.out.println("Coordonnées du point : (" + this.x + ", " + this.y + ")");
    }
}