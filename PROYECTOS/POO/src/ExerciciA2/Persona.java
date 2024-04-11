package ExerciciA2;

public class Persona {
   private String dni, nom, cognoms;

    private int edat;

    public Persona (String id, String nom, String cognoms, int edad){

        this.dni = dni;
        this.nom = nom;
        this.cognoms = cognoms;
        this.edat = edad;
    }

    public String getDni() {
        return dni;
    }

    public String getNom() {
        return nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public int getEdat() {
        return edat;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public void setEdat(int edat) {

        this.edat = edat;
    }


}
