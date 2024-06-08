package Lectura_fitxers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjemploBufferReader {
    public static void main(String[] args) {
        String fichero = "Documentos/frases.txt";
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try
        {
            //Creamos un objeto FileReader
            fileReader = new FileReader(fichero);
            //Creamos un objeto BufferedReader
            bufferedReader = new BufferedReader(fileReader);

            //leer y mostrar el contendio del archivo
            //int caracter;
            String linea;
            while((linea = bufferedReader.readLine()) != null)
            {
                System.out.println(linea);
            }

            fileReader.close();
            bufferedReader.close();
        }
        catch(IOException ioe)
        {
            System.out.println("Error al leer el archivo");
        }

    }
}