package Exercici_NumsRacionals;

public class ProvaRacional {

    public static void main(String[] args) {

        //construim dos objectes Racional
        Racional num1 = new Racional();
        Racional num2 = new Racional();

        //donem valor als numeros racionals utilitzant els metodes
        //num1
        num1.assignaNumerador(2);//asignem numerador
        num1.assignaDenominador(7);//assignem denominador
        //num2
        num2.assignaNumerador(3);
        num2.assignaDenominador(2);

        //imprimim els numero per pantalla utilizant el metode imprimir
        System.out.println("Numero 1: ");
        num1.imprimir();
        System.out.println("Numero 2: ");
        num2.imprimir();

        //sumamos los dos numeros y los imprimimos
        Racional resultadoSuma = num1.suma(num2);
        System.out.println("La suma de num1 + num2 es: ");
        resultadoSuma.imprimir();

        //restamos dos numeros y los imprimimos
        Racional resultadoResta = num1.resta(num2);
        System.out.println("La resta de num1 - num2 es: ");
        resultadoResta.imprimir();

        //multiplicamos dos numeros racionales y los imprimimos
        Racional producto = num1.producto(num2);
        System.out.println("El producto de num1 * num2 es: ");
        producto.imprimir();

        //dividimos dos numeros racionales y los imprimimos
        Racional division = num1.divisio(num2);
        System.out.println("La division de num1 / num2 es: ");
        division.imprimir();

        //comprobaciones de si son iguales o ejemplo iguales y ejemplo diferentes
        System.out.println();
        num1.esIgual(num2);//diferentes

        //cambiamos los valores para que sean iguales
        num1.assignaNumerador(2);
        num1.assignaDenominador(2);
        num2.assignaNumerador(2);
        num2.assignaDenominador(2);

        num1.esIgual(num2); //iguales

    }
}
