package TD3.ex3;

public class Compte {
    private int solde;
    private String titulaire;

    private static int nbComptes = 0;

    public Compte() {
        this.solde = 0;
        this.titulaire = "";
        nbComptes++;   // Incrémentation à chaque création d'objet Compte
    }

    // Ouvrir un compte : nom du titulaire et solde = 0
    public void ouvrirCompte(String nom) {
        this.titulaire = nom;
        this.solde = 0;
    }

    // Déposer de l'argent
    public void deposerArgent(int somme) {
        if (somme > 0) {
            this.solde += somme;
        } else {
            System.out.println("Montant invalide !");
        }
    }

    // Transférer de l'argent vers un autre compte
    public void transfererArgent(int somme, Compte c) {
        if (somme > 0 && this.solde >= somme) {
            this.solde -= somme;
            c.solde += somme;
        } else {
            System.out.println("Transfert impossible !");
        }
    }

    // Lire le solde
    public int getSolde() {
        return this.solde;
    }

    // Afficher les informations d’un compte
    public void afficheCompte() {
        System.out.println("Titulaire : " + this.titulaire);
        System.out.println("Solde : " + this.solde + " DT");
    }
    // Afficher le nombre total de comptes
    public static void afficherNbComptes() {
        System.out.println("Nombre total de comptes créés : " + nbComptes);
    }
}

