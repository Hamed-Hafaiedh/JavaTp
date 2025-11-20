package TD4.ex3;

public class TestLot {
    public static void main(String[] args) {
        // Création d'un lot de 10 articles
        Lot lot = new Lot(10);

        // 7 Stylos
        lot.ajouterArticle(new Stylo(1, "Stylo bille", "Bic", 1.2, 1), 0);
        lot.ajouterArticle(new Stylo(2, "Stylo plume", "Parker", 12.5, 2), 1);
        lot.ajouterArticle(new Stylo(3, "Feutre noir", "Stabilo", 2.3, 3), 2);
        lot.ajouterArticle(new Stylo(4, "Crayon mine", "Maped", 0.8, 4), 3);
        lot.ajouterArticle(new Stylo(5, "Stylo gel", "Pilot", 2.0, 5), 4);
        lot.ajouterArticle(new Stylo(6, "Marqueur", "Sharpie", 3.5, 6), 5);
        lot.ajouterArticle(new Stylo(7, "Stylo rouge", "Bic", 1.3, 2), 6);

        // 3 Ramettes
        lot.ajouterArticle(new RamettePapier(8, "Ramette A4", "Clairefontaine", 5.2, 80), 7);
        lot.ajouterArticle(new RamettePapier(9, "Ramette A3", "Clairefontaine", 8.4, 120), 8);
        lot.ajouterArticle(new RamettePapier(10, "Ramette recyclée", "RecyPap", 6.0, 100), 9);

        // Affichage de tous les articles
        System.out.println("=== Liste des articles ===");
        lot.afficherArticles();

        // Calcul de la facture totale
        System.out.println("\nFacture totale : " + lot.calculerFacture() + "€");

        // Suppression d’un article (ex: celui à l’indice 3)
        Article aSupprimer = lot.getArticle(3);
        lot.supprimerArticle(aSupprimer, 3);

        // Nouvelle facture après suppression
        System.out.println("\n=== Après suppression d’un article ===");
        lot.afficherArticles();
        System.out.println("\nNouvelle facture : " + lot.calculerFacture() + "€");
    }
}

