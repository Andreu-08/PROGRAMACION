package Exercicis_Exepcions_1a7;
import java.util.*;//incluye el manejo de las Excepciones
public class Ej_Excepcions2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);//captrar la entrada de usuario

        int A,B, result; //variables para las operaciones

        try /*bloque donde se ejecutara el programa que puede ocasionar
            la excepcion, en este caso puede tener un tipo de dato incorrecto
            (InputMismatchException) o un error en alguna operacion, como
            division por 0 (AritmeticException)*/
        {
            System.out.println("Introduce el numerador: ");
            A = in.nextInt();//debe ser un Int para que no salte InputMismatchException

            System.out.println("Introduce el denominador: ");
            B = in.nextInt();//Si es un 0 saltara ArithmeticException

            result = A / B;
            //si los valores son correctos se ejecutara la division y se mostrara el resultado
            System.out.println(A + " / " + B + " = " + result);

        }
        //si se captura alguna excepcion se ejecutara el bloque catch correspondiente
        catch (InputMismatchException e)//captura la excepcion de valor incorrecto
        {
            System.out.println("Valor introducido incorrecto");
            e.printStackTrace();
        }
        catch (ArithmeticException e)//captura la excepcion de operacion fallida (div por 0 en este caso)
        {
            System.out.println("División entre cero: " + e);
            e.printStackTrace();
        }

        //se ejecuta ocurran o no excepciones
        System.out.println("Fin del programa");
    }
}
