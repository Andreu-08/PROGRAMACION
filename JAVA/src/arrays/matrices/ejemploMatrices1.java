package arrays.matrices;

import java.util.Arrays;

public class ejemploMatrices1 {
    public static void main(String[] args) {
        int m[][] = new int[4][5]; // matriz de 20 elementos (4 filas x 5 columnas)

        //Declaración y llenado
       /* int m[][] = { { 15, 21, 18, 9, 15 }, { 10, 52, 17, 19, 7 }, { 19, 2, 19, 17, 7 },
                { 92, 13, 13, 32, 41 } }; */

        //Llenado de manera manual
        m[0][0] = 15;
        m[0][1] = 21;
        m[0][2] = 18;
        m[0][3] = 9;
        m[0][4] = 15;

        m[1][0] = 10;
        m[1][1] = 52;
        m[1][2] = 17;
        m[1][3] = 19;
        m[1][4] = 7;

        m[2][0] = 19;
        m[2][1] = 2;
        m[2][2] = 19;
        m[2][3] = 17;
        m[2][4] = 7;

        m[3][0] = 92;
        m[3][1] = 13;
        m[3][2] = 13;
        m[3][3] = 32;
        m[3][4] = 41;

        // Comprobar un elemento, p. ej. (2,3)
        int num = m[2][3];
        System.out.println("Valor en la posición (2,3): " + num);
        System.out.println("Valor en la posición (1,4): " + m[1][4]); //directamente

        // Recorrer matriz.
        // Como tenemos 2 indices, para referenciar un valor
        // necesitaremos dos bucles for(;;);
        for (int i = 0; i < 4; i++) { //Recorremos fila
            for (int j = 0; j < 5; j++) { //Recorremos columnas
                System.out.println(m[i][j]); //Mostrará cada elemento en una línia
            } // fin bucle de la 2a dimensión
        } // fin bucle de la 1a dimensión

        // El primer bucle for recorre la primera dimensión del vector bidimensional
        // Como era m[4][5], el primer bucle recorre desde i = 0 hasta i = 3 (4 elementos)

        // El segundo bucle for recorre la 2ª dimensión del vector bidimensional
        // Como era m[4][5] este bucle recorre des de j = 0 hasta j= 4 (5 elementos)
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                //Se mostrarán todos los elementos de la misma fila en una fila
                System.out.print("m[" + i + "][" + j + "]= " + m[i][j] + " ");
            } // fin bucle de la 2a dimensión
        } // fin bucle de la 1a dimensión

        System.out.println("");
        for(int[] fila : m) {
            for (int elemento : fila) {
                System.out.print(elemento);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
