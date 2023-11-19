package bucles;

import java.util.Scanner;

public class Nota10oNo_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean Deu = false; //iniciem un boolean en falso per a veure si apareix algun 10
        int nota;

        //començem un do whyle per a llegir numeros fins a introduir un -1
        do {
            //demanem que se introduixca la nota y que cuan les tinga totes pose un -1 per a acabar
            System.out.println("Introduix una nota, escriu un -1 per a acabar: ");

            //fem que la variable nota siga el numero escrit per teclat
            nota = scanner.nextInt();

            //se comprova si la nota es 10
            if (nota == 10) {
                Deu = true; // si la nota es deu cambiem el boolean a verdader
            }
        } while (nota != -1); //fem que el bucle acabe al introduir un -1

        //utilitzem un if else per poder escriure el misatges de si se ha contat algun 10 o no
        if (Deu){
            System.out.println("Has introduit algun 10");
        } else {
            System.out.println("No has introduit ningun 10");
        }
        scanner.close();

    }
}
