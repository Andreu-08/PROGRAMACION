package Lectura_fitxers;

import java.io.FileReader;
import java.io.IOException;

public class EjemploReader {

    public static void main(String[] args) {
        String fichero = "Documentos/frases.txt";
        int contVocales=0;
        try
        {
            //Creamos un objeto FileReader
            FileReader fileReader = new FileReader(fichero);

            //leer y mostrar el contendio del archivo
            int caracter;
            while((caracter = fileReader.read()) != -1)
            {
                char letra = (char) caracter;
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
                    contVocales++;
                System.out.print(letra);

            }
            System.out.println("El texto tiene "+contVocales+ " vocales");
            //cerramos el FileReader
            fileReader.close();
        }
        catch(IOException ioe)
        {
            System.out.println("Error al leer el archivo");
        }


    }
}