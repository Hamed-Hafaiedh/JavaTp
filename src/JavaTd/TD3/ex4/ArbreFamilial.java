package TD3.ex4;

public class ArbreFamilial{

    public static void main(String[] args) {

        // Ancêtres
        Personne jean = new Personne("Jean", "Dupont", 1970, "célibataire");
        Personne anne = new Personne("Anne", "Martin", 1975, "célibataire");

        // Mariage
        jean.marier(anne);

        // Enfant : Pierre Dupont
        Personne pierre = new Personne(
                anne,
                jean,
                "célibataire",
                2000,
                "Dupont",
                "Pierre"
        );
        // Affichage
        System.out.println(jean.afficheInfos());
        System.out.println(anne.afficheInfos());
        System.out.println(pierre.afficheInfos());
    }
}

