package Fitxers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreArchivo = "Documentos\\Mis cosas\\Libros\\quijote_cervantes.txt"; // Nombre del archivo a leer

        try{
            String linea;
            int contadorLineas = 0;
            int contadorPaginas = 1;

            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                contadorLineas++;

                // Detenerse después de cada 25 líneas
                if (contadorLineas % 25 == 0) {
                    System.out.println("\n--- Página " + contadorPaginas + " ---");
                    contadorPaginas++;

                    // Esperar hasta que el usuario presione Enter
                    System.out.println("Presiona Enter para continuar...");
                    sc.nextLine(); //System.in.read(); // Lee un solo carácter (Enter) del teclado
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
