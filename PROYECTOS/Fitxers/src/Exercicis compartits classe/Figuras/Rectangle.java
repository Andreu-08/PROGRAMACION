package figuras;

public class Rectangle implements IFugura2D {

    private double ample;
    private double alt;

    public Rectangulo(double ample, double alt) {
        this.ample = ample;
        this.alt = alt;
    }
    public double getAlt() {
        return alt;
    }

    public double getAmple() {
        return ample;
    }

    @Override
    public double perimetre() {
        return 2 * (ample + alt);
    }

    @Override
    public double area() {
        return ample * alt;
    }

    @Override
    public void escalar(double escala) {
        if (escala > 0) {
            ample *= escala;
            alt *= escala;
        }
    }

    @Override
    public void imprimir() {
        System.out.println("Rectangle - Ample: " + getAmple() + ", Alt: " + getAlt() + ", Perímetre: " + perimetre() + ", Àrea: " + area());
    }

}

