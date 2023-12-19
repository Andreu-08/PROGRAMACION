package arrays.matrices;

public class Per_a_Practicar_2 {
    /*
    2. Crea un programa que cree una matriu de 10x10 i introduisca
    els valors de les taules de multiplicar de l'1 al 10 (cada taula a una fila).
    Després mostrarà la matriu per pantalla.
     */
    public static void main(String[] args) {
        final int filas = 10, cols = 10; //tamaño matriz

        int[][] matriz = new int[filas][cols];


        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {   //rellenar mariz
                matriz[f][c] = (f + 1)*(c+1);
            }
        }
        //mostrar la matriz
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
