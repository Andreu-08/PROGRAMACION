package exerciciejemplo_banco;

public class cliente {

    //ATRIBUTOS
    private String nombre;
    private double monto;

    //CONSTRUCTOR
    public cliente (String nombreC){

        this.nombre = nombreC;
        this.monto = 0.0;
    }

    //GETTERS
    public String getNombre(){
        return this.nombre;
    }

    public double getMonto(){

        return this.monto;
    }
    //SETTERS
    /*(setnombre no tiene sentico querer
     cambiarle el nombre al cliente asi que no tendra setter)
     las cantidades variaran con los metodos no hara falta llamar al monto*/

    //METODOS

    public void depositar (double cantidad){

        this.monto += cantidad;

    }

    public void extraer(double cantidad){
        this.monto -= cantidad;
    }

    public void imprimir(){
        System.out.println(this.nombre + " tiene depositadad la suma de " + this.getMonto());
    }




}
