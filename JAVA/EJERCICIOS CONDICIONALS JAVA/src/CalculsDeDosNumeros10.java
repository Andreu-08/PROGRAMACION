import java.util.Scanner;

public class CalculsDeDosNumeros10 {

    public static void main(String[] args) {
        //Es crea un objecte scanner per a que lliga la entrada per teclat
        Scanner scanner =new Scanner(System.in);

        //Demanar el primer numero
        System.out.print("Indica el primer numero: ");
        double num1 = scanner.nextDouble(); //utilitzem double per a poder incluir decimals

        //demanar el segon numero
        System.out.print("Indica el segon numero: ");
        double num2 = scanner.nextDouble();

        //fem els calculs (suma, resta, producte i divisio)
        double suma = num1 + num2;
        double resta = num1 - num2;
        double producte = num1 * num2;

        //comprovar si la divisio es 0
        double divisio = 0.0;
        if (num2 != 0) {
            divisio = num1/num2;
        } else { //si el numero no es diferent a 0 mostrat el misatge
            System.out.println("No es pot dividir per cero.");
        }

        //mostrar els resultats
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producte: " + producte);

        //comprovar si se ha fet la divisio perque era diferent a 0 i fer la operacio
        if(num2 != 0){
            System.out.println("Divisio: " + divisio);
        }
        scanner.close();

    }

}
