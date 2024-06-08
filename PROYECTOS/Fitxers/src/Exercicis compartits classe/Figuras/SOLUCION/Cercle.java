package appFigures;

public class Cercle implements IFigura2D{

    private double radio;

    public Cercle(int radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double perimetre(){

        double diametro = radio*2;
        return  diametro * Math.PI;
    }

    @Override
     public double area(){

        return Math.PI * Math.pow(radio,2);
    }

    @Override
    public void escalar(double escala){

        if (escala > 0) {
            radio *= escala;
        }
        else
            System.out.println("ERROR: L'escala ha de ser major a 0.");
    }

    @Override
    public void imprimir() {
        System.out.println("Cercle - Radi: " + getRadio() + ", Perímetre: " + perimetre() + ", Àrea: " + area());
    }
}
