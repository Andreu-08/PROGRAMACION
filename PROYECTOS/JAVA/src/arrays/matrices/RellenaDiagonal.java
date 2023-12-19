package arrays.matrices;

import java.util.Scanner;

public class RellenaDiagonal{
    public static void main(String[] args) {
        /*Programa qe crea y carga una matriz de enteros de N x N columnas
        N sera un nuemero entero que se pedira al usuario
        El programa ha de rellenar la matriz con valores
        y mostrar una X para los elementos de la diagonal principal y un - para el resto.
         */

        Scanner teclado = new Scanner(System.in);

        int tam; // variable para guardar el tamaño de la matriz

        System.out.println("Introduce un numero entero mayor que 0: "  );
        tam = teclado.nextInt();

        //creacion de la matriz
        int [][] matriz;
        matriz = new int[tam][tam];

        //mostrar por pantalla la matriz

        for(int filas = 0; filas < matriz.length; filas++)
        {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++)
            {

                if (filas == columnas)
                {
                    matriz[filas][columnas]=1;//le asignamos un 1 si pertenece a la diagonal principal
                    System.out.print(" X ");
                }else
                {
                   System.out.print(" - ");
                }
            }
            System.out.println("\n");
        }

    }
}
