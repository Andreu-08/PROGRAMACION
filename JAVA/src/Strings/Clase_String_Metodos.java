package Strings;

public class Clase_String_Metodos {
    public static void main(String[] args) {

        //METODOS DE LA CLASE STRING

        // 1. METODO valueOf()

        /*
        Este metodo se utiliza para convertir tipos de datos
        (enteros, booleanos, caracteres etc.) en una representacion
        de ellos en cadena de texto.

        Nos de volvera un valor String para el tipo de dato que queramos.
         */

        //Ejemplo metodo valueOf, pasamos un entero a cadena de texto

        int numEjemplo1 = 100;

        //aqui aplicamos el metodo valueOf
        String IntCaracteres = String.valueOf(numEjemplo1);
        /*
        ahora el el valor de numEjemplo podra ser tratado como un String
        en la variable IntCaracteres
         */

        //2. METODO length()

        /*
        El metodo length se utiliza para medir la cantidad de caracteres que
        habria dentro de una cadena de texto.

        Este metodo nos devolvera un entero (int) con la cantidad de caracteres
        que tiene la cadena
         */

        //Ejemplo de utilizacion del metodo length

        //se declara el stirng del que queremos saber el numero de caracteres
        String stringEjemplo1 = "Andreu Orenga";
        /*
        aplicacion del metodo en una variable int ya que es el tipo de dato
        que nos devolvera
         */
        int longitudEjemplo1 = stringEjemplo1.length();
        /*
        esta variable la podremos utilizar para hacer operacion que requieran
        saber el numero de caracteres que tiene nuestra cadena de texto.
         */

        //3. METODO CharAt()

        /*
        Este metodo se utiliza para obtener el caracter dentro de una posicion
        especifica en una cadena de texto
         */
        String stringEjemplo2 = "Andreu Orenga";

        /*
        Al aplicar el metodo CharAT podremos saber el valor del caracter en
        la posicion que le indiquemos este caracter sera de tipo char
        (caracter de texto)
         */
        char caracterEjemplo = stringEjemplo2.charAt(5);
         /*
         este ejemplo nos devolvera el caracter en la posicion 6 ya que empieza a
         contar desde 0
          */

        //4. METODO equals(cadena)

        /*
        este metodo compara cadenas de texto y nos devuelve un valor boleano
        que estara en true si son identicas o en false en el caso contrario
         */
        /*aqui comparamos las dos cadenas de texto de las variables anteriores
        este ejemplo nos devolvera true en el bolean ya que son identicas
         */

        boolean equalsEjemplo = stringEjemplo1.equals(stringEjemplo2);

        //ahora podremos utilizar esta variable como un boolean en nuestro pograma

        //5. METODO equalsIgnoreCase(cadena)

        /*
        Este metodo es igual que el metodo anterior (equals) con la unica diferencia
        de que el equals difernecia entre mayusculas y minusculas y este metodo
        no diferencia entre ellas ("Andreu Orenga" comparado con "andreu orenga"
        devolveria el boolean en true
         */

        //6. METODO substring (ini, fin)

        /*Este metodo nos permitira sacara partes de una cadena de texto
        (subcadenas) indicandole desde donde queremos que empieze a extraer
        y la posicion siguiente hasta donde queremos que extraiga
         */
        /*
        creamos la varaible de tipo String de la queremos extraer la paralabre
        Orenga, para ello utilizaremos el emtodo substring
         */
        String Ejemplo3 = "Andreu Orenga";
        /*
        Este ejemplo nos devolveria la palabra "orenga" ya que le  indicaremos
        entre parentesis el rango en la que se incluye dentro de la cadena
        la podremos utilizar como un tipo de dato String que es lo que devuelve
        este metodo
         */
        String Orenga = Ejemplo3.substring(7,13);

        //7. METODO indexOf(cadena)

        /*
        ese metodo nos devolvera la primera posicion dentro de la cadena
        de una subcadena, en el casi de que esa subcadena se repita este
        metodo guardara en un numero entero el valor de la posicion de la
        primera vez que aparece esa subcadena (este numero entero sera la
        posicion del primer caracter de la subcadena dentro del texto)
         */
        /*
        en este ejemplo guardaremos en un entero (int) el valor de la
        posicion en la que se encuentra la subcadena "dreu" que solor
        aparecera una vez dentro de la cadena, en el caso de aparecer
        mas veces guardaria la posicion de la primera ignorando las otras
         */
        String Ejemplo4 = "Andreu Orenga";
        /*
        crearemos la variable int que guardara la posicion 2 de la cadena
        ya que es la posicion donde empieza la subcadena que le hemos indicado
        entre parentesis ("dreu")
         */
        int posicionDreu = Ejemplo4.indexOf("dreu");
        /*
        podria utilizarse para encontrar la primera vez que aparece algun
        caracter en concreto, en el caso de no contener ese caracter o subcadena
        el int tendra el valor -1
         */

        //8. METODO lastIndexOf(cadena)

        /*
        este metodo se utilizara para encontrar la ultima aparacion
        de un caracter o subcadena dentro de la cadena de texto (String)
        que queramos y lo alamacenara como un entero en una variable (int)
        como en el metodo indexOf si no encuentra el caracter que le indicamos
        en la cadena mostrara -1
         */

        int posicionUltimaA = Ejemplo4.lastIndexOf("a");
        /*esta linea de codigo alamacenara en un entero la posicion
        de la ultima a encontrada en la variable tipo String que le
        hemos indicado
         */

        //9.METODO startsWhith(cadena)

        /*
        Este metodo se utiliza para ver si una cadena empieza de una forma
        especifica, se le pasara al metodo la subcadena/caracter que quermaos y este
        nos indicara mediante un boolean si la cadena empieza por esa subcadena/caracter (true)
        o de lo contrario no empieza asi (false)
         */

        /*
        En el siguiente ejemplo nos indicara si la variable empieza por el caracter "A"
        devolvera un valor boleano true ya que si que empieza por ese caracter
         */
        boolean inicioA = Ejemplo4.startsWith("A");

        //10. METODO endsWith(cadena)
        /*
         Este metodo se utilizara de la misma forma que el startsWith pero
         al contrario que este endsWith nos indicara con un boleano (true or
         false), si la cadena a la que hacemos referencia termina de la
         forma que le indicamos (true si termina igual) (false sino)
         */
        boolean finA = Ejemplo4.endsWith("A");
        /* este booleano sera siempre false ya que la cadena no termina con A*/

        //11. METODO replace(cadena1,cadena2)
        /*
        este metodo nos permite remplazar partes de un String por otra cadena
        o caracter de texto que queremas, lo almacenara en un String y cada vez que
        utilizemos este tendra la parte indicada remplazada por la otra
         */
        String ejemplo5 = "Andreu Orenga";
        String remplazaoOrenga = ejemplo5.replace("Orenga", "Ramon");
         /*
         Aqui hemos remplazado la cadena de caracteres "Orenga" por la cadena "Ramon"
         cada vez que utilizemos este String en el codigo su valor sera el de
         "Andreu Ramon" en vez de su valor inicial.
          */

    }
}
