import java.util.Scanner;

public class Piramide_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriu un numero per a formar la seua piramide");

        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = num - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
