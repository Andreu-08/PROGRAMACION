package Pildoras_Informaticas;

import java.util.Scanner;

public class Acceso_aplicacion {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String clave = "Andreu"; //Se guarda dentro de la variable clase la cadena de texto correcta

        String pass =""; //cadena de texto vacia que se llenara con los valores que introduciremos por pantalla

        /*
        se utiliza el metodo equials ya que compararemos la palabra de la variable clave para ver si es
        igual que la de pass que seria la contraseña que queremos comprobar utilizaremos el bucle de tipo while
        para que se repita el proceso las veces que sean necesarias hasta que la condicion sea verdadera
        el equials cambiara a true cuando sean iguales
         */
        while (clave.equals(pass)==false){ /*mientras (while) la variable clave sea diferente de la variable pass
                                               preguntar por la contraseña por pantalla*/
            System.out.println("Introduce la contraseña: ");
            //se cambia el valor de la variblae con el valor introducido por pantall .next(porque es un string)
            pass= entrada.next();
            /*
            cuando el valor introducido en la variable pass sea igual (equals=true)entonces la condicion de while sera falsa
            y el programa se saldra del while y nos ejecutara la sigueinte parte del programa fuera del while
             */
            /*
            * en el caso de que la condicion siga siendo verdadera el while contiuara y ejecutara el if
            * y las lineas de codigo que tiene dentro en este caso "contraseña incorrecta" y volvera a repetir el while
            * desde la primera linea*/
            if(clave.equals(pass)==false){

                System.out.println("Contraseña incorrecta");

            }
        }
        //linea de codigo que se jecutara cuando salgamos del bucle while (esta fuera justo fuera de las llaves del while)
        System.out.println("Contraseña correcta");
    }
}
