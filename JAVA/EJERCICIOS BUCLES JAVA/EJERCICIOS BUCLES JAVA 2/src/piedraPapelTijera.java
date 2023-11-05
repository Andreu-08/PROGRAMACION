public class piedraPapelTijera {
    public static void main(String[] args) {

        System.out.println("Genera al azar piedra, papel, tijera");

        int  tirada = (int) (Math.random() * 3 + 1);

        switch (tirada) {
            case 1:
                System.out.println("Piedra");
                break;
            case 2:
                System.out.println("Papel");
                break;
            case 3:
                System.out.println("Tijera");
                break;
            default:
                System.out.println("Tirada no valida");
                break;
        }
    }
}
