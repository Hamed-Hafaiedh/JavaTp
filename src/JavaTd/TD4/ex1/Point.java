package TD4.ex1;

public class Point {
    private int x;
    private int y;
    public void initialise(int x, int y) {
        this.x = x;
        this.y = y;}
    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;}
}