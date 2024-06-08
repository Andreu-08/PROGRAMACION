package vehiculos2;

public class Barco extends Acuatico{
    static boolean motor;
    public void setMotor(){
        if(motor){
            System.out.println("Tiene motor");
        }
        else{
            System.out.println("No tiene motor");
        }
    }
    public Barco(String matricula, String modelo, int slora, boolean motor){
        super(matricula,modelo,slora);
        this.motor = motor;
    }

    @Override
    public void imprimir() {

    }
}