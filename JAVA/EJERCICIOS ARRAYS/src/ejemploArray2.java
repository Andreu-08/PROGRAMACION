import java.util.Scanner;

public class ejemploArray2 {
    public static void main(String[] args) {
        int[] array = new int[7];
        Scanner teclado = new Scanner(System.in);

        System.out.println("introduce el numero por consola: ");
        System.out.println("Tu array tiene los siguentes valores:");

        for (int indice = 0; indice < array.length; indice++) {
           array[indice] = (int) (Math.random() * 10 + 1);
        }

        for (int indice = 0; indice < array.length; indice++) {
            System.out.print("[" + array[indice] + "]");
        }

    }
}
