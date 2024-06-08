package Practica_Banc_Exepcions.deparbankv2;
import Practica_Banc_Exepcions.deparbankv2.Exception.AvisarHisendaException;
import Practica_Banc_Exepcions.deparbankv2.Exception.CompteException;

import java.util.ArrayList;


    public class CompteBancariV2 {
        private String IBAN;
        private String titular;
        private double saldo;
        private ArrayList<String> movimientos;

        public CompteBancariV2(String IBAN, String titular) throws CompteException {
            this.IBAN = IBAN;
            this.titular = titular;
            this.saldo = 0.0;
            this.movimientos = new ArrayList<>();
            if (!validarDatos()) {
                throw new CompteException("Datos inválidos para la cuenta bancaria.");
            }
        }

        private boolean validarDatos() {
            return validarIBAN(IBAN) && titular != null && !titular.trim().isEmpty();
        }

        private boolean validarIBAN(String iban) {
            return iban != null && iban.matches("[A-Z]{2}\\d{2}[A-Z0-9]{10,28}");
        }

        public boolean ingresar(double cantidad) throws CompteException, AvisarHisendaException {
            if (cantidad <= 0) {
                throw new CompteException("La cantidad a ingresar debe ser mayor que cero.");
            }
            if (cantidad > 3000) {
                throw new AvisarHisendaException("Operación de ingreso notificable a Hacienda.");
            }
            saldo += cantidad;
            movimientos.add("Ingreso: " + cantidad);
            return true;
        }

        public boolean retirar(double cantidad) throws CompteException, AvisarHisendaException {
            if (cantidad <= 0) {
                throw new CompteException("La cantidad a retirar debe ser mayor que cero.");
            }
            if (cantidad > 3000) {
                throw new AvisarHisendaException("Operación de retiro notificable a Hacienda.");
            }
            if (saldo - cantidad < -50) {
                throw new CompteException("Fondos insuficientes para realizar la retirada.");
            }
            saldo -= cantidad;
            movimientos.add("Retiro: " + cantidad);
            return true;
        }

        public void imprimirDatos() {
            System.out.println("IBAN: " + IBAN);
            System.out.println("Titular: " + titular);
            System.out.println("Saldo: " + saldo);
        }

        public void imprimirMovimientos() {
            if (movimientos.isEmpty()) {
                System.out.println("No hay movimientos registrados.");
            } else {
                System.out.println("Movimientos:");
                for (String movimiento : movimientos) {
                    System.out.println(movimiento);
                }
            }
        }

        public String getIban() {
            return IBAN;
        }

        public String getTitular() {
            return titular;
        }

        public double getSaldo() {
            return saldo;
        }
    }


