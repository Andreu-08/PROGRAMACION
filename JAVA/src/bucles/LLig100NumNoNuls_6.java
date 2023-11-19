package bucles;

public class LLig100NumNoNuls_6 {
    public static void main(String[] args) {

        //iniciem una varieable bololean per a saber si es verdades o fals que hi ha un numero negatiu

        boolean numNegatiu = false;

        for (int i = 0; i < 100; i++) { //fem un bucle for per a llegir 100 numeros

            int num = (int) (Math.random() * 201) - 100; //utlitzant math random podem generar numeror aleatoris entre -100 y 100

            // comporvem si el numero es negatiu
            if (num < 0) {
                numNegatiu = true;
            }
        }
        //imprimim si se ha llegit algun negatiu o no
        if (numNegatiu){
            System.out.println("Se ha llegit algun negatiu");
        }else {
            System.out.println("No se ha genereat ningun negatiu");
        }
    }
}
