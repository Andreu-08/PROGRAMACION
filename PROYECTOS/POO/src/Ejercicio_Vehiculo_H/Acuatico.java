package Ejercicio_Vehiculo_H;

public class Acuatico extends Vehiculo{

    protected String nombreAcuatico;

    public Acuatico(String nombreVehiculo, String nombreAcuatico){

       super(nombreVehiculo);
       this.nombreAcuatico = nombreAcuatico;
    }

    public static void navegar( int millas){
        System.out.println("El barco ha recorrido " + millas);

    }


}
