package Pildoras_Informaticas;

import java.util.Scanner;

public class Uso_Arrays3_LlenadoPorConsola {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        String [] paises = new String[8];

        for (int i=0; i<8; i++){
            System.out.println("introduce pais: " + (i+1));
         paises[i] = teclado.next();
        }
        for (String elemento: paises){
            System.out.println("["+elemento+"]");
        }
    }
}
