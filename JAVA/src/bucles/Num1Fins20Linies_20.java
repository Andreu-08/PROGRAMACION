package bucles;

import java.util.Scanner;

public class Num1Fins20Linies_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriu un numero entre 0 y 20: ");
        int N = scanner.nextInt();

        if (N < 0 || N > 20) {
            System.out.println("El numero te que estar entre 0 y 20");
        } else {

            for (int i = 1; i <= N; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(i);
                }
                System.out.println();
            }

        }

    }
}
