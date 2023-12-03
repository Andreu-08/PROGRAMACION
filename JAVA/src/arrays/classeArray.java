package arrays;
import java.util.*;
public class classeArray {
    public static void main(String[] args) {
        //a) crea un vector de grandaria 10 y omplil amb valors aleatoris de 0 a 30
        int[] array1= new int[10];

        Random ramdom = new Random();
         for(int i = 0; i< 10; i++){
             array1[i]= ramdom.nextInt(31);
         }
        System.out.println("a) " + Arrays.toString(array1));

        //b) calcula la suma y la mitjana de tots els valors del vector
         int suma = 0;

         //fem un bucle per a calcular la suma de tots el elements del vector
        for(int i = 0; i<array1.length; i++){
            suma += array1[i];
        }

        //calculem la mijana de la suma dels elements del array
        //fem que la mitja siga en decimals ya que pot no ser un numero sencer
        double mitja = (double) suma / array1.length;

        //imprimir per pantalla la suma y la mitja del vector
        System.out.println("\nb) Suma: " + suma + " Media: "+ mitja);

        //c) Ordena el vector y mostral per pantalla
        //utilitzem el metode sort per a ordenar el array de menor a major
        Arrays.sort(array1);
        System.out.println("\nc) "+ Arrays.toString(array1));

        //d) mostra per pantalla el numero maxim y minim del array
        // creem una variblae amb el numero mes gran del array que sera el ultim ya que esta ordenat
        // agafem tota la longitud del array y li restem 1 que agafe la ultima posicio
        int max = array1[array1.length -1];

        //creem una variable min que sera la posicio 0(primera) del array ordenat
        int min = array1[0];

        System.out.println("\nd) Maxim: " + max + " Minim: " + min);

        //e) crear un vector de grandaria 10 y omplirlo amb el valor -10
        int[] arraymenos10 = new int[10];

        Arrays.fill(arraymenos10,-10);//Utilitzem el metode fill per a plenar el array en el valor que mosatros volem

        System.out.println("\ne) " + Arrays.toString(arraymenos10));

        //f) crea una copia del vector anterior
        int[] copiamenos10;

        //para clonar utilizamos el meotodo clone
        copiamenos10 = arraymenos10.clone();

        System.out.println("\nf) Aqui hemos copiado el array pero no lo mostramos por pantalla");

        //g) del vector copiat, assigna el valor 3 a les posicions 5 a 9
        //utilizem altra volta el metode fills per a determinar el rang y plenarlo amb el valor que volem (3)
        Arrays.fill(copiamenos10,4,9,3);

        System.out.println("\ng) " + Arrays.toString(copiamenos10));

        //h) crea un vector que multiplique el primer vector amb lúltim
        //creem una variable per al resultat amb la longitud del primer vector ya que sabem que son iguals
        int[] productearrays = new int[array1.length];
        //creem un bucle per a multiplicar element per element el 1r vector y el ultim
        for (int i=0; i<array1.length; i++){
            //se multiplica la posicio i de cada array en cada volta del bucle y se almacena en la variable
            productearrays[i] = array1[i] * copiamenos10[i];
        }
        System.out.println("\nh) " + Arrays.toString(productearrays));

        //i) ordena el verctor multiplicat per a mostrarlo



    }

}
