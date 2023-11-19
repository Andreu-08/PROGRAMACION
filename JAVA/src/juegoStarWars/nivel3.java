package juegoStarWars;

import java.util.Random;
import java.util.Scanner;

public class nivel3 {
    public static void nivel3(){

        Random num = new Random();

        long N = num.nextInt(50)+50;

        System.out.println("\nHan Solo proporciona el código correcto. Atracan en la estrella de la muerte, se\n" +
                "equipan con trajes de soldados imperiales que encuentran en la nave para pasar\n" +
                "desapercibidos y bajan. Ahora deben averiguar en qué nivel de los " +N+ " existentes se\n" +
                "encuentra el reactor principal. Se dirigen al primer panel computerizado que\n" +
                "encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita\n" +
                "introducir una clave de acceso. Entonces recuerda la información que le proporcionó\n" +
                "Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de "+N+"/10\n" +
                "(redondeando el resultado hacia abajo), donde " + N + " es el nº de niveles”.\n" +
                "¿Cual es el nivel correcto?");

        //utilizamos double para hacer la division de N entre 10 ya que nos va a dar decimales
        //a esto le decimos que tiene que ser igual a un entero (int)

        double num2 = (int) N/10;

        long factorial = 1; //creem una variable amb long perque el factorial pot ser molt llarg

        // fem el calcul del factorial amb un bucle for
        for (int i = 1; i <= num2; i++){

            factorial = factorial * i;
        }

        Scanner scanner = new Scanner(System.in);
        long respuestaUsuario = scanner.nextInt();

        if(respuestaUsuario == factorial){
            nivel4.nivel4();
        }else{
            perder.perder();
        }
    }
}
