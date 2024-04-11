public class Caballo extends Animal{
    private int patas;
    public Caballo(int edad, String nombre, String tipo_alimentacion, int patas) {
        super(edad, nombre, tipo_alimentacion);
        this.patas=patas;
    }

    public String toString(){
        return super.toString()+"\nPatas: "+this.patas;
    }
    public void relinchar(){
        System.out.println("Hiiii");
    }

    public static int edadC(int edadC){//la edad siempre va a ser 25
        edadC = 25;
        return edadC;
    }


}