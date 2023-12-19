package funciones;

import java.util.Scanner;

public class Preu_IVA_f5 {
    public static double precioConIVA(double preu){
        return (preu*1.21);
    }
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
       System.out.println("Introduce un precio para sumarle el iva:"); 

       double  precioSin = teclado.nextInt();

       double precioConIvA = precioConIVA(precioSin);

       System.out.println("El precio con IVA es " + precioConIvA);

    }
    
}
