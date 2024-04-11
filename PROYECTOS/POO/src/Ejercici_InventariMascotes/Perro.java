package Ejercici_InventariMascotes;

public class Perro extends Mascota {

    //atributos de la clase perro esta vez privados ya que no habra mas subclases apartir de Perro
    private String raza;
    private boolean pulgas;

    //constructor de la clase Perro con los atributos heredados de Mascota
    public Perro(String nombre, int edad, String estado, String fechaNacieminto, String raza, boolean pulgas){
        super(nombre, edad, estado, fechaNacieminto);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    //metodo para obtener que tipo de mascota es sobrescribiendo el metodo de mascota
    @Override
    public String getTipo(){
        return "Perro";
    }

    //metodo privado de esta clase para saber si el perro tiene puglas o no


    /*metodo para mostrar la info del perroo que en este caso no sobreescribe el metodo,
    lo llama desde Mascota y lo amplia
     */
    @Override
    public void muestra() {
        //se muestra el mensaje incluido en mascota
        super.muestra();
        //se amplia con la informacion del perro
        System.out.println("[Raza: " + raza + "], [Pulgas: " +  (pulgas ? "SI]" : "NO]"));
    }

    //metodo hablar para perro sobreescrito de mascota
    @Override
    public void habla() {
        System.out.println(nombre + " esta ladrando");
    }



}
