package Ejercicios_Practica_Examen1;

import java.util.Scanner;

public class AreaCuadrado{

    public static void main(String[] args) {

        int areaCuadrado = 0;
        int lado = 5;

        areaCuadrado = lado*lado;

        System.out.println("El area de un cuadrado de lado 5 es igual a: " + areaCuadrado);

        Scanner teclado =new Scanner(System.in);

        System.out.println("Introduce el lado del cuadrado: ");

        lado = teclado.nextInt();

        areaCuadrado = lado*lado;

        System.out.println("El area del cuadrado del que has introducido el lado es: "+areaCuadrado);
    }
}
