package Ejercicios_Practica_Examen1;

import java.util.Scanner;

public class CalculadoraSimple {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

       double num1;
        double num2;

        System.out.println("Introduce un numero: ");
        num1 = teclado.nextDouble();
        System.out.println("Introduce un numero para calcular la suma resta producto y division");
        num2 = teclado.nextDouble();

        double suma;
        double resta;
        double producto;
        double  division;

        suma = num1 + num2;
        resta = num1 - num2;
        producto = num1*num2;

        System.out.println("La suma de los dos numeros es: "+ suma);
        System.out.println("La resta de los dos numeros es: "+resta);
        System.out.println("El producto de los dos numeros es: "+producto);

        if (num2 != 0){
            division = num1/num2;
            System.out.println("La divisio dels dos numeros es: " +division);
        }else {
            System.out.println("No se puede dividir por cero");
        }







    }
}
