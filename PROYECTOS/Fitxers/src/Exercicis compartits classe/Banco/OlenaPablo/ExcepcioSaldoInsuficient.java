package bancario;

public class ExcepcioSaldoInsuficient extends Exception {
    public ExcepcioSaldoInsuficient(String message) {
        super(message);
    }
}