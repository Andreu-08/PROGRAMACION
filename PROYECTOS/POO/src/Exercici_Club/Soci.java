package Exercici_Club;

import java.util.Scanner;

public class Soci {

    private String nom;
    private int antiguetat;

    public Soci(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el nombre: ");
        this.nom = teclado.nextLine();
        System.out.println("Introduce la antiguedad: ");
        this.antiguetat = teclado.nextInt();

    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAntiguetat(int antiguetat) {
        this.antiguetat = antiguetat;
    }

    public String getNom() {
        return nom;
    }

    public int getAntiguetat() {
        return antiguetat;
    }

    public void imprimir(){

        System.out.println("Nom: " + this.nom +"\n" +
                            "Antiguetat: " + this.antiguetat + " anys");
    }


}
