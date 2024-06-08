package Programacion.Java.animalicos;
    public class Gato extends Animal{
        static public String pedigri = "没错，你说对了，我知道了";
        static public int edad = 7;
        static public String nombre = "Pituña";
        static public String tipo_alimentacion = "Variado";
     public Gato(int edad, String nombre, String tipo_alimentacion, String pedigri) {
         super(edad, nombre, tipo_alimentacion);
         this.edad = edad;
         this.nombre = nombre;
         this.tipo_alimentacion = tipo_alimentacion;
         this.pedigri = pedigri;
     }
}
