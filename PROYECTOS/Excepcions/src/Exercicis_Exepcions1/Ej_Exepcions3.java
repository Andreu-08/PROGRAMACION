package Exercicis_Exepcions1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej_Exepcions3 {
    public static void main(String[] args) {
        double[] d = new double[5];
        Scanner sc = new  Scanner(System.in);


           for (int i = 0; i < d.length; i++) {
              try {
                  System.out.println("Introudix el valor en la posicion: " + i);
                  d[i] = sc.nextDouble();
              }catch(InputMismatchException e){
                  System.out.println("Valor introducido incorrecto");
                  e.printStackTrace();
                  sc.nextLine();
                  i--; //hace que el programa vuelva atras en el bucle para reptir el error
               }
           }
           mostraVector(d);
    }
    public static void mostraVector(double[] a){
        for(double v : a){
            System.out.print( "["+ v + "]");
        }
    }
}
