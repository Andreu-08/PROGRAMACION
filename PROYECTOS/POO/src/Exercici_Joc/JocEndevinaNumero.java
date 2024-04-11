package Exercici_Joc;

import java.util.Scanner;

public class JocEndevinaNumero extends Joc implements IJugable {
    private int numeroAEndevinar;

    public JocEndevinaNumero(int vides, int numeroAEndevinar) {
        super(vides);
        this.numeroAEndevinar = numeroAEndevinar;
    }

    @Override
    public void jugar() {
        this.reiniciarPartida();
        Scanner scanner = new Scanner(System.in);
        int intent;
        boolean seguirJugant = true;

        while (seguirJugant && llevarVida()) {
            System.out.println("Endevina el número entre 0 i 10:");
            intent = scanner.nextInt();
            if (validarNumero(intent)) {
                if (intent == this.numeroAEndevinar) {
                    System.out.println("Has encertat!!");
                    Joc.actualitzarRecord(this.vides);
                    seguirJugant = false;
                } else {
                    System.out.println("Número incorrecte. " + (intent < numeroAEndevinar ? "El número és més gran." : "El número és més petit."));
                }
            } else {
                System.out.println("Número no vàlid. Torna-ho a intentar.");
            }
        }
    }

    @Override
    public void mostrarNom() {
        System.out.println("Endevina un número");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Intenta endevinar un número entre 0 i 10. Tens " + this.videsInicials + " vides.");
    }

    protected boolean validarNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }
}
