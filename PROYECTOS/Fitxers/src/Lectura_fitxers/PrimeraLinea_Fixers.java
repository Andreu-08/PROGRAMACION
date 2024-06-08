package Lectura_fitxers;

import java.io.*;

public class PrimeraLinea_Fixers {

    public static int comptarParaules(File ruta)throws IOException{

        int contador = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(ruta))){
            String linea;

            while((linea = br.readLine()) != null){
                String[] palbras = linea.split("\\s+");
                contador += palbras.length;

            }
        }
        return contador;
    }

    public static void main(String[] args) {
       File ruta = new File("C:\\Users\\Andreu\\OneDrive - Conselleria d'Educació\\DAW\\PROGRAMACION\\PROYECTOS\\Fitxers\\Documentos\\Libros\\coplas_manrique.txt") ;

        try(BufferedReader reader = new BufferedReader(new FileReader(ruta))){

            String primeraLinea = reader.readLine();
            System.out.println(primeraLinea);
            int contadorPalabras = comptarParaules(ruta);
            System.out.println("el archivo tiene " +  contadorPalabras + " palabras");
        }catch(IOException e){
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
