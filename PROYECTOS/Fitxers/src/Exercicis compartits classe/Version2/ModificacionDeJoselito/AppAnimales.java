package Programacion.Java.animalicos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class AppAnimales {
    static Scanner in = new Scanner(System.in);
    /*HE CONVERTIDO TODOS LOS ATRIBUTOS DE LOS ANIMALES EN PUBLIC, NO SUPE HACERLO COMO ES DEBIDO...*/
    /*static  Caballo c1 = new Caballo(Caballo.edad, Caballo.nombre, Caballo.tipo_alimentacion, Caballo.patas);
    static  Gato g1 = new Gato(Gato.edad, Gato.nombre, Gato.tipo_alimentacion, Gato.pedigri);
    static Perro p1 = new Perro(Perro.edad, Perro.nombre, Perro.tipo_alimentacion, Perro.raza);*/
    static int respuesta, respuesta2;
    public static void main(String[] args){
        System.out.println("\nHola amable usuario ¿qué le gustaría hacer? :3\n");
        do{
        System.out.println("=========================================================\n" +
                "==== 1. VER INFORMACIÓN DE LOS ANIMALES EN LA GRANJA ====\n" +
                "==== 2. MODIFICAR ANIMALICOS ============================\n" +
                "==== 3. COMPARADOR DE EDADES ENTRE ANIMALES =============\n"+
                "==== 4. SALIR ===========================================\n" +
                "=========================================================\n");

        boolean tf = false;
        do {
            try {
                respuesta = parseInt(in.nextLine());
                tf = false;
            }catch(Exception err){
                tf = true;
            }
            if(respuesta <1 || respuesta > 4){
                System.out.println("Valor introducido no valido");
                tf = true;
            }
        }while(tf);

        /*1. MOSTRAR A TODOS LOS BICHOS Y SUS RASGOS*/
        if(respuesta == 1){
            new Caballo(Caballo.edad, Caballo.nombre, Caballo.tipo_alimentacion, Caballo.patas);
            System.out.print("CABALLO:");
            Caballo.info();
            System.out.println("Patas: " + Caballo.patas +"\n");

            Gato g1 = new Gato(Gato.edad, Gato.nombre, Gato.tipo_alimentacion, Gato.pedigri);
            System.out.print("GATO:");
            Gato.info();
            System.out.println("Perigri: " + Gato.pedigri +"\n");

            Perro p1 = new Perro(Perro.edad, Perro.nombre, Perro.tipo_alimentacion, Perro.raza);
            System.out.print("PERRO:");
            Perro.info();
            System.out.println("Raza: " + Perro.raza +"\n");

        /*2. MODIFICAR ANIMALICOS*/
        }else if(respuesta == 2){
            System.out.println("Muy bien, a quien quieres modificar?" +
                    "\n====================\n" +
                    "==== 1. CABALLO ====\n" +
                    "==== 2. GATO =======\n" +
                    "==== 3. PERRO ======\n" +
                    "====================");
            boolean tf2 = false;
            do {
                try {
                    respuesta2 = parseInt(in.nextLine());
                    tf2 = false;
                }catch(Exception err){
                    tf2 = true;
                }
                if(respuesta < 1 || respuesta > 3){
                    System.out.println("Valor introducido no valido");
                    tf2 = true;
                }
            }while(tf);

            if(respuesta2 == 1){
                System.out.println("Muy bien, adelante, modifica al caballo\nNOMBRE:");
                Caballo.nombre = in.nextLine();
                System.out.println("TIPO DE ALIMENTACIÓN:");
                Caballo.tipo_alimentacion = in.nextLine();
                System.out.println("PATAS:");
                Caballo.patas = in.nextInt();
                System.out.println("EDAD:");
                Caballo.edad = in.nextInt();
            }else if(respuesta2 == 2){
                System.out.println("Muy bien, adelante, modifica al gatico\nNOMBRE:");
                Gato.nombre = in.nextLine();
                System.out.println("TIPO DE ALIMENTACIÓN:");
                Gato.tipo_alimentacion = in.nextLine();
                System.out.println("PEDIGRI:");
                Gato.pedigri = in.nextLine();
                System.out.println("EDAD:");
                Gato.edad = in.nextInt();
            }else if(respuesta2 == 3){
                System.out.println("Muy bien, adelante, modifica al perrico\nNOMBRE:");
                Perro.nombre = in.nextLine();
                System.out.println("TIPO DE ALIMENTACIÓN:");
                Perro.tipo_alimentacion = in.nextLine();
                System.out.println("RAZA:");
                Perro.raza = in.nextLine();
                System.out.println("EDAD:");
                Perro.edad = in.nextInt();
            }
        /*3. VER LAS EDADES ENTRE LOS ANIMALICOS*/
        }else if(respuesta == 3){
            System.out.println("Las edades son las siguientes:\n" +
                    "Caballo: " + Caballo.edad + " | Gato: " + Gato.edad + " | Perro: " + Perro.edad + "\n");
            ArrayList<Integer> papeadaDeMameo = new ArrayList<Integer>(Arrays.asList(Caballo.edad, Gato.edad, Perro.edad));

            int mayor = 0;
            int menor = 999999999;
            for(int i = 0; i < papeadaDeMameo.size(); i++){
                if(papeadaDeMameo.get(i) > mayor){
                    mayor = papeadaDeMameo.get(i);
                }
            }
            for(int i = 0; i < papeadaDeMameo.size(); i++){
                if(papeadaDeMameo.get(i) < menor){
                    menor = papeadaDeMameo.get(i);
                }
            }
            System.out.println("La mayor edad es " + mayor + ", y la menor es " + menor);
        }

        }while(respuesta != 4);
    }
}