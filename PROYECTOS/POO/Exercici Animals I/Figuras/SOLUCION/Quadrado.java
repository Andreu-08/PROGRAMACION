package appFigures;
public class Quadrado implements IFigura2D{
    private double lado;

    public Quadrado( double ladosiguales){

        this.lado=ladosiguales;

    }
    public double getLadosiguales(){
        double perimetro, area;
        perimetro=lado*4;
        area=lado*lado;
        return area;
    }

    public void escalar(double escala){
        if (escala>0)
            lado*= escala;
        else
            System.out.println("ERROR: L'escala ha de ser major a 0.");
    }


    public double perimetre() {
        double perimetro;
        perimetro=lado*4;
        return perimetro;
    }

    public double area() {
        double area;
        area=lado*lado;
        return area;
    }
    public void imprimir(){
        System.out.println("El cuadrado tiene los lados de: "+lado+ ",un perimetro de: "+perimetre()+",un area de: "+area());
    }

}
