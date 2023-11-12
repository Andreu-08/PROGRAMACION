import java.util.Random;

public class Muestra50NumsEntre100y199_3 {
    public static void main(String[] args) {

        Random numero = new Random();

        //declarem les variables que alaçenaran el numero minim el maxim y la suma per a fer la mitja
        //utilitzem la constant integer per a que la varieble se incie desde el varol minim y maxim posible
     int numMaxim = Integer.MIN_VALUE;
     int numMinim = Integer.MAX_VALUE;
     int suma = 0;

     //utilitzem un for per a generar els 50 numeros alatoris
        for (int i = 0; i < 50; i++) {
            //dins del for fem que estos numeros siguen entre el 100 y el 199
            int num = numero.nextInt(100) + 100;

            //imprimim el numero en la mateixa linea amb un espai
            System.out.print(num + " ");

            //actualizem les variables numMaxim y numMinim
            if (num > numMaxim) {
                numMaxim = num;

            }if (num < numMinim) {
                numMinim = num;
            }

            //acumulem la variable suma per a poder traure la mitjana despres

            suma = suma + num;
        }
        //utiliztzem un double per a calcular la mitjana dividint el acumulat en suma per els numeros generats

        double mitjana = (double) suma /50;

        //imprimim els resultats

        System.out.println("\nEl numero maxim es: " + numMaxim);
        System.out.println("El numero minim es: " + numMinim);
        System.out.println("La mitjana de els numeros generats es: " + mitjana);

    }
}
