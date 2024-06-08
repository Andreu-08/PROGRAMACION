package Lectura_Escritura_Fitxers.E2_NotesAlumnes;
import java.util.*;
import java.io.*;

public class E2_NotesAlumnes {

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();

        try (BufferedReader rd = new BufferedReader(new FileReader("Documentos/alumnos_notas.txt"))) {
            String line;  // Almacena cada línea del archivo

            // Bucle para leer el archivo línea a línea
            while ((line = rd.readLine()) != null) {
                // Dividimos la línea utilizando  y creamos el array de strings
                String[] partes = line.split(" ");  // Usar espacio como delimitador
                String nombreCompleto = partes[0] + " " + partes[1];  // Asumir que las dos primeras partes son nombre y apellido
                Alumno alumno = new Alumno(nombreCompleto);  // Creamos el alumno con el nombre completo extraído del fichero

                // Recorremos las partes del array desde el índice 2 para sacar las notas y las guardamos en un double
                for (int i = 2; i < partes.length; i++) {
                    double nota = Double.parseDouble(partes[i]);
                    // Añadimos la nota con el método de la clase alumno
                    alumno.anadirNota(nota);
                }
                alumnos.add(alumno);
            }
            // Ordenamos con Collections.sort el ArrayList de alumnos
            Collections.sort(alumnos, new Comparator<Alumno>() {
                public int compare(Alumno a1, Alumno a2) {
                    return Double.compare(a2.obtenerMedia(), a1.obtenerMedia());
                }
            });
            // Mostramos la información
            for (Alumno alumno : alumnos) {
                System.out.println(alumno.getNombre() + " - Media: " + alumno.obtenerMedia());
            }

        } catch (IOException e) {
            System.err.println("Error de lectura: " + e.getMessage());
        }
    }
}



