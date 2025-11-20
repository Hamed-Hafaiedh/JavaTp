package DS;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Animal("chien", 3);
        Animal a2 = new Animal("chien", 5);
        Chat c1 = new Chat("chat", 3, "noir");

        System.out.println("Chien 1 : " + a1);
        System.out.println("Chien 2 : " + a2);
        System.out.println("Chat 1  : " + c1);

        Animal.affichNbrAnimaux(); // affichera 3

        boolean rts = a1.compare(a2);
        System.out.println("a2 est plus vieux ou égal à a1 ? " + rts);
    }
}

