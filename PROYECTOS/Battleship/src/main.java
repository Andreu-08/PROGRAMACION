import java.util.*;

public class main {
    public static void main(String[] args) {
        //indicamos el tamaño del tablero que queremos para jugar
        int tamañoTablero = 10;
        //rellenamos el tablero con la funcion que hemos creado para ello
        char[][] tableroUsuario = inciarTablero(tamañoTablero);
        char[][] tableroMaquina = inciarTablero(tamañoTablero);

        int dificultad = seleccionDificultad();

        if (dificultad == 1) {
            colocarBarcosFacil(tableroMaquina);
        } else if (dificultad == 2) {
            nivelMedio(tableroMaquina);
        } else if (dificultad == 3){
            nivelDificil(tableroMaquina);
        }

        //mostramos el tablero de juego al usuario
        mostrarTablero(tableroUsuario);
        mostrarTablero(tableroMaquina);

        int intentos;

        if (dificultad == 1) {
            intentos = 50;
        } else if (dificultad == 2) {
            intentos = 30;
        } else
            intentos = 10;

        //inciar partidad y ejecuta la partida
        while (intentos > 0) {
            System.out.println("Te quedan " + intentos + " intentos");
            int[] posicionDisparo = elegirPosicionDeDisparo();
            realizarDisparo(tableroMaquina, tableroUsuario, posicionDisparo);
            mostrarTablero(tableroUsuario);

            if (ganarPartida(tableroMaquina)) {
                System.out.println("¡Victoria! Has destruido todos los barcos en " + (intentos + 1) + " intentos");
                break;
            }

            intentos--;

            if (intentos == 0) {
                System.out.println("Has superado los intentos, ¡¡¡GAME OVER!!!!");
                mostrarTablero(tableroMaquina);
            }
        }
    }

    /*
    funcion que inicializa una matriz que se utilizara como tablero
    y que estara rellena con el simbolo "-"
     */
    public static char[][]inciarTablero(int tamaño){
        //creamos una matriz de caracteres que representara el tablero
        char[][] tablero = new char[tamaño][tamaño];
        // utilizamos un bucle for each para rellenar la matriz
        for(char[]fila : tablero){
            /*
            indicamos que en cada posicion de cada fila muestre el simbolo -
            utilizando arrays.fill
             */
            Arrays.fill (fila, '-');
        }
        //devuelve el tablero inciado y relleno con -
        return tablero;
    }


    //funcion que muestra el tablero en el que jugara el usuario
    public static void mostrarTablero (char[][] tablero) {
        System.out.println("*******TABLERO*******");
        System.out.print("  ");//Ajusta la posicion de la primera fila de caracteres con el tablero
        for (int i = 0; i < tablero.length; i++){
            //Aqui indicamos que tiene que mostrar A,B,C... en la primera fila
            System.out.print((char)('A' + i) + " ");
        }
        System.out.println();

        for (int i = 0;  i< tablero.length; i++) {
            //aqui nos llenara la columna lateral con los numeros de cada fila empieza en 0
            System.out.print(i + " ");
            for (int j = 0; j< tablero[i].length; j++) {
                System.out.print(tablero[i][j]+ " ");
            }
            System.out.println();
        }
    }


    //funcion que muestra el menu de seleccion de dificultad
    public static int seleccionDificultad() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Selecciona dificultad");
        System.out.println("1.Facil");
        System.out.println("2.Medio");
        System.out.println("3.Dificil");


        int seleccion = teclado.nextInt();
        //bucle while que utilizamos para verificar que la seleccion esta en el menu
        while (seleccion < 1 || seleccion > 3) {
            System.out.println("Opcion no valida. Seleccione una dificultad");
            seleccion = teclado.nextInt();
        }
        return seleccion;
    }


    //colocar barcos en el tablero de la maquina
    public static boolean verificarColocacion(char[][] tablero, int fila, int columna, char tipo, int orientacion){
        int longitudBarco = longitudBarco(tipo);

        // Verifica que el barco cabe en la posición
        if ((orientacion == 1 && fila + longitudBarco > tablero.length) || (orientacion == 2 && columna + longitudBarco > tablero[0].length)) {
            return false;
        }

        // Verifica si en esa posición hay algún barco
        for (int i = 0; i < longitudBarco; i++) {
            if (orientacion == 1 && tablero[fila + i][columna] != '-') {
                return false;
            } else if (orientacion == 2 && tablero[fila][columna + i] != '-') {
                return false;
            }
        }

        // Verifica si hay algún barco tocandose
        for (int i = fila - 1; i <= fila + longitudBarco; i++) {
            for (int j = columna - 1; j <= columna + 1; j++) {
                if (i >= 0 && i < tablero.length && j >= 0 && j < tablero[0].length) {
                    if (tablero[i][j] != '-' && tablero[i][j] != tipo) {
                        return false;
                    }
                }
            }
        }
        // Si todas las verificaciones están bien se colocan los barcos
        return true;
    }


    //funcion para posicionar los barcos en el tablero despues de las verificaciones
    public static void posicionBarcos (char[][] tablero, int fila, int columna, char tipo, int orientacion){
        int longitudBarco = longitudBarco(tipo);

        for (int i = 0; i < longitudBarco; i++ ){
            if(orientacion == 1){
                tablero[fila + i][columna] = tipo;
            }else if (orientacion == 2){
                tablero[fila][columna+i]= tipo;
            }
        }
    }


    //funcion que coloca varios varcos de forma aleatoria dentro del tablero
    public static void colocarBarcos(char[][] tablero, char tipo, int cantidad, int orientacion){
        for (int i = 0; i < cantidad; i++){
            int fila, columna;
            boolean colocacionCorrecta;

            do {
            fila = (int) (Math.random() * tablero.length);
            columna = (int) (Math.random() * tablero[0].length);
            colocacionCorrecta = verificarColocacion(tablero,fila,columna,tipo,orientacion);
            }while(!colocacionCorrecta);

            posicionBarcos(tablero, fila,columna, tipo, orientacion);

        }
    }


    //funcion para colocar los diferentes tipos de barco en el modo facil
    //se indica la cantidad de barcos y su orientacion
    public static void colocarBarcosFacil(char[][] tablero){
        colocarBarcos (tablero, 'L', 5,1);
        colocarBarcos (tablero, 'B', 3,2);//2 orientacion horizontal
        colocarBarcos (tablero, 'Z', 1,1);//1 orientacion vertical
        colocarBarcos (tablero, 'P', 1,2);
    }


    //funcion para darle la longitud al barco
    //a cada letra retorna la cantidad de lugares que ocupara
    public static int longitudBarco(char tipo){
        switch (tipo){
            case 'L':
                return 1;
            case 'B':
                return 3;
            case 'Z':
                return 4;
            case 'P':
                return 5;
            default:
                return 0;

        }
    }


    //funcion para que el usuario elija la posicion a la que quiere disparar
    public static int[] elegirPosicionDeDisparo(){
        Scanner teclado = new Scanner(System.in);
        int[] posicion = new int[2];

        //aqui el usuario eligira la fila del disparo (numero)
        System.out.println("Elige la fila (numero):");
        posicion[0]= teclado.nextInt();

        //aqui el usuario elegira la columna (letra)
        System.out.println("Elige la columna (letra)");
        char letra = teclado.next().toUpperCase().charAt(0);
        //se convierte la letra a numero utilizando el codigo ASCII
        posicion[1] =letra -'A';

        //retorna la posicion a la que ira el disparo
        return posicion;

    }

    //funcion para que se ejecute el disparo corrrectamente y incluya ese disparo en el tablero
    public static void realizarDisparo (char[][] tableroMaquina, char[][] tableroUsuario, int[] posicionDisparo){
        int fila = posicionDisparo[0];
        int columna = posicionDisparo[1];

        //se verifica si hay algun barco en la posicion disparada

        if(tableroMaquina[fila][columna] != '-'){
            System.out.println("Tocado");
            tableroUsuario[fila][columna] = tableroMaquina[fila][columna];
        }else{
            System.out.println("Agua");
            tableroUsuario[fila][columna]= 'X'; //marcamos la posicion con una X si no hay barco
        }
    }

    //funcion para saber si se han destruido todos los barcos y poder finalizar la partida
    public static boolean ganarPartida(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++){
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] != '-' && tablero[i][j] != 'X'){
                    return false;
                }
            }
        }
        return true;
    }


    //funcion para implementar el nivel medio del juego
    //se indicara la colococacion de los barcos para este nivel
    public static void nivelMedio (char[][] tablero) {
        colocarBarcos(tablero, 'L',2,1);
        colocarBarcos(tablero, 'B',1,2);
        colocarBarcos(tablero, 'Z',1,1);
        colocarBarcos(tablero, 'P',1,2);
    }

    //funcion para implementar el nivel dificil
    public static void nivelDificil (char[][] tablero) {
        colocarBarcos(tablero, 'L',1,1);
        colocarBarcos(tablero, 'B',1,2);
    }

    /*falta el nivel personalizado, y no he poido hacer que se muestre el mensaje
    de victoria en el momento que destuyes el ultimo barco :(
     */
}



