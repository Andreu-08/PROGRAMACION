package Ejercici_InventariMascotes;

public class ProgramaInventari {
    public static void main(String args[]) {
    // Creem unas quantes mascotes
        Perro p1 = new Perro("Bobby", 5, "jugando", "Feb-2018", "Pastor alemán",
                false);
        Perro p2 = new Perro("Lulu", 7, "durmiendo", "Abril-2016", "Rottweiler",
                false);
        Gato g1 = new Gato("Luna", 2, "durmiendo", "Sept-2020", "negro", false);
        Gato g2 = new Gato("Pecas", 2, "rascandose", "Julio-2019", "blanco", true);
        Loro l1 = new Loro("Arturito", 10, "hablando", "Enero-2015", "largo", true,
                "Murcia", true);
        Canario c1 = new Canario("Basilio", 5, "piando", "Dic-2018", "corto", true,
                "amarillo", true);
    // Creem inventari
        Inventari inventari = new Inventari();
    // Afegim mascotes a l’inventari
        inventari.inserirAnimal(p1);
        inventari.inserirAnimal(p2);
        inventari.inserirAnimal(g1);
        inventari.inserirAnimal(g2);
        inventari.inserirAnimal(l1);
        inventari.inserirAnimal(c1);
    // Mostrem llista d’animals
        inventari.mostrarLlistaAnimals();
        System.out.println("");
    // Mostrem tots els animals
        inventari.mostrarTotsAnimals();
    // Eliminem un parell de mascotes
        inventari.eliminarAnimal(1);
        inventari.eliminarAnimal(2);
    // Mostrem llista d’animals
        inventari.mostrarLlistaAnimals();
        System.out.println("");
    }
}
