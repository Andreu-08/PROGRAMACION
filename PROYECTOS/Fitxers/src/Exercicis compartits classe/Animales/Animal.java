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

    public static void main() {
        Perro.main();
        Gato.main();
        Caballo.main();
    }
    public static void moverse(){
        boolean caminar = true;

        if(caminar){
            System.out.println("Caminando");
        }
        else{
            System.out.println("Corriendo");
        }
    }
    public static void cazarratones(){//esto deberia ser solo del gato
        boolean cazar = true;

        if(caminar){
            System.out.println("Caza ratones");
        }
        else{
            System.out.println("Pacifista");
        }

        
        public int compararEdad(Animal otroAnimal) {//sirve para comparar dos animales y da la diferencia de edad 
        return Integer.compare(this.edad, otroAnimal.edad);
        } 
        
        public static void Comparador(){
            if(edadG > edadP){
                Diferencia = edadG-edadP;
                System.out.println("El Gato es mayor que el perro por " + Diferencia + " años")
            }
            else(edadP > edadG) {
                Diferencia = edadP-edadG;
                System.out.println("El perro es mayor que el Gato por " + Diferencia + " años")
            }
            else(edadG > edadC) {
                Diferencia = edadG-edadC;
                System.out.println("El Gato es mayor que el Caballo por " + Diferencia + " años")
            }
            else(edadC > edadG) {
                Diferencia = edadC-edadG;
                System.out.println("El Caballo es mayor que el Gato por " + Diferencia + " años")
            }
            else(edadP > edadC) {
                Diferencia = edadP-edadC;
                System.out.println("El perro es mayor que el Caballo por " + Diferencia + " años")
            }
            else(edadC > edadP) {
                Diferencia = edadC-edadP;
                System.out.println("El Caballo es mayor que el Perro por " + Diferencia + " años")
            }
            
            

        }
    }

}