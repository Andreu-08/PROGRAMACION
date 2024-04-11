package vehiculos2;

public class Coche extends Terrestre{
    private boolean aa;

    public Coche (String matricula, String model, int nRodes, boolean teAA)
    {
        super(matricula, model, nRodes);
        this.aa = teAA;
    }
    
    // Getters / setters
    public boolean getAA()
    {
        return this.aa;
    }
        
    /*public void setAA(boolean teAA)
    {
        this.aa = teAA;
    }*/
    
    // Sobrescritura del método imprimir
    @Override
    public void imprimir()
    {
        super.imprimir();
        if(this.aa)
        {
            System.out.println("Cotxe amb aire accondicionat");
        }
        else
        {
            System.out.println("Cotxe sense aire acondicionat");
        }         
    }  
    
}
