package Ejercici_ArrayList_Producte;

public class Producte {

    private String nom;
    private int quantitat;
    public Producte(String nom, int quantitat){
        this.nom = nom;
        this.quantitat = quantitat;
    }

    public String getNom() {
        return nom;
    }

    public int getQuantitat() {
        return quantitat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }

    @Override
    public String toString() {
        return "Nom Proucte: " + nom +
                "\nQuantitat: " + quantitat;
    }

}
