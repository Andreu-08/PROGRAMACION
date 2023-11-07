public class ejemploArray1 {
    public static void main(String[] args) {

        int[] array = new int[5]; //declaracion y creacion array manera 1
        int tamanyo = array.length;

        String[] array2 = {"Andreu", "iñaki", "javi"};//manera 2 de declaracion
        int medida = array2.length;
       // System.out.println(medida);


        array[3] = 7; //se imprime en la posicion 3 del array el numero 7
        array[4] = array[3]*2; //se imprime en la posicion 4 del array el array 3(7) *2

        for ( int indice = 0; indice < medida; indice++){

            //System.out.println(array[indice]);
            System.out.println("vuelta nº: " + (indice + 1));
            System.out.println("["+array2[indice]+"]");
        }

    }
}
