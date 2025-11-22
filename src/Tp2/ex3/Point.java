package Td2.ex3;
import java.lang.Math;
public class Point {
    private double x;
    private double y;

    public Point(double x,double y){
        this.x=x;
        this.y= y;
    }
    public static double distance(Point p1,Point p2){
        double xs=p2.x - p1.x;
        double ys=p2.y - p1.y;
        return Math.sqrt((Math.pow(xs,2))+(Math.pow(ys,2)));
    }
    public void affiche() {
        System.out.println("Point{" + "x=" + x + ", y=" + y + '}');
    }

}
