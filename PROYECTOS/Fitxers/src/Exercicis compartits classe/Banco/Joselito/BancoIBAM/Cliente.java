package Programacion.Java.TryCatch.CasoPractico;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Random;

public class Cliente {
    static Scanner in = new Scanner(System.in);
    ArrayList<String> movimientos = new ArrayList<String>();
    String fechaActual = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    public String IBAM;
    public String Nombre;
    public int dinero;
    public int accion;


    public Cliente(int dinero, int accion){
        this.dinero = dinero;
        this.accion = accion;
    }



    // MÉTODO DE CATCH PARA NO PASARSE DEL DINERO QUE TIENE EL CLIENTE //
    public void naoNao(int dinero, int accion){
        this.dinero = dinero;
        this.accion = accion;

        if(accion > dinero){
            throw new NumberFormatException("La cantidad de dinero introduccida es mayor de la que se tiene");
        }
    }



    // MÉTODO DE EXTRACCIÓN DE DINERO //
    public void extraccion(){

        System.out.println("¿Cuanto dinero quieres extraer?");

        do {
            try {
                accion = in.nextInt();
                naoNao(dinero, accion);
            } catch (NumberFormatException deMas) {
                System.out.println(deMas.getMessage());
            }
        }while(accion > dinero);

        dinero = dinero - accion;

        System.out.println("Has extraido " + accion + "€, te quedan " + dinero + "€");

        movimientos.add("Sacaste " + accion + "€" + " el día " + fechaActual);
    }



    // MÉTODO DE DEPOSITAR DE DINERO //
    public void depositar(){
        System.out.println("¿Cuanto dinero quieres depositar?");
        accion = in.nextInt();
        dinero = dinero + accion;

        System.out.println("Has introducido " + accion + "€, ahora tienes " + dinero + "€");

        movimientos.add("Introdujiste " + accion + "€" + " el día " + fechaActual);
    }



    // DINERO ACTUAL DEL CLIENTE //
    public int getDinero(){
        return dinero;
    }



    // GENERAR IBAN //
    public void generateUserIBAM(StringBuilder IBAM){
        IBAM = new StringBuilder();

        for (int i = 0; i < 2; i++) {
            char letraRandom = (char) ('A' + (int) (Math.random() * 26));
            IBAM.append(letraRandom);
        }

        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int NumeroRandom = random.nextInt(10);
            IBAM.append(NumeroRandom);
        }

        this.IBAM = String.valueOf(IBAM);
    }



    // TITULAR //
    public void setNombre(String Nombre){
        char Response;

        do {
        System.out.println("¿Cuál es su nombre?");
            Nombre = in.nextLine();
            System.out.println("¿Su nombre es " + Nombre + "?\n" +
                               "Responde con Y/N");

            Response = in.next().charAt(0);
            Response = Character.toUpperCase(Response);
            in.nextLine();
        }while(Response != 'Y');

        this.Nombre = Nombre;
    }

    public String getNombre(){
        return Nombre;
    }


    // MOVIMIENTOS //
    public void Movimientos(){
        for(int i = 0; i < movimientos.size(); i++){
            System.out.printf("| " + movimientos.get(i) + " |");
        }
    }


    // DATA DEL CLIENTE //
    public String toString(){
        return "Nombre: " + Nombre + "\nDINERO: " + dinero + "€\nIBAM: " + IBAM;
    }
}
