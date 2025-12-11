package TD4.ex3;

public class RamettePapier extends Article {
    private int grammage;
    public RamettePapier(int reference, String descriptif, String marque, Double prixUnitaire,int grammage){
        super(reference,descriptif,marque,prixUnitaire);
        this.grammage=grammage;
    }

    @Override
    public String toString() {
        return super.toString()+"RamettePapier{" + "grammage=" + grammage + '}';
    }
}
