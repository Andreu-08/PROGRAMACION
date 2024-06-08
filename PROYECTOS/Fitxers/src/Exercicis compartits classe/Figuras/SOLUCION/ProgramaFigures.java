package appFigures;

import java.util.ArrayList;

public class ProgramaFigures {
    public static void main(String[] args) {
        ArrayList<IFigura2D> figures = new ArrayList<IFigura2D>();
        Cercle cercle = new Cercle(3);
        Quadrado quadrat = new Quadrado(4);
        Rectangle rectangle = new Rectangle(5, 8);
        Triangulo triangle = new Triangulo(7, 4);

        figures.add(cercle);
        figures.add(quadrat);
        figures.add(rectangle);
        figures.add(triangle);

        imprimirLista(figures);
        escalarLista(figures, 2);
        imprimirLista(figures);
        escalarLista(figures, 0.1);
        imprimirLista(figures);

    }

    private static void escalarLista(ArrayList<IFigura2D> figures, double escala) {
        for (IFigura2D figura2D : figures){
            figura2D.escalar(escala);
        }
    }

    private static void imprimirLista(ArrayList<IFigura2D> figures) {
        for (IFigura2D figura2D : figures) {
            figura2D.imprimir();
        }
    }
}