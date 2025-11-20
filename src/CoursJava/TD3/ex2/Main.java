package TD3.ex2;

public class Main {
    public static void main(String[] args) {

        Adresse adr = new Adresse("Avenue de la République", "Bizerte", "7000", "Tunisie");

        Personne p = new Personne("Hafaiedh", "Hamed", adr, 20);

        p.presenteToi();
    }
}
