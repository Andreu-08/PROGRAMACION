package vehiculos2;

import java.util.Scanner;

public abstract class Acuatico extends Vehiculo {
    final private int slora;
    public Acuatico(String matricula, String modelo,int slora){
        super(matricula, modelo);
        matricula = validarMatricula(matricula);
        this.slora = slora;
    }
    @Override
    public abstract void imprimir();

    private String validarMatricula(String matricula) {
        Scanner scanner = new Scanner(System.in);
        boolean valido;
        do {
            valido = (matricula.length() >= 3 && matricula.length() <= 10);
            if (!valido) {
                System.out.println("Escribe una matricula valida");
                matricula = scanner.next();
            }
        } while (!valido);
        return matricula;
    }
}

