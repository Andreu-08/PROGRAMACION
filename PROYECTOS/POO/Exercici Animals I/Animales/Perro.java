   
   public class Perro extends Animal{

       protected raza;

       public Perro ( String nombre, String tipo_alimentacion, int edad, String raza){

           super(nombre, tipo_alimentacion, edad);
           this.raza = raza;
       }
   
    public static void ladrar(){
        System.out.print("Guau");
    }
    public static int edadP(int edadP){
        edadP = 18;
        return edadP;
    }
    public Perro(int edad, String nombre, String tipo_alimentacion, String raza) {
        super(edad, nombre, tipo_alimentacion);
        this.raza = raza;
    }
    private String raza;
}
