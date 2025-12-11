package TD2.ex1;

public class Point {
    private char nom;
    private double absice;

    public Point(){
    }
    public Point(char nom , double absice){
        this.nom=nom;
        this.absice=absice;
    }

    public void  setNom(char nom){
        this.nom=nom;
    }
    public char getName(){
        return this.nom;
    }

    public void setAbsice(double absice) {
        this.absice = absice;
    }
    public double getAbsice(){
        return this.absice;
    }

    public void affiche(){
        System.out.println("nom :" + this.nom +" "+ "absice :" + this.absice);
    }
    public double translate(double val){
        return this.absice+=val;
    }


}
