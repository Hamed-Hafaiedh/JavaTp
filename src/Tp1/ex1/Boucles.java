package Tp.ex1;

public class Boucles {
    public static void main (String [] args)
    {
        int a = 0;
        do
        {
            System.out.println("java");
            a++;
        }
        while(a < 5);
        System.out.println("valeur de a en sortie de boucle = " + a);
        System.out.println();

        int b = 0;
        do
        {
            System.out.println("java");
            b++;
        }
        while(a < -1);
        System.out.println("valeur de b en sortie de boucle = " + b);
        System.out.println();

        int c = 0;
        while(c < 0)
        {
            System.out.println("java");
            c++;
        }
        System.out.println("valeur de c en sortie de boucle = " + c);
    }
}