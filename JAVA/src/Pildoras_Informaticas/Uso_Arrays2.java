package Pildoras_Informaticas;

public class Uso_Arrays2 {
    public static void main(String[] args) {

        /*
         declaramos una matriz llamada paises de tipo String que
         sera el tipo de dato que devolvera, y le indicamos que tendra
         entre [] 8 indices (empezaran en 0) y que estos indices
         contendran valores de tipo string(caracteres de texto)
         */

        String[] paises= new String[8];

        /*
        aqui rellenamos los indices de la matriz con los caracteres de texto que queremos
         */
        paises[0]= "España"; //recordar que los valores de texto para los arrays van entre ""
        paises[1]= "China";
        paises[2]= "EEUU";
        paises[3]= "Colombia";
        paises[4]= "Ecuador";
        paises[5]= "VILLAGARCIA DEL LLANO";
        paises[6]= "MARY";
        paises[7]= "ANDREU";


        for(int i=0; i<8; i++){
            /*
            aqui imprimimos el numero de la vuelta del bucle + 1 (para que no sea
            0 la primera posicion y lo concatenamos con el valor de la matriz en
            esa vuelta entre corchetes
             */
            System.out.println((i+1) + " " +"["+ paises[i] +"]");
        }
        System.out.println("\nPrint del bucle for each");
        //EXPLICAION DE BUCLE FOR EACH
        /*
        este bucle se encargar de recorrer la matriz por el mismo
        sin necesidad de que le indiquemos la cantidad de indices que
        tiene
         */
        for(String elemento: paises){
            System.out.println(elemento);
        }
    }
}
