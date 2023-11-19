package bucles;

public class MostraParellsDeUEnU_3 {
    public static void main(String[] args) {
        // Iniciem el buble deesde 1 fins 200 utilizant el for perque sabem el numero de voltes
        for (int i = 1; i <= 200; i++) {

            // comprovem si el numeroe es par cuan el producte de la seua divisio per 2 es 0
            if (i % 2 == 0) {
                // si es par, imprimim el numero per pantalla
                System.out.println(i);
            }
        }
    }
}






