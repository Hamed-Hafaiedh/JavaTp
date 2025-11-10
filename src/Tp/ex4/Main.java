package Tp.ex4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int val1,val2;
        System.out.println("entrer la premier valeur ");
        val1=read.nextInt();
        System.out.println("entrer la dexieme valeur ");
        val2=read.nextInt();

        System.out.println("le max est :"+Math.max(val1,val2));
    }
}
