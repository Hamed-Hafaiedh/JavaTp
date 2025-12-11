package TD3.ex4;

public class Main{
    public static void main(String[] args) {

        // Création de 3 personnes
        Personne p1 = new Personne("Jean", "Dupont", 2000, "célibataire");
        Personne p2 = new Personne("Sophie", "Martin", 2002, "célibataire");
        Personne p3 = new Personne("Karim", "Ben Ali", 1998, "célibataire");

        System.out.println("\n--- Informations initiales ---");
        System.out.println(p1.afficheInfos());
        System.out.println(p2.afficheInfos());
        System.out.println(p3.afficheInfos());

        // Test âge
        System.out.println("\nÂge de Jean en 2025 : " + p1.age(2025));
        System.out.println("Âge de Sophie en 2025 : " + p2.age(2025));

        // Test mariage
        System.out.println("\n--- Mariage entre Jean et Sophie ---");
        p1.marier(p2);

        // Réaffichage après mariage
        System.out.println("\n--- Après mariage ---");
        System.out.println(p1.afficheInfos());
        System.out.println(p2.afficheInfos());

        // Tentative de remariage impossible
        System.out.println("\n--- Tentative de remariage de Sophie avec Karim ---");
        p2.marier(p3); // Doit afficher une erreur
    }
}

