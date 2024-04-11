package Ejercicio_Vehiculo_H;

public class Barco extends Acuatico{

    public Barco(String nombreVehiculo, String nombreAcuatico){
        super(nombreVehiculo, nombreAcuatico);
    }
    void prenderMotor(){
        System.out.println(nombreAcuatico + " prendio el motor");
    }
}
