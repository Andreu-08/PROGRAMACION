package funciones;

import java.util.Scanner;

public class Milles_Kilometres_f4 {
    public static double millesAkm(int milles){

        final double km= 1.60934;

        return (milles*km);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriu el valor en milles per a pasarlo a km :");

        int valor = teclado.nextInt();

        System.out.println(valor + " milles son "+millesAkm(valor) +"Km");
    }
}
