import java.util.Scanner;

public class multiplesDe3_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Demanem al usuari que introduixca un numero
        System.out.print("Introduix un numero: ");
        int numero = scanner.nextInt();
        //Crem el contadomultiplos per a que vaja guardant la cuantitat de multiplos que conte
        int multiplos = 0;

        //iniciem un bucle for per a que ens conte la cuantitat de multiples de 3 fins el numero introduit
        for (int i = 1; i <= numero; i++) {

            if (i % 3 != 0) { //este if fa que si el numero no es mutiple de 3 continua al seguent numero
                continue;
            }
            // se incrementa el contador de multiplos amb els que se han contat abanç de imprimirlo
            multiplos++;

        }
        //es mostra la cuantitat de multiplos per pantalla
        System.out.println("Cantitat de multiplos de 3 = " + multiplos);

    }
}
