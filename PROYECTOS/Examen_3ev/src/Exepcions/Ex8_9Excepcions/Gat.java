package Exercicis_Exepcions_8a10.Ej_8_9;

public class Gat {

    private String nom;
    private int edad;

    /*constructor de la clase gat amb paremetres
    * que implemta les excepcions del seters per a validar*/

    public Gat(String nom, int edad) throws Exception {
        setNom(nom);
        setEdad(edad);
    }

    //getters
    public int getEdad() {
        return edad;
    }

    public String getNom() {
        return nom;
    }

    //setters per que validen els atributs implementatn Excepcions
    public void setNom(String nom) throws Exception {
        if(nom.length()<3){
            throw new Exception("El nom del gat ha de tenir 3 caracters minim");
        }
        this.nom = nom; //se li dona el valor al atribut despues de la validacio
    }

    public void setEdad(int edad) throws Exception {
        if(edad<0){
            throw new Exception("L'edat no pot ser negativa");
        }
        this.edad = edad;
    }

    //metode per a imprimir
    public  void imprimir(){
        System.out.println("Nom: " + getNom() + "\nEdad: " + getEdad());
    }
}
