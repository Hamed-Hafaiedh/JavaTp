package TD5.ex8;

public class PatinageArtistique extends Individuelle{
    private double note;
    private static double MaxNote=0;

    public PatinageArtistique(double note){
        super("Patinage",1);
        this.note=note;
        if(note>MaxNote){
            MaxNote=note;
        }
    }
    public boolean Gagner(){
        return note==MaxNote;
    }
    public String toString(){
        return "Le candidat a eu la note"+note;
    }
}