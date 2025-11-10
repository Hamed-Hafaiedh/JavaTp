package Td2.ex3;


public class TestPoint {
    public static void main(String[] args)
    {
        Point p1 = new Point(1.0, 3.0);
        Point p2 = new Point(5.0, 6.0);
        double d = Point.distance(p1,p2);
        p1.affiche( );
        p2.affiche( );

        System.out.println("Distance entre p1 et p2 =" + d);
    }
}
