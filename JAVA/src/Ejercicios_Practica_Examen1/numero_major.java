package Ejercicios_Practica_Examen1;

import java.util.Scanner;

public class numero_major {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Numero 1: ");
        int num1= teclado.nextInt();

        System.out.println("Numero 2: ");
        int num2 = teclado.nextInt();

        if (num1 < num2){
            System.out.println("El " + num2 + " es major");
        } else {
            System.out.println("El " + num1 + " es major");
        }
    }
}
