package vehiculos2;

import java.util.Scanner;

public class Acuatico extends Vehiculo {
    private final int slora;
    public Acuatico(String matricula, String modelo,int slora){
        super(matricula, modelo);
        matricula = validarMatricula(matricula);
        this.slora = slora;
    }

    public int getSlora() {
        return slora;
    }

    @Override
    public void imprimir(){
        System.out.println("Vehiculo de tipo acuático --> Matrícula: "+this.getMatricula()+
                " - Modelo: "+this.getModelo()+" - Eslora: "+getSlora());
    }

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

