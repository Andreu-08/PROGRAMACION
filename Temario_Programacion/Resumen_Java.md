# JAVA
## Caracteristicas de Java
- __Sencillo:__ Elimina cracteristicas engorrosas.
- __Orientado a objets.__
- __Distribuido:__ Buen tratamiento en las redes.
- __Seguro:__

    - no permite leer y escribir ficheros sin permiso.
    - No permite desbordar la pila de ejecucion.
    - No permite la corrupcion de memoria.

- __Neutro.__
- __Addaptable:__ Los tipos de datos son iguales en todas las plataformas.
- __Interpretado.__
- __Alto rendimiento.__

## Estructurras principales de Java
### Tipos de programas

- Aplicaciones de Consola

- Aplicaciones de proposioto general 

- Applets (Aplicaiones que se ejecutan en el navegador)

## Anatomia de un progarama en java
``` java 
//progrma que imprime por pantalla la frase "Hola mundo"
public class PrimerEjemplo{
    Public statis void main(String[] args){
        System.out.println("Hola mundo");
    }
}
```
## Creacion de un proyecto en Java
1. Crear proyecto en el ID de programacion.

2. Crear clase dentro de la carpeta _"src"_.
3. Simpre primera letra en mayuscula (nunca debe ser un numero).
4. Todo tiene que estar dentro de la classe y el metodo.
5. Todas las setencias terminan en ;
6. El nombre de la clase tiene que tener el mismo que el del archiv .java
```java
Ejemplo de codigo

public class PrimeraClase { //public = modificador de acceso

    public static void main(String[] args) { //metodo main

        System.out.println("Hola mundo"); //todas las sentencias terminan en ;
    }
}
```
## Sintaxis Java (Introduccion)
### Tipos de datos (primitivos)
#### Enteros 
- __Int:__ Desde -2.147.483.648 hasta el mismo numero en positivo.
- __Short:__ Desde -32000 hasta 32000.
- __Long:__ Rango muy grande de numero, utilizamos el sufijo L al declararlo.
- __Byte:__ Rango de numero más pequeño.
#### Decimales
- __Float:__ Aproximadamente 6 decimales, utilizamos el sufijo F al declararlo.
- __Double:__ Tiene una parte decimal muy larga hasta 15, no lo declaramos con sufijo.
#### Char
 Representa cualquier caracter ('a'), siempre entre comillas simples.
#### Boolean
Tipo de datos que solo tiene dos valores (verdadero o falso).

### Variables 
- Datos que pueden ir cambiando durante la ejecucion de un programa.
- Guardan datos temporalmente que pueden ser utilizados en el futuro por el mismo programa
#### Creacion de una variable y inicializacion de una variable
```java
int salario; //cracion de una variable sin inciar

salario = 200; //iniciamos la variable dandole un valor en este caso 200

int num = 5 //declaracion i iniciacion en la misma linea

public class variables {

    public static void main(String[] args) { //el codigo se ejecuta dentro del metodo main

        byte edad; //declaracion de varible
        //byte (tipo de dato) edad(nombre de la varible

        edad = 35; //iniciamos la variable dandole un valor (35)

        // byte edad = 35; declaracion de variable en una misma linea
        System.out.println(edad); //imprime el 35

        edad = 75; // se cambia el valor de la variable edad y se machaca el      anterior

        System.out.println(edad); //imprimimos el ultimo valor por encima del print de la variable por consola (75)
    }
}
```
- Podemos cambia el nombre de la variable cuando queramos indicando el nombre de la variable = otro valor.

### Comentarios 
- Pequeñas anotaciones que describen el codigo.
- Siempre empiezan con // seguido de el comentario. 
- El programa no los tendra en cuenta para su ejecucion.
- /*....**/ esto nos permitira comentar un bloque de codigo. 
- Se recomienda utilizarlo con frecuencia. 
### Metodos
 - Los definiriamos como lo que es capaz de hacer un objeto.
 - Cuando ejecutamos un metodo hacemos que este funcione en el objeto en el que lo aplicamos.
 ```java
 System.out.println (" ")
 //System : indicaria nuestro sistema
 //out: indicaria que la salida es por la consola del sistema
 //println: imprime lo que indiquemos en este caso seria el metodo
 ```
### Constantes
- Declaracion de un valor que no puede cambiar (contrario a las variables).
- Datos fijos que podremos utilizar en cualquier momento dentro del programa.
#### Ejemplo de constante (valor fijos de conversion entre Cº y ºF)
```java
final double a_pulgadas = 2,54;
```
- Se utiliza _final_ delante de la declaracion.
- Puede ser en la misma linea o en diferente como las variables.
### Operadores
#### Aritmeticos
    + Suma                      
    - Resta
    * Multiplicaion
    / Division
#### Logicos, Relacionales y Booleanos
    > Mayor que, < Menor que.
    != Distinto que.
    == Igual que.
    && 'y' logico ( y ademas...).
#### Incremento y Decremento
    ++valor incrementa en 1 el valor 
    --valor decremeta en 1 el valor 
    += o -= suma o resta el valor que le indiquemos (equivalente a num = num - o + valor).
#### Concatenacion
    + Une cadenas de caracteres con variables etc...

#### Ejemplos de operadores en Java
```java
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
```
## Clases en Java 
- __Propias:__ Son las clases cradas por nosotros con el codigo y los metodos que queramos.
- __Predefinidas:__ Son las clases del propio lenguaje Java que estan ya que cradas y disponibles para nuestra utilizacion dentro de nuestros programs (API de Java).

### Calculos numericos / Clase Math
La clase Math incluye diferentes metodos que nos permiten realizar calculos matematicos.
> __Math.sqrt(num)__ : noms permite calcular la raiz cuadrada del numero entre parentesis.

>__Math.pow(base,exponente)__: nos permite calcular la potencia de un numero.

>__Math.round(num decimal)__: nos permite redondear un numero.

>__Math.PI__: constante dentro de la clase Math que contiene el numero PI.
#### Ejemplos clase math
```java
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
```
#### Casting (Refundicion)
```java
int raiz = (int) Math.round(num1);
```
- Se añade entre parentesisi el tipo de dato que queremos convertir el valor que nos devolvera la expresion.
- Se utiliza cuando algunos de los metodos devuelven un tipo de dato que no es el que nosotros queremos, para que haga la conversion antes de seguir utilizando el programa.
- En este caso el metodo round de la clase Math nos devolvera un long para la variable con el resultado, nosotros lo estamos convirtiendo a un int (int).
### Manipulacion de cadenas de caracteres / Clase String
- String no es un tipo de dato primitivo es una clase.
- Como almacenar una cadena de caracteres String.
```java
String mi_nombre = "Andreu";
```
#### Metodos mas utilizados de las clase String
> __length()__: Saber la longitud de la cadena de caracteres, la cantidad letras y espacios que tiene.

> __charAt(posicion)__: Saber que caracter hay en una posicion en concreto contando desde 0
 ```java
mi_nombre.charAt(2) = 'd';

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
```
>__subsring(x,y)__: devuelve una subcadena de caracteres x (desde donde empieza a contar), y (el numero de caracteres que cuenta)
```java
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
        String frase_resumen = frase.substring(29, 30); /*esto nos mostrara por pantalla la letra a de la palabra aprender ya que es la posicion 29 y le decimos que pare de contar en la 30*/
        System.out.println(frase_resumen);

        frase_resumen= frase.substring(0, 29) + "irnos a la playa"; /*aqui concatenamos una parte de la cadena con una frase que le añadimos para darle ese valor a la variable anterior*/
        System.out.println(frase_resumen); //imprimimos el nuevo valor de la variable String modificada

        // se puede concatenar tanto modificando las varibles como en el print para jugar con las oraciones como queramos
    }
}
```
> __equals(String)__: Devuelve true o flase cuando compara las cadenas, distingue entre mayusculas y minusculas.

>__equalsIgnoreCase(String)__: No distingue entre mayusculas y minusculas
```java
public class Manipula_Cadenas3 {
    public static void main(String[] args) {

        String alumno1, alumno2;/*declaramos dos variables tipo string a la vez sin iniciarlas*/

        //iniciamos las dos variables
        alumno1 = "David";
        alumno2 = "David";

        //ejemplo del metodo equals para comparar cadenas de caracteres
        /*aqui estamos utilizando el metodo para comparar las variables alumno1
        y alumno2 para ver si son iguales (true) o diferentes (false)
        en este caso sera true porque son iguales
         */
        System.out.println(alumno1.equals(alumno2));
         /*si queremos que no ignore entre mayusculas y minusculas
         utilizaremos el metodo equalsIgnoreCase
          */
    }
}
```
## Salidas y Entradas de datos 
- La salida de datos son datos que se van a mostrar fuera del programa .out (junto con System. muestra el valor por la consola del sistema).
- Las entradas de datos permiten al usuario introducir datos en la ejecucion del programa (permite escribir en la consola o en una interfaz grafica lo que queramos antes de continuar con la ejecucion).

### Clase Scanner
- Esta clase nos permite introducir informacion por la consola del sistema.
- Para utilizar esta clase necesitaremos crear un objeto que utilize la clase scanner.
```java
Scanner teclado = new Scanner (System.in);
```
#### Metodos mas utilizados 
> __nextline()__: introducir texto.

>__neextInt()__: introducir numero enteros.

>__nextdouble()__: introducir numero decimales.

#### Ejemplo clase Scanner
```java
import java.util.Scanner;
//Importamos la clase Scanner ya que no pertenece al paquete por defecto de JAVA
public class Entrada_Ejemplo1 {
    public static void main(String[] args) {

        /*contruccion del objeto entrada de tipo scanner que tomara
        informacion introducida por la consola del sistema (System.in)
         */
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre:");

        /* declaramos la variable tipo string ya que queremos que nos devuelvan caracteres
        esta variable sera igual al objeto que hemos creado anteriormente mas el metodo .nextline que nos
        perminte escribir caracteres por consola (siempre tneemos que indicar el tipo de dato que queremos
        que se ingrese
         */
        String nombre = entrada.nextLine();

        System.out.println("Introduce tu edad:");
         //en este caso estamos necesitamos que el usuario nos introduzca un numero entero por consola .nextInt
        int edad = entrada.nextInt();
        /*imprimirmos por pantalla utilizando concatenaciones una frase que incluira la variable nombre que
        se habra iniciado con el valor que el usuario habra indicado por teclado acompañado de la edad que habra
        indicado y le sumamos 1 ya que queremos saber que edad entrada el siguiente año
         */
        //recordamos que si queremos modificar la variable en el print entre () hacemos la operacion en este caso +1
        System.out.println("Hola " + nombre + ". El año que viene tendras " + (edad + 1) + " años");

    }
}
```
## Condicionales y Bucles
### Flujo de control y ejecucion
```java
Public static void main (String[] args){

    l.codigo1;
    l.codigo2;      //esto seria la linea de ejecucion (l.1 -l.4)
    l.codigo3;
    l.codigo4;
 
}
```
las estructuras de control modifican esta linea de jecucion, dando saltos o repitiendo partes del codigo.
### Condicionales (Saltos en el codigo)
#### Condicional _if_
```java
if(condicion){

    codigo que se ejecuta si la condicion es true;

} aqui se puede acompañar con un else en caso de false


public class Evalua_Edad {

    public static void main(String[] args) {

        //creamos oun objeto escaner llamado entrada para la introduccion de datos por consola del sistema
        Scanner entrada = new Scanner(System.in);

        /*mensaje indicando que el usuario introducza el valor en consola que queremos*/
        System.out.println("Introduce tu edad: ");

        /*variable en la que se guardara el valor introducido por consola*/
        int edad = entrada.nextInt();


        /*vamos a utilizar el condicional if marcandole la condicion que queremos evaluar entre parentesis
        * en el caso de que se cumpla la condicion el programa terminara mostrando el codigo que se encuentra dentro
        * de ese if, si no se cumple seguir con la ejecucion (si pasa esto)*/
        if (edad < 18){
            //codigo que se ejecutara si es verdad el if
            System.out.println("Eres menor de edad");
        }
        /*si no se cumple el if el programa pasara a leer el else que solo puede estar si hay un if, y ejecutara
        el codigo que tenga dentro de las llaves que es lo que tiene que pasar en el caso contrario de la condicion
        del ig (si no)
         */
        else {
            //codigo que si no es verdad el if (se lo saltara) y ejecutara este
            System.out.println("Eres mayor de edad");
        }

        /*si tenemos que evaluar varias condiciones podemos montar diferentes if else o utilizar detras del if
        un else if (si no pasa esto -> si esto y asi las veces que queramos introduciendo el codigo dentro de else if
        que si no se cumple se ira saltando hasta que se cumpla la condicion
         */
        System.out.println("Introduce tu edad: ");

        int edad2 = entrada.nextInt();

        //Ejemplo estructura else if

        if (edad2<18){
            System.out.println("Eres adolescente");

        } else if (edad2 < 40) {

            System.out.println("Eres joven");
        }else if (edad < 60){

            System.out.println("Eres maduro");

            /* se termina con un else cuando queramos la ultima condicion*/
        } else {

            System.out.println("Cuidate");
        }


    }
}
```
#### Condicional _swich_
```java
swich(valor a evaluar){
    case 1: //utilizamos :
        codigo a ejecutar;
        brake;//para saltar el resto de casos.
    case 2 : // siguiente caso
        .
        .
        .
    //se puede añadir una opcion default para cuando el valor no coincida con ningun caso
}
```
### Bucles (Repeticion de partes de codigo)
#### Bucles indetermindos
- Bucles en los que no sabemos la cantidad de veces que se tendra que repetir el codigo hasta que se cumpla cierta condicion.
##### While
- Si la condicion es cierta siempre se ejecutran las lineas de codigo hasta que deje de ser cierta.
- Si es falsa desde el principio no se ejecutara ninguna vez
###### Ejemlo coidgo while (comprobar contraseña)
```java
public class Acceso_aplicacion {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String clave = "Andreu"; //Se guarda dentro de la variable clase la cadena de texto correcta

        String pass =""; //cadena de texto vacia que se llenara con los valores que introduciremos por pantalla

        /*
        se utiliza el metodo equials ya que compararemos la palabra de la variable clave para ver si es
        igual que la de pass que seria la contraseña que queremos comprobar utilizaremos el bucle de tipo while
        para que se repita el proceso las veces que sean necesarias hasta que la condicion sea verdadera
        el equials cambiara a true cuando sean iguales
         */
        while (clave.equals(pass)==false){ /*mientras (while) la variable clave sea diferente de la variable pass preguntar por la contraseña por pantalla*/
            System.out.println("Introduce la contraseña: ");
            //se cambia el valor de la variblae con el valor introducido por pantall .next(porque es un string)
            pass= entrada.next();
            /*
            cuando el valor introducido en la variable pass sea igual (equals=true)entonces la condicion de while sera falsa
            y el programa se saldra del while y nos ejecutara la sigueinte parte del programa fuera del while
             */
            /*
            * en el caso de que la condicion siga siendo verdadera el while contiuara y ejecutara el if
            * y las lineas de codigo que tiene dentro en este caso "contraseña incorrecta" y volvera a repetir el while
            * desde la primera linea*/
            if(clave.equals(pass)==false){

                System.out.println("Contraseña incorrecta");

            }
        }
        //linea de codigo que se jecutara cuando salgamos del bucle while (esta fuera justo fuera de las llaves del while)
        System.out.println("Contraseña correcta");
    }
}
```
##### Do While
- El codigo siempre se ejecutarar una vez.
- Despues de ejecutarse es cuando evaluara la condicion del while 
```java 
public class Adivina_Numero {
    public static void main(String[] args) {


        Scanner teclado =new Scanner(System.in); /* generamos un objeto de tipo Scanner que utilizaremos
                                                 luego para introducir valores por pantalla (teclado)*/


    /*vamos a generar un numero aleatorio entre o y 100 utiliziando el metodo random de la clase Math
    declaramos una variable que guardara el valor de ese numero en un entero
    utilizando casting (int) pasamos a entero el valor que genra Math. random ya que este es decimal
    este valor decimal lo tendremos que multiplicar *100 ya que es un valor que esta entre 0 y 1
    (lo que nos genera el Math.random)
     */
        int aleatorio = (int) (Math.random()*100); //esta sera la declaracion para generar un num entre 0 y 100

        //declaramos las variables que necesitaremos dentro del bucle while para los intentos de acertar el numero
        int numero = 0;
        int intento = 0;
        
         //EJEMPLO DEL MISMO CODIGO CON DO WHILE
      /*aqui tenemos un ejemplo del mismo codigo pero con el bule do while que
      a diferencia del while siempre se ejecutara al menos una vez, asi en este caso
      si el numero aleatorio fuera 0, al no entrar en el while porque la varible tiene
      ya ese valor y seria cierto entonces lo saltaria, el do haria que se ejecutara
      primero antes evaluar la condicion que iria al finalizar la ejecucion de las lineas de
      codigo dentro del do. (abajo tenemos la sintaxis de este mismo)*/

        /*mientras (while) numero diferente (operador !=) a aleatorio(numero generado en la variable con random)
        se tendra que repetir el bucle generado con while */
        do {
            intento++;

            System.out.println("Introduce un numero: ");

            numero = teclado.nextInt();
            if (aleatorio < numero){

                System.out.println("mas bajo");

            } else if (aleatorio>numero) {

                System.out.println("mas alto");

            }

        } while(numero!=aleatorio);
    }
       

        System.out.println("Lo has conseguido en "+ intento + " intentos");
        /*mensaje que se mostrar cuando ya no se cumpla la condicion del while
         y el programa se salga de este (en este caso cuando el numero aleatorio
         sea==al numero introducido por teclado), concatemos la variblae intento
         que ha ido incrementando todas las veces que hemos entrado dentro del while*/
}
```