package Pildoras_Informaticas;

public class Operadores {
    public static void main(String[] args) {

        int a = 5; //declaracion en misma linea
        //declaracion i iniciacion en lineas diferentes
        int b;
        b = 7;

        int c = b + a; /* iniciamos la variable c utilizando el operador +
        c sera igual a variable b + variable a*/

        System.out.println(c); //imprimira el 12 por consola (b+a)

        c++; //oeperador incremento
        System.out.println(c); //imprimira el valor de c incrementado en 1

        //c+=6; // incrementara en 6 el valor de c

        //int c = b/a; daria error al almacenar la division en un entero ya que daria decimales

       // si queremos dividir deberemos iniciar la varibles con el tipo de dato double para decimales
        // en el caso de dar un nomero entero nos lo dara con dos decimles (2.00)


    }
}
