    public class Gato extends Animal{

    
    
    public void maullar(){
        System.out.print("Miau");
    }
    public static int edadG(int edadG){
        edadG = 12;
        return edadG;
    }
     public Gato(int edad, String nombre, String tipo_alimentacion, String pedigri) {
        super(edad, nombre, tipo_alimentacion);
        this.pedigri=pedigri;
    }
    private String pedigri;
}
