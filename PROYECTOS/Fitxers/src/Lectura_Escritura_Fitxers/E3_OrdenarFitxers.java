package Lectura_Escritura_Fitxers;
import java.io.*;
import java.util.*;


public class E3_OrdenarFitxers {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la ruta del archivo (A):");
        String a = sc.nextLine();
        System.out.println("Introduce el nombre del archivo (B):");
        String b = sc.nextLine();

        //array list para guardar cada linea del archivo
        List<String> lineas = new ArrayList();

        //leemos el archivo line a linea
        try(BufferedReader br = new BufferedReader(new FileReader(a))){

            String linea;//guardamos cada line del archivo para meterla en el arraylist
            //bucle para intorducir las lineas en el arraylist
            while((linea = br.readLine()) != null){
                lineas.add(linea);
            }

        }catch(IOException e){
            System.out.println("Error al leer el archivo" + e.getMessage());
        }
        Collections.sort(lineas); //ordenamos el arraylist alfabeticamente

        //escribimos en el archivo nuevo
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(b))){
            //for para recorrer el array y ir escribiendo por lineas
            for (String linea : lineas){
                bw.write(linea);
                bw.newLine();//salto de linea
            }

        }catch(IOException e) {
            System.err.println("Error al escribir en el archivo " + e.getMessage());
        }

        File archivo = new File(b);
        if(archivo.exists()){
            System.out.println("El archivo ha sido creado y ordenado correctamente");
        }else{
            System.out.println("Error al crear el archivo");
        }
        sc.close();

    }
}
