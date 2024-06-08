package vehiculos2;

public class Moto extends Terrestre {
    private String color;
      
     public Moto (String matricula, String model, int nRodes, String color)
    {
        super(matricula, model, nRodes);
        this.color = color;
    }
    
    // Getters / setters
    public String getColor()
    {
        return this.color;
    }

    /*public void setColor(String color)
    {
        this.color = color;
    }*/
        
    // Sobrescritura del método imprimir
    @Override
    public void imprimir()
    {
        super.imprimir();
        System.out.println("Moto de color " + this.getColor());               
    }
}
