package juegoStarWars;

import java.util.Scanner;

public class inicio{
    public static void inicio() {
        //se imprime por pantalla la frase y el texto de presentacion del juego
        //utilizamos \n para aplicar saltos de linea donde queremos
        System.out.println("\n===STAR WARS CÓDIGOS SECRETOS===");
        System.out.println("\nHace mucho tiempo, en una galaxia muy, muy lejana… La Princesa Leia, Luke\n" +
                "Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada\n" +
                "en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio\n" +
                "está construyendo para destruirla.");

        //utilizamos la clasee escaner para la entrada por teclado
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n(Presiona intro para continuar)");
        scanner.nextLine();//este metodo de la clase escanner ara que el juego continue al presionar intro
    }
}
