package Pildoras_Informaticas;

public class Calculos_conMath {
    public static void main(String[] args) {


        /*declaracion de variable para calcular raiz cuadrada
         double al ser el resultado con decimales
        Math(clase que queremos utilizar).sqrt(metodo de esa clase que vamos a utilizar
        en este caso el metodo que calcula raizes cuadradas (sqrt)
        (10) valor del que queremos que se haga la operacion*/
        double raiz = Math.sqrt(10);

        System.out.println(raiz);/*imprime el valor de la variable raiz que es el resultado
                                    de la raiz cuadrada en este caso de 10*/

        /*esto se puede utilizar con todos los metodos dentro de la clase Math utilizando
        Math. y el metodo que necesitemos* */

        //EJEMPLO METODO .round

        float num1 = 5.85F; // tenemos que utilizar el tipo de dato float ya que es el que admite el metodo round
        //F(float necesita la F al final del valor)

        int resultado = (int) Math.round(num1); //pasamos entreparentesis la variable(float) que queremos redondear
        //utilizamos casting (en este caso (int)) para convertir el Long que nos devuelve el metodo en un Int

        System.out.println(resultado);// imprimimos el resultado que sera el num1 redondeado con round

        //EJEMPLO METODO .pow

        //declaramos las variables para 5 elevado a 3 como doubles que es lo que admite el metodo
        double base=5;
        double exponente = 3;

        int resultado2 = (int)Math.pow(base, exponente);
        //declaramos como int que es lo que queremos y aplicamos casting ya que el metodo devuelve un double
        //en el parentesis primero le pasamos la variable que queremos elevar, el exponenete por el que se elevara

        System.out.println("El resultado de "+  (int)base + " elevado a " + (int)exponente + " es igual a: " +resultado2);
        //imprimimos el resultado de 5 elevado a 3 que sera un int sin decimales
        //utilizamos los operadores de concatenacion para mostrarlo junto con la frase que qeremos
        //utilizamos casting para que no nos muestre los decimales de la base y el exponente y los pase a enteros (Int)

    }
}
