package Escritura_fitxers.exercicis_compartits_writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fichero = "annotations.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fichero, true))) {
            String frase;

            System.out.println("Introdueix anotacions. Per a finalitzar, deixa la línia en blanc i prem Enter.");

            while (true) {
                frase = scanner.nextLine();

                if (frase.isEmpty()) {
                    break;
                }

                writer.write(frase);
                writer.newLine(); // Afegeix un salt de línia
            }

            System.out.println("Les anotacions han estat afegides a 'annotations.txt'");
        } catch (IOException e) {
            System.out.println("S'ha produït un error en escriure al fitxer: " + e.getMessage());
        }
    }
}
