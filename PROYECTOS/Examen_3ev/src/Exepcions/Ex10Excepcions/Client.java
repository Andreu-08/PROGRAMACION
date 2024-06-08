package Exepcions.Ex10Excepcions;

import Exepcions.Ex10Excepcions.Exceptions.DepositNegatiu;
import Exepcions.Ex10Excepcions.Exceptions.FonsInsuficients;

public class Client {

    //atributs
    private String nom;
    private double saldo;

    public Client(String nom, double saldo) {
        this.nom = nom;
        this.saldo = saldo;
    }
    //metode per a depositar diners
    public void depositar(double deposit) throws DepositNegatiu {

        //creem la excepcio per si el el deposit es un num negatius
        if(deposit < 0) {
        throw new DepositNegatiu("Error: El deposit no pot ser negatiu");
        }

        this.saldo += deposit; //se suma el deposit al saldo inicial
    }

    public void extraure(double quantitat) throws FonsInsuficients {
        if(quantitat<= saldo){
            this.saldo -= quantitat;
        }else {
            throw new FonsInsuficients("Error: Fons insuficients");
        }
    }

    //metode per a imprimir la info del client
    public void imprimir(){
        System.out.println("DADES DEL CLIENT" +
                          "\n---------------" +
                          "\nNom: " + this.nom +
                          "\nSaldo: " + this.saldo);
    }

}
