package Tp.ex3;


public class Main {
    public static void main(String[] args) {
        int[] tab={1,2,3,4,5,6,7,8,9,10};
        int somme=0;
        for (int nb:tab) {
            somme+=nb;
        }
        System.out.println("la totale est :"+somme);

        for (int i = 0; i < tab.length / 2; i++) {
            int temp = tab[i];
            tab[i] = tab[tab.length - 1 - i];
            tab[tab.length - 1 - i] = temp;
        }
        System.out.println("l'inverse de tableau est :");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}
