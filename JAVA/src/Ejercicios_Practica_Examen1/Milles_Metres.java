package Ejercicios_Practica_Examen1;

import java.util.Scanner;

public class Milles_Metres {

    public static void main(String[] args) {

        final int metres = 1852;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Indica les milles que vols pasar a metres");

        int millas = teclado.nextInt();

        int resultat = millas * metres;

        System.out.println(millas + " milles son " +resultat + " metres");



    }
}
