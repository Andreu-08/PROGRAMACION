import java.util.Scanner;

public class positiusYNegatiusFinsEscriure0_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int positius = 0; //inicializem la variable positius a 0
        int negatius = 0; //inicializem la variable negatius a 0
        int num;

        do {
            System.out.println("Introduix un numero, escriu un 0 per a acabar: ");
            num = scanner.nextInt();

            //se fa la comprovacio de si el numero es positiu o engatiu
            if (num > 0 ) {
                positius++; // se incrementa el contador positiu

            } else if (num < 0) {
                negatius++; //se incrementa el contador de negatius

            }
        } while (num != 0); //acabem el cicle do while escribint el 0

        //imprimim per pantalla la cuantitat de numeros positius y negatius que se han contat
        System.out.println("Hast introdiut " + positius + " numeros positius.");
        System.out.println("Has introduis " + negatius + " numeros negatius.");

        scanner.close();
    }
}
