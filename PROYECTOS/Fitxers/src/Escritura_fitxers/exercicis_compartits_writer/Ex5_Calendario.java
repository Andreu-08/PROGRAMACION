package Escritura_fitxers.exercicis_compartits_writer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ex5_Calendario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre del mes:");
        String nombreMes = scanner.nextLine();
        System.out.println("Introduce el número de días del mes:");
        int numDias = scanner.nextInt();
        System.out.println("Introduce el número del día de la semana del primer día del mes (1=Lunes, 7=Domingo):");
        int primerDia = scanner.nextInt();

        // Preparar el contenido del calendario
        String calendario = generarCalendario(numDias, primerDia);
        String nombreArchivo = nombreMes + "Calendari.txt";

        // Escribir el calendario en un archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(calendario);
            System.out.println("Calendario creado con éxito en el archivo: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

        scanner.close();
    }

    private static String generarCalendario(int numDias, int primerDia) {
        StringBuilder calendario = new StringBuilder();
        String[] diasSemana = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};
        int diaActual = 1;

        // Encabezado de días de la semana
        for (String dia : diasSemana) {
            calendario.append(String.format("%4s", dia));
        }
        calendario.append("\n");

        // Rellenar los espacios en blanco hasta el primer día del mes
        int diaDeLaSemana = 1;
        for (int i = 1; i < primerDia; i++) {
            calendario.append(String.format("%4s", ""));
            diaDeLaSemana++;
        }

        // Llenar el calendario con los días del mes
        while (diaActual <= numDias) {
            calendario.append(String.format("%4d", diaActual));
            if (diaDeLaSemana % 7 == 0) {
                calendario.append("\n");
            }
            diaActual++;
            diaDeLaSemana++;
        }

        return calendario.toString();
    }
}
