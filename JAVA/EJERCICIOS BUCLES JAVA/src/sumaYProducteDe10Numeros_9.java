public class sumaYProducteDe10Numeros_9 {
    public static void main(String[] args) {

        int suma = 0; //iniciem la variable suma en 0
        int producte = 1; //iniciem la variable multplicacio en 1 per a no multiplicar per 0

        //escribim un bucle for per a que es repetixca 10 voltes
        for (int i = 1; i <= 10; i++) {
            suma = suma + i; //se suma el numero actual a la suma
            producte = producte * i; //se multiplica el numero actual per el producte
        }
        System.out.println("La suma dels 10 primers numeros naturals es " + suma);
        System.out.println("El producte dels 10 primers numeros naturals es " + producte);
    }
}
