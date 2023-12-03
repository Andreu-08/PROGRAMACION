package arrays;

import java.util.Scanner;

public class Contraseña0k {

    public static void main(String[] args) {


        /*
        PROGRAMA QUE VA A PEDIR UNA CONTRASEÑA Y VALIDARLA SEGUN
        LAS CARACTERISTICAS
        nº mayusculas
        nº minusculas
        nº total de caracteres
        nº digitos
        nº caracteres especiales
         */

        /*
        declaramos constantes para el total de cada caracteristica que queremos dentro de la contraseña
        los valores minimos que tiene que haber de cada una
         */

        final int totalCaracteres = 8;
        final int mayus = 1;
        final int minus = 2;
        final int num = 3;
        final int especiales = 1;

        //objeto scanner para leer por teclado (teclado)
        Scanner teclado= new Scanner(System.in);
        String password = ""; //cadena de caracteres vacia que contendra lo que introduzca el usuario

        /*
        variblaes que contaran cada tipo de valor dentro de la contraseña (contadores)
        que estaran iniciados a 0
         */
        int totalCarCont = 0;
        int mayusCon = 0;
        int minusCOn = 0;
        int numCont = 0;
        int especialesCont = 0;

        /*
        indicamos con un mensaje que el usuario introduzca la contraseña
        los valores introducidos se guardaran en el String password
        esto estara dentro del do while para que se repita si es incorrecto
         */

        /*
        utilizamos un do while que rellena la variable password con lo que se
        introduce por teclado y dejara de mostrar el mensaje cuando no se cumpla la
        condicion de while (que la longitud del string (.length) sea menor
        que el totaldecaracteres que queremos), cuando sea igual o mayor terminara
         */
         do{
             System.out.println("Introduce contraseña: ");
             password = teclado.next();
         }while (password.length() < totalCaracteres);

         //aqui contamos cada tipo de caracter que tiene la contraseña que se ha introducido

         for (int letras = 0; letras < password.length(); letras++) {

             char caract = password.charAt(letras);

             if (Character.isLowerCase(caract)){//comprueba si la letra es minuscula

                 minusCOn++;
             } else if (Character.isUpperCase(caract)) { //comprueba si es mayuscula

                 mayusCon++;
             } else if (Character.isDigit(caract)) {

                 numCont++;
             } else if (caract == '_' || caract =='-' || caract == '.' ) //compruebo si hay alguno de estos caracteres
             {
                 especialesCont++;
             }

         }
        //ahora comprobaremos si cumplen la condicion para que sea correcta la contraseña
        if (mayusCon < mayus)
            System.out.println("Tu contraseña no cumpre el numero minimo de mayusculas");
        if (minusCOn < minus)
            System.out.println("Tu contraseña no cumple el numero minimo de minusculas");
        if (numCont < num)
            System.out.println("Tu contraseña no cumple el numero minimo de numeros");
        if (especialesCont < especiales)
            System.out.println("Tu contraseña no cumple el numero minimo de caracteres especiales");
        if (mayusCon>=mayus && minusCOn>=minus && numCont>=num && especialesCont>=especiales)
            System.out.println("CONTRASEÑA ACEPTADA");
    }
}
