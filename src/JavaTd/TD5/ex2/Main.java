package TD5.ex2;

import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) {
        byte valByte = 1;
        short valShort = 2;
        int valInt = 3;
        long valLong = 4;
        float valFloat = 5.f;
        double valDouble = 6.0;

        System.out.println("** A **");
        A objA = new A();
        objA.f(valByte);
        objA.f(valFloat);
        System.out.println("\n** B **");
        B objB = new B();
        objB.f(valByte);
        objB.f(valFloat);
        objA = objB;
        objA.f(valByte);
        objA.f(valFloat);

        System.out.println("\n** C **");
        C objC = new C();
        objC.f(valByte);
        objC.f(valLong);
        objC.f(valFloat);
        objA = objC;
        objA.f(valByte);
        objA.f(valLong);
        objA.f(valFloat);
        System.out.println("\n** D **");
        D objD = new D();
        objD.f(valByte);
        objD.f(valLong);
        objD.f(valDouble);
        objA = objD;
        objA.f(valByte);
        objA.f(valLong);
        objA.f(valDouble);
        System.out.println("\n** F **");
        F objF = new F();
        objF.f(valByte);
        objF.f(valInt);
        objF.f(valFloat);
        objF.f(valDouble);
        System.out.println();
        objA = objF;
        objA.f(valByte);
        objA.f(valInt);
        objA.f(valFloat);
        objA.f(valDouble);
        System.out.println();
        objC = objF;
        objC.f(valByte);
        objC.f(valInt);
        objC.f(valFloat);
        objC.f(valDouble);

    }
}
