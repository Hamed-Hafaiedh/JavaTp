package TD4.ex3;

public class Article {
    private int reference;
    private String descriptif;
    private String marque;
    private Double prixUnitaire;

    public Article(){}
    public Article(int reference,String descriptif,String marque,Double prixUnitaire){
        this.reference=reference;
        this.descriptif=descriptif;
        this.marque=marque;
        this.prixUnitaire=prixUnitaire;
    }
    public double getPrix(){
        return this.prixUnitaire;
    }
    public String toString(){
        return "--ref: "+reference+"--descr: "+descriptif+"--marque: "+marque+"--pu: "+prixUnitaire;
    }

}
