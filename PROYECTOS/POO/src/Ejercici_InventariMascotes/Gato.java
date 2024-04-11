package Ejercici_InventariMascotes;

public class Gato extends Mascota{

    //atributos privados para gato, son privados ya que no habra mas subclases
    private String color;
    private boolean peloLargo;

    //constructor para Gato que hereda atributos de Mascota
    public Gato(String nombre, int edad, String estado, String fechaNacimiento, String color, boolean peloLargo){
        super(nombre,edad, estado, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    //metodo para obtener el tipo de mascota sobreescrito de la clase Mascota
    @Override
    public String getTipo(){
        return "Gato";
    }

   //metodo para mostrar la info del gato que se ampliara del metodo mascota
    public void muestra(){
        super.muestra();
        System.out.println("[Color: " + color + "], [Pelo largo: " + (peloLargo ? "SI]" : "NO]"));
    }

    //metodo habla sobrescrito de la clase Mascota
    @Override
    public void habla() {
        System.out.println(nombre + " esta maullando");
    }
}
