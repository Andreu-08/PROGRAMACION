package Exercicis_Exepcions1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej_Excepcions1 {
    public static  void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;
        try {
            System.out.println("Introduix un numero enter: ");
            a = sc.nextInt();

            System.out.println("El valor introduit es: " + a);
        }
        catch(InputMismatchException e) {
            System.err.println("El valor introudit es incorrecte ");
            e.printStackTrace();//mensajes de error extra
        }
        finally {
            System.out.println("Fin del Programa");
        }
    }
}
