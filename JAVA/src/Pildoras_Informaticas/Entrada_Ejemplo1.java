package Pildoras_Informaticas;
import java.util.Scanner;
//Importamos la clase Scanner ya que no pertenece al paquete por defecto de JAVA
public class Entrada_Ejemplo1 {
    public static void main(String[] args) {

        /*contruccion del objeto entrada de tipo scanner que tomara
        informacion introducida por la consola del sistema (System.in)
         */
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre:");

        /* declaramos la variable tipo string ya que queremos que nos devuelvan caracteres
        esta variable sera igual al objeto que hemos creado anteriormente mas el metodo .nextline que nos
        perminte escribir caracteres por consola (siempre tneemos que indicar el tipo de dato que queremos
        que se ingrese
         */
        String nombre = entrada.nextLine();

        System.out.println("Introduce tu edad:");
         //en este caso estamos necesitamos que el usuario nos introduzca un numero entero por consola .nextInt
        int edad = entrada.nextInt();
        /*imprimirmos por pantalla utilizando concatenaciones una frase que incluira la variable nombre que
        se habra iniciado con el valor que el usuario habra indicado por teclado acompañado de la edad que habra
        indicado y le sumamos 1 ya que queremos saber que edad entrada el siguiente año
         */
        //recordamos que si queremos modificar la variable en el print entre () hacemos la operacion en este caso +1
        System.out.println("Hola " + nombre + ". El año que viene tendras " + (edad + 1) + " años");

    }
}
