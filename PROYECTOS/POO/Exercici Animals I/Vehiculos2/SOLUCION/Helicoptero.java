package vehiculos2;


public class Helicoptero extends Aereo {
    private int numDeHelices;

    public Helicoptero(String matricula,String model,int numeroSeients,int numDeHelices){
    super(matricula, model,numeroSeients);
    this.numDeHelices = numDeHelices;
    }
    
     @Override
     public  void imprimir(){
         super.imprimir();
        System.out.println("El numero de helices es: " + getnumDeHelices());
    }

   
    public int getnumDeHelices(){
        return numDeHelices;
    }
}
