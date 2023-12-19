package Pildoras_Informaticas;

public class constantes {
    public static void main(String[] args) {
        //declaracionde una constante
        //en este caso 2,54 cm = 1 pulgada
        //final + tipo de dato + nombre = valor
        final double apulgadas = 2.54;

        double cm = 6; // variable con la cantidad de cm que queremos pasar a pulgadas

        double  resultado  = cm /apulgadas; /*variable para almacenar el resultado de
                                                la operacion entre la variable cm y la
                                                constante apulgadas*/


        //imprimimos el resultado de la operacion utilizando el operador de concatenacion
        System.out.println("En " + cm +" cm hay " + resultado + " pulgadas");

        //podremos seguir utilizando apulgadas en el programa siemppre que necesitemos ese valor

        int operador1, operador2, resultado2;
        //declaracion de variables en la misma linea a falta de asignarles valor, las podremos iniciar cuando hagan falta

        operador1=8;
        operador2=7;

        resultado2 = operador1+operador2;
        // ejemploi de iniciacion y utilizacion de estas variables

        System.out.println(resultado2);//imprime la suma de las dos variables que es lo que guarda resultado2
    }
}
