package Exercici_NumsRacionals;

public class Racional {

    //Creamos los atributos del objeto 'Racional'
    private int nume;
    private int denom;

    /* Creamos el constructor del objeto racional, esta vacio
    ya que asignaremos con metodos los numeros para el numerador y el
    denominador
     */
    public Racional(){
    }

    //metodo 1 que asignar el valor del numerador
    public void assignaNumerador (int x){
        this.nume = x;
    }

    //metodo 2 para asignar el valor del denominador
    public void assignaDenominador(int i){
        //utilizamos un if para mostrar un error si el denominador es 0
        if (i != 0){
            this.denom = i;
        } else{
            System.err.println("Error: El denominador no puede ser 0");
        }
    }

    //metodo 3 para imprimir el numero racional
    public void imprimir(){
        System.out.println(nume + "/" + denom);
    }

    /*vamos a implementar dos numeros auxiliares para poder calcular
    el mcm (min comun multiplo) y el mcd (maximo comun divisor) y
    asi poder realizar las operaciones siguientes mas facilmente
     */
    private int mcd (int a, int b){
        while (b != 0){
            int resto = b;

            b = a % b;
            a = resto;
        }
        return a; //maximo comun divisor
    }

    private int mcm (int a, int b){
        return (a * b) / mcd(a,b); //minimo comun multiple
    }

    //metodo 4 para sumar dos numeros racionales
    public Racional suma(Racional r){
        //objeto que crearemos como resultado de la suma
        Racional resultadoSuma  = new Racional();
        //sacamos el mim comun denominador de los objetos a sumar
        int comunDenom = mcm(this.denom, r.denom);
        //sacamos los nuevos numeradores acorde al denominador
        int nume1 = this.nume * (comunDenom / this.denom);
        int nume2 = r.nume * (comunDenom / r.denom);
        //sumamos los numeradores
        int sumaNume = nume1 + nume2;
        //asignamos el resultado al resultado de la suma
        resultadoSuma.assignaNumerador(sumaNume);
        resultadoSuma.assignaDenominador(comunDenom);
        //devolvemos el resultado de la suma
        return resultadoSuma;
    }

    //metodo 5 para restar numeros racionales
    public Racional resta(Racional r){
        Racional resultadoResta = new Racional();
        int comunDenom = mcm(this.denom, r.denom);

        int nume1 = this.nume * (comunDenom / this.denom);
        int nume2 = r.nume * (comunDenom / r.denom);

        int restaNume = nume1 - nume2;

        resultadoResta.assignaNumerador(restaNume);
        resultadoResta.assignaDenominador(comunDenom);

        return resultadoResta;
    }

    //metodo 6 per a multiplicar numeros racionales
    public Racional producto(Racional r){

        Racional resultadoProducto = new Racional();
        /*aqui calculamos el nuevo numerado y denominador
        multiplicando el de cada objeto racional
         */
        int nuevoNume = this.nume * r.nume;
        int nuevoDenom = this.denom * r.denom;

        //damos valores al numero racional que vamos retornar
        resultadoProducto.assignaNumerador(nuevoNume);
        resultadoProducto.assignaDenominador(nuevoDenom);

        //devolvemos el resultado de la multiplicacion
        return resultadoProducto;
    }

    //Metodo 6 para dividir nuemros racionales
    public Racional divisio(Racional r){
        Racional resultadoDivision = new Racional();
        /*se multiplican los numeradores y denominadores de forma cruzada*/
        int nuevoNume = this.nume * r.denom;
        int nuevoDenom = this.denom * r.nume;

        resultadoDivision.assignaNumerador(nuevoNume);
        resultadoDivision.assignaDenominador(nuevoDenom);

        return resultadoDivision;
    }

    //Metodo 7 para comprobar si dos numeros racionales son iguales o no

    public boolean esIgual(Racional r){

        //comprobacion de si son iguales para devolver true
        boolean iguales = this.nume == r.nume && this.denom == r.denom;
        //if para mostrar el mensaje en cada caso
        if(iguales){
            System.out.println("Los números racionales " + this.nume + "/" + this.denom + " y " + r.nume + "/" + r.denom + " son iguales.");
        }else{
            System.out.println("Los números racionales " + this.nume + "/" + this.denom + " y " + r.nume + "/" + r.denom + " no son iguales.");
        }
        return iguales;
    }


}
