package TD3.ex2;

public class Personne {
    private String nom;
    private String prenom;
    private int age;
    private Adresse adresse;


    public Personne(String nom) {
        this.nom=nom;
    };
    public Personne(String prenom, int age) {
        this.prenom=prenom;
        this.age=age;
    }
    public Personne(String nom, String prenom, Adresse adresse, int age) {
        this.nom=nom;
        this.prenom=prenom;
        this.adresse=adresse;
        this.age=age;
    }

    //getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public Adresse getAdresse() {
        return adresse;
    }
    //setters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void anniversaire(){
        this.age+=1;
    }
    public void presenteToi() {
        System.out.println("Je m'appelle " + nom + " " + prenom + ".");
        System.out.println("J’ai " + age + " ans.");
        System.out.println("J’habite à : " + adresse.afficherAdresse());
    }
}
