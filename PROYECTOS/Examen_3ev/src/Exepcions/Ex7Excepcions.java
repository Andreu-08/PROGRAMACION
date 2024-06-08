package Exercicis_Exepcions_1a7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej_Excepcions7_WaitApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int seg = 0;
        boolean numValid = false;

        while(!numValid){
            try{
                System.out.println("Indica el temps de espera en segons: ");
                seg = sc.nextInt();
                if(seg < 0){
                    /*Exepcio per a manejar que el numero siga negatiu
                      (throw new per a personalitzar el mensage)*/
                    throw new IllegalArgumentException("ERROR: El numero no pot ser negatiu");
                }
                numValid = true;
                //Excepcio per a comprobar el tipus de dada correcte
            }catch(InputMismatchException e){
                System.err.println("ERROR: El numero te que ser un enter");
                sc.nextLine();//limpiem la entrada del escanes(evita bucle infinit)
                //llancem la excepcio per a numero negatiu
            }catch(IllegalArgumentException e){
                System.err.println(e.getMessage());
                sc.nextLine();
            }
        }

        try{
            //crida al metode esperaSegons que te eimplementada la excepcio
            esperaSegons(seg);
            //excepcio en el cas de que la pausa siga interrumpida
        } catch (InterruptedException e) {
            System.out.println("Excepcio en el cas de que falle esperaSegons");

        }finally {//sempre ens indicara que el programa ha finalitzat
            System.out.println("Programa finalitzat");
        }

    }
    /*
    metode per a manejar la excepcio de pausa del programa
    (InterruptedException) que indicarem amb el "throws"
    per a saber que el metode implementa esta excepcio
     */
    public static void esperaSegons(int seg) throws InterruptedException {
        try{
            //conversio dels segons a milisegons posant en pausa el programa
            Thread.sleep(seg * 1000);
        }catch(InterruptedException e){ //excepcio per a interrumpir el programa
            System.err.println("ERROR: El programa ha segut pausat");
        }
    }
}
