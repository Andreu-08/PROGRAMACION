import java.util.Random;

public class Daus_1 {
    public static void main(String[] args) {
        //creem un random per a poder generar la tirada aleatoria del dau
        Random dau = new Random();

        //creem les variables de cada dau igual a el numero aleatoria entre 1 y 6 generat per el random

        int dau1 = dau.nextInt(6) + 1; //el 6 genera numeros aleatoris entre 0 y 5 al sumarli 1 desplacem el rang en una posicio fent que se generen entre 1 y 6
        int dau2 = dau.nextInt(6) + 1;
        int dau3 = dau.nextInt(6) + 1 ;

        //declarem la variable suma per a poder mostrar el resultat de la suma dels tres daus
        int suma = dau1 + dau2 + dau3;

        System.out.println("La tirada dels daus es " + dau1 + " " + dau2 + " " + dau3);

        System.out.println("La suma de la tirada es " + suma);

    }
}
