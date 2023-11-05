import java.util.Scanner;

public class numeroMajorOIgual14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //escrivim els numeros per teclat y els llegim
        System.out.println("Escriu el primer número: ");
        int num1 = scanner.nextInt();

        System.out.println("Escriu el segundo número: ");
        int num2 = scanner.nextInt();
        //comprovem quin numero es major y el mostrem els misatge per pantalla
        if (num1 > num2) {
            System.out.println("El primer número (" + num1 + ") es major que el segon número (" + num2 + ").");
        } else if (num2 > num1) {
            System.out.println("El segon número (" + num2 + ") es major que el primer número (" + num1 + ").");
        } else {
            System.out.println("Els dos numero sin iguals (" + num1 + ").");
        }

    }

}
