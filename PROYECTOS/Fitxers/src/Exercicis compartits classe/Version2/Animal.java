public class Animal {
    protected String nombre;
    protected String tipo_alimentacion;
    protected int edad;
    
    public Animal(int edad, String nombre,String tipo_alimentacion){
        this.edad = edad;
        this.nombre = nombre;
        this.tipo_alimentacion=tipo_alimentacion;

    }

    public String toString(){
        return "\nNombre: "+nombre+"\nTipo de alimentación: "+tipo_alimentacion+"\nEdad: "+edad;

    }

    public static void moverse(boolean camina){
        //boolean caminar = true;

        if(camina){
            System.out.println("Caminando");
        }
        else{
            System.out.println("Corriendo");
        }
    }

        
    public String compararEdad(Animal otroAnimal) {//sirve para comparar dos animales y da la diferencia de edad
        int codigo = Integer.compare(this.edad, otroAnimal.edad);
        String mensaje="";

        if (codigo < 0)
            mensaje= this.nombre +" es menor";
        else if ( codigo > 0)
            mensaje= otroAnimal.nombre +" es menor";
        else
            mensaje="Los dos animales tienen la misma edad";

        return mensaje;
    }
        
    public static void Comparador(int edadG, int edadC, int edadP){
        int Diferencia;
            if(edadG > edadP){
                Diferencia = edadG-edadP;
                System.out.println("El Gato es mayor que el perro por " + Diferencia + " años");
            }
            else if (edadP > edadG) {
                Diferencia = edadP-edadG;
                System.out.println("El perro es mayor que el Gato por " + Diferencia + " años");
            }
            else if(edadG > edadC) {
                Diferencia = edadG-edadC;
                System.out.println("El Gato es mayor que el Caballo por " + Diferencia + " años");
            }
            else if(edadC > edadG) {
                Diferencia = edadC-edadG;
                System.out.println("El Caballo es mayor que el Gato por " + Diferencia + " años");
             }
            else if (edadP > edadC) {
                Diferencia = edadP-edadC;
                System.out.println("El perro es mayor que el Caballo por " + Diferencia + " años");
            }
            else if (edadC > edadP) {
                Diferencia = edadC-edadP;
                System.out.println("El Caballo es mayor que el Perro por " + Diferencia + " años");
            }
            
            

        }



}