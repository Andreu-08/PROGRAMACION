import java.util.Scanner;

public class TotCompraBolita {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Total compra :");
        // se agrega un codigo para cada color
        double TotalCompra = scanner.nextDouble();
        System.out.println("Color de la bolita: ");
        System.out.println("1. Blanca");
        System.out.println("2. Verde");
        System.out.println("3. Amarilla");
        System.out.println("4. Azul");
        System.out.println("5. Roja");

        System.out.println("Elige el color de la bolita (1-5)");
        int opcion = scanner.nextInt(); //crear la variable opcion

        double bolita = 0.0;

        if (opcion == 1) {
            bolita = 0.0;
        } else if (opcion == 2) {
            bolita = 0.10 * TotalCompra;

        } else if (opcion == 3) {
            bolita = 0.25 * TotalCompra;
        } else if (opcion == 4) {
            bolita = 0.50 * TotalCompra;
        } else if (opcion == 5) {
            bolita = TotalCompra;
        } else {
            System.out.println("No se aplica descombte");
        }
        double PreuFinal = TotalCompra - bolita;

        System.out.println("precio total:" + PreuFinal);
        scanner.close();
    }
}
