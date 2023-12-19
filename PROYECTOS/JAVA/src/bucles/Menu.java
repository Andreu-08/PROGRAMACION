package bucles;
import java.util.*;
public class Menu {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        int opcion = 0;
        while (opcion!=5) {
            System.out.println("*****************************");
            System.out.println("*******MENU d'OPCIONS********");
            System.out.println("*****************************");
            System.out.println("1.Permuta dos valors");
            System.out.println("2.Sumatori");
            System.out.println("3.Maxim i Minim");
            System.out.println("4.Numeros primers");
            System.out.println("5.Eixir");
            System.out.println("*****************************");

            System.out.println("Selecciona una opcio:");
            opcion = teclado.nextInt();
            int[] valores = new int[2];
            int num;
            switch (opcion) {
                case 1:
                    int aux = 0;
                    System.out.println("Introduce un valor:");

                    valores[0]= teclado.nextInt();

                    System.out.println("Introduce otro valor:");
                    valores[1]= teclado.nextInt();
                    System.out.println("Array en orden\n");
                    for(int i = 0; i<2; i++){
                        System.out.println(valores[i]);
                    }
                    aux = valores[0];
                    valores[0] = valores[1];
                    valores[1]= aux;

                    System.out.println("Array permutado\n");
                    for(int i = 0; i<2; i++){
                        System.out.println(valores[i]);
                    }
                    break;
                case 2:
                    int sumatorio = 0;
                    System.out.println("Introduce un numero para saber el sumatorio");
                    num = teclado.nextInt();
                    for(int i =1; i<=num; i++ ){
                        sumatorio += i;
                    }
                    System.out.println("El sumatorio de "+ num +" es igual a "+sumatorio);
                    break;

                case 3:
                    System.out.println("Introduce un valor:");

                    valores[0]= teclado.nextInt();

                    System.out.println("Introduce otro valor:");
                    valores[1]= teclado.nextInt();

                    if(valores[0]<valores[1]){
                        System.out.println("El valor max es: " +valores[1]);
                        System.out.println("El valor min es: "+valores[0]);
                    }else{
                        System.out.println("El valor max es: " +valores[0]);
                        System.out.println("El valor min es: "+valores[1]);
                    }
                    break;

                case 4:
                    System.out.println("Introduce un numero: ");
                    num = teclado.nextInt();

                    for(int i = 1; i<num; i ++){
                        System.out.print(i + ", ");
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("chauuuuu");
                    break;

                default:

                    System.out.println("??????");
                    break;
            }

        }





    }
}
