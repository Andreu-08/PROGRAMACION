package Practica_Banc_Exepcions.deparbankv2;

import Practica_Banc_Exepcions.deparbankv2.Exception.AvisarHisendaException;
import Practica_Banc_Exepcions.deparbankv2.Exception.CompteException;

import java.util.Scanner;

public class DeparBankV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CompteBancariV2 cuenta = null;
        boolean cuentaValida;

        // Intento de crear cuenta y validación de la misma
        do {
            try {
                System.out.print("Introduzca número IBAN: ");
                String iban = sc.nextLine();
                System.out.print("Introduzca titular de cuenta: ");
                String titular = sc.nextLine();
                cuenta = new CompteBancariV2(iban, titular);
                cuentaValida = true;
            } catch (CompteException e) {
                System.out.println("Error al crear la cuenta: " + e.getMessage());
                cuentaValida = false;
            }
        } while (!cuentaValida);

        int opcion;
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

            try {
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
                        double cantidad = sc.nextDouble();
                        cuenta.ingresar(cantidad);
                        break;
                    case 6:
                        System.out.print("Inserte cantidad a retirar: ");
                        double cantidadRetiro = sc.nextDouble();
                        cuenta.retirar(cantidadRetiro);
                        break;
                    case 7:
                        cuenta.imprimirMovimientos();
                        break;
                    case 8:
                        System.out.println("GRACIAS POR USAR NUESTRA APLICACIÓN");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elija una opción del menú.");
                        break;
                }
            } catch (CompteException | AvisarHisendaException e) {
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
        } while (opcion != 8);

        sc.close();
    }
}
