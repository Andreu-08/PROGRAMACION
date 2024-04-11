package Exercici_Animals_Herencia;

public class Mamifero extends Animal{
    protected int gestacion;
    String raza;
    public Mamifero(String nombre, String tipo_alimentacion, int edad, int gestacion) {
        super(nombre, tipo_alimentacion, edad);
        this.gestacion = gestacion;

    }
    public String toString(){
        return super.toString() + "\nGestacion: " + gestacion;
    }

}
