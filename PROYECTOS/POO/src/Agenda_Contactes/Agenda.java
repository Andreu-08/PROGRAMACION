package Agenda_Contactes;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    //creamos el array lista como un atributo de clase que podremosutilizar en todos los metodos
    private static ArrayList<Contacto> agenda = new ArrayList<>();
    //creamos una objeto scanner para toda la clase
    private static Scanner teclado = new Scanner (System.in);

    public static void main(String[] args) {
        //creem el menu utilizando todos los metodos que hemos declarados
        int opcion;
        do{
            menu();
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    introducirContacto();
                    break;
                case 2:
                    consultarContactos();
                    break;
                case 3:
                   consultaDni();
                    break;
                case 4:
                    borrarContactos();
                    break;
                case 5:
                    System.out.println("Programa Cerrado");
                    break;
                default:
                    System.err.println("Opcion no valida, selecciona una opcion valida (1-5)");
            }
        }while(opcion != 5);
    }

    //metodo para mostrar el menu
    private static void menu(){
        System.out.println(
                "Menu:" +
                "\n1. Introducir contacto" +
                "\n2. Consultar la informacion de todos los contactos" +
                "\n3. Consultar un contacto por su DNI" +
                "\n4. Borrar un contacto" +
                "\n5. Cerrar el programa" +
                "\nSelecciona una opcion: "
        );
    }

    //metodo para introducir los contactos
    private static void introducirContacto(){
        System.out.println("Introduce los datos del contacto:" +
                            "\nDNI: ");
        String dni = teclado.nextLine();

        System.out.println("Nombre completo: ");
        String nombre = teclado.nextLine();

        System.out.println("Telefono: ");
        String telf= teclado.nextLine();

        System.out.println("e-Mail: ");
        String eMail = teclado.nextLine();

        //creamos el objeto contacto con los datos introducidos
        Contacto nuevoContacto = new Contacto(dni, nombre, telf, eMail);
        //lo añadimos a  nuestro arraylist
        agenda.add(nuevoContacto);
        System.out.println("Contacto introducido con exito");
    }

    //metodo para consultar todos los contactos de la agenda
    private static void consultarContactos(){
        if(agenda.isEmpty()){
            //comprobamos si la agenda esta vacia
            System.err.println("No hay contactos en la agenda");
        }else{
            System.out.println("Lista de contactos: ");
            //for each para recorrer el arraylist y mostrar los contactos
            for(Contacto contacto : agenda){
                System.out.println(contacto);
            }
        }
    }

    //metodo para buscar a un contacto por su dni
    private static void consultaDni(){
        System.out.println("Introduce el DNI del contacto que quieres consultar: ");
        String dniConsulta = teclado.nextLine();
        //boleaano para comprobar si el dni existe o no en la lista
        boolean buscaDni = false;

        //for each para recorrer el arraylist y buscar el contacto
        for( Contacto contacto : agenda){
            //llamamos al dni del contacto con el getDni y lo comparamos con equals
            if(contacto.getDni().equals(dniConsulta)){
                System.out.println("El contacto que buscas es: ");
                System.out.println(contacto);
                //salir del bucle
                buscaDni = true;
                break;
            }
        }
        //no se encuentra el dni en la lista
        if(!buscaDni) {
            System.err.println("El contacto no esta en la agenda");
        }
    }

    //metodo para borrar contactos
    private static void borrarContactos(){
        System.out.println("Introduce el DNI del contacto que quieres borrar: ");
        String dniBorrar = teclado.nextLine();
        boolean eliminado = false;
        //recorremos el array lista utilizando el size i el get para seleccionar el contacto indicado
        for (int i = 0; i < agenda.size(); i++){
            if(agenda.get(i).getDni().equals(dniBorrar)){
                //utilizamos el remove para borrar el objeto seleccionado
                agenda.remove(i);
                System.out.println("Contacto borrado");
                //salimos del bucle
                eliminado = true;
                break;
            }
        }
        if(!eliminado){
            System.err.println("Contacto no encontrado, No se ha podido borrar");
        }
    }

}
