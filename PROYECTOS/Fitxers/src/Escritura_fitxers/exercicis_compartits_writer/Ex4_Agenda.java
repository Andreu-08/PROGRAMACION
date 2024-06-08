package Escritura_fitxers.exercicis_compartits_writer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ex4_Agenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.println("Introduce el nombre del mes:");
        String nombreMes = scanner.nextLine();
        System.out.println("Introduce el número de días del mes:");
        int numDias = scanner.nextInt();
        System.out.println("Introduce el número del día de la semana del primer día del mes (Lunes 1, Martes 2 etc...):");
        int primerDia = scanner.nextInt();

        // Preparar el nombre del archivo
        String nombreArchivo = nombreMes + ".txt";

        // Crear y escribir en el archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            // Escribir la cabecera del mes
            writer.write(nombreMes);
            writer.newLine();
            writer.write("----------------------------");
            writer.newLine();
            // Calcular el día de la semana inicial
            int diaSemana = primerDia;

            // Escribir cada día del mes
            for (int i = 1; i <= numDias; i++) {
                writer.write(getDayName(diaSemana) + " " + i + ":");
                writer.newLine();
                writer.write("----------------------------");
                writer.newLine();
                diaSemana = diaSemana % 7 + 1; // Avanzar al siguiente día de la semana
            }

            System.out.println("Agenda creada con éxito en el archivo: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    // Método para obtener el nombre del día de la semana
    private static String getDayName(int dayNumber) {
        switch (dayNumber) {
            case 1: return "Lunes";
            case 2: return "Martes";
            case 3: return "Miercoles";
            case 4: return "Jueves";
            case 5: return "Viernes";
            case 6: return "Sabado";
            case 7: return "Domingo";
            default: return "Unknown";
        }
    }

}
