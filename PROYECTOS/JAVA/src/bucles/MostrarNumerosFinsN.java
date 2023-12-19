package bucles;

import java.util.Scanner;

public class MostrarNumerosFinsN {
    public static void main(String[] args) {
        // creem la classe escaner per a poder escriure el numero per teclat
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriu un nomero: ");
        //declarem la variable N per a que siga igual al que hem escrit
        int N = scanner.nextInt();

        //iniciem um bucle for desde 1 fins a N
        for (int i = 1; i <= N; i++){

            System.out.println(i); // imprimim el numero actual de cada volta

        }
        scanner.close();
    }
}
