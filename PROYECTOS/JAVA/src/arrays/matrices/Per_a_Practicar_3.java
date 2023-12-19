package arrays.matrices;

import java.util.Scanner;

public class Per_a_Practicar_3 {
    /*
    3. Crea un programa que cree una matriu de mida NxM (mida introduïda per teclat)
    i introduïu NxM valors (també introduïts per teclat). Després haurà de recórrer
    la matriu i al final mostrar per pantalla quants valors són més grans que zero,
    quants són menors que zero i quants són igual a zero.
     */
    public static void main(String[] args) {

        int fila, col; //N i M
        int menores =0, mayores =0, igual =0;
        int[][] matriz;

        Scanner teclado = new Scanner(System.in);

        //pedir tamaño
        System.out.println("Introduce numero de filas:");
        fila=teclado.nextInt();

        System.out.println("Introduce nuemro de columnas:");
        col = teclado.nextInt();

        matriz = new int[fila][col]; //cuando ya sabemos las medidas creamos la matriz

        for(int f = 0; f < matriz.length; f++){

            for (int c=0; c< matriz[f].length; c++){

                System.out.println("Introduce es siguiente valor:");
                matriz[f][c] = teclado.nextInt();

                //comprobamos si es mayor menor o igual que 0
                if(matriz[f][c] > 0)
                    mayores++;
                else if (matriz[f][c]==0)
                    igual++;
                else menores++;
            }
        }
        System.out.println("La matriz tiene " + mayores +" valores mayor que 0");
        System.out.println("La matriz tiene " + igual +" valores igual que 0");
        System.out.println("La matriz tiene " + menores +" valores menor que 0");
        
    }
}
