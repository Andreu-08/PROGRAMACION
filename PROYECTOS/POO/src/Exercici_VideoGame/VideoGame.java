package Exercici_VideoGame;

public class VideoGame {
    private String titol;
    private double preu;

    private String genere;

    public VideoGame(String titulo, String genero, double precio) {

        this.titol = titol;
        this.preu = preu;
        this.genere = genere;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
