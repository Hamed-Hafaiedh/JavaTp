package TD5.ex8;

import java.util.HashMap;
import java.util.Map;

public class Foot extends Collectif{
    private Map<String,Integer> score= new HashMap<String,Integer>();

    public Foot(int butEqui1,int butEqui2,int nbJ){
        super("Football");
        if(butEqui1<9 && butEqui2<9){
            score.put("equipe1",butEqui1);
            score.put("equipe2",butEqui2);
        }
        this.nbJoueurs=nbJ;
    }
    public boolean Gagner() {
        return (score.get("equipe1") > score.get("equipe2"));
    }

    public String toString() {
        String resultat;
        if (Gagner() == true) {
            resultat = " gagné ";
        } else {
            resultat = " perdu ";
        }
        return "l’équipe a " + resultat + " avec le score "
                + score.get("Equipe1") + "-" + score.get("Equipe2");
    }
}