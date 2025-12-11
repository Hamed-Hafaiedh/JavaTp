package TD5.ex1;
//class a
public class A {
        public void affiche() {
            System.out.print("Je suis un A ");}
    }
    //class b
    class B extends A {}
//class c
    class C extends A {
        public void affiche() {
            System.out.print("Je suis un C ");}
}
//class d
    class D extends C {
        public void affiche() {
            System.out.print("Je suis un D ");}
}
    class E extends B {}



    class F extends C {}