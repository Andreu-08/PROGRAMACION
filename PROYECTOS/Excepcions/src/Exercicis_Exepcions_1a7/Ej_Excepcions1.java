package Exercicis_Exepcions_1a10;

import java.util.InputMismatchException; //maneja errores de tipo de dato
import java.util.Scanner;

public class Ej_Excepcions1 {
    public static  void main(String[] args) {

        Scanner in = new Scanner(System.in); //lee la entrada en teclado

        int A; //variable para almacenar el numero introducido por el usuario

        try /*bloque donde se realiza la accion que podria tener una excepcion,
              en este caso que el tipo de dato sea un entero, en el momento que
              detecte que no es un entero saltara al catch (InputMismatchException)*/
        {
            System.out.print("Introduce un número entero: ");
            A = in.nextInt();//en el caso de que este valor no sea entero salta la excepcion

            System.out.println("Valor introducido: " + A);

        }
        catch(InputMismatchException e) //en el caso de capturar una excepcion de ese tipo se almacena en la e
        {
            System.err.println("Valor introducido incorrecto");
            e.printStackTrace(); /*imprime toda la informacion sobre la excepcion (pila)
                                   muestra el lugar exacto del error en el codigo */
        }

        /*al estar fuera del bloque try-catch se ejecutara siempre aunque salte la exception
           se puede utilizar finally*/
        System.out.println("Fin del programa");

    }
}
