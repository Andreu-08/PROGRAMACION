package arrays;
import java.util.Arrays;
import java.util.Random;
public class Exercici4arrays {
    public static void main(String[] args) {
        //creem dos arrays de tamany 20
        int[] array1 = new int[20];
        int[] array2 = new int[20];

        //plenem el primer array amb numeros aleatoris entre 0 y 20

        Random random = new Random();
        for (int i = 0; i < 20; i++){
            array1[i] = random.nextInt(21); //asi generem els numeros aleatoris entre 0-20
        }

        //creem una copia inversa del primer array en el segon array
        for (int i = 0; i< 20; i++){
            array2[i] = array1 [19 - i];
        }
        //asi creem el tercer array y el plenem amb el primer array y el segon array
        int [] array3 = new int [40];
        System.arraycopy(array1,0,array3,0,20);
        System.arraycopy(array2, 0, array3,20, 20);

        //creem el 4t arrays plenantlo alternativament amb elements del 1r y el 2n

        int[] array4 = new int[40];
        for (int i = 0; i < 20; i++) {
            array4[2 * i] = array1[i];
            array4[2 * i + 1] = array2[i];
        }



        // imprimim tots el arrays per pantalla
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Array 3: " + Arrays.toString(array3));
        System.out.println("Array 4: " + Arrays.toString(array4));
    }
}
