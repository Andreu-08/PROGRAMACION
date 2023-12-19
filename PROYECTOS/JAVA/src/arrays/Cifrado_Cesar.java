package arrays;

import java.util.Scanner;

public class Cifrado_Cesar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        /*1. Llegir una cadena de Estring i crear un vector de char amb el mateix*/

        System.out.println("Introduce la frase que quieres cifrar en minusculas : ");

        //guardem la frase introduida per teclat
        String frase = teclado.nextLine();
        //creem un vector amb la longitud de la frase que hem introduit
        char[] frase1 = new char[frase.length()];

        //plenem el vector amb els cada un dels caracters de la frase
        for (int i = 0; i<frase.length(); i++){
            frase1[i] = frase.charAt(i);
        }
        System.out.println(frase1);
        /*2. Demanar el valor de rotacio i sumar-lo a cada caracter */

        System.out.println("Introduce el valor de rotacion para codificar la frase: ");

        int valorRotacion = teclado.nextInt();

        for (int i=0; i< frase1.length; i++){
            if( Character.isLowerCase(frase1[i])){
                frase1[i] = (char) (((frase1[i] - 'a' + valorRotacion)%26) + 'a');

            }
        }
        System.out.println(frase1);
    }
}
