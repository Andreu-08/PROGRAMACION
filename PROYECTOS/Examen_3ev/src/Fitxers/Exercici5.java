package Gestio_Fitxers1.Entregables_4y5;
import java.io.File;
import java.io.FileNotFoundException;

public class Ex5_gestioFitxers1 {
    public static void main(String[] args) {

        // Instaciem a la classe FILE amb les rutes relatives a les carpetes que volem esborrar
        File fotografies = new File("C:\\Users\\Andreu\\OneDrive - Conselleria d'Educació\\DAW\\PROGRAMACION\\PROYECTOS\\Fitxers\\Documentos\\Fotografias");
        File llibres = new File("C:\\Users\\Andreu\\OneDrive - Conselleria d'Educació\\DAW\\PROGRAMACION\\PROYECTOS\\Fitxers\\Documentos\\Libros");
        File documents = new File("C:\\Users\\Andreu\\OneDrive - Conselleria d'Educació\\DAW\\PROGRAMACION\\PROYECTOS\\Fitxers\\Documentos");

        boolean resultat = false;

        try {
            // Esborrem la carpeta 'Fotografias' i tot el seu contingut
            resultat = esborrarTot(fotografies);
            if (resultat) {
                System.out.println("La carpeta 'Fotografias' ha segut esborrada");
            }

            // Esborrem la carpeta 'Libros' i tot el seu contingut
            resultat = esborrarTot(llibres);
            if (resultat) {
                System.out.println("La carpeta 'Libros' ha segut esborrada");
            }

            // Esborrem la carpeta 'Documentos' i tot el seu contingut
            resultat = esborrarTot(documents);
            if (resultat) {
                System.out.println("La carpeta 'Documentos' ha segut esborrada");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    } // Del main()


    /* Crea una funci� anemomenada esborrarTot() que elimine tots els arxius i carpetes d'una ruta:
     *
     * Si no existeix la ruta, mostra una excepci�.
     * Si �s un arxiu, l'esborrem
     * Si �s una carpeta, primer eliminem tots els seus arxius, i despr�s, esborrem la carpeta
     *
     */

    public static boolean esborrarTot(File directori) throws FileNotFoundException {
        //verifiquem que el fitxer o directori existeix sino llançem la excepcio
        if (!directori.exists()) {
            throw new  FileNotFoundException("Error: El directori (" + directori.getName()+") no existeix");
        }
        //si exiteix, comprovem si conte archius per a esborrarlos de dins cap a fora
        if(directori.isDirectory()) {
            //array amb tots el fichers y directoris fills
            File [] archius = directori.listFiles();
            if (archius != null) {//si el array no esta buit el recorrerem per a anar borrant el contingut
                for(File archiu: archius){
                    esborrarTot(archiu);//utilitzem la recursivitat del metode per a asegurar que es borra tot
                }
            }
        }
        //finalment esborrem el directori ya buit
        return directori.delete();
    }


}