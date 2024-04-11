package Exercici_VideoGame;

import java.util.ArrayList;

public class VideoGameList {
 private ArrayList<VideoGame> listaVideoJuegos;

 public VideoGameList() {
     listaVideoJuegos = new ArrayList<>(5);
 }

 //metodo para agregar un videojuego

    public void agregar(String titulo, String genero, double precio ){
     if(listaVideoJuegos.size() <5){ //utilizamos .size para verificar si la lista esta llena

         VideoGame videojuego = new VideoGame(titulo, genero,precio);

         listaVideoJuegos.add(videojuego);
         System.out.println("Video juego agregado correctamente");
     }else{
         System.err.println("No se puede agregar, la lista esta llena ");
     }
    }

    //metodo para eliminar un videojuego

    public void eliminar(int posicion){ //pasaremos la posicion del videojuego que queremos eliminar

        if(posicion >= 0 && posicion < listaVideoJuegos.size()) {

            listaVideoJuegos.remove(posicion); //esto eliminara lo que contenga la posicion indicada
            System.out.println("Videojuego eliminado correctamente ");
        }else{
            System.out.println("Posicion invalida");
        }
    }

 }


