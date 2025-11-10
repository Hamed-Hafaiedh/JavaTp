package Tp.ex2;

public class Main {
    public static void main(String[] args) {

        int z, x, y, somme;
        float q, diviseur;

        // Initialisation
        x = 5;
        y = 3;
        z = 0;
        q = 10;
        diviseur = 3;
        int compteur = 12;
        int total = 20;

        // Q1
        z = x++ + y;

        // Q2
        if (compteur > 10) {
            System.out.println("compteur est plus grand que 10");
        }

        // Q3
        total -= --x;

        // Q4
        q = q % diviseur;
        q %= diviseur;

        // Q5
        x = 1;
        somme = 0;

        while (x != 11) {
            somme += x;
            x++;
        }

        System.out.println("la somme est : " + somme);
    }
}
