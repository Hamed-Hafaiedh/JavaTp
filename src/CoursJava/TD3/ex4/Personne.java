package TD3.ex4;

public class Personne {

    private String nom;
    private String prenom;
    private int annee_de_naissance;
    private String etat_civil;
    private Personne conjoint;
    private Personne pere;
    private Personne mere;

    public Personne() {
        System.out.println("Nouvelle personne construite.");
    }
    //constracteur sans parents
    public Personne(String prenom, String nom, int annee_de_naissance, String etat_civil) {
        this.prenom = prenom;
        this.nom = nom;
        this.annee_de_naissance = annee_de_naissance;
        this.etat_civil = etat_civil;
        this.conjoint = null;
        this.pere=null;
        this.mere=null;

        System.out.println("Nouvelle personne construite.");
    }
    //constracteur avec parents
    public Personne(Personne mere, Personne pere, String etat_civil, int annee_de_naissance, String prenom, String nom) {
        this.mere = mere;
        this.pere = pere;
        this.conjoint = null;
        this.etat_civil = etat_civil;
        this.annee_de_naissance = annee_de_naissance;
        this.prenom = prenom;
        this.nom = nom;
    }

    // Méthode age correcte
    public int age(int annee) {
        return annee - this.annee_de_naissance;
    }

    // Méthode marier correcte
    public void marier(Personne p) {

        if (this.conjoint != null || p.conjoint != null) {
            System.out.println("Erreur : l'un des deux est déjà marié.");
            return;
        }

        this.conjoint = p;
        p.conjoint = this;

        this.etat_civil = "marié(e)";
        p.etat_civil = "marié(e)";
    }

    public String afficheInfos() {

        String pereNom = (pere != null) ? pere.nom + " " + pere.prenom : "Inconnu";
        String mereNom = (mere != null) ? mere.nom + " " + mere.prenom : "Inconnue";
        String conjointNom = (conjoint != null) ? conjoint.nom + " " + conjoint.prenom : "Aucun conjoint";

        return  "\nPersonne : " + prenom + " " + nom +
                "\nAnnée de naissance : " + annee_de_naissance +
                "\nÉtat civil : " + etat_civil +
                "\nPère : " + pereNom +
                "\nMère : " + mereNom +
                "\nConjoint : " + conjointNom;
    }
}

