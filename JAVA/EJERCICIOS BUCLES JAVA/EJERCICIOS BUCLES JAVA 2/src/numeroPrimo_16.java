import java.util.Scanner;

public class numeroPrimo_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriu un numero per a vore si es primo: ");

        int numero = scanner.nextInt();

        boolean esPrimo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo && numero > 1) {
            System.out.println("Es Primo!");
        } else {
            System.out.println("No es Primo!");
        }
    }
}
