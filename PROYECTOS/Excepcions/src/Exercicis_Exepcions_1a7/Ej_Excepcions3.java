package Exercicis_Exepcions_1a10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej_Excepcions3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double[] vector = new double[5];//array de 5 elementos


        for(int i = 0; i < vector.length; i++) //bucle para rellenar el array
        {
            try/*se encuentra dentro del bucle para relaizar la comprobacion cada vez
                en el caso de que haya un valor invalido en este caso no sea(int),
                el programara restara una posicion al bucle para que repitamos la
                introduccion de valor */
            {
                System.out.println("Introduce el valor de la posición " + i);
                vector[i] = in.nextDouble();
            }
            catch(InputMismatchException e) //se ejecutara esta parte al introducir un valor incorrecto
            {
                System.out.println("Valor introducido incorrecto. Vuelve a introducir el valor...");
                in.nextLine(); //limpia la entrada de texto para evitar errores
                i--;//resta una posicion al bucle para repetir el codigo anterior
            }
        }

        mostrarVector(vector);//muestra los valores del vector mediante una funcion (siempre se ejecuta)

    }

    //funcion para mostar los valores del vector
    public static void mostrarVector(double[] v)
    {
        System.out.print("Datos del vector [ ");

        for(int j = 0; j < v.length; j++)
        {
            System.out.print(v[j] + ", ");
        }

        System.out.println("\b\b ]");//\b retrocede posiciones en el print y imprime lo que se indica
    }
}
