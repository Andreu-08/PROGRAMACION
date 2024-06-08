package appFigures;
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



    public double perimetre() {
        double perimetro;
        perimetro=(altura*2)+base;
        return perimetro;
    }

    public double area() {
        double area;
        area=(base*altura)/2;
        return area;
    }
    public void escalar(double escala){
        if (escala>0) {
            base *= escala;
            altura *= escala;
        }
        else
            System.out.println("ERROR: L'escala ha de ser major a 0.");
    }
    public void imprimir(){
        System.out.println("El triangulo tiene de base "+base+"y una altura de "+altura+" por lo cual tiene un perimetro de: "+perimetre()+",una area de: "+area());
    }


}



