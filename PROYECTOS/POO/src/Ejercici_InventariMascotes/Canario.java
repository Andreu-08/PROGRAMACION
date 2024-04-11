package Ejercici_InventariMascotes;

public class Canario extends Aves{
    //atributos privados de la classe canario
    private String color;
    private boolean canta;

    //constructor de la clase canario
    public Canario(String nombre, int edad, String estado, String fechaNacimiento,String pico, boolean vuela, String color, boolean canta ){
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.color = color;
        this.canta = canta;
    }

    //metodo para indicar el tipo de animal sobreescrito de Mascota
    public String getTipo(){
        return "Canario";
    }

    //metodo para mostrar la info del canario ampliado con sus atributos
    public void muestra(){
        super.muestra();
        System.out.println("[Color: " + color +"], [Canta: " + (canta ? "SI]" : "NO]"));
    }

    //metodo para ver si el canario canta
    @Override
    public void habla(){
        if(canta) {
            System.out.println(nombre + " esta cantando");
        }else {
            System.out.println(nombre + " no puede cantar");
        }
    }

    //metodo para saber si esta volando
    public void volar() {
        if(vuela) {
            System.out.println(nombre + " esta volando");
        }else {
            System.out.println(nombre + " no esta volando");
        }
    }
}
