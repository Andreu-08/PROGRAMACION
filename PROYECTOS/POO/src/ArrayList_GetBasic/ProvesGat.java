package ArrayList_GetBasic;

import java.util.ArrayList;

public class ProvesGat {
    public static void main(String[] args) {
        //declaramos  el ArrayList donde almacenaremos varios gatos
        ArrayList<GatBasic> gatos = new ArrayList<>();

        //creamos algunos objetos gatos para rellenar el arraylist

        GatBasic gato1 = new GatBasic("Negro", "Persa", 3, "macho", 5.0);
        GatBasic gato2 = new GatBasic("Blanco", "Siames", 8, "macho", 10.0);
        GatBasic gato3 = new GatBasic("Marron", "Persa", 1, "hembra", 2.0);
        GatBasic gato4 = new GatBasic("Gris", "Birmano", 4, "hembra", 7.0);

        //rellenamos el ArrayList con los gatos que hemos creado
        gatos.add(gato1);
        gatos.add(gato2);
        gatos.add(gato3);
        gatos.add(gato4);

        //METODOS DE LA CLASSE ARRAYLIST
        //metodo size()
        gato4.miolar();
        //utilizamos este metodo para contar la cantidad de elementos que contiene el arraylist
        int cantidadGatos = gatos.size();
        System.out.println("La cantidad de gatos de la lista es: " + cantidadGatos);

        //metodo add(x)
        //este metodo se utiliza para añadir un nuevo elemento al final del arrayList
        GatBasic gato5 = new GatBasic("Beige", "Siames", 3, "hembra", 4.3);
         //añadimos el nuevo elemento con el add
        gatos.add(gato5);

        //metodo get() utilizado en el metodo que hemos creado para imprimir
        //imprimimos la lista para ver que estan todos los gatos utilizando el metodo de imprimir
        imprimirGatos(gatos);
        cantidadGatos = gatos.size();
        System.out.println("La cantidad de gatos de la lista es: " + cantidadGatos);
        gato5.ronronear();

        //metodo remove(posicion)
        //elimina uno de los elementos dentro del arraylista gatos

        gatos.remove(1); //elimina el gato en la posicion 2

        System.out.println("\nLista despues de eliminar el gato en la posicion 2");
        imprimirGatos(gatos);

        //metodo remove(x)
        //elimina un elemento especifico dentro del arraylist
        gatos.remove(gato5);//esto elimina el objeto que hemos llamado gato 5

        System.out.println("\nLista despues de eliminar el gato5");
        imprimirGatos(gatos);

        //metodo set(posicion, x)
        GatBasic gato6 = new GatBasic("Azul", "persa", 14, "macho", 5.6);

        gatos.set(2, gato6); //modifica el gato en la posicion 3 por el nuevo gato6 que hemos creado

        System.out.println("\nLista despues de utilizar el metodo set");
        imprimirGatos(gatos);

        //metodo contrains
        //verifica si un objeto esta dentro del arraylist
        if(gatos.contains(gato2)) {
            System.out.println("\nEl gato esta en la lista");
        }else{
            System.out.println("\nEl gato no esta en la lista");
        }

        gato3.comer();

        //metodo indexOf(x)
        //buscara un objeto dentr del arrayList si no lo encuentra devolvera -1
        int indiceGato = gatos.indexOf(gato6); // guarda la posicion en la que se encuentra el gato6

        if (indiceGato != -1) { //indicamos que sea diferente a -1 porque es lo que devuelve si no lo encuentra
            System.out.println("El gatos esta en la posicion: " + indiceGato);
        }else{
            System.out.println("El gato no esta en la lista");
        }

        //metodo clear()
        //elimina todos los elementos dentro del arrayList
        gatos.clear();
        System.out.println("\nLista de gatos despues de utilizar el clear");
        cantidadGatos = gatos.size();
        imprimirGatos(gatos);
        System.out.println("La cantidad de gatos de la lista es: " + cantidadGatos);



        gato1.pelear(gato2);

    }

    //metodo para imprimir la lista de gatos
    public static void imprimirGatos(ArrayList<GatBasic> listaGatos){
        System.out.println("Lista de Gatos");

            for (int i = 0; i < listaGatos.size(); i++) {
                //metodo get(posicion)
                //aqui utilizamos el metodo get para devolver el elemento de esta posicion
                GatBasic gato = listaGatos.get(i);
                System.out.println(
                    "Gato " + (i + 1) + ": " +
                    " Color: " + gato.getColor() +
                    ", Raza: " + gato.getRaza() +
                    ", Sexo: " + gato.getSexo() +
                    ", Edad: " + gato.getEdad() +
                    ", Peso: " + gato.getPesoKG()
                );
            }

    }

}
