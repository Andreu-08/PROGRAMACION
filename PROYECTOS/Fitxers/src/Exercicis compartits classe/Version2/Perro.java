   
   public class Perro extends Animal{

       private String raza;

       public Perro(int edad, String nombre, String tipo_alimentacion, String raza) {
           super(edad, nombre, tipo_alimentacion);
           this.raza = raza;
       }

       public String toString(){
           return super.toString()+"\nRaza: "+this.raza;
       }
   
        public void ladrar(){
            System.out.println("Guau");
        }
    public static int edadP(int edadP){
        edadP = 18;
        return edadP;
    }

}
