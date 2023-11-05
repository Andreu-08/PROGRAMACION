import java.util.Scanner;

public class MostrarNumMajor11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Indica el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Indica el segon numero: ");
        int num2 = scanner.nextInt();

        //comprar els numeros per vore quin es major
        int major;
        if (num1 > num2) {
            major = num1;
        } else { //si el numero 1 es major que el dos major es numero 1 sino major el numero 2
            major = num2;

            //mostrem quin es el numero major
            System.out.println("El numero major es: " + major);

            scanner.close();
        }
    }
}
