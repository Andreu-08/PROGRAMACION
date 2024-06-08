package Programacion.Java.TryCatch.CasoPractico;
import Programacion.Java.TryCatch.CincoDiez.ejercicio9.Gato;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        int respuesta;
        Scanner in = new Scanner(System.in);

        Cliente cliente1 = new Cliente(5000, 0);
        cliente1.generateUserIBAM(new StringBuilder("i"));
        cliente1.setNombre("i");

        do {
        System.out.println("\n============================\n" +
                "==== 1. DATOS COMPLETOS ====\n" +
                "==== 2. TITULAR ============\n" +
                "==== 3. VER IBAM ===========\n" +
                "==== 4. EXTRAER DINERO =====\n" +
                "==== 5. DEPOSITAR DINERO ===\n" +
                "==== 6. SALDO ==============\n" +
                "==== 7. MOVIMIENTOS ========\n" +
                "==== 8. SALIR ==============\n" +
                "============================");

        respuesta = in.nextInt();

            switch (respuesta) {
                case 1:
                    System.out.println(cliente1);
                    break;
                case 2:
                    System.out.println("Cuenta a nombre de " +cliente1.getNombre());
                    break;
                case 3:
                    System.out.println(cliente1.IBAM);
                    break;
                case 4:
                    cliente1.extraccion();
                    break;
                case 5:
                    cliente1.depositar();
                    break;
                case 6:
                    System.out.println("Tienes " + cliente1.getDinero() + "€");
                    break;
                case 7:
                    cliente1.Movimientos();
                    break;
                case 8:
                    System.out.println("Adeu!!");
                    break;
                default:
                    System.out.println("Has introducido un valor fuera del rango esperado");
                    break;
            }
        }while (respuesta != 8);
    }
}

        /* * AÑADIR SIGUIENTES DATOS:
            ! Trycatch para evitar errores de transacciones
        */