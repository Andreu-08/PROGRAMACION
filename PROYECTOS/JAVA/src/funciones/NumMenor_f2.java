package funciones;
import java.util.*;
public class NumMenor_f2 {
    //funcio que retorna el numero menor
    public static int menor(int a, int b){

        if(a<b){
            return a;
        }else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.println("Escriu dos valors per a saber quin es menor  :");
        //utilizem la funcio menor donantli els valor escrits per teclat
        System.out.println("El numero menor es " + menor(teclado.nextInt(), teclado.nextInt()));
    }
}
