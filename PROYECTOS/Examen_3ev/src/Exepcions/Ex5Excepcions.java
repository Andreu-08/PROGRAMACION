package Exercicis_Exepcions_1a7;

import java.util.Scanner;

public class Ej_Excepcions5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int valor = 0;

        while (true) {

            System.out.println("Introduce un número (1000 para salir):");
             valor = scanner.nextInt();
             if(valor == 1000) break;

             try {
                 imprimeixPositiu(valor);
             } catch (Exception p) {
                 //mostra el mensaje personalitzat de la excepcio
                 System.err.println(p.getMessage());
             }

             try {
                 imprimeixNegatiu(valor);
             } catch (Exception n) {
                 System.err.println(n.getMessage());
             }

        }
        System.out.println("Fi del programa");

    }

    //funcio que pot crear excepcions (throws Exception)
    static void imprimeixPositiu(int p) throws Exception {
        if (p < 0) {
            //crear una nova excepcio y el seu mensaje
            throw new Exception("El valor no es positivo: " + p);
        }
        System.out.println("Valor positivo: " + p);
    }

    static void imprimeixNegatiu(int n) throws Exception {
        if (n >= 0) {
            throw new Exception("El valor no es negativo: " + n);
        }
        System.out.println("Valor negativo: " + n);
    }

}