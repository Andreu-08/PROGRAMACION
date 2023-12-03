package Pildoras_Informaticas;

import java.util.Scanner;
import java.lang.*;

public class Comprueba_mail {
    public static void main(String[] args) {

        //creamos objeto scanner para poder utilizarlo cuando queramos dar valor a alguna variable cpor teclado
        Scanner teclado = new Scanner(System.in);

        boolean arroba = false; //variable boolean que solo puede ser T or F

        //mensaje que pedira el email por pantalla
        System.out.println("Introduce mail: ");
        //variable que se iniciara con el valor que escribamos por pantalla del tipo String al ser cadena de texto
        //solo .next no .nextInt(que seria cuando queremos introducir valores enteros
        String mail = teclado.next();

        /*
        iniciamos la variable i para que empieze a contar las vueltas desde 0
        indicamos que mientras i sea menor a la cantidad de caracteres de la cadena de texto mail
        (para esto utilizamos el metodo length de la clase string que nos cuenta la cantidad de caracteres
        de una cadena) incrementamos i en un hasta que esto se cumpla
         */
        for (int i = 0; i < mail.length(); i ++){
            /*
            creamos un if dentro del bucle for para si la posicion en la cadena de caracteres, que sera el valor
            de i (el numero de la vuelta que esta dando el bucle) es igual a el caracter @ entonces el boolean
            arroba pasara a se verdadero, en este momento se saldra del if
            el bucle seguira funcionando hasta cumplir con la cantidad de caracteres de la cadena y cuando acabe
            saldra del bucle (si a detectado un arroba cuando salga del bucle la varible sera true
             */
            if (mail.charAt(i) == '@') { //el metodo charAt nos permite saber el valor del caracter de mail en ese momento
                arroba = true;
            }
        }
        /*
        al salir del bucle for ya sabremos si el valor de arroba es true or false creamos un if que
        en el caso de true imprima un mensaje y en caso contrario otro diferente
         */
        if (arroba == true){
            System.out.println("El email es correcto");
        }
        else{
            System.out.println("El email no es correcto");
        }
    }
}
