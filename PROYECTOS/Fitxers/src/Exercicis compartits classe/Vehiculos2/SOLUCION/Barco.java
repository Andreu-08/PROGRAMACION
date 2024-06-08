package vehiculos2;

public class Barco extends Acuatico{
    private boolean motor;
    public String tieneMotor(){
        if(motor){
            return "Tiene motor";
        }
        else{
            return "No tiene motor";
        }
    }
    public Barco(String matricula, String modelo, int slora, boolean motor){
        super(matricula,modelo,slora);
        this.motor = motor;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.print(" - Motor: "+( motor ? "Con motor" : "Sin motor"));
        System.out.print(" - Motor: "+ tieneMotor()); //equivalente
    }
}










