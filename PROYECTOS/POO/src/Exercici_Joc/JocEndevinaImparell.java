package Exercici_Joc;

public class JocEndevinaImparell extends JocEndevinaNumero {
    public JocEndevinaImparell(int vides, int numeroAEndevinar) {
        super(vides, numeroAEndevinar);
    }

    @Override
    public void mostrarNom() {
        System.out.println("Endevina un nombre imparell");
    }

    @Override
    protected boolean validarNumero(int numero) {
        if (numero % 2 == 0) {
            System.out.println("El número no és imparell. Intenta de nou.");
            return false;
        }
        return super.validarNumero(numero);
    }
}
