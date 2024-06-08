package Practica_Banc_Exepcions.deparbank;

import java.util.Scanner;

public class DeparBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CompteBancari cuenta;
        boolean cuentaValida;

        do {
            System.out.print("Introduzca numero IBAN: ");
            String iban = sc.nextLine();
            System.out.print("Introduzca titular de cuenta: ");
            String titular = sc.nextLine();
            cuenta = new CompteBancari(iban, titular);
            cuentaValida = cuenta.getValida();
            if (!cuentaValida) {
                System.out.println("Datos inválidos. Por favor, intente de nuevo.");
            }
        } while (!cuentaValida);

        int opcion;
        double cantidad;
        do {
            System.out.println("Elija una opción:");
            System.out.println("1. Datos de la cuenta.");
            System.out.println("2. IBAN.");
            System.out.println("3. Titular.");
            System.out.println("4. Saldo.");
            System.out.println("5. Ingreso.");
            System.out.println("6. Retirada.");
            System.out.println("7. Movimientos.");
            System.out.println("8. Salir.");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpia el buffer de entrada

            switch (opcion) {
                case 1:
                    cuenta.imprimirDatos();
                    break;
                case 2:
                    System.out.println("IBAN: " + cuenta.getIban());
                    break;
                case 3:
                    System.out.println("Titular: " + cuenta.getTitular());
                    break;
                case 4:
                    System.out.println("Saldo: " + cuenta.getSaldo());
                    break;
                case 5:
                    System.out.print("Inserte cantidad a ingresar: ");
                    cantidad = sc.nextDouble();
                    sc.nextLine(); // Limpia el buffer de entrada
                    if (cuenta.ingresar(cantidad)) {
                        System.out.println("Ingreso realizado correctamente.");
                    } else {
                        System.out.println("Error al realizar el ingreso.");
                    }
                    break;
                case 6:
                    System.out.print("Inserte cantidad a retirar: ");
                    cantidad = sc.nextDouble();
                    sc.nextLine(); // Limpia el buffer de entrada
                    if (cuenta.retirar(cantidad)) {
                        System.out.println("Retirada realizada correctamente.");
                    } else {
                        System.out.println("Error al realizar la retirada.");
                    }
                    break;
                case 7:
                    cuenta.imprimirMovimientos();
                    break;
                case 8:
                    System.out.println("GRACIAS POR USAR NUESTRA APLICACIÓN");
                    break;
                default:
                    break;
            }
        } while (opcion != 8);
        sc.close();
    }
}

