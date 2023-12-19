package bucles;

import java.util.Scanner;

public class adivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aleatorio = (int) (Math.random()*100+1);
        int num;

        System.out.println("Intenta adivinar el numero aleatorio del 1 al 100, tienes 9 intentos");
        System.out.println(aleatorio);

       //BUCLE FOR
        /*
       for (int intentos=5; intentos>0; intentos--){
            System.out.println("Introduce el numero:");
            num = scanner.nextInt();

            if (num > aleatorio) {
                System.out.println("El numero que itentas adivinar es menor. Te quedan " + (intentos-1) + "intentos");
            }
            else if (num < aleatorio){
                System.out.println("El numero que itentas adivinar es mayor. Te quedan " + (intentos-1) + "intentos");
            }
            else {
                System.out.println("Has acertado y has utilizado " + (5 - (intentos-1)) + " intentos");
                break;
            }
            if (intentos-1 == 0){
                System.out.println("Has perdido. El numero era: " +  aleatorio);
            }
        //BUCLE DO WHILE
        /*int intentos = 5;
        do
        {
            System.out.println("Intorduce el numero que piensas: ");
            num = scanner.nextInt();

            if (num > aleatorio) {
                System.out.println("El numero que itentas adivinar es menor. Te quedan " + (intentos-1) + " intentos");
            }
            else if (num < aleatorio){
                System.out.println("El numero que itentas adivinar es mayor. Te quedan " + (intentos-1) + " intentos");
            }
            else {
                System.out.println("Has acertado y has utilizado " + (5 - (intentos-1)) + " intentos");
            }
            intentos--;

        } while (intentos > 0 && num != aleatorio);
        if (intentos == 0){
            System.out.println("Has fallado el numero era "  + aleatorio);
        }*/
    }
}
