package TD5.ex1;

public class Main {
    public static void main(String[] args) {
        A a = new A(); a.affiche();
        B b = new B(); b.affiche();
        a = b;   a.affiche();
        System.out.println("---------------------------");
        C c = new C(); c.affiche();
        a = c;   a.affiche();
        System.out.println("---------------------------");
        D d = new D(); d.affiche();
        a = d;   a.affiche();
        c = d;   c.affiche();
        System.out.println("---------------------------");
        E e = new E(); e.affiche();
        a = e;   a.affiche();
        b = e;   b.affiche();
        System.out.println("---------------------------");
        F f = new F(); f.affiche();
        a = f; a.affiche();
        c = f; c.affiche();
        System.out.println("---------------------------");
    }
}
