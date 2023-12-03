package Pildoras_Informaticas;

public class Uso_Arrays {
    public static void main(String[] args) {

        //DECLARACION Y RELLENADO DE LA MATRIZ EN DIFERENTES LINEAS

        /*
        declaracion de una matriz que sera de tipo entero llamada mi_matriz
        que tendra 5 indices que tendran que ser enteros en su interior
        indicado con el segundo int, falta iniciar con un valor cada uno de estos
         */
        int [] mi_matriz = new int[5];
        /*
        aqui se rellena cada uno de los indices con un valor entero ya que
        hemos indicado (int) empezando desde el indice 0 indicadado entre los corchetes
        ya que los indices empiezan a contar en 0, asi sucesivamente indicando cada
        indice y el valor que le queremos dar
         */
        mi_matriz[0]= 5;
        mi_matriz[1]= 38;
        mi_matriz[2]= -15;
        mi_matriz[3]= 92;
        mi_matriz[4]= 71;
        /*
        para imprimir por pantalla los valores de la matriz deberemos indicar el nombre
        de esta y entre los corchetes el indice en que se encuentra el valor que queremos
        imprimir, en este caso en cada linea se a impreso el valor de cada indice
        recordar siempre que la primera posicion sera el 0
         */
        System.out.println(mi_matriz[0]);
        System.out.println(mi_matriz[1]);
        System.out.println(mi_matriz[2]);
        System.out.println(mi_matriz[3]);
        System.out.println(mi_matriz[4]);
        /*
        aqui vamos a imprimir tdos los valores de todos los indices
        de la matriz utilizando un bucle for, este bucle empezara con
        la variable i en el valor 0 i recorrera los valores hasta justo antes
        de 5 que es la cantidad de indices que tenemos en la matriz(de 0 a 4)
        recordar que la primera posicion de la matriz siempre sera 0
         */
        System.out.println("\n Print de la matriz utilizando el for");
        for (int i =0; i<5; i++){
            /*
            este print lo que ara es imprimir el valor de i dentro de la
            matriz en cada vuelta del bucle sera un indice mas ya que
            se incrementa la i (i++), lo vamos a concatenar con el valor de i
            en cada vuelta para asi verlo mas claro i añadiendo los corchetes
            que tambien tendran que ir concatenados añadiendolos como caracteres
            de texto entre comillas
             */
            System.out.println("El valor dentro de la posicion " +i+ " es igual a "+"[" + mi_matriz[i] + "]");
        }

        //DECLARACION DE UNA MATRIZ EN LA MISMA LINEA

        /*
        aqui vamos a declarar una matriz en la misma linea indicando que la vamos a
        tratar como un entero (int) i que sera igual a entre parentesis () y separados
        por comas los valores de cada indice en orden, en este tipo de declaraciones
        no se vera tan claro cual es la ultima posicion si es muy larga, esto nos
        complicara saber el limite del bucle for
         */
        int[] mi_matriz2 = {5, 38, -15, -92, 71};

        /*
        vamos a modificar el bucle for con el metodo lengt de  la clase array
        que nos devolvera la longitud del array (su ultima posicion,
        indicaremos que tiene que repetir el proceso hasta que llegue a
        el nombre de la matriz .length
         */
        System.out.println("\n Print de la matriz utilizando el for y declarada en la misma linea");
        for (int i =0; i<mi_matriz2.length; i++){

            System.out.println("El valor dentro de la posicion " +i+ " es igual a "+"[" + mi_matriz[i] + "]");
        }

    }
}
