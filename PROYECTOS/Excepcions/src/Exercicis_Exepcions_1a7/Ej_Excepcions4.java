package Exercicis_Exepcions_1a7;
import java.util.*;
public class Ej_Excepcions4 {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        //variable que genera un numero aleatoria entre 1 y 100 (este sera el tamaño del array)
        int N = (int)(Math.random() * 100 + 1);
        int[] vector = new int[N];//el tamañao del array es el numero random generado

        //for para rellenar el array tambien con numeros aleatorios
        for(int i = 0; i < N; i++)
        {
            vector[i] = (int)(Math.random() * 10 + 1);
        }

        int valor = 0; //la utilizaremos para generar el bucle ya almacenar la posicion que estamos consultando

        do{
            try/*bloque dentro del do-while para que se repita mientras se cumple la condicion
                en este caso que el valor sera mayor que 0, si pones un valor incorrecto saltara
                InputMismatchException y se volvera a repetir el bucle, si el valor se sale del rango
                del array ssaltara ArrayIndexOutOfBoundsException y se volvera a repetir el bucle,
                salirmos del bucle introduciendo un numero negativo*/
            {
                System.out.println("Introduce la posición del vector para mostrar: (número negativo para salir)");
                valor = in.nextInt(); //indicamos posicion del vector para que muestre su valor
                System.out.println("Valor en el vector: " + vector[valor]);
                in.nextLine();//limipia la entrada de datos para volver a introducir
            }
            catch(InputMismatchException e)//se ejecuta cuando indicamos un valor incorrecto en este caso que no sea int
            {
                System.out.println("Valor introducido incorrecto");
                in.nextLine();
            }
            catch(ArrayIndexOutOfBoundsException e)//se ejecuta cuando indicamos una posicion fuera del rango del array
            {
                //si la posicion esta fuera del rango del array y es mayor que 0 muestra este mensaje y vulve al inicio
                if(valor >= 0)
                {
                    System.out.println("Posición fuera de los límites del vector");
                }
            }

        } while(valor >= 0); //si el valor es >= 0 continuara el bucle

        System.out.println("Salida del programa");

    }
}
