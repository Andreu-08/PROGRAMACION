package juegoStarWars;

import java.util.Random;
import java.util.Scanner;

public class nivel5 {
    public static void nivel5(){

        Random num = new Random();
        Random num2 =new Random();
        int M = num.nextInt(5)+5;
        int S = num2.nextInt(5)+5;

        System.out.println("\nConsiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba,\n" +
                "programe el temporizador y salir de allí corriendo. Necesita programarlo para que\n" +
                "explote en exactamente " + M + " minutos y " + S + " segundos, el tiempo suficiente para escapar\n" +
                "antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y\n" +
                "desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto\n" +
                "peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar\n" +
                "el factorial de " + M + " y el factorial de " + S +". ¿Qué valor debe introducir?");

        long factorialM = 1; //creem una variable amb long perque el factorial pot ser molt llarg

        // fem el calcul del factorial amb un bucle for
        for (int i = 1; i <= M; i++){

            factorialM = factorialM * i;
        }
        long  factorialS = 1; //creem una variable amb long perque el factorial pot ser molt llarg

        // fem el calcul del factorial amb un bucle for
        for (int i = 1; i <= S; i++){

            factorialS = factorialS * i;
        }
        long respuestaCorrecta = factorialM + factorialS;

        Scanner scanner = new Scanner(System.in);
        long respuesUsuario = scanner.nextInt();

        if (respuesUsuario == respuestaCorrecta){
            ganar.ganar();
        }else{
            perder.perder();
        }


    }
}
