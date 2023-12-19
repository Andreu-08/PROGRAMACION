package arrays;

import java.util.Scanner;

public class ejemploArray2 {
    public static void main(String[] args) {

        int[] array = new int[10];
        int total = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero que quieres encontrar " + "(entre el 0 y el 20): ");

        int numero = teclado.nextInt();


        //llenamos el array
        for (int indice = 0; indice < array.length; indice++) {
           array[indice] = (int) (Math.random() * 20 + 1);
        }

        //comprobacion
        for (int indice = 0; indice < array.length; indice++) {
            if(array[indice]==numero) {
                total++;
            }

        }
        System.out.print("El array tiene los siguientes valores: ");

        for (int indice =0; indice < array.length; indice++){
            System.out.println("[" + array[indice]+"]");

        }
        if (total == 0){  //\n fuerza el salto de linea

            System.out.println("\nEl numero que buscabas no se ha encontrado.");

        } else {

            System.out.println("\nEl numero que buscabas se encontrado " + total +" veces");
        }
    }
}
