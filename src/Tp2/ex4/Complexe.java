package Td2.ex4;

public class Complexe {
    private double reel;
    private double imag;

    public Complexe(double reel, double imag) {
        this.reel = reel;
        this.imag = imag;
    }

    public String info() {
        return "(" + reel + " + i" + imag + ")";
    }

    public Complexe produit(Complexe z) {
        double x1 = this.reel;
        double y1 = this.imag;

        double x2 = z.reel;
        double y2 = z.imag;

        double r = x1 * x2 - y1 * y2;
        double i = x1 * y2 + y1 * x2;

        return new Complexe(r, i);
    }

    public static Complexe produit(Complexe z1, Complexe z2) {
        double x1 = z1.reel;
        double y1 = z1.imag;

        double x2 = z2.reel;
        double y2 = z2.imag;

        double r = x1 * x2 - y1 * y2;
        double i = x1 * y2 + y1 * x2;

        return new Complexe(r, i);
    }
}
