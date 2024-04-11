package Exercici_Animals_Herencia;

public class Perro extends Mamifero{

    public Perro(String nombre, String tipo_alimentacion, int edad, int gestacion) {
        super(nombre, tipo_alimentacion, edad, gestacion);
    }


    public void Correr(){
        System.out.println("Perro");
        super.Correr();
    }
}
