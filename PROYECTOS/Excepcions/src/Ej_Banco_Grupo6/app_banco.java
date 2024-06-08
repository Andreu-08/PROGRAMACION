package grupal;

import java.util.Scanner;

public class app_banco {
    public static void main(String[] args)  {
        Scanner entrada = new Scanner(System.in);

        cuenta cuenta_javi = new cuenta();
        try {
            cuenta_javi.setSaldo(1000);
        } catch ( Exception E){
            System.out.println("EL error "+ E);
        }
        try {
            cuenta_javi.sacarDinero(900);
          
        } catch ( Exception E){
            System.out.println("EL error "+ E);
        }
        try {
            cuenta_javi.sacarDinero(900);
        } catch ( Exception E){
            System.out.println("EL error "+ E);
        }



    }
}
