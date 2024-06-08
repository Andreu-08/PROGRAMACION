public class banco {
private double saldo;

    public static void main(String[] args) {
        try{
            sacardinero(200, 300);
        }catch (FueraDeRango e){
            System.err.println(e);
        }
    }



public static void sacardinero(double saldo, double retirada) throws FueraDeRango{
    if(retirada > saldo){
        throw new FueraDeRango("Operacion fuera de rango");
    }else System.out.print("Saldo restante: "+ saldo-retirada);
}

}
