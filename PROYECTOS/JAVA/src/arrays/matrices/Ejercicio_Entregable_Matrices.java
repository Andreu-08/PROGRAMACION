package arrays.matrices;

import java.util.Scanner;

public class Ejercicio_Entregable_Matrices {

    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int menu=0;
        int valorMatriz = 0;
        int aux= 0;
        int suma = 0;
        int flag=0;
        //menu
        while(menu != 7) {
            System.out.println("************MENU************\n" +
                    "1.Ompli la matriu de numeros\n" +
                    "2.Suma de una fila\n" +
                    "3.Suma de una columna\n" +
                    "4.Suma diagonal principal\n" +
                    "5.Suma diagonal inversa\n" +
                    "6.Mitjana de tots els valors\n" +
                    "7.Salir");

             System.out.println("Elige una opcion:");
                menu = teclado.nextInt();

            switch (menu) {
                case 1:
                    flag=1;
                    for (int i =0; i< 4; i++){

                        for(int j=0; j< 4; j++){

                            System.out.println("Introduce valor " +i + "," + j);
                            valorMatriz= teclado.nextInt();
                            matriz[i][j] = valorMatriz;
                        }
                    }

                    for (int i =0; i< 4; i++){
                        for(int j=0; j< 4; j++) {
                            System.out.print(matriz[i][j]);
                        }
                        System.out.println();
                        }
                    break;
                case 2:
                    if (flag != 1) {
                        System.out.println("Primer has de omplir la matriu");
                        break;
                    }
                    System.out.println("Indica la fila que quieres sumar ");
                    aux = teclado.nextInt();
                    for(int i = 0; i < 4; i++){
                        suma += matriz[aux][i];
                    }
                    System.out.println("La suma de la fila es: " +suma);
                    System.out.println();
                    suma=0;
                    break;
                case 3:
                    if (flag != 1) {
                        System.out.println("Primer has de omplir la matriu");
                        break;
                    }
                    System.out.println("Indica la columna que quieres sumar ");
                    aux = teclado.nextInt();
                    for(int i = 0; i < 4; i++){
                        suma += matriz[i][aux];
                    }
                    System.out.println("La suma de la columna es: " +suma);
                    System.out.println();
                    suma=0;
                    break;
                case 4:
                    if (flag != 1) {
                        System.out.println("Primer has de omplir la matriu");
                        break;
                    }
                    for (int i=0; i<4; i++){
                        for(int j=0; j<4; j++){
                            if(i==j){
                                suma += matriz[i][j];
                            }
                        }
                    }
                    System.out.println("La suma de la diagonal principal es: " + suma);
                    System.out.println();
                    suma=0;
                    break;
                case 5:
                    if (flag != 1) {
                        System.out.println("Primer has de omplir la matriu");
                        break;
                    }
                    for (int i=0; i<4; i++){
                        for(int j=0; j<4; j++){
                         if((i + j) == (matriz.length - 1)){
                             suma += matriz[i][j];
                         }
                        }
                    }
                    System.out.println("La suma de la diagonal invertida es: " + suma);
                    System.out.println();
                    suma=0;
                    break;
                case 6:
                    if (flag != 1) {
                        System.out.println("Primer has de omplir la matriu");
                        break;
                    }
                    for (int i=0; i<4; i++) {
                        for (int j = 0; j < 4; j++) {
                            suma+= matriz[i][j];
                        }
                    }
                    System.out.println("La mitjana dels valors de la matriuz es: "+(suma/16));
                    System.out.println();
                    break;

                case 7:
                    System.out.println("Adios");
                    break;

                default:
                    if (flag != 1) {
                        System.out.println("Primer has de omplir la matriu");
                        break;
                    }
                    break;
            }
        }
    }
}
