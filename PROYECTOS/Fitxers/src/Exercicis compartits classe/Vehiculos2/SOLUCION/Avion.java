package vehiculos2;

public class Avion  extends Aereo{

    private int tiempoMaxV;

      
    public Avion(String matricula, String model, int numeroSeients, int tiempoMaxV){
        super(matricula, model, numeroSeients);
        this.tiempoMaxV = tiempoMaxV;
    }
    
    @Override    
    public void imprimir(){
        super.imprimir();
        System.out.println("El tiempo maximo de vuelo es: " + gettiempoMaxV());
                            
    
    }
    
    public int gettiempoMaxV(){
        return tiempoMaxV;
    }  
    
}
