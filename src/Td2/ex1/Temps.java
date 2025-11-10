package Td2.ex1;

public class Temps {
    private int heure;
    private int minute;
    private int seconde;

    public Temps(int heure) {
        this.heure = heure;
    }

    public Temps(int heure, int minute) {
        this.heure = heure;
        this.minute = minute;
    }

    public Temps(int heure, int minute, int seconde) {
        this.heure = heure;
        this.minute = minute;
        this.seconde = seconde;
    }
    public void affiche(){
        System.out.println("Il est "+heure+" heures :"+minute+" minutes :"+seconde+" secondes ");
    }

}

