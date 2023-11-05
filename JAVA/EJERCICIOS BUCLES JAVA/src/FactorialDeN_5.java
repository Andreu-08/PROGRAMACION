import java.util.Scanner;

public class FactorialDeN_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriu  un numero: ");

        int N = scanner.nextInt(); //creem la variable N amb el numero escrit per teclat

        long factorial = 1; //creem una variable amb long perque el factorial pot ser molt llarg

        // fem el calcul del factorial amb un bucle for
        for (int i = 1; i <= N; i++){

            factorial = factorial * i;
        }
        System.out.println("El factorial de " + N + " es igual a " + factorial);
    }
}
