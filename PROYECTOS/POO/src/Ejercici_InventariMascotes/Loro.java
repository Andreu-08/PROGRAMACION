package Ejercici_InventariMascotes;

public class Loro extends Aves{
    //metodos privados de la clase Loro que no tiene mas subclases
    private String origen;
    private boolean habla;

    //constructor de la clase loro que erada atributos de ave y mascota (que ya los tiene ave)
    public Loro(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela, String origen, boolean habla){
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

    //metodo para obtrener el tipo de mascota sobreeescrito
    @Override
    public String getTipo(){
        return "Loro";
    }

    //metodo muestra ampliaco de su superclase

    @Override
    public void muestra() {
        super.muestra();
        System.out.println("[Origen: " + origen + "], [Puede hablar: " + (habla ? "SI]" : "NO]"));
   }

   //metodo para saludar en el caso de que hable
    public void saluda() {
        if(habla){
            System.out.println("Hola");
        }else{
            System.out.println("No saluda porque no sabe hablar");
        }
    }

    //metodo para saber si el loro vuela sobreeescrito de su superclase
    @Override
    public void volar(){
        if(vuela) {
            System.out.println(nombre + " esta volando");
        }else{
            System.out.println(nombre + " no esta volando");
        }
    }

    //metodo habla sobreescrito de la superclase principal mascota
    @Override
    public void habla(){
        if(habla){
            System.out.println("El loro puede hablar");
        }else{
            System.out.println("El loro no sabe hablar");
        }
    }
}
