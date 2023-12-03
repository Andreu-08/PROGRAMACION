package Ejercicios_Practica_Examen1;

import java.util.Scanner;

public class Major_Menor_Edad {
    public static void main(String[] args) {

        Scanner teclado =new Scanner(System.in);

        System.out.println("Indica la teua edad: ");

        int edad = teclado.nextInt();

        if (edad < 18){
            System.out.println("Eres menor de edad");
        } else if (edad < 40) {
            System.out.println("Eres joven");
        } else if (edad < 60) {
            System.out.println("Eres maduro");
        }else {
            System.out.println("Eres viejo");
        }


    }

}
