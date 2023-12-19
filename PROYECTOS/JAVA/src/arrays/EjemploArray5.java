package arrays;
import java.util.*;
public class EjemploArray5 {
    public static void main(String[] args) {
        String[] vector = {"lunes","Martes","Miercoles","Jueves","Viernes"};

        //Ordenar el vector ascendente
        Arrays.sort(vector);
        System.out.println(Arrays.toString(vector));

        //Oredeanr vector descendente
        for(int index=vector.length-1; index>=0; index--){
            System.out.print(" " + vector [index]+ " ");
        }
        System.out.println("");
        System.out.println(Arrays.toString(vector));

        Arrays.sort(vector,Collections.reverseOrder());
        System.out.println(Arrays.toString(vector));
    }
}
