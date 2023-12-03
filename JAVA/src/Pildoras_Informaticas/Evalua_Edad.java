package Pildoras_Informaticas;
import java.util.*;
public class Evalua_Edad {

    public static void main(String[] args) {

        //creamos oun objeto escaner llamado entrada para la introduccion de datos por consola del sistema
        Scanner entrada = new Scanner(System.in);

        /*mensaje indicando que el usuario introducza el valor en consola que queremos*/
        System.out.println("Introduce tu edad: ");

        /*variable en la que se guardara el valor introducido por consola*/
        int edad = entrada.nextInt();


        /*vamos a utilizar el condicional if marcandole la condicion que queremos evaluar entre parentesis
        * en el caso de que se cumpla la condicion el programa terminara mostrando el codigo que se encuentra dentro
        * de ese if, si no se cumple seguir con la ejecucion (si pasa esto)*/
        if (edad < 18){
            //codigo que se ejecutara si es verdad el if
            System.out.println("Eres menor de edad");
        }
        /*si no se cumple el if el programa pasara a leer el else que solo puede estar si hay un if, y ejecutara
        el codigo que tenga dentro de las llaves que es lo que tiene que pasar en el caso contrario de la condicion
        del ig (si no)
         */
        else {
            //codigo que si no es verdad el if (se lo saltara) y ejecutara este
            System.out.println("Eres mayor de edad");
        }

        /*si tenemos que evaluar varias condiciones podemos montar diferentes if else o utilizar detras del if
        un else if (si no pasa esto -> si esto y asi las veces que queramos introduciendo el codigo dentro de else if
        que si no se cumple se ira saltando hasta que se cumpla la condicion
         */
        System.out.println("Introduce tu edad: ");

        int edad2 = entrada.nextInt();

        //Ejemplo estructura else if

        if (edad2<18){
            System.out.println("Eres adolescente");

        } else if (edad2 < 40) {

            System.out.println("Eres joven");
        }else if (edad < 60){

            System.out.println("Eres maduro");

            /* se termina con un else cuando queramos la ultima condicion*/
        } else {

            System.out.println("Cuidate");
        }


    }
}
