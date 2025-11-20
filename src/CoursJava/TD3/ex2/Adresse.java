package TD3.ex2;

public class Adresse {
    private String rue;
    private String ville;
    private String codePostal;
    private String pays;

    public Adresse(){}
    public Adresse(String rue, String ville, String codePostal, String pays){
        this.rue=rue;
        this.ville=ville;
        this.codePostal=codePostal;
        this.pays=pays;
    }

    //getters
    public String getRue(){
        return this.rue;
    }

    public String getVille() {
        return ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getPays() {
        return pays;
    }
    //setters

    public void setRue(String rue) {
        this.rue = rue;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
    // Méthode pour afficher l'adresse formatée
    public String afficherAdresse() {
        return this.rue + ", " + this.codePostal + " " + this.ville + ", " + this.pays;
    }
}