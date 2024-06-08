package Exepcions;
import java.util.*;
public class Ex6Excepcions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//captura la entrada de l'usuari

        //variables que anem a necesitar
        int pes = 0;
        double volum = 0;
        boolean pesValid = false; //per a fer la comprobacio fins que siga valid el num
        boolean volumValid = false;

        /*bucles per a manejar les excepcions y evitar errors a la hora de realitzar el calcul
         impedira finalitzar el programa fins que se calcule una densitat correcta
         */

        //verifiquem el valor del pes
        while (!pesValid) {

            try {
                System.out.println("Introdueix el pes en grams per a calcular la densitat :");
                pes = sc.nextInt();
                pesValid = true;
            } catch (InputMismatchException e) { //en asegurem que el valor te un format correcte(int)
                System.err.println("Error: El valor te que ser un enter");
                sc.next(); //limpia el scanner per a evitar bucles infinits
            }
        }

        //verifiquem el valor del volum
        while (!volumValid) {
            try {
                System.out.println("Introdueix el volum en litres: ");
                volum = sc.nextDouble();
                if (volum == 0) {
                    //Modifiquem el mensatje de la excepcio per a que siga mes clar
                    throw new ArithmeticException("El volum no pot ser zero");
                }
                volumValid = true; //sexecuta cuan el volum es valid per a ixir del bucle
            } catch (InputMismatchException e) {//comprova que es un dobule
                System.err.println("Error: El valor no es correcte, introdueix un valor correcte");
                sc.next();
            } catch (ArithmeticException e) {//comprova que no siga 0
                System.err.println(e.getMessage());
            }

        }

        //calculem la densitat fora dels bucles amb les dades ya verificades y correctes
        System.out.println("El pes es: " + pes);
        System.out.println("El volum es: " + volum);
        double densitat = pes / volum;
        System.out.println("La densitat es : " + densitat);
    }
}


