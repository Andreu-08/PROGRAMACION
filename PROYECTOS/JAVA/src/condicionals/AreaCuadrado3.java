package condicionals;

import java.util.Scanner;
//La clase Scanner se importa para poder leer entradas escritas por teclado

public class AreaCuadrado3 {
    public static void main(String[] args) {
        //creamos un objeto Scanner que nos permite leer la entrada que escribamos
        Scanner scanner = new Scanner(System.in);

        //muestra un mensaje que solicita la entrada de la longitud
        System.out.println("Ingresa la longitud del lado: ");
        //se utiliza para crear la variable con la entrada escrita por teclado
        int lado = scanner.nextInt();

        //creamos la variable que calcula el area del cuadrado con la operacion que debe hacer
        int area = lado * lado;

        //muestra el resultado por pantalla
        System.out.println("El area del cuadrado es igual a: " + area);

        scanner.close();

    }
}
