package arrays;

public class EjemploStringArray {
    public static void main(String[] args) {

        String[] palabras = {"albaricoque", "Alonso", "treinta y tres", "trembolona", "helicoptero"};

        String larga="";
        int letras=0;

        for(int index=0; index< palabras.length;index++)
        {
            if (palabras[index].length()>=larga.length()){
                larga=palabras[index];
                letras=larga.length();
            }
        }
        System.out.println("La palabra mas larga tiene "+letras+" letras");
    }
}
