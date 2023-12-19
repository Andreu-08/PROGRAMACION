package arrays;

import java.util.Scanner;
public class ExemArray4 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int midaMax, midaMin=0;
        boolean v1Llarg = false;

        System.out.println("Introdueix la mida del 1r vector");
        int[] array1 = new int[teclat.nextInt()];
        //Emplenem array 1 amb valors aleatoris
        for (int i=0; i < array1.length; i++)
        {
            //Per simplificar valors entre 0 i 20
            array1[i]=(int) (Math.random()*(20+1));
        }

        System.out.println("Introdueix la mida del 2n vector");
        int[] array2 = new int[teclat.nextInt()];
        //Emplenem array 2 amb valors aleatoris
        for (int i=0; i < array2.length; i++)
        {
            //Per simplificar valors entre 0 i 20
            array2[i]=(int) (Math.random()*(20+1));
        }

        //creem un terecer array amb la longitud del array mes llarg
        int[] arrayMax = new int[Math.max(array1.length, array2.length)];

        //comprovem quin dels dos arrrays es el mes curt
        int[] arrayMin = array1.length < array2.length ? array1 : array2;

        //se plena el tercer array amb els valors mes grans dels index dels dos primers arrays
        for (int index=0; index < arrayMin.length; index++)
            arrayMax[index] = Math.max(array1[index], array2[index]);

        //si els dos primers arrays tenen longituds diferens, compia els elements restants del array mes llarg
        if (array1.length != array2.length) {
            int[] arrayLong = array1.length > array2.length ? array1 : array2;
            System.arraycopy(arrayLong, arrayMin.length, arrayMax, arrayMin.length, arrayLong.length - arrayMin.length);
        }
        //imprimim els tres arrays
        System.out.println("Array 1:"); // System.out.println(Arrays.toString(array1));
        for (int i=0; i < array1.length; i++)
        {
            System.out.print("["+array1[i]+"]");
        }
        System.out.println("\nArray 2:"); //System.out.println(Arrays.toString(array2));
        for (int i=0; i < array2.length; i++)
        {
            System.out.print("["+array2[i]+"]");
        }
        System.out.println("\nArray 3:"); //System.out.println(Arrays.toString(array3));
        for (int i=0; i < arrayMax.length; i++)
        {
            System.out.print("["+arrayMax[i]+"]");
        }

    }
}