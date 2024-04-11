package Ejercici_ArrayList_Producte;

import java.util.*;


public class ProgProducte {

    private static ArrayList<Producte> llista = new ArrayList<>();

    public static void imprimir(){
        //creamos un iterator que recorrera el arraylist "llista"
        Iterator<Producte> it = llista.iterator();
        //la condicion del while comprobara si hay algo en la siguiente posicion del array
        while(it.hasNext()){
            Producte producte = it.next();
            System.out.println(producte);
        }
    }
    public static void main(String[] args) {
        Producte p1 = new Producte("Teclado", 6);
        Producte p2 = new Producte("Raton", 3);
        Producte p3 = new Producte("Tarjeta Grafica", 5);
        Producte p4 = new Producte("Auriculares", 12);
        Producte p5 = new Producte("Pantalla", 250);

        llista.add(p1);
        llista.add(p2);
        llista.add(p3);
        llista.add(p4);
        llista.add(p5);

        imprimir();
        llista.remove(p2);
        llista.remove(p5);

        System.out.println();

        imprimir();
        System.out.println();
        //introduim el objecte p2 en la segona posicion del Arraylist
        llista.add(1,p2);

        for (int i = 0; i < llista.size(); i++){
            System.out.println(llista.get(i));
        }

        llista.clear();
        
    }

}
