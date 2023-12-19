package juegoStarWars;

import java.util.Random;
import java.util.Scanner;

public class nivel4 {
    public static void nivel4(){

        Random num = new Random();

        int P = num.nextInt(90)+10;

        System.out.println("\nGracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta\n" +
                "acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para\n" +
                "intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita\n" +
                "verificar si el número " + P + " es primo o no. Si es primo introduce un 1, si no lo es\n" +
                "introduce un 0.");

        boolean esPrimo = true;

        for (int i = 2; i < P; i++) {
            if (P % i == 0) {
                esPrimo = false;
                break;
            }
        }
        Scanner scanner = new Scanner(System.in);
        int respuestaUsuario = scanner.nextInt();

        if(esPrimo && respuestaUsuario == 1) {
            nivel5.nivel5();
        } else if (!esPrimo && respuestaUsuario == 0) {
            nivel5.nivel5();
        } else{
            perder.perder();
        }

    }
}
