package Exepcions;

import java.util.*;

public class Ex1Excepcions {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int A;       
        
        try
        {
            System.out.print("Introduce un número entero: ");
            A = in.nextInt();
            
            System.out.println("Valor introducido: " + A); 

        }
        catch(InputMismatchException e)
        {
            System.out.println("Valor introducido incorrecto");
            e.printStackTrace();            
        }
        
        System.out.println("Fin del programa");
        
    }    

}
