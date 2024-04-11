package ExerciciA1;

import java.util.Random;
import java.util.Scanner;

public class Punt {

    //atributs privats
   private int x, y ;

   // constructor amb parametres, obliga a afejir valors al crear el objecte
    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //metodes get i set per a poder accedir als atributs del objecte

    //GETTERS
    int getX(){
        //te que retornar el argutmente al que fa referencia
        return x;
    }

    int getY(){

        return y;
    }

    //SETTERS
    public void setX(int x){

        this.x = x;
    }

    public void setY(int y){

        this.y = y;
    }

    //implementacio de metodes

    //imprimeix per pantalla les cordenades dels valors del objecte
    public void  imprimir(){

        System.out.println("("+ x +","+ y + ")");
    }
    //cambia el valor de les dos cordenades a la vegada
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    //desplaça les cordenades del punt
    public void desplaça(int distx, int disty){

        x += distx;
        y += disty;
    }

    public double distancia(Punt P){

        double potenciaX, potenciaY;


       potenciaX =  Math.pow(this.x - P.x , 2);
       potenciaY =  Math.pow(this.y - P.y, 2);


       double raiz = Math.sqrt(potenciaX + potenciaY);

       return raiz;
    }

    public static Punt creaPuntAleatori(){

        double numeroRand = Math.random() * 200 - 100;

        int numeroRound = (int) Math.round(numeroRand);

        Punt P = new Punt(numeroRound, numeroRound);

        return P;
    }


}
