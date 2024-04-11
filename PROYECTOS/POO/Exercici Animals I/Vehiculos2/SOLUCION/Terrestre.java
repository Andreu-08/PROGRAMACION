package vehiculos2;

public class Terrestre extends Vehiculo {
    private final int numRodes;

    public Terrestre(String matricula, String model, int nRodes)
    {
        super(matricula,model);
        if(matricula.matches("[0-9]{4}[a-zA-Z]{3}"))
            this.numRodes = nRodes;
        else 
        {
            this.numRodes = 0;
            System.out.println("ERROR: Matrícula no vàlida");
        }
    }
    
    public int getRodes()  
    {
        return numRodes;
    }

    // Sobreescritura del método abstracto
    @Override
    public void imprimir()
    {
        System.out.println("Vehículo terrestre --> Matrícula: " + this.getMatricula() + " - Modelo: " + this.getModelo() + " - Nº ruedas: " + this.getRodes()); //gets
    }
    
    
}
