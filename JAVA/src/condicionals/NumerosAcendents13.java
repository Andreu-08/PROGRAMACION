package condicionals;

import java.util.Scanner;

public class NumerosAcendents13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriu el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Escriu el segon numero:");
        int num2 = scanner.nextInt();

        //verifiquem quin es el numero major i quin el menor
        int major, menor;

        if (num1<num2){
            menor=num1;
            major=num2;
        }else{
            menor=num2;
            major=num1;
        }
        System.out.println("Els numeros en ordre ascendent son: " + menor + "," + major);
    }
}
