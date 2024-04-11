package Exercici_Club;

public class Club {
    public static void main(String[] args) {

        Soci A = new Soci();
        Soci B = new Soci();
        Soci X = new Soci();

        A.imprimir();
        B.imprimir();
        X.imprimir();

        Club.mesAntic(A,B,X);
    }

    public static void mesAntic(Soci A, Soci B, Soci X){

        if (A.getAntiguetat() > B.getAntiguetat() & A.getAntiguetat() > X.getAntiguetat()){
            System.out.println("El soci mes antic es: "+ A.getNom());
        }else if(B.getAntiguetat() > A.getAntiguetat() & B.getAntiguetat() > X.getAntiguetat()){
            System.out.println("El soci mes antic es: " + B.getNom());
        }else{
            System.out.println("El soci mes antic es: " + X.getNom());
        }
    }
}

