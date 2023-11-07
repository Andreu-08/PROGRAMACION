import java.util.Random;

public class PalsDeLaVaralla_2 {

    public static void main(String[] args) {

        Random varalla = new Random();

         int numCarta = varalla.nextInt(13) + 1;

         int palCarta = varalla.nextInt(4) + 1;

        //Asi asignem una lletra a la carta segons el seu numero ya que no son valors numerics
        String carta = " ";

        switch (numCarta) {
            case 1:
                carta = carta + " As";
                break;
            case 11:
                carta = carta + " J";
                break;
            case 12:
                carta = carta + " Q";
                break;
            case 13:
                carta = carta + " K";
                break;
            default:
               carta = String.valueOf(numCarta);

        }
        switch (palCarta) {
            case 1:
                carta = carta + " piques";
                break;
            case 2:
                carta = carta + " cors";
                break;
            case 3:
                carta = carta + " diamants";
                break;
            case 4:
                carta = carta + " trevols";
                break;

        }

        System.out.println("La carta generada al azar es: " + carta);

    }
}
