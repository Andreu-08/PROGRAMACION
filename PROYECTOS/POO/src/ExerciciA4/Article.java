package ExerciciA4;

public class Article {

    private String nom;
    private double preu;
    private int iva;
    private int quantsQueden;

    public Article(String nom, double preu, int iva, int quantsQueden) {
        if (nom.equals("")) {
            System.err.println("ERROR: El nom no pot estar buit");
        } else if (preu <= 0) {
            System.err.println("ERROR: El preu no pot ser menor o igual a zero");
        } else if (iva != 21) {
            System.err.println("ERROR: El iva ha de ser el 21%");
        } else if (quantsQueden < 0) {
            System.err.println("ERROR: El stock no pot ser menor que zero");
        } else {
            this.nom = nom;
            this.preu = preu;
            this.iva = iva;
            this.quantsQueden = quantsQueden;
        }
    }

    public String getNom() {
        return nom;
    }

    public double getPreu() {
        return preu;
    }

    public int getIva() {
        return iva;
    }

    public int getQuantsQueden() {
        return quantsQueden;
    }

    public void setNom(String nom) {
        if (nom.equals("")) {
            System.err.println("ERROR: El nom no pot estar buit");
        } else {
            this.nom = nom;
        }
    }

    public void setPreu(double preu) {
        if (preu <= 0) {
            System.err.println("ERROR: El preu no pot ser menor o igual a zero");
        } else {
            this.preu = preu;
        }
    }

    public void setIva(int iva) {
        if (iva != 21) {
            System.err.println("ERROR: El iva ha de ser el 21%");
        } else {
            this.iva = iva;
        }
    }

    public void setQuantsQueden(int quantsQueden) {
        if (quantsQueden < 0) {
            System.err.println("ERROR: El stock no pot ser menor que zero");
        } else {
            this.quantsQueden = quantsQueden;
        }

    }
}
