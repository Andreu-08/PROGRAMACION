package Fitxers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex1 {
    public static void main(String[] args) {
        String nombreArchivo = "Documentos/frases.txt"; // Nombre del archivo a leer

        try {
            File archivo = new File(nombreArchivo); //creamos el objeto archivo
            FileReader reader = new FileReader(archivo); //creamos el objeto reader para leer caracter a caracter del archivo
            BufferedReader buffer = new BufferedReader(reader); //creamos el objeto buffer para leer linea a linea el archivo

            String primeraLinea = buffer.readLine(); // Leer la primera línea del archivo
            if (primeraLinea != null) {
                System.out.println("La primera línea del archivo es: " + primeraLinea);
            } else {
                System.out.println("El archivo está vacío.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
