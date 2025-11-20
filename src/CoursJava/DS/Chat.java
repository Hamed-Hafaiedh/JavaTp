package DS;

public class Chat extends Animal {
    private String couleur;

    public Chat(String nom, int age, String couleur) {
        super(nom, age);
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return super.toString() + ", Chat{" + "couleur='" + couleur + '\'' + '}';
    }
}
