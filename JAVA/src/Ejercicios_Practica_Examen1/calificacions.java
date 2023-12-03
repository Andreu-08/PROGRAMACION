package Ejercicios_Practica_Examen1;

import java.util.Scanner;

public class calificacions {
    public static void main(String[] args) {

        Scanner tecaldo = new Scanner(System.in);
        System.out.println("Indica la calificacio:");
        int calificacio = tecaldo.nextInt();

        if(calificacio <3){
            System.out.println("Molt Deficient");
        } else if (calificacio < 5) {
            System.out.println("Insuficient");
        } else if (calificacio <= 6) {
            System.out.println("Be");
        } else if (calificacio < 9) {
            System.out.println("Notable");
        } else if (calificacio <= 10) {
            System.out.println("Exelente");
        }else{
            System.out.println("No es permet esta calificacio");
        }
    }
}
