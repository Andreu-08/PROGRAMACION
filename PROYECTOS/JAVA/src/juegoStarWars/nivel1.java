package juegoStarWars;

import java.util.*;


public class nivel1 {
    public static void inicioJuego(){
        //con el metodo random creamos los numero aleatorios que apareceran en el texto
        Random num = new Random();
        int S1 = num.nextInt(10)+1;//indicamos que queremos 10 num aleatorios que empiezen desde el 1 (incluido) hacia delante
        int S2 = num.nextInt(10)+20;//indicamos que queremos 10 num aleatorios que empiezen desde el 20(incluido) hacia delante

        // imprimimos el texto con los numeros aleatorios
        System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al\n"
                +"sistema " + S1 + " en el sector " + S2 +", pero el sistema de navegación está estropeado y el\n"
                +"computador tiene problemas para calcular parte de las coordenadas de salto.\n"
                +"Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.\n"
                +"Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que\n"
                +"calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).\n"
                +"¿Qué debe introducir?");

        Scanner scanner = new Scanner(System.in);
        int respuestaUsuario = scanner.nextInt();

        int sumatorio = 0;
        for(int i=S1; i<=S2; i++) {
            sumatorio += i;
        }

        int respuestaCorrecta = sumatorio;

        if(respuestaUsuario == respuestaCorrecta){
            nivel2.nivel2();
        }else{
            perder.perder();
        }
    }
}
