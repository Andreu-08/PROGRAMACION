package condicionals;

import java.util.Scanner;

public class DADO{
    public static void main(String[] args) {
        //Crea la variable numero
        int numero;
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Introduce un numero: ");
            numero = teclado.nextInt();
        }

        //permite llamar a la variable tantas veces como quieras (case...)
        switch (numero){
            case 1:
                System.out.println("En la cara opuesta esta el seis");
                break;
            case 2:
                System.out.println("En la cara opuesta esta el cinco");
                break;
            case 3:
                System.out.println("En la cara opuesta esta el cuatro");
                break;
            case 4:
                System.out.println("E la cara opuesta esta el tres");
                break;
            case 5:
                System.out.println("En la cara opuesta esta el dos");
                break;
            case 6:
                System.out.println("En la cara opuesta esta el uno");
                break;
            default:
                System.out.println("ERROR: Numero Incorrecto");
                break;

          

        }

    }
}