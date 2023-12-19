package Pildoras_Informaticas;

public class Uso_Bucle_for {
    public static void main(String[] args) {

        //repite el nombre Andreu 10 veces
        //variblae i dentro del bucle es el contador de las vueltas
        //esta seguido de la condicion del bucle en este caso que i sea < que 10
        //la parte final incrementa el contador i en 1 cada vez que empieza el bucle
        for (int i = 0; i < 10; i++ ) {

            System.out.println("Andreu"); //linea de codigo que se ejecutara cada vez que empieze el for
        }

        //ejemplo del bucle for decrementando la i en vez de incrementandola, hara los mismo que el anterior
        //la i se inicia en 10 y se indica que se repita mientras sea mayor que 0
        for (int i = 10; i > 0; i-- ) {

            System.out.println("Andreu2");
        }
    }
}
