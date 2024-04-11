package Introduccio_Arraylist2;

public class Carta {

    private String pal;
    private String num;

    public Carta(String pal, String num){
        this.pal = pal;
        this.num = num;
    }

    //getters
    public String getPal(){

        return pal;
    }

    public String getNum() {
        return num;
    }

    //no tenenmos setters ya que inicaremos los atributos con el constructor

    //metode per a imprimir el pal y el numero de la carta
    public void printC(){

        System.out.println(getNum() + " de " + getPal());
    }
}
