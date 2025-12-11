package TD5.ex2;

public class Surcharge {}
    class A {
        public void f(double valDouble) {
            System.out.print("A.f(double=" + valDouble + ") ");
        }
    }
    class B extends A {}
    class C extends A {
        public void f(long valLong) {
            System.out.print("C.f(long=" + valLong + ") ");
        }
    }
    class D extends C {
        public void f(int valInt) {
            System.out.print("D.f(int=" + valInt + ") ");
        }
    }
    class F extends C {
        public void f(float valFloat) {
            System.out.print("F.f(float=" + valFloat + ") ");
        }
        public void f(int valInt) {
            System.out.print("F.f(int=" + valInt + ") ");
        }
    }
