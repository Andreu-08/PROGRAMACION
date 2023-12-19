package Pildoras_Informaticas;

public class Manipula_Cadenas2 {
    public static void main(String[] args) {

        //ejemplo con el metodo substring para extraer una parte de la cadena que nosotros queramos

        //declaramos variable de tipo string con una oracion
        String frase = "Hoy es un estupendo dia para aprender a programar en Java";

        /*declaramos otra variable que va a ser igual a la parte que queremos extraer
        para ello le decimos que es igual a la variable que contiene la frase y le aplicamos el metodo
        substring donde le indicaremos entre el parentesis el rango de la frase que tiene que cojer y que
        se transformara en el valor de la nueva variable
         */
        /* con el primer parametro indicamos la posicion en la que empieza a extraer y el siguiente parametro indica
        el caracter siguiente al que queremos extraer que ya no se mostrara
         */
        String frase_resumen = frase.substring(29, 30); /*esto nos mostrara por pantalla la letra a de la palabra
                                                           aprender ya que es la posicion 29 y le decimos que pare de
                                                           contar en la 30*/
        System.out.println(frase_resumen);

        frase_resumen= frase.substring(0, 29) + "irnos a la playa"; /*aqui concatenamos una parte de la cadena
                                                                        con una frase que le añadimos para darle ese
                                                                         valor a la variable anterior*/
        System.out.println(frase_resumen); //imprimimos el nuevo valor de la variable String modificada

        // se puede concatenar tanto modificando las varibles como en el print para jugar con las oraciones como queramos
    }
}
