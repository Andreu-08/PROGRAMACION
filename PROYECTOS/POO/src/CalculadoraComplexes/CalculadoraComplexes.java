package CalculadoraComplexes;

public class CalculadoraComplexes {
    public static void main(String[] args) {

        //creacio dels objectes complexes
        Complexe A = new Complexe(2,3);
        Complexe B = new Complexe(1,4);

        //utilitzem el metodo tString per a imprimir el numero
        System.out.println(A.toString());
        System.out.println(B.toString());

        //metode sumar
        /*
        declarem un numero nou que sera igual a la
        suma dels dos numeros que pasem al metode sumar
         */
         Complexe sumaAB = A.sumar(B);

         //imprimim la suma
        System.out.println(
                "La suma de " + A.toString()+
                "+" + B.toString() + " es igual a: " +
                sumaAB.toString()
        );

        //metode restar
        Complexe restaAB = A.restar(B);
        System.out.println(
                "La resta de " + A.toString()+
                "-" + B.toString() + " es igual a: " +
                restaAB.toString()
        );

        //metode multiplicar
        Complexe producteAB = A.multiplicar(B);
        System.out.println(
                "El producte de " + A.toString()+
                "*" + B.toString() + " es igual a: " +
                producteAB.toString()
        );

        //metode dividir
        Complexe restoAB = A.dividir(B);
        System.out.println(
                "la divisio de " + A.toString()+
                "/" + B.toString() + " es igual a: " +
                restoAB.toString()
        );
    }
}
