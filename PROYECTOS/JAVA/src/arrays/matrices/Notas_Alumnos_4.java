package arrays.matrices;
import java.util.*;
public class Notas_Alumnos_4 {
    public static void main(String[] args) {

        Scanner teclado =new Scanner(System.in);

        double[][] tablaNotas = new double[4][5]; //declaracion de variable
        double[] notaMedia = new double[4];
        double [] notaMax = new double[4];
        double [] notaMin = new double [4];
        double sumaNotas= 0;
        double max = 0;
        double min = 11111111;


        for(int i=0; i<4;i++){
            System.out.println("Introduce la nota de Alumno "+(i+1) + ":");
            for(int j= 0; j < 5; j++){
                System.out.println("Asignatura "+(j+1));
                    tablaNotas[i][j] = teclado.nextInt();
                    sumaNotas += tablaNotas[i][j];
                    if (tablaNotas[i][j] > max){
                        max = tablaNotas[i][j];
                    }
                    if (tablaNotas[i][j] < min){
                    min = tablaNotas[i][j];
                }
            }
            notaMedia[i] = sumaNotas/5;
            notaMax[i] = max;
            notaMin[i] = min;
            max = 0;
            min = 999;
            sumaNotas=0;
        }

        for (int i = 0; i<4; i++){
            System.out.println("La nota media del alumno " + (i+1) + " es " + notaMedia[i]+"\n"
            +"La nota maxima es " + notaMax[i] +"\n" + "La nota minima es " + notaMin[i] + "\n");
        }
    }
}
