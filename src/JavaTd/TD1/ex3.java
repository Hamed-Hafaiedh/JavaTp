package TD1;


import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("entrer votre prenom :");
        String prenom = read.next();

        System.out.println("le prenom en majuscule est :"+prenom.toUpperCase());
        System.out.println("la loungeur de prenom est :"+prenom.length());
        System.out.println("la premier lettre de prenom est :"+prenom.charAt(0));
    }
}
