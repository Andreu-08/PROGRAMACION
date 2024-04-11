package Ejercici_InventariMascotes;
//clase abstracta Aves que hereda directamente de Mascota
public abstract class Aves  extends Mascota{

   protected String pico;
   protected boolean vuela;

    //constructor de la clase Aves heredando los atributos de Mascota
    public Aves(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela){
        super(nombre, edad,estado,fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }

    //metodo abstracto para volar que se implementara en cada ave
    public  abstract void volar();

    //metodo abstracto para hablar que se sobreescribe del metodo heredado de Mascota
    @Override
    public void habla(){
        System.out.println(nombre + " esta silbando");
    }
}
