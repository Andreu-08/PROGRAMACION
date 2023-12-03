package Ejercicios_Practica_Examen1;

import java.util.Scanner;

public class Operaciones_Radio {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el radio de una circunferencia  para saber su area, su longitud y su volumen:");

       int radi= teclado.nextInt();

       int diametro = radi+radi;

       double longitud = (Math.PI * diametro);
       double areaCirculo =  (Math.PI * Math.pow(radi,2));

       double volumen =(4/3 * Math.pow (radi, 3)* Math.PI );

        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El area de la circunferencia es: " + areaCirculo);
        System.out.println("El volumen de la esfera es: " + volumen);
    }
}
