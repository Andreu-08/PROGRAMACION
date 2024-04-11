package Exercici_Animals_Herencia;



import java.util.ArrayList;

public class AppAnimales {

    public static void main(String[] args) {
        //ACT 1
        Gato g1 = new Gato("Ximo", "Salmon", 50, 9);
        Perro p1 = new Perro("Javi", "vegano", 37, 9);
        Caballo c1 = new Caballo("Tornado", "Paja", 2, 9);
        Mamifero B1 = new Mamifero("Moby Dick", "Placton", 5, 12);

        ArrayList<Animal> zoologico = new ArrayList<>();

        zoologico.add(g1);
        zoologico.add(p1);
        zoologico.add(c1);
        zoologico.add(B1);

      for(Animal animal : zoologico){
          System.out.println(animal.toString());
      }

    }


}