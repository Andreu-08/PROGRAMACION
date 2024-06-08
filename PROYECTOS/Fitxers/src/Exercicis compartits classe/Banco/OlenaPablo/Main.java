package bancario;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(1000.00);

        System.out.println("Cuenta 1, saldo inicial: " + cuenta1.getSaldo());

        /*System.out.println("Exraer 800 euros: ");
        try {
            cuenta1.extreure(800);
            System.out.println("Cuenta 1, saldo actual: " + cuenta1.getSaldo());
        } catch (ExcepcioSaldoInsuficient e) {
            System.err.println("Error: " + e.getMessage());
        }*/

        System.out.println("Exraer 1500 euros: ");
        try {
            cuenta1.extreure(1500);
            System.out.println("Cuenta 1, saldo actual: " + cuenta1.getSaldo());
        } catch (ExcepcioSaldoInsuficient e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}