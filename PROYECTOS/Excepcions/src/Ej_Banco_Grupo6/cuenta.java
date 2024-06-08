package grupal;

import Ejercicio_9.nombreValido;

public class cuenta {

    private double saldo;

    public void setSaldo(double saldo) throws comprobar_dinero {
        if (saldo > 0) {
            this.saldo = saldo;
            System.out.println(" Tu saldo es "+saldo);

        } else throw new comprobar_dinero("El dinero tiene que ser positivo  ");

    }

    public double getSaldo()  {
        return saldo;
    }
    public void sacarDinero(int sacar)  throws comprobar_dinero{

        if (saldo>sacar){
            saldo = saldo -sacar;
            System.out.println(" Has sacado "+ sacar+" tienes en la cuenta "+saldo);
        } else throw new comprobar_dinero("Saldo Insuficiente   ");

    }
    public void ingresarDinero(int dinero){
        saldo = saldo + dinero;
    }


}
