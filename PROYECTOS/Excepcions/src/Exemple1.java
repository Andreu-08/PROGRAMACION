import java.util.InputMismatchException;
import java.util.Scanner;
public class Exemple1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0, z = 0, k = 0;
        boolean repetir;
        do {
            repetir = false;
            try{
            System.out.print("Introdueix el primer número enter: ");
            x = sc.nextInt();
            System.out.print("Introdueix el segon número enter: ");
            y = sc.nextInt();
            System.out.print("Introdueix el tercer número enter: ");
            z = sc.nextInt();
            System.out.print("Introdueix el quart número enter: ");
            k = sc.nextInt();
            sc.nextLine();
            break;
        }catch(InputMismatchException e){
            System.err.println("\nHas introduit un valor no valid " + e.toString());
            sc.nextLine();
            repetir = true;
           }
        } while (true);

        System.out.println("int introduït -> " + x);
        System.out.println("int introduït -> " + y);
        System.out.println("int introduït -> " + z);
        System.out.println("int introduït -> " + k);
    }
}