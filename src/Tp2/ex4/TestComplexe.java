package Td2.ex4;

public class TestComplexe {
    public static void main(String[] args) {
        Complexe z1 = new Complexe(1.0, 2.0);
        System.out.println ("z1="+z1.info());

        Complexe z2=new Complexe(2.0, 1.0);
        System.out.println ("z2="+z2.info());

        Complexe z3 = z1.produit(z2);
        System.out.println ("z1 x z2 ="+z3.info());

        Complexe z4 = Complexe.produit (z2, z1);
        System.out.println ("z2 x z1 ="+z4.info());
    }
}
