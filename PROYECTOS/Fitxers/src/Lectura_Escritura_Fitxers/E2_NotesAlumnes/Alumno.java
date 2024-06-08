package Lectura_Escritura_Fitxers.E2_NotesAlumnes;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<Double> notas; //almacenara tipos de datos double

    //constructor para el alumno
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    //metodo para añadir notas al array list
    public void anadirNota(double nota) {
        this.notas.add(nota);
    }

    //metodo para calcular la media de las notas
    public double obtenerMedia(){
        double suma = 0;
        //for para recorrer el arraylist y sacar las medias de cada nota
        for(Double nota: notas){
            suma += nota;
        }
        return suma/notas.size();//.size para dividir por la cantidad de notas
    }

    //getter para poder mostrar luego el nombre del alumno
    public String getNombre() {
        return nombre;
    }
}
