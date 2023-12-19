package bucles;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //imprimim mensatge per a que el usuari ingrese un numero
        System.out.println("Indica la cantitat de numeros de la serie fibonacci que vols generar: ");

        //N sera la varible que tindra el numero introduit per teclat
        int N = teclado.nextInt();

        int num1 = 0;
        int num2 = 1;
        //imprimim els dos primers numeros ya que despres els anira sumant y imprimira els seguents
        System.out.print(num1 + " " + num2 + " ");

        //utilitzem el for pero a generar tanst numeros com se han indicat per teclat
        for(int i = 2; i < N; i++){  //iniciem la i en 2 ya que ya hem impres els dos primers numeros de la serie

            //fem que se sume cada ronda els dos numeros anterios y se imprimixquen per pantalla

            int numSeguent = num1 + num2;

            //imprimim el seguent numero amb un espai

            System.out.print(numSeguent + " ");

            //actualizem els dos numeros per a que se sumen en la seguent volta

            num1 = num2;
            num2 = numSeguent;
        }
    }
}
