package Exercicis_Exepcions1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej_Exepcions2 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int a;
        int b;

        try{
            System.out.println("Introdueix el nuemerador : ");
            a = sc.nextInt();
            System.out.println("Introdueix el denominador: ");
            b = sc.nextInt();

            System.out.println("La divisio es: " + a/b);

        }
        catch (InputMismatchException e) {
            System.err.println("Els valors son incorrectes");
            e.printStackTrace();
        }
        catch(ArithmeticException e){
            System.err.println("No es pot dividir per este numero");
            e.printStackTrace();
        }
        finally{
            System.out.println("Fin del programa");
        }
    }
}
