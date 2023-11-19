package bucles;

import java.util.Scanner;

public class numeroSimbols_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un numero ");

        int num = scanner.nextInt();

        if (num > 0) {
              for (int i = 0; i < num; i++){
                   System.out.print("*");
              }
        } else {
            for (int i = 0; i < -num; i++) {
                System.out.print("$");
            }
        }
    }
}
