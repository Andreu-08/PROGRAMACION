package Pildoras_Informaticas;

import java.util.Scanner;

public class Areas {

    public static void main(String[] args) {
        //objeto scanner que se utilizara para que el usuario indique valores por pantalla
        Scanner entrada = new Scanner(System.in);
        /*
        imprimimos por pantalla la opciones que tendra para elegir el usuario utilizamos \n en el punto
        donde queremos que aparezca un salto de linea cuando se ejecute el programa, los numeros seran
        las opciones que podra elegir mas tarde el usuario
         */
        System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");

        /*
        en esta variable se almacenara el valor que el usuario elija (1, 2, 3, 4 en este caso) y evaluaremos
        con un swuich si esta eligiendo una de las opciones o si lo que ha introducido no esta entre ellas
         */
        int figura = entrada.nextInt();

        //SINTAXIS Y EJEMPLO SWITCH
        /*
        vamos a evaluar si la variable figura entre el parentesis para saber si en ella se encuentra una de las opciones
         */
        switch (figura){
            //sintaxis para indicar los casos, cada caso sera una de las opciones
            case 1: //comprobamos si figura es un uno para ejecutar lo que hay a continuacion en el caso contrario case 2
                System.out.println("Introduce el lado: ");
                int lado = entrada.nextInt();
                System.out.println("El area del cuadrado es: " + (int)Math.pow(lado,2)); /*metodo pow de la clase math que
                                                                                  sirve para elevar al cuadrado se utiliza casting (int)*/
                break; //el break rompera la ejecucion cuando se cumpla lo que hay dentro del case sino seguiria por el 2

            case 2: //segundo caso que se ejecutara si el usuario elige el 2
                /*mismo sistema que en el caso uno que se repetira en todos los casos, cuando se ejecuten
                las lineas dentro del caso dos se rompera el swuich con break y se continuara con el codigo siguiente si hay
                saltando el resto de casos
                 */
                System.out.println("Introduce la base: ");
                int base = entrada.nextInt();
                System.out.println("Introduce la altura: ");
                int altura = entrada.nextInt();
                System.out.println("El are del rectangulo es: " + base*altura);//hacemos la operacion dentro del print
                break;

            case 3: //recordar en cada caso la sintaxis seran dos puntos
                /*no declaramos las variables ya que al no ejecutarse el caso 2 las variables que tenemos en el
                (base y altura) no tendran aun ningun valor, utilizaremos las mismas*/
                System.out.println("Introduce la base: ");
                base = entrada.nextInt(); //se le da ala variable el valor introducido por consola
                System.out.println("Introduce la altura: ");
                altura = entrada.nextInt();
                System.out.println("El area del triangulo es: " + (base*altura)/2);

                break;

            case 4:
                System.out.println("Introduce el radio: ");
                int radio = entrada.nextInt();

                System.out.print("El area del circulo es: " + Math.round(Math.PI * (Math.pow(radio, 2))));
                /*Aqui hemos calculado el area dentro del print utilizando diferentes metodos de la clase math
                * round(para redondear el resultado de toda la operacion), PI (constante creada en la clase
                * math con el valor del num PI), pow (metodo que nos permite elevar un numero por el que queramos)*/
                break;

            default: //podemos utilizar opcionalmente el default en este caso por si no pone ninguna de las opciones que hay
                    //en el caso de no poner default y no elegir una de las opciones el programa finaliza sin mas
                System.out.println("La opcion no es correcta"); //mensaje que se mostrar si no elijes ninguno de los casos

        }

    }
}
