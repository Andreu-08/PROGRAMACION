package Programacion.Java.animalicos;

    public class Perro extends Animal{
        static public String raza = "サンチェス犬";
        static public int edad = 0;
        static public String nombre = "Chispa";
        static public String tipo_alimentacion = "Variado";
    public Perro(int edad, String nombre, String tipo_alimentacion, String raza) {
        super(edad, nombre, tipo_alimentacion);
        this.edad = edad;
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.raza = raza;
    }
}
