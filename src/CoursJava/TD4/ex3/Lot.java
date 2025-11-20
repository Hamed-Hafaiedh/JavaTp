package TD4.ex3;

public class Lot {
    private Article[] articles;
    private int nbArticles;

    // Constructeur : crée un tableau vide de la taille donnée
    public Lot(int nbArticles) {
        this.nbArticles = nbArticles;
        this.articles = new Article[nbArticles];
    }

    // Récupère un article par son indice
    public Article getArticle(int i) {
        if (i >= 0 && i < nbArticles)
            return articles[i];
        else
            return null;
    }

    // Ajoute un article à une position donnée
    public boolean ajouterArticle(Article a, int indice) {
        if (indice >= 0 && indice < nbArticles && articles[indice] == null) {
            articles[indice] = a;
            return true;
        }
        return false;
    }

    // Supprime un article à une position donnée
    public boolean supprimerArticle(Article a, int indice) {
        if (indice >= 0 && indice < nbArticles && articles[indice] == a) {
            articles[indice] = null;
            return true;
        }
        return false;
    }

    // Calcule le prix total du lot
    public double calculerFacture() {
        double total = 0;
        for (Article a : articles) {
            if (a != null)
                total += a.getPrix();
        }
        return total;
    }

    // Affiche tous les articles
    public void afficherArticles() {
        for (int i = 0; i < nbArticles; i++) {
            if (articles[i] != null)
                System.out.println(articles[i]);
        }
    }
}

