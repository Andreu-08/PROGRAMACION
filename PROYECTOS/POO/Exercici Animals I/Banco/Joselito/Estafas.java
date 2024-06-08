package preuba;
import java.util.Scanner;
public class Estafas {

    static int resta;
    static int usuario = 500;

    /*=================================================================*/
    public static void sacarDinero(){
        Scanner in = new Scanner(System.in);

        System.out.println("¿Cuanto dinero quieres sacar?");
        do {
            resta = in.nextInt();
            NO(resta);
        }while(resta > usuario);

        usuario -= resta;
    }

    /*=================================================================*/
    public static void NO(int resta){
        if(Estafas.resta > usuario){
            throw new ArithmeticException("Cantidad de dinero que se quiere extraer mayor a la que se posee");
        }
    }

    /*=================================================================*/
    public static void main(String[] args) {
        System.out.println("DINERO ACTUAL: " + usuario);
        sacarDinero();
        System.out.println("DINERO RESTANTE: " + usuario);
    }
}
