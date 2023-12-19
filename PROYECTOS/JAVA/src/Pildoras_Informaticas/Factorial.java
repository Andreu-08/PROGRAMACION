package Pildoras_Informaticas;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        /*
        creamos el objeto numero con la clase escaner que utilizaremos
        para introducir el numero del cual queremos saber el factorial
        por la consola del sistema
         */
        Scanner numero = new Scanner(System.in);
        /*
        iniciamos la variable resultado en 1 para que nunca se muiltiplique por 0
        esta variable la utilizaremos dentro del for mas adelante para guardar el
        resultado de la multiplicacion de las vueltas del bucle
        se declara con el tipo de dato long ya que el resultado del factorial puede
        llegar a ser un numero muy grande
         */
        long resultado = 1L;

        //mostramos un mensaje por pantalla para que el usuario indique un numero
        System.out.println("Introduce un numero para saber su factorial: ");

        /*
        aqui declaramos la variable que utilizara el objeto teclado de la clase escaner para
        almacenar un numero introducido por teclado que luego se utilizara para saber las vueltas
        que dara el bucle for
         */
        int num = numero.nextInt();
        /*
        En este for se inicia la variable i con el numero indicado por teclado,
        mientras i sea mayor que que 0 decrementaremos i en 1 (i--) de esta forma
        el bucle ira desde el numero que nosotros hemos introducido bajando hasta
        ser igual que cero (ej; 4 -> i sera 4 luego 3 luego 2) cantidad de vueltas
        del bucle
         */
        for (int i = num; i > 0; i--) {
            /*
            cada vuelta que de el bucle ejecutara esta linea de codigo que modigicara la
            variable resultado iniciada antes multiplicandola por el valor de i en ese
            momento, cada vuelta lo multiplicara por el valor ya dado en la vuelta anterior
            que se esta guardando en esa variable
             */
            resultado = resultado * i;
        }
        /*
        aqui utilizamos la concatenacion para imprimir el mensaje que queremos junto
        con las variables que necesitamos mostrar por pantalla en este cas num y resultado
         */
        System.out.println("El factorial de " + num + " es " + resultado);
    }
}
