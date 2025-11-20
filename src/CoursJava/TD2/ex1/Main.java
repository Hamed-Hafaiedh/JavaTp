package TD2.ex1;

public class Main {
    public static void main(String[] args) {
        Point p1= new Point('A',5.5);
        System.out.println(p1.getName());
        System.out.println(p1.getAbsice());
        p1.affiche();
        System.out.println("apres transaction :" + p1.translate(2) );

    }
}
