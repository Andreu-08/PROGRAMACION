package Fitxers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Pedir al usuario que introduzca el nombre del archivo
            System.out.println("Introduce el nombre del archivo (ruta):");
            String nombreArchivo = scanner.nextLine();

            // Pedir al usuario que introduzca la palabra a buscar
            System.out.println("Introduce la palabra a buscar:");
            String palabraABuscar = scanner.nextLine();

            // Procesar el archivo para buscar la palabra
            buscarPalabraEnArchivo(nombreArchivo, palabraABuscar);

            scanner.close();
        }

        public static void buscarPalabraEnArchivo(String nombreArchivo, String palabraABuscar) {
            try {
                String linea;
                int numeroLinea = 1;

                FileReader fr = new FileReader(nombreArchivo);
                BufferedReader br = new BufferedReader(fr);

                while ((linea = br.readLine()) != null) {
                    if (linea.contains(palabraABuscar)) {
                        System.out.println("Línea " + numeroLinea + ": " + linea);
                    }
                    numeroLinea++;
                }
                br.close();
            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            }
        }
    }