package Lectura_Escritura_Fitxers;
import java.io.*;
public class E1_MaximMinim {
    public static void main(String[] args) {
        BufferedReader br = null; //definimos el valor antes de utilizar el buffer
        try{
           //creamos un Filereader para leer el archivo numeros.txt
            FileReader MinMax = new FileReader("Documentos/numeros.txt");
            //envolvemos el Filereader en el Buffereader para mejorar la lectura
            br = new BufferedReader(MinMax);
            //variables para guadar los numeros maximos y minimos que se van leyendo dentro del rango de INT
            int max = Integer.MIN_VALUE;//valor minimos de un int
            int min = Integer.MAX_VALUE;//valor maximo de un int

            String line;//almacenara la linea que se esta leyendo

            //bucle para recorrer el archivo y ir leyendo linea a linea
            while( (line = br.readLine()) != null){
                int num = Integer.parseInt(line.trim()); //convertimos la linea en un entero  (tim limpia la linea de espacios)
                if(num > max){//si el numero es mayor que el minimo de int este sera el maximo
                    max = num;
                }
                if(num < min){
                    min = num;
                }
            }
            //imprimimos los valores maximos y minimos
            System.out.println("El valor maximo es:" + max);
            System.out.println("El valor minimo es:" + min);
        //manejo de las IOExceptions por si no se puede leer el archivo correctamente
        }catch(IOException e){
            System.err.println("Error al leer el archivo");
            //finally para cerrar el close o mostrar una excepcion en el caso de que no se pueda cerrar correctamente
        }finally {
            if(br != null){
                try{
                    br.close();
                }catch (IOException e){
                    System.err.println("Error al cerrar el archivo");
                }
            }
        }

    }
}
