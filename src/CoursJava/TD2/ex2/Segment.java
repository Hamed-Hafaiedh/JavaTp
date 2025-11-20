package TD2.ex2;
import java.lang.Math;     // (optionnel) importe une bibliothèque
public class Segment {
    private int extr1;
    private int extr2;

    //constructeurs
    public Segment(){}
    public Segment(int extr1,int extr2){
        this.extr1=extr1;
        this.extr2=extr2;
    }
    //getters && setters
    public int getExtr1(){
        return this.extr1;
    }
    public int getExtr2(){
        return this.extr2;
    }

    // Méthode pour calculer la longueur du segment
    public double longueur() {
        return Math.abs(extr2 - extr1);
    }

    // Redéfinition de la méthode toString()
    @Override
    public String toString() {
        return "Segment [" + extr1 + " ; " + extr2 + "]";
    }
}