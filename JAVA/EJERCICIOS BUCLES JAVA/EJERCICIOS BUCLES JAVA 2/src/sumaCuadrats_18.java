public class sumaCuadrats_18 {
    public static void main(String[] args) {
       //bucle for
        //iniciem la variable suma en 0
        int suma = 0;
        //gastem el bucle for ya que sabem que es fins al numero 5
        for (int i = 1; i <= 5; i++){
            //calculem el cuadrat del numero actual del bucle y el sumem a la variable suma
            suma += i * i;
        }
        System.out.println("La suma dels cuadrats dels 5 primers numeros naturals es " + suma);


    }
}
