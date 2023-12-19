package bucles;

import java.util.Scanner;

public class NumerosMajors_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //iniciem les variables que se van a utilitzar
        int ultimNum = 0;
        int totalNum = 0;
        int numFallat= 0;

        while (true) {//se utilitza per a crear un bucle que es infinit fin que se cumplixca la condicio (0)
            System.out.println("Escriu un numero: ");//demanem al usuari que escriga un numero
            int num = scanner.nextInt();//declarem el numero en una variabla

            if (num == 0) { //si numero es igual a 0 ixim del bucle
                break;
            }
            //si el nuero es major que el ultim numero introdiut en este
            //cas 0 perque el hem iniciat a 0 el acceptem y el actualizem
            if (num > ultimNum) {
                ultimNum = num;
                totalNum++; //incrementem en 1 el total de numeros introduits
            }else {
                System.out.println("Fallo es menor"); //si el numero es menor se mostra este misatje
                numFallat++; //se incrementa el numero de fallos en 1
            }
        }
        //se imprim per pantalla el total dde numeros y de fallos despres de ixir del bucle
        System.out.println("Total numeros introduits " + totalNum);
        System.out.println("Total numeros Fallats " + numFallat);

    }
}
