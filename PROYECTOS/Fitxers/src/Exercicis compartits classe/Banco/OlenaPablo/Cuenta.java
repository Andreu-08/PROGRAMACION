package bancario;

public class Cuenta {
    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    // Método para extraer dinero
    public void extreure(double cantidad) throws ExcepcioSaldoInsuficient {
        if (cantidad > saldo) {
            throw new ExcepcioSaldoInsuficient("Saldo insuficiente. No se puede extraer más dinero del que hay en la cuenta.");
        } else {
            saldo -= cantidad;
            System.out.println("Se han extraído " + cantidad + "€ de la cuenta");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo =saldo;
    }
}