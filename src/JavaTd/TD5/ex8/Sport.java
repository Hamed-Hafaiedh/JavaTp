package TD5.ex8;

public abstract class Sport {
    protected String type;
    protected int nbJoueurs;

    public Sport(String type) {
        this.type = type;
    }

    public abstract boolean Gagner();

    public String toString(){
        return  "Le sport est de type"+" "+ type+
                "et fait intervenir"+" "+nbJoueurs+ "joueurs";
    }
}
