import java.util.Scanner;

public class ValorDeAElevatAB_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //demanem el numero A per pantalla i el transformem en una variable
        System.out.println("Introduix el valor de A: ");
        int A = scanner.nextInt();

        //demanem el numero B per pantalla y el transformem en variable
        System.out.println("Introduix el valor de B: ");
        int B = scanner.nextInt();

        int resultat = 1; //iniciem la variable resultat en 1

        //utilitzant un bucle for fem el calcul de A elevat a B
        for(int i = 0; i < B; i++) {

            resultat = resultat * A;
        }

        System.out.println("A elevat a B es igual a " + resultat);

        scanner.close();
    }
}
