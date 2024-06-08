package Escritura_fitxers;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Exemple_Escritura {
    public static void main(String[] args) {

        String[] linees = { "Un", "Dos", "Tres", "Quatre", "Cinc", "Sis", "Set", "..." };

        FileWriter fitxer = null;
        try {

            fitxer = new FileWriter("C:\\Users\\Andreu\\OneDrive - Conselleria d'Educació\\DAW\\PROGRAMACION\\PROYECTOS\\Fitxers\\Documentos_carpetaparaejercicios\\ficher_escritua.txt");

            // Escrivim línea a línea en el fitxer

            for (String linea : linees) {

                fitxer.write(linea + "\n");
            }

            fitxer.close();

        } catch (Exception ex) {
            System.out.println("Em missatge de l'exepció és: " + ex.getMessage());
        }
    }
}
