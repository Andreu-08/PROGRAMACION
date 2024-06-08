package Lectura_Escritura_Fitxers;
import java.io.*;
import java.util.*;

public class E4_NomCognom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos nombre aleatorios quieres generar?");
        int cantNombres = sc.nextInt();
        //variables archivos lectura
        String nombre = "Documentos/usa_nombres.txt";
        String apellido = "Documentos/usa_apellidos.txt";

        //variable para archivo escritura
        String fileRandom = "Documentos/usa_persona_random.txt";

        //array lista para almacenar datos leidos
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<String> apellidos = new ArrayList<>();

        //array list para combinar los datos leidos
        ArrayList<String> nombresRandoms = new ArrayList<>();
        //leemos los nombres del archivo
        try(BufferedReader br = new BufferedReader(new FileReader(nombre))){
            String linea;
            while ((linea = br.readLine()) != null){
                nombres.add(linea);
            }

        }catch(IOException e){
            System.out.println("Error al leer el archivo: " + e.getMessage());
            sc.close();
        }

        //leemos los apellidos del archivo de apellidos
        try(BufferedReader br = new BufferedReader(new FileReader(apellido))){
            String linea;
            while ((linea = br.readLine()) != null){
                apellidos.add(linea);
            }

        }catch(IOException e){
            System.out.println("Error al leer el archivo: " + e.getMessage());
            sc.close();
        }

        //generamos los nombres aleatorios combinando nombres y apellidos
        Random rand = new Random();
        for (int i = 0; i < cantNombres; i++){
            String nom = nombres.get(rand.nextInt(nombres.size()));
            String ap = apellidos.get(rand.nextInt(apellidos.size()));
            nombresRandoms.add(nom + " " + ap);
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileRandom))){
             for (String nombreRandom : nombresRandoms){
                 //escribimos un nombre random de los que hemos almacenado
                 bw.write(nombreRandom);
                 bw.newLine();
             }
        }catch (IOException e){
            System.out.println("Error al generar el archivo: " + e.getMessage());
        }

        sc.close();
    }
}
