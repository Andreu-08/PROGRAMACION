package CasPractic_Fitxers;
import java.util.Scanner;

public class Miniterminal {
    public static void main(String[] args) {
        MiniFileManager fileManager = new MiniFileManager(); // Crea una instancia de MiniFileManager para gestionar las operaciones de archivos y directorios.
        Scanner scanner = new Scanner(System.in); // Prepara el objeto Scanner para leer la entrada de la línea de comandos.
        String command; // Variable para almacenar el comando ingresado por el usuario.
        boolean running = true; // Controla el bucle principal del programa.

        System.out.println("Miniterminal activado"
                            +"\n----------------------"
                            + "\npwd: imprime el directorio actual"
                            + "\ncd: cambiar de directorio"
                            + "\nls: lsita los archivos sin detalles"
                            + "\nll: muestra los archivos con detalles"
                            + "\nmkdir: crea un directorio"
                            + "\nrm: eliminar un directorio"
                            + "\nmv: mueve o renombra un directorio"
                            + "\nexit para salir"
        );

        while (running) {
            System.out.print("cmd> "); // Muestra el prompt cmd> para indicar al usuario que puede ingresar comandos.
            command = scanner.next(); // Lee el primer token de la entrada, que corresponde al comando.

            switch (command.toLowerCase()) { // Evalúa el comando ignorando las mayúsculas.
                case "pwd":
                    System.out.println(fileManager.getPWD()); // Imprime el directorio actual.
                    scanner.nextLine(); // Limpia el resto de la línea para evitar errores de lectura.
                    break;
                case "cd":
                    if (scanner.hasNext()) {
                        String dir = scanner.next();
                        fileManager.changePWD(dir);
                    } else {
                        System.out.println("Uso: cd <directorio>");
                    }
                    scanner.nextLine(); // Limpia el resto de la línea.
                    break;
                case "ls":
                    fileManager.printList(false); // Lista los archivos del directorio actual sin detalles.
                    scanner.nextLine(); // Limpia el resto de la línea.
                    break;
                case "ll":
                    fileManager.printList(true); // Lista los archivos con detalles.
                    scanner.nextLine(); // Limpia el resto de la línea.
                    break;
                case "mkdir":
                    if (scanner.hasNext()) {
                        String dir = scanner.next(); // Lee el siguiente token que debe ser el nombre del directorio.
                        fileManager.mkdir(dir);
                    } else {
                        System.out.println("Uso: mkdir <directorio>");
                    }
                    scanner.nextLine(); // Limpia el resto de la línea.
                    break;
                case "rm":
                    if (scanner.hasNext()) {
                        String file = scanner.next(); // Lee el siguiente token que debe ser el archivo o directorio a eliminar.
                        fileManager.rm(file);
                    } else {
                        System.out.println("Uso: rm <archivo/directorio>");
                    }
                    scanner.nextLine(); // Limpia el resto de la línea.
                    break;
                case "mv":
                    if (scanner.hasNext()) {
                        String file1 = scanner.next(); // Lee el primer archivo para mover.
                        if (scanner.hasNext()) {
                            String file2 = scanner.next(); // Lee el segundo archivo, el destino.
                            fileManager.mv(file1, file2);
                        } else {
                            System.out.println("Uso: mv <origen> <destino>");
                        }
                    } else {
                        System.out.println("Uso: mv <origen> <destino>");
                    }
                    scanner.nextLine(); // Limpia el resto de la línea.
                    break;
                case "exit":
                    running = false; // Termina el programa.
                    break;
                default:
                    System.out.println("Comando no reconocido.");
                    scanner.nextLine(); // Limpia el resto de la línea si el comando no es reconocido.
            }
        }
        scanner.close();
        System.out.println("Programa finalizado."); // Mensaje de finalización.
    }
}
