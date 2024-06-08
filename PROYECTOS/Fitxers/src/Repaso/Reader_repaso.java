import java.io.*;
import java.util.*;
public class Reader_repaso {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new FileReader("Restaurants.csv"))) {
            String linea;
            while((linea = br.readLine()) != null){
                //split para dividir cada linea por las comas
                String[] lineaDividida = linea.split(",");
                //aqui recorremos el array y contamos su tamaño maximo menos 1 que sera la ultimacolumna
                if(lineaDividida[lineaDividida.length -1].startsWith("6")){
                    System.out.println(linea);
                }

            }
        }catch(IOException e){
            System.out.println("Error " + e.getMessage());
        }
    }
}
