package DS;

public class Animal {
    private String nom;
    private int age;
    private static int nbrAnimaux; // compteur partagé

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
        nbrAnimaux++; // incrémente à chaque création
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" + "nom='" + nom + '\'' + ", age=" + age + '}';
    }

    // Méthode statique pour afficher le nombre total d’animaux
    public static void affichNbrAnimaux() {
        System.out.println("Nombre total d'animaux : " + nbrAnimaux);
    }

    // Méthode d’instance pour comparer deux animaux
    public boolean compare(Animal a) {
        return a.age >= this.age;
    }
}
