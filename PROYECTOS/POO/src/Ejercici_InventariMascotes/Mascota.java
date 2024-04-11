package Ejercici_InventariMascotes;

/*clase mascota abstracta que se utilizara
sus atributos y metodos implementados para crear las otras clases
 */
public abstract class Mascota {
    //atributos de las mascotas
    protected String nombre;
    protected int edad;
    protected String estado;
    protected String fechaNacimiento;

    //constructor de la clase mascota
    public Mascota(String nombre, int edad, String estado, String fechaNacimiento){

        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    //metodo abstracto para indicar el tipo de mascota que sera en las otras clases
    public abstract String getTipo();

    /*metodo para imprimir los valores de la mascota por pantalla
    este metodo lo llamaremos desde aqui
     */
    public void muestra(){
        System.out.println("[Tipo: " + getTipo() +
                "] [Nombre: " + nombre + "] [Edad: " + edad +
                "] [Estado: " + estado + "] [Nacimiento: " + fechaNacimiento + "]");
    }

    //metodo para que se celebre el cumpleañós de la mascota
    public void cumpleaños(){
        edad++;
        System.out.println("Es el cumpleaños de " + nombre +
                ", ahora tiene " + edad);
    }
    //metodo para indicar que la mascota ha fallecido
    public void morir(){
        estado = "fallecido";
        System.out.println(nombre + " ha fallecido");
    }

    //metodo abstracto para que hable la mascota, cada una tendra su print
    public abstract void habla();

    //añadimos este getter ya que lo necesitaremos luego en el metodo mostrar llistaAnimals
    public String getNombre() {
        return nombre;
    }
}
