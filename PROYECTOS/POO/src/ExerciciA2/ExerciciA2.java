package ExerciciA2;
import java.util.*;
public class ExerciciA2 {

    public static void main(String[] args) {

        Persona persona1 = new Persona("18999548P", "José", "Serrano Márquez", 25);
        Persona persona2 = new Persona("20222444L", "María", "Carcelén Sánchez", 17);

        String cadena1 = persona1.getNom() + " " + persona1.getCognoms() + " amb DNI " + persona1.getDni();
        String cadena2 = persona2.getNom() + " " + persona2.getCognoms() + " amb DNI " + persona2.getDni();

        if (persona1.getEdat() >= 18) {
            cadena1 += " és major d'edat";
        } else {
            cadena1 += " no és major d'edat";
        }

        if (persona2.getEdat() >= 18) {
            cadena2 += " és major d'edat";
        } else {
            cadena2 += " no és major d'edat";
        }

        System.out.println(cadena1);
        System.out.println(cadena2);
        System.out.println("");

        persona1.setNom("Juan");
        persona1.setEdat(11);
        persona2.setNom("Carmen");
        persona2.setEdat(33);

        cadena1 = persona1.getNom() + " " + persona1.getCognoms() + " amb DNI " + persona1.getDni();
        cadena2 = persona2.getNom() + " " + persona2.getCognoms() + " amb DNI " + persona2.getDni();

        if (persona1.getEdat() >= 18) {
            cadena1 += " és major d'edat";
        } else {
            cadena1 += " no és major d'edat";
        }

        if (persona2.getEdat() >= 18) {
            cadena2 += " és major d'edat";
        } else {
            cadena2 += " no és major d'edat";
        }

        System.out.println(cadena1);
        System.out.println(cadena2);
    }
}
