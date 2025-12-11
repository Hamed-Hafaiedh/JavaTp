package TD5.ex8;

import java.util.LinkedHashSet;
import java.util.Set;

public class Natation extends Individuelle{
    private double Distance;
    private double Time;
    private Set<Double> ListTime=new LinkedHashSet<Double>();

    public Natation(double dist,double Time){
        super("Natation",1);
        this.Distance=dist;
        this.Time=Time;
    }
    public void ajoutListTime(double temps){
        ListTime.add(temps);
    }

    public boolean Gagner(){
        for (double t:ListTime) {
            if(t<this.Time){
                return false;
            }
        }
        return true;
    }
    public String toString(){
        String rts;
        if(Gagner()){
            rts="gagner";
        }else{
            rts="perdu";
        }
        return "Le nageur a parcoucu"+Distance+" mètres en"+Time+"et il a le resultas"+" "+rts+"la course";
    }
}