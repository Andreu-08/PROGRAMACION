import java.util.Scanner;

public class BANCO {
    private double saldo;
    static Scanner tec=new Scanner(System.in);
    double sacardinero =tec.nextInt();
    public BANCO(double saldo){
        this.saldo=saldo;
    }
    private static double Sacardineross(Double saldo, Double sacardinero) {
        saldo-=saldo-sacardinero;
        double saldorestante;
        saldorestante=saldo;
        return saldorestante;
    }
    public static void mostrarsaldo(double saldorestante){
        System.out.println(saldorestante);
    }
    public static void main(String[]args) {
        try {
            Sacardineross(800.0,9.6);
            mostrarsaldo(9.6);
        }
        catch (Exception e){
            System.out.println("No puedes sacar mas dinero del que tienes");
            mostrarsaldo(800.0);
        }






    }




}
