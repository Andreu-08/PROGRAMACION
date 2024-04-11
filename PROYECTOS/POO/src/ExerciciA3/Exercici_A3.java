package ExerciciA3;

import ExerciciA3.Rectangle;

public class Exercici_A3 {

    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle(0, 0, 5, 5);
        Rectangle rec2 = new Rectangle(7, 9, 2, 3);

        System.out.println("Cooordenades del rectangle 1 (" + rec1.getX1() + "," + rec1.getY1() + ") i (" + rec1.getX2() + "," + rec1.getY2() + ")");
        System.out.println("Cooordenades del rectangle 2 (" + rec2.getX1() + "," + rec2.getY1() + ") i (" + rec2.getX2() + "," + rec2.getY2() + ")");
        System.out.println("El perímetre del rectangle 1 es: " + perimetre(rec1));
        System.out.println("El perímetre del rectangle 2 es: " + perimetre(rec2));
        System.out.println("L'àrea del rectangle 1 es: " + area(rec1));
        System.out.println("L'àrea del rectangle 2 es: " + area(rec2));
        System.out.println("");

        rec1.setX1(10);
        rec1.setX2(3);

        rec2.setY1(12);
        rec2.setY2(5);

        System.out.println("Cooordenades del rectangle 1 (" + rec1.getX1() + "," + rec1.getY1() + ") i (" + rec1.getX2() + "," + rec1.getY2() + ")");
        System.out.println("Cooordenades del rectangle 2 (" + rec2.getX1() + "," + rec2.getY1() + ") i (" + rec2.getX2() + "," + rec2.getY2() + ")");
        System.out.println("El perímetre del rectangle 1 es: " + perimetre(rec1));
        System.out.println("El perímetre del rectangle 2 es: " + perimetre(rec2));
        System.out.println("L'àrea del rectangle 1 es: " + area(rec1));
        System.out.println("L'àrea del rectangle 2 es: " + area(rec2));
        System.out.println("");

    }

    public static double perimetre(Rectangle rect) {
        int lado1 = Math.abs(rect.getX1() - rect.getX2());
        int lado2 = Math.abs(rect.getY1() - rect.getY2());

        return (lado1 + lado2) * 2;
    }

    public static double area(Rectangle rect) {
        int lado1 = Math.abs(rect.getX1() - rect.getX2());
        int lado2 = Math.abs(rect.getY1() - rect.getY2());

        return lado1 * lado2;
    }

}
