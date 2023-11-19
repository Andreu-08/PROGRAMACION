package bucles;

import java.util.Scanner;

public class AdivinaElNumeroDel1Al100_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //iniciem el minim y el maxim del rang dels numeros que poden ser posibles
        int min = 1;
        int max = 100;
        String resposta; //utilitzem el String resposta per a poder dirli si el numero es major o menor

        //iniciem un bucle do while per a que l'ordinador repetixca fins que li dius 'correcte'
        do {
            int proposta = (min + max) / 2; //el ordenador proposa un numero en mitg del rang que li hem asignat
            // imprimix el numero proposat per pantalla
            System.out.println("Has pensat en " + proposta + ", respon 'major' o 'menor' ");

            resposta = scanner.nextLine();

            // se actualitza el rang per damunt o per baix del numero proposat segons la resposta
            if (resposta.equals("major")) {
                min = proposta + 1;
            } else if (resposta.equals("menor")) {
                max = proposta - 1;
            }
        } while (!resposta.equals("correcte")); //fem que la maquina pare de dir numeros escribint la paraula 'correcte'

        // en el cas de dirli que es correct ens imprimix este misatge per pantalla
        System.out.println("¡He adivinat el numero!");

        scanner.close();
    }
}
