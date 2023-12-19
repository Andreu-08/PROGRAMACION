package Pildoras_Informaticas;

public class Manipula_Cadenas3 {
    public static void main(String[] args) {

        String alumno1, alumno2;/*declaramos dos variables tipo string a la vez sin iniciarlas*/

        //iniciamos las dos variables
        alumno1 = "David";
        alumno2 = "David";

        //ejemplo del metodo equals para comparar cadenas de caracteres
        /*aqui estamos utilizando el metodo para comparar las variables alumno1
        y alumno2 para ver si son iguales (true) o diferentes (false)
        en este caso sera true porque son iguales
         */
        System.out.println(alumno1.equals(alumno2));
         /*si queremos que no ignore entre mayusculas y minusculas
         utilizaremos el metodo equalsIgnoreCase
          */
    }
}
