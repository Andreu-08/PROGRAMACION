package Introduccio_Arraylist2;
import java.util.ArrayList;
import java.util.Collections;


public class Mazo {

    //creacion del array list
   private ArrayList <Carta> Baralla= new ArrayList<>();

    public Mazo() {
        //creamos los objetos dentro del add directamente
        Baralla.add(new Carta("copas", "As"));
        Baralla.add(new Carta("copas", "Sota"));
        Baralla.add(new Carta("bastos", "Caballo"));
        Baralla.add(new Carta("bastos", "7"));
        Baralla.add(new Carta("oros", "2"));
        Baralla.add(new Carta("oros", "Rey"));
        Baralla.add(new Carta("espadas", "5"));
        Baralla.add(new Carta("espadas", "3"));
    }

    public void imprimirBaralla(){
        System.out.println("Les cartes en la baralla son:");
        for (Carta carta : Baralla) {
            carta.printC();
        }
    }

    public void bararjar(){

        Collections.shuffle(this.Baralla);
    }

    public static void main(String[] args) {

        Mazo mazo = new Mazo();

        mazo.imprimirBaralla();

        System.out.println(" ");

        mazo.bararjar();

        mazo.imprimirBaralla();
    }


}
