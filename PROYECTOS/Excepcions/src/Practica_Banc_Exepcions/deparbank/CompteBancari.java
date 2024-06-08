package Practica_Banc_Exepcions.deparbank;

import java.util.ArrayList;

public class CompteBancari {
    private String IBAN;
    private String titular;
    private double saldo;
    private boolean valida;
    private ArrayList<String> movimientos;

    public CompteBancari(String IBAN, String titular) {
        this.IBAN = IBAN;
        this.titular = titular;
        this.saldo = 0.0;
        this.movimientos = new ArrayList<>();
        this.valida = validarDatos();  // Validación de los datos al crear la cuenta
    }

    private boolean validarDatos() {
        return validarIBAN(IBAN) && titular != null && !titular.trim().isEmpty();
    }

    private boolean validarIBAN(String iban) {
        return iban != null && iban.matches("[A-Z]{2}\\\\d{2}[A-Z0-9]{10,28}");
    }

    public boolean getValida() {
        return true;
    }

    public boolean ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            movimientos.add("Ingreso: " + cantidad);
            return true;
        }
        return false;
    }

    public boolean retirar(double cantidad) {
        if (cantidad > 0 && (saldo - cantidad) >= -50) {
            saldo -= cantidad;
            movimientos.add("Retiro: " + cantidad);
            return true;
        }
        return false;
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


