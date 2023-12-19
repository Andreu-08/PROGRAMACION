package arrays.matrices;

public class Per_a_Practicar_1 {
    /*
    1. Crea un programa que cree una matriu de mida 5x5 que emmagatzeme
    els números de l'1 al 25 i després mostre la matriu per pantalla.
    */
    public static void main(String[] args) {

        final int filas=5, cols = 5; //tamaño matriz

        int[][] matriz = new int [filas][cols];

        int contador = 1;
        for (int f=0; f < matriz.length; f++)
        {
            for(int c=0; c < matriz[f].length; c++)
            {
                matriz[f][c] = contador;
                contador++;
            }
        }
        for (int f=0; f < matriz .length; f++)
        {
            for (int c=0; c< matriz[f].length; c++)
            {
                System.out.print(matriz[f][c]+"\t");
            }
            System.out.println("\n");
        }
    }
}
