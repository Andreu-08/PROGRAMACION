package Ejercici_InventariMascotes;

import java.util.ArrayList;

public class Inventari {
    //Arraylist para almacenar las mascotas
    private ArrayList <Mascota> animales = new ArrayList<>();

    // Método para obtener el tipo de mascota utilizando instaceof
    private String getTipusMascota(Mascota m) {
        if (m instanceof Perro) {
            return "Perro";
        } else if (m instanceof Gato) {
            return "Gato";
        } else if (m instanceof Loro) {
            return "Loro";
        } else if (m instanceof Canario) {
            return "Canario";
        } else {
            return "Mascota desconocida";
        }
    }

    //metodo para mostrar la lista de animales
    public void mostrarLlistaAnimals() {
        System.out.println("Lista de animales en el inventario:");
        for (Mascota mascota : animales) {
            System.out.println(getTipusMascota(mascota) + ": " + mascota.getNombre());
        }
    }
    public void mostrarUnAnimal(int index) {
        if (index >= 0 && index < animales.size()) {
            System.out.println("Animal en la posición " + index + ":");
            animales.get(index).muestra();
        } else {
            System.out.println("No se pudo encontrar el animal");
        }
    }

    //metodo para mostrar todas la info de  animales
    public void mostrarTotsAnimals() {
        System.out.println("Información de todos los animales en el inventario:");
        for (Mascota mascota : animales) {
            mascota.muestra();
        }
    }

    //metodo apra añadir una mascota al inventario
    public void inserirAnimal(Mascota a){
        animales.add(a);
        System.out.println(a.getNombre() + " añadido al inventario");
    }

    //metodo para eliminar un animal de la lista
    public boolean eliminarAnimal(int index) {
        if (index >= 0 && index < animales.size()) {
            Mascota mascotaEliminada = animales.remove(index);
            System.out.println("Mascota eliminada del inventario: " + mascotaEliminada.getNombre());
            return true;
        } else {
            System.out.println("No se pudo eliminar la mascota.");
            return false;
        }
    }

    //metodo para vaciar el inventario
    public void buidarInventari() {
        animales.clear();
        System.out.println("Se ha vaciado el inventario.");
    }
}
