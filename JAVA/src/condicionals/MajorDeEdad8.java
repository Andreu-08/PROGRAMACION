package condicionals;

import java.util.Scanner;
public class MajorDeEdad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //mensatje per a introduir la edad per teclat
        System.out.print("Introdueix la edad ");
        //llegir edad
        int edad = scanner.nextInt();

        //comprovar si es major de edad
        if (edad >= 18) {
            System.out.println("Es major de edad.");
        }
        scanner.close();
    }
}