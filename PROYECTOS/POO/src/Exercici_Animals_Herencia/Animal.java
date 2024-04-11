package Exercici_Animals_Herencia;

public class Animal {
        protected String nombre;
        protected String tipo_alimentacion;
        protected int edad;

        public String toString(){
            return "\nNombre: " + nombre +
                    "\nTipo de alimentacion: " +
                    tipo_alimentacion + "\nEdad: " +
                    edad;
        }

        public Animal (String nombre, String tipo_alimentacion, int edad){
                this.nombre = nombre;
                this.edad = edad;
                this.tipo_alimentacion = tipo_alimentacion;
        }

        public void Correr(){
                System.out.println("Esta corriendo");
        }
}
