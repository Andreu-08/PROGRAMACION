package Exercicis_Exepcions_8a10.EJ_10;

import Exercicis_Exepcions_8a10.EJ_10.Exceptions.DepositNegatiu;
import Exercicis_Exepcions_8a10.EJ_10.Exceptions.FonsInsuficients;

import java.util.Scanner;

public class provaClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Client client = new Client("Andreu", 1700);
        double cantitat; //cantitat per a depositar y extraure;

        //intent de depositar amb les posibles Exepcions
        while(true){
            try {
                client.imprimir();
                System.out.println("Indica la cuantitat a depositar: ");
                cantitat = sc.nextDouble();
                client.depositar(cantitat);
                System.out.println("Se ha depositat la cuantitat correctament");
                break;
            }catch(DepositNegatiu e){//Excepcio personalitzada
                System.err.println(e.getMessage());
            }
        }
        client.imprimir();
        while(true){
            try{
                System.out.println("Indica la cuantitat a retirar: ");
                cantitat = sc.nextDouble();
                client.extraure(cantitat);
                System.out.println("Se han extret " + cantitat + "€ correctament");
                break;
            }catch(FonsInsuficients e){
                System.err.println(e.getMessage());
            }
        }
        client.imprimir();
    }
}
