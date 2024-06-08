package Exercicis_Exepcions_8a10.Ej_8_9;

public class AppGat8 {
    public static void main(String[] args) {

        try {//comprovem la Excepcio per al nom de 3 lletres
            Gat g1 = new Gat("Andreu", 8);
            g1.imprimir();
            g1.setNom("Pi");
            g1.imprimir();//no funciona ya que salta a la excepcio
        }catch(Exception e) {
            System.err.println("Error: " + e);

        }

        //fem saltar la excepcio per a la edad en negatiu
        try{
            Gat g2 = new Gat("Paco", -2);
            g2.imprimir();
        }catch(Exception e) {
            System.err.println("Error: " + e);
        }
    }
}
