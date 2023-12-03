package Ejercicios_Practica_Examen1;

import java.util.Scanner;

public class Major_3Nums {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("num1:");
        num1= teclado.nextInt();

        System.out.println("num2");
        num2=teclado.nextInt();

        System.out.println("num3:");
        num3= teclado.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("Major " + num1);

        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Major " + num2);

        }else{
            System.out.println("Major " + num3);
        }


    }
}
