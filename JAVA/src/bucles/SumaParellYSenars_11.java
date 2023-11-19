package bucles;

public class SumaParellYSenars_11 {
    public static void main(String[] args) {

        int parells = 0; //se incia la suma dels numeros parells en 0
        int senars = 0; //se inicia la suma dels numeros senars en 0

        //utilitzem el for per recorrer tots els numeros que hi ha de 100 a 200 de un en un
        for (int i = 100; i <= 200; i++) {
            // utilitzem if else per a comprovar si el numero es par o senar
            if (i % 2 == 0) {
                parells = parells + i; //en el cas de ser par li sumem la variable parells
            } else {
                senars = senars + i; // en el cas contrari li sumem la variable senars
            }
        }
        // imprimim el misatge amb els resultats de les sumes
        System.out.println("La suma dels numeros parells entre 100 y 200 es " + parells);
        System.out.println("La suma dels numeros senars entre 100 y 200 es " + senars);
    }
}
