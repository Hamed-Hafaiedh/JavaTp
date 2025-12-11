package TD3.ex3;

public class TestCompte {
    public static void main(String[] args) {

        // Création de 2 comptes
        Compte c1 = new Compte();
        Compte c2 = new Compte();

        // Ouverture
        c1.ouvrirCompte("Hamed");
        c2.ouvrirCompte("Ali");

        // Dépôts
        c1.deposerArgent(500);
        c2.deposerArgent(300);

        // Affichage initial
        System.out.println("=== Avant transfert ===");
        c1.afficheCompte();
        c2.afficheCompte();

        // Transfert
        c1.transfererArgent(200, c2);

        System.out.println("\n=== Après transfert ===");
        c1.afficheCompte();
        c2.afficheCompte();

        // Affichage du nombre total de comptes créés
        System.out.println();
        Compte.afficherNbComptes();
    }
}
