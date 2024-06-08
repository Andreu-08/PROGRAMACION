package Exercicis_Exepcions_8a10.EJ_10.Exceptions;
//clase que hereda de la clase Exeption de Java per a manejar exceptions
public class FonsInsuficients extends Exception{
    //clase y metode per a manejar la excepcio
    public FonsInsuficients(String mensaje){
        super(mensaje);//el mensaje se pasara desde el constructor on volem crear la exepcio
    }
}
