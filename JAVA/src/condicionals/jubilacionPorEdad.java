package condicionals;

import java.util.Scanner;

public class jubilacionPorEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Edad: ");
        int edad = scanner.nextInt();

        System.out.println("Antiguedad: ");
        int antiguedad = scanner.nextInt();

        String tipoJubilacion = "";

        if (edad >= 60 && antiguedad < 25) {
            tipoJubilacion = "por edad";
        } else if (edad < 60 && antiguedad >= 25){
            tipoJubilacion = "por antiguedad joven";
        } else if (edad >= 60 && antiguedad >= 25) {
            tipoJubilacion = "por antiguedad adulta";
        } else {
            tipoJubilacion = "no cumple los requisitos";
        }

        System.out.println("la persona esta abscrita a" + tipoJubilacion);


    }
}