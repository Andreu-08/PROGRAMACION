package funciones;

import java.util.Scanner;

public class Positiu_Negatiu_Cero_f3 {
    public static int dimeSigne(int a){

        if(a>0){
            return 1;
        } else if (a<0) {
            return -1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduix un numero :");

        int num=teclado.nextInt();

        if(dimeSigne(num)==1){
            System.out.println("El numero es positiu");
        } else if (dimeSigne(num)==-1) {
            System.out.println("El numero es negatiu");
        }else{
            System.out.println("El numero es zero");
        }
    }
}
