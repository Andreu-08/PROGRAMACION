import java.util.Scanner;

public class NumeroPositiuNegatiu12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix un numero: ");
        int num = scanner.nextInt();//se llig el numero ingresat per pantalla

        // verifiquem que el numero es major que 0
        if (num >= 0) {
            System.out.println("El numero es positiu");
        } else {
            System.out.println("El numero es negatiu");
        }
        scanner.close();
    }
}
