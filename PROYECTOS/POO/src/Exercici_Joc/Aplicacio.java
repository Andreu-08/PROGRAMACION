package Exercici_Joc;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacio {
    public static void main(String[] args) {
        ArrayList<IJugable> jocs = new ArrayList<>();
        jocs.add(new JocEndevinaNumero(3, (int) (Math.random() * 10)));
        jocs.add(new JocEndevinaParell(3, 2 * (int) (Math.random() * 5)));
        jocs.add(new JocEndevinaImparell(3, 2 * (int) (Math.random() * 5) + 1));

        Scanner scanner = new Scanner(System.in);
        int eleccio;

        do {
            System.out.println("Tria un joc:");
            for (int i = 0; i < jocs.size(); i++) {
                jocs.get(i).mostrarNom();
            }
            System.out.println("Introdueix el número del joc (0-2):");
            eleccio = scanner.nextInt();

            if (eleccio >= 0 && eleccio < jocs.size()) {
                IJugable jocSeleccionat = jocs.get(eleccio);
                jocSeleccionat.mostrarInfo();
                jocSeleccionat.jugar();
            } else {
                System.out.println("Selecció no vàlida. Torna a intentar-ho.");
            }

            System.out.println("Vols jugar de nou? (sí = 1, no = qualsevol altre número):");
        } while (scanner.nextInt() == 1);
    }
}
