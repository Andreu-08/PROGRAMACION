package Exercicis_Exepcions_8a10.Ej_8_9;

import java.util.ArrayList;
import java.util.Scanner;

public class AppGat9 {

   static Scanner sc = new Scanner(System.in);
   static ArrayList<Gat> llistaGats = new ArrayList<>();
   static int contador = 0;

    public static void main(String[] args) {
        introduirGat();
        System.out.println(contador + " gats han segut inclosos correctament" +"\nLlista de gats:");
        //mosra els gats que han segut inclosos exitosament
        for (Gat gat : llistaGats) {
            gat.imprimir();
        }
    }
    //funcio per a introduir gats al array list verificant amb exepcions
    public static void introduirGat(){
        String nom;
        int edad;

        for(int i =0; i<5; i++){
            try{
                System.out.println("Indica el nom del gat: ");
                nom = sc.nextLine();
                System.out.println("Indica la edad del gat: ");
                edad = sc.nextInt();
                sc.nextLine();
                llistaGats.add(new Gat(nom, edad));
                System.out.println("Gat inclós exitosament");
                i++;//sols pasara al seguent gat si se verifica correctament
                contador++;
            }catch(ArithmeticException e){
                System.out.println("Error: Dada Invalida");
            }catch (Exception e){
                System.err.println("Error: " + e.getMessage());
                sc.nextLine(); //limpia la ixida del Scanner
            }
        }
    }
}
