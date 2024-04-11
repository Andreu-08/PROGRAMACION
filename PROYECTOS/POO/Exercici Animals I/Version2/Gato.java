    public class Gato extends Animal{

    private String pedigri;

    public Gato(int edad, String nombre, String tipo_alimentacion, String pedigri) {
        super(edad, nombre, tipo_alimentacion);
        this.pedigri=pedigri;
    }

    public String toString(){
        return super.toString()+"\nPedigrí: "+this.pedigri;
    }
    
    public void maullar(){
        System.out.println("Miau");
    }

    public void cazarratones(boolean esCazador) {//esto deberia ser solo del gato
        //boolean cazar = true;
        if (esCazador) {
                System.out.println("Caza ratones");
            } else {
                System.out.println("Pacifista");
            }
    }

    public static int edadG(int edadG){
        edadG = 12;
        return edadG;
    }


}
