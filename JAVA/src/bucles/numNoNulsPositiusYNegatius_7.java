package bucles;

public class numNoNulsPositiusYNegatius_7 {
    public static void main(String[] args) {

        int positius = 0;
        int negatius = 0;

        for (int i = 0; i < 100; i++) { //fem un bucle for per a llegir 100 numeros
            int num = (int) (Math.random() * 201) - 100; //utlitzant math random podem generar numeror aleatoris entre -100 y 100}

            if (num > 0) {
                positius++; // si el numero es positiu incrementem en 1 el valor de la variabla positiu
            } else if (num < 0) {
                negatius++; // si el numero es negatiu incrementem en  1 el valor de la variable negatius
            }
        }

        //mostrem els mensajes en la cantitat de numeros negatius i positius que se han contat

        System.out.println("Se han llegit " + positius + " numeros positius.");
        System.out.println("Se han llegit " + negatius + " numeros negatius.");
    }
}
