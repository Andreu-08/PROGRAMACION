
import java.io.*;
import java.util.ArrayList;

public class Reader_Writer_repaso {
    public static void main(String[] args) {


        ArrayList<String> lista = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader("Restaurants.csv"))) {
            String linea;
            while((linea = br.readLine()) != null){
                //split para dividir cada linea por las comas
                String[] lineaDividida = linea.split(",");
                    //aqui recorremos el array y contamos su tamaño maximo menos 1 que sera la ultimacolumna
                    if(lineaDividida[lineaDividida.length -1].startsWith("6")){
                        lista.add(linea);
                    }
            }
        }catch(IOException e){
            System.out.println("Error " + e.getMessage());
        }


        try(BufferedWriter br = new BufferedWriter(new FileWriter("Restaurants2.csv"))){
            for (String linea : lista) {
                br.write(linea);
                br.newLine();
            }
        }catch(IOException e){
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
