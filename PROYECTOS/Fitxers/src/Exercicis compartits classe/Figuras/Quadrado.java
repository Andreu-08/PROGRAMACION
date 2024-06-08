public class Quadrado implements IFigura2D{
    private double ladosiguales;


    public Quadrado( double ladosiguales){

        this.ladosiguales=ladosiguales;

    }
    public double getLadosiguales(){

        perimetro=ladosiguales*4;
        area=ladosiguales*ladosiguales;


    }
    double perimetro, area;
    public double escala(double escala){
        if (escala>0)
            ladosiguales*= ladosiguales;
        return escala;
    }


    public double getPerimetro() {
        perimetro=ladosiguales*4;
        return perimetro;
    }

    public double getArea() {
        area=ladosiguales*2;
        return area;
    }
    public void imprimir(){
        System.out.println("El cuadrado tiene los lados de: "+getLadosiguales()+ ",un perimetro de: "+getPerimetro()+",un area de: "+getArea()+", y una escala de: "+escala());
    }

}
