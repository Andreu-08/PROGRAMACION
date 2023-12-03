package Pildoras_Informaticas;

import java.util.Scanner;

public class Adivina_Numero {
    public static void main(String[] args) {


        Scanner teclado =new Scanner(System.in); /* generamos un objeto de tipo Scanner que utilizaremos
                                                 luego para introducir valores por pantalla (teclado)*/


    /*vamos a generar un numero aleatorio entre o y 100 utiliziando el metodo random de la clase Math
    declaramos una variable que guardara el valor de ese numero en un entero
    utilizando casting (int) pasamos a entero el valor que genra Math. random ya que este es decimal
    este valor decimal lo tendremos que multiplicar *100 ya que es un valor que esta entre 0 y 1
    (lo que nos genera el Math.random)
     */
        int aleatorio = (int) (Math.random()*100); //esta sera la declaracion para generar un num entre 0 y 100

        //declaramos las variables que necesitaremos dentro del bucle while para los intentos de acertar el numero
        int numero = 0;
        int intento = 0;

        /*mientras (while) numero diferente (operador !=) a aleatorio(numero generado en la variable con random)
        se tendra que repetir el bucle generado con while */

        while(numero!=aleatorio){
            intento++; /*incrementamos la variable intentos que es 0 para que
                        cada vez que entre en el while se incremente en uno*/

            System.out.println("Introduce un numero: ");

            numero = teclado.nextInt(); /*cambiamos el valor 0 de la varibale por el numero
                                         que introducimos por pantalla utilizando el objeto
                                         scanner que hemos creado*/
            /*
            dentro del mismo while indicamos que si la variable aleatorio (con el valor de Math.random)
            es menor que el numero introducido por pantalla (variable con el valor teclado.nextint)
            nos muestre el mensaje correspondiente, y en el caso de que sea mayor otro mensaje (else if)
             */
          if (aleatorio < numero){

              System.out.println("mas bajo");

          } else if (aleatorio>numero) {

              System.out.println("mas alto");

          }

        }

        System.out.println("Lo has conseguido en "+ intento + " intentos");
        /*mensaje que se mostrar cuando ya no se cumpla la condicion del while
         y el programa se salga de este (en este caso cuando el numero aleatorio
         sea==al numero introducido por teclado), concatemos la variblae intento
         que ha ido incrementando todas las veces que hemos entrado dentro del while*/


      //EJEMPLO DEL MISMO CODIGO CON DO WHILE
      /*aqui tenemos un ejemplo del mismo codigo pero con el bule do while que
      a diferencia del while siempre se ejecutara al menos una vez, asi en este caso
      si el numero aleatorio fuera 0, al no entrar en el while porque la varible tiene
      ya ese valor y seria cierto entonces lo saltaria, el do haria que se ejecutara
      primero antes evaluar la condicion que iria al finalizar la ejecucion de las lineas de
      codigo dentro del do. (abajo tenemos la sintaxis de este mismo)

        do {
            intento++;

            System.out.println("Introduce un numero: ");

            numero = teclado.nextInt();
            if (aleatorio < numero){

                System.out.println("mas bajo");

            } else if (aleatorio>numero) {

                System.out.println("mas alto");

            }

        } while(numero!=aleatorio);*/
    }

}
