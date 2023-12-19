package Pildoras_Informaticas;

public class Manipula_Cadenas {

    public static void main(String[] args) {

        /*Declaracion de variable objeto de tipo string
        siempre entre comillas dobles*/

        String nombre = "Andreu";

        //impresion por pantalla de la variable tipo string
        System.out.println("Mi nombre es: " + nombre);

        //ejemplo de como se aplica el metodo length para contar la cantidad de caracteres de la cadena que queremos
        System.out.println("Mi nombre tiene: " + nombre.length() +" letras");

        //ejemplo del metodo charAt para que nos devuelva la primera letra en este caso del nombre
        System.out.println("La primera letra de: " +nombre + " es la " + nombre.charAt(0));
            //cambiamos el numero entre parentesis del charAt pra elegir la posicion de la cadena que qeremos que devuelva

        //como saber la ultima posicion de cualquier cadena de caracteres
        int ultima_letra; //declaracion de la variable que tendra el valor total de caracteres que hay en la cadena

        ultima_letra = nombre.length();//aqui la iniciamos con la cantidad de caracteres que incluye la cadena

        /*imprimimos con el metodo charAt poniendo entre parentesis la posicion de la ultima letra
        en este caso el valor de ultima_letra que es 6 menos 1 que indicara que nos muestre el caracter en la posicion nº5
        como empieza a contar desde 0 el ultima caracter siempre sera esa posicion en culaquier cadena*/
        System.out.println("La ultima letra es la " + nombre.charAt(ultima_letra-1));

    }
}
