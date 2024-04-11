package Exercici_Joc;

public class JocEndevinaParell extends JocEndevinaNumero {
    public JocEndevinaParell(int vides, int numeroAEndevinar) {
        super(vides, numeroAEndevinar);
    }

    @Override
    public void mostrarNom() {
        System.out.println("Endevina un nombre parell");
    }

    @Override
    protected boolean validarNumero(int numero) {
        if (numero % 2 != 0) {
            System.out.println("El número no és parell. Intenta de nou.");
            return false;
        }
        return super.validarNumero(numero);
    }
}
