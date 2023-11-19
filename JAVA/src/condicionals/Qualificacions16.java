package condicionals;

import java.util.Scanner;

public class Qualificacions16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduïx una qualificació numèrica entre 0 i 10: ");
        double qualificacio = scanner.nextDouble();

        if (qualificacio < 3.0) {
            System.out.println("Molt Deficient");
        } else if (qualificacio < 5.0) {
            System.out.println("Insuficient");
        } else if (qualificacio < 6.0) {
            System.out.println("Bé");
        } else if (qualificacio < 9.0) {
            System.out.println("Notable");
        } else if (qualificacio <= 10.0) {
            System.out.println("Excel·lent");
        }

        scanner.close();
    }
}
