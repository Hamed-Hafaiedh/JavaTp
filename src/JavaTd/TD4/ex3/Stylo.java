package TD4.ex3;

public class Stylo extends Article {
    private int couleur;

    public Stylo(int reference, String descriptif, String marque, Double prixUnitaire, int couleur) {
        super(reference, descriptif, marque, prixUnitaire);
        this.couleur = couleur;
    }

    @Override
    public String toString() {

        return  super.toString()+"Stylo{" + "couleur=" + couleur + '}';
    }
}
