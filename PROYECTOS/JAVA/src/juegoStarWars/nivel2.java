package juegoStarWars;

import java.util.Random;
import java.util.Scanner;

public class nivel2 {
    public static void nivel2(){

        Random num = new Random();
        int P1 = num.nextInt(7)+1;//indicamos que queremos 7 num aleatorios que empiezen desde el 1 (incluido) hacia delante
        int P2 = num.nextInt(5)+8;//indicamos que queremos 5 num aleatorios que empiezen desde el 8 (incluido) hacia delante

        System.out.println("\nGracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella\n" +
                "de la muerte. Como van en una nave imperial robada se aproximan lentamente con\n" +
                "la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí\n" +
                "agente de espaciopuerto " +P1+ " contactando con nave imperial " +P2+". No están destinados\n" +
                "en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa. “Eh…\n" +
                "tenemos un fallo en el… eh… condensador de fluzo... Solicitamos permiso para\n" +
                "atracar y reparar la nave”. El agente, que no se anda con tonterías, responde\n" +
                "“Proporcione código de acceso o abriremos fuego”. Han Solo ojea rápidamente el\n" +
                "manual del piloto que estaba en la guantera y da con la página correcta. El código\n" +
                "es el productorio entre el nº del agente y el nº de la nave (ambos inclusive).\n" +
                "¿Cuál es el código");

        Scanner scanner = new Scanner(System.in);
        long respuestaUsuario = scanner.nextInt();

        // iniciamos la variable del productorio en 1 para que el resultado no sea 0
        // utilizamos long ya que puede dar numeros muy grandes
        long productorio = 1;
        for(int i=P1; i<=P2; i++) {
            productorio *= i;
        }

        long respuestaCorrecta = productorio;

        if(respuestaUsuario == respuestaCorrecta){
            nivel3.nivel3();
        }else {
            perder.perder();
        }
    }
}
