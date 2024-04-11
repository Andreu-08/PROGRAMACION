package ExerciciA1;

public class ExerciciA1 {
    public static void main(String[] args) {

        Punt P1 = new Punt(5,0);

        Punt P2 = new Punt(10,10);

        Punt P3= new Punt(-3,7);

        /*utilizem el .set.. per a modificar el valor del atribut en este cas
        del objecte P1*/
        P1.setX(10); P1.setY(8);

        //utilizem el .get... per a cridadar al atribut que necesitem
        /*System.out.println("(" + P1.getX() + ")" +"(" + P1.getY() + ")");
        System.out.println("(" + P2.getX() + ")" +"(" + P2.getY() + ")");
        System.out.println("(" + P3.getX() + ")" +"(" + P3.getY() + ")");*/

        P1.imprimir();

        P1.setXY(4, 4);

        P2.setXY(2,2);

        System.out.println(P1.distancia(P2));
    }
}
