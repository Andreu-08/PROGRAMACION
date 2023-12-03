package Ejercicios_Practica_Examen1;

import java.util.Scanner;

public class Positiu_Negatiu {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Numero: ");
        int num1 = teclado.nextInt();


        if (num1<0){
            System.out.println("El numero es negatiu");
        }else {
            System.out.println("El numero es positiu");
        }
    }
}
