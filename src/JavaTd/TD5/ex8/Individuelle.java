package TD5.ex8;

public abstract class Individuelle extends Sport{
    public Individuelle(String type,int nbJoueurs){
        super(type);
        super.nbJoueurs=nbJoueurs;
    }
}
