package funciones;

import java.util.Scanner;

public class Exercici_Snacks {
    private static Scanner teclado = new Scanner(System.in);
    //matriu per a guardar la cauntitat de snacks disponibles
    private static int[][] cantidad = {
            {5, 5, 5, 5},
            {5, 5, 5, 5},
            {5, 5, 5, 5},
            {5, 5, 5, 5}
    };
    //variable que acmulara el total de ventes
    private static int ventas = 0;
    //matriu que guarda els noms dels snacks
    private static String[][] nomSnack = {
            {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
            {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
            {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
            {"Lacasitos", "Crunch", "Milkybar", "KitKat"}
    };
    //matriu que alamacena el preu de cada snack
    private static double[][] preu = {
            {1.1, 0.8, 1.5, 0.9},
            {1.8, 1, 1.2, 1},
            {1.8, 1.3, 1.2, 0.8},
            {1.5, 1.1, 1.1, 1.1}
    };

    public static void main(String[] args) {
        //variable per a poder elegir la opcio en el menu
        int menu = 0;

        //bucle per a que es mostre el menu correctament
        do {
            //es mostar el menu y es demana que seleccionem una opcio
            System.out.println("************MENU************\n" +
                    "1.Demana un Snack\n" +
                    "2.Mostrar Snacks Disponibles\n" +
                    "3.Omplir Maquina\n" +
                    "4.Apagar Maquina\n");

            System.out.println("Elige una opcion");
            menu = teclado.nextInt();
            //switch per a cada opcio del menu (cada opcio sera una funcio)
            switch (menu) {
                case 1:
                    demanarSnack();
                    break;
                case 2:
                    mostrarSnacksDisponibles();
                    break;
                case 3:
                    omplirMaquina();
                    break;
                case 4:
                    apagarMaquina();
                    break;
                default:
                    System.out.println("Opcion no valida, Selecciona una opccion del 1 al 4");
                    break;
            }
        } while (menu != 4);
    }

    //funcio per a cuan vulgam imprimir una matriu de string
    private static void imprimirMS() {
        int filas = nomSnack.length;
        int columnas = nomSnack[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + nomSnack[i][j] + "]" + " ");
            }
            System.out.println();
        }
    }

    /*funcio per a la primera opcio, mostrar el snack y en deixara elegir un
    indicant la fila y la columna que volem, aumentara despres el total de ventes
    y ens mostrara el snack que hem demanat y el seu preu
     */
    private static void demanarSnack() {
        imprimirMS();
        System.out.println("Demana un Snack (indica fila y columna)");
        int fila = teclado.nextInt();
        int columna = teclado.nextInt();

        if (cantidad[fila][columna] > 0) {
            cantidad[fila][columna]--;
            ventas++;
            System.out.println("Has demanat un " + nomSnack[fila][columna] +
                    ". Preu: " + preu[fila][columna]);
        } else {
            System.out.println("No hi ha més unitats d'aquest snack.");
        }
    }

    /*funcio per al cas dos que ens mostrara els snacks disponibles en la maquina
    y el seu preu*/
    private static void mostrarSnacksDisponibles() {
        System.out.println("Snacks disponibles:");
        int filas = nomSnack.length;
        int columnas = nomSnack[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int codiSnack = i * columnas + j;
                System.out.println("Codi: " + codiSnack +
                        ", Nom: " + nomSnack[i][j] +
                        ", Preu: " + preu[i][j]);
            }
        }
    }

    /*funcio per a la tercera opcio demanara una contraseña per a omplir la maquina
    (utilitzem el metode equals per a comprobar si el que introduix lusuari es igual
    a la contraseña que hem posat, despres oferix la opcio de rellenar la posicio (f/c)
    que vullgam de la maquina.
    */
    private static void omplirMaquina() {
        System.out.println("Introdueix la contrasenya per omplir la màquina:");
        String contrasenya = teclado.next();
        if (contrasenya.equals("123456789")) {
            imprimirMS();
            System.out.println("Introdueix la posició del snack (fila i columna):");
            int fila = teclado.nextInt();
            int columna = teclado.nextInt();
            System.out.println("Introdueix la quantitat a afegir:");
            int quantitat = teclado.nextInt();
            cantidad[fila][columna] += quantitat;
            System.out.println("Màquina omplida correctament.");
        } else {
            System.out.println("Contrasenya incorrecta. No pots omplir la màquina.");
        }
    }
    /* funcio per al cas 4 que apagara la maquina, mostrara el total de ventes
    y detrindra la maquina*/

    private static void apagarMaquina() {
        System.out.println("Ventes Totals: " + ventas + "\n" +
                "Maquina Apagada");
    }

}


