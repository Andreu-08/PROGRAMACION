public class AppAnimales {
    public static void main(String[] args) {
        //ACT 1
        Gato g1 = new Gato(21, "a","pescado", "rechulon");
        Perro p1 = new Perro(12, "uwu", "carne","culon" );
        Caballo c1 = new Caballo(43, "cgf", "manzanas", 8);

        g1.maullar();
        p1.ladrar();
        c1.relinchar();;

        Animal.moverse(true);

        System.out.println(g1);
        System.out.println(p1);
        System.out.println(c1);

        System.out.println("\nComparación de edades:");
        System.out.println("Edad de gato vs. Edad de perro: " + g1.compararEdad(p1));
        System.out.println("Edad de perro vs. Edad de caballo: " + p1.compararEdad(c1));
    }
}