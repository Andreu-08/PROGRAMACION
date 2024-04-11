public class Triangulo implements IFigura2D{

    private double base, altura;


    public Triangulo(double base, double altura){
    //super(perimetro, area, escala, imprimir);
    this.base=base;
    this.altura=altura;



    }

    public double getAltura() {


        return altura;
    }

    public double getBase() {
        return base;
    }

    double perimetro, area, escala;


    public double getPerimetro() {
        perimetro=(altura*2)+base;
        return perimetro;
    }

    public double getArea() {
        area=(base*altura)/2;
        return area;
    }
    public double escala(double escala){
        if (escala>0)
            ladosiguales*= ladosiguales;
        return escala;
    }
    public void imprimir(){
        System.out.println("El triangulo tiene de base "+base+"y una altura de "+altura+" por lo cual tiene un perimetro de: "+getPerimetro()+",una area de: "+getArea()+", y una escala de: "+escala);
    }


}



