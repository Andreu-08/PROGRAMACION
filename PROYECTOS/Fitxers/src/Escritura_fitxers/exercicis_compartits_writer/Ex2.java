package Escritura_fitxers.exercicis_compartits_writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File f = new File("sentences.txt");

        // Esborra l'arxiu existent si n'hi ha algun
        if (f.exists()) {
            f.delete();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(f))) {
            String frase;

            System.out.println("Introdueix oracions. Per a finalitzar, deixa la línia en blanc i prem Enter.");

            while (true) {
                frase = scanner.nextLine();

                if (frase.isEmpty()) {
                    break;
                }

                writer.write(frase);
                writer.newLine(); // Afegeix un salt de línia
            }

            System.out.println("Les oracions han estat guardades a 'sentences.txt'");
        } catch (IOException e) {
            System.out.println("S'ha produït un error en escriure al fitxer: " + e.getMessage());
        }
    }
}
