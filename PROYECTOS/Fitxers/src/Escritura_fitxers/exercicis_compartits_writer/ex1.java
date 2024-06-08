package exercicis_compartits;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduce una frase: ");
            String frase = scanner.nextLine();

            if (frase.isEmpty()) {
                System.out.println("La primera frase no puede estar vacía.");
                return;
            }

            System.out.print("Introduce una segunda frase: ");
            String frase2 = scanner.nextLine();

            if (frase2.isEmpty()) {
                System.out.println("La segunda frase no puede estar vacía.");
                return;
            }

            try (FileWriter writer = new FileWriter("twoSentences.txt", true)) {
                writer.write(frase + "\n" + frase2);
                System.out.println("¡Frases escritas correctamente en el archivo!");
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e.getMessage());
        }
    }
}