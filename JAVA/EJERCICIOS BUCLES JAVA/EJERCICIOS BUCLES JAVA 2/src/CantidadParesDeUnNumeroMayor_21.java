import java.util.Scanner;

public class CantidadParesDeUnNumeroMayor_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriu un numero: ");;
        int A = scanner.nextInt();

        System.out.print("Escriu un numero mes gran: ");
        int B = scanner.nextInt();

        if (A > B) {
            System.out.println("El numero te que ser mes gran");
        } else {
            int contadorPars = 0;

            for (int i = A; i <= B; i++) {
                System.out.print(i + " ");
                if (i % 2 == 0) {
                    contadorPars++;
                }
            }
            System.out.println();
            System.out.println("La cantitat de numeros parells es: " + contadorPars);
        }
    }
}
