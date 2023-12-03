package arrays.matrices;

import java.util.Arrays;

public class MatrizMarco {
    public static void main(String[] args) {
        /*
        crear y inicializar matriz en 8 filas y 6 columnas
         */
        int[][] m = new int[8][6];

        //rellenamos la mtriz con un for

        for(int fila=0; fila < m.length; fila++){

            for (int columna =0; columna < m[fila].length; columna++){
                /*
                comprobamos si estamos en la primera o ultima fila
                 */
                if (fila==0 || fila == m.length -1){

                    m[fila][columna] = 1;
                }
                //comprobamos si estamos en la 1ª o ultima columna

                if(columna == 0 ||columna == m[fila].length-1){

                        m[fila][columna] = 1;
                }
            }
        }
        System.out.println("** Matriz marco **");
        for (int[] f : m){

            System.out.println(Arrays.toString(f));
        }
    }
}

