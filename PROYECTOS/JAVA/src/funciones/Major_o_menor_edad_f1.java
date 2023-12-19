package funciones;


import java.util.Scanner;

public class Major_o_menor_edad_f1 {
    //funcio per a saber si un valor es >= 18
    public static boolean esMajorEdad(int a) {

        if (a>=18) {
            return true;
        }else{
            return false;
        }
    }
    
      public static void main(String[] args) {

          Scanner teclado =new Scanner(System.in);

          System.out.println("Indica la edad per a saber si eres major de edad");

          if (esMajorEdad(teclado.nextInt())){ //utilizem la funcio donantli un valor per teclat
              System.out.println("Es major de edad");
          }else {
              System.out.println("No es major de edad");
          }
      }
}
