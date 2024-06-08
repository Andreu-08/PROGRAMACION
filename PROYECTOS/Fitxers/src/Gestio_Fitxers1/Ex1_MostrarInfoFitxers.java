package Gestio_Fitxers1;

import java.io.*;
import java.util.*;
public class Ex1_MostrarInfoFitxers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ruta; //variable per a la ruta que pasara el ususari

        System.out.println("Introdueix una ruta (Enter per a ixir)");

        //bucle per a manejar les exepcions y comprobar la ruta
        while (true){
            System.out.println("Ruta: ");
            ruta = sc.nextLine();
            if (ruta.equals("")){//comproba si la ruta esta buida per a ixir
                break;
            }
            try{
                //creem l'objecte per File amba la ruta del usuari
                File f = new File(ruta);
                //metode per a mostrar la informacio
                mostraInfoRuta(f);
            }catch(Exception e){
                System.err.println("Error: " + e.getMessage());
            }
        }

    }

    //metode per a mostrar info de una ruta, objecte file com argument
    //pot llançar un excepcio FileNotFoundException si no troba la ruta
    public static void mostraInfoRuta(File ruta) throws FileNotFoundException {
        if(!ruta.exists()){ //comproba si existix la ruta .exist
            throw new FileNotFoundException("La ruta no exiteix: " + ruta.getPath()); //mensaje per a la excepcio amb la ruta
        }
        if(ruta.isDirectory()){//comproba si file es un directori
            //crea el array amb la llista dels posibles fitxers dins del directori (diferencia entre directoris y archius)
            File[] fitxers = ruta.listFiles();

            //si el directori esta buit mostra un misatge
            //si el array no esta buit el recorrerm amb un foreach per a mostrar el que conté
            if(fitxers == null || fitxers.length == 0) {
                System.out.println("El directori: (" + ruta.getPath() + ") esta buit");
            }else{for(File f : fitxers){
                    //si es directori[D] si es archiu[A]
                    if(f.isDirectory()){
                        System.out.println("[D]: " + f.getName());
                    }else{
                        System.out.println("[A]:" + f.getName() );
                    }
                }
            }
        }else{//si la ruta no es un archiu imprim el nom
            System.out.println("[A]: " + ruta.getName() );
        }
    }
}


