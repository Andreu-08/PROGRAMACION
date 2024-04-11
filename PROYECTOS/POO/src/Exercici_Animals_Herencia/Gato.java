package Exercici_Animals_Herencia;

public class Gato extends Mamifero{

    protected String raza;


    public Gato(String nombre, String tipo_alimentacion, int edad, int gestacion) {
        super(nombre, tipo_alimentacion, edad, gestacion);
    }
}
