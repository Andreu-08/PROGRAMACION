import java.util.Scanner;

public class MajorDeTresNumeros15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriu el primer número: ");
        int num1 = scanner.nextInt();

        System.out.println("Escriu el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Escriu el tercer número: ");
        int num3 = scanner.nextInt();
        //variable major per a indicar quin es el numero mes gran
        int major;
        //comprovar si el numero 1 es el mes gran
        if (num1 > num2 && num1 > num3) {
            major = num1;
        //comprovar si el numero 2 es el mes gran
        } else if (num2 > num1 && num2 > num3) {
            major = num2;
        //sino pasa res de les instruccions anteriors el 3 sera el mes gran
        } else {
            major = num3;
        }
        //dir per pantalla quin es el numero mes gran indicat en la variable major
        System.out.println("El número major es: " + major);

        scanner.close();
    }
}
