package Gestio_Fitxers1;
import java.io.File;
import java.util.Arrays;
public class Ex3_MostrarInfoFitxers {

    public static void main(String args[]) {

        //objectes de la clase file de cada directori
        File docOrigen = new File("C:\\Users\\Andreu\\OneDrive - Conselleria d'Educació\\DAW\\PROGRAMACION\\PROYECTOS\\Fitxers\\Documentos");
        File docDesti = new File("C:\\Users\\Andreu\\OneDrive - Conselleria d'Educació\\DAW\\PROGRAMACION\\PROYECTOS\\Fitxers\\DOCS");

        // Comprovem que la carpeta Documents està creada, simplement és per acotar errors
        if (!docOrigen.exists()) {
            System.out.println("COMPROVA QUE LA CARPETA DOCUMENTS ESTA CREADA I LA RUTA ES CORRECTA");
        }

        //Renimbrem el directori "Documentos" a "DOCS"

        if(docOrigen.renameTo(docDesti)) {
            System.out.println("La carpeta 'Documentos' ha segut renombrada a 'DOCS'");
        }else{
            System.out.println("No se pot renombrar 'Dcumentos', verifica la ruta");
        }

        // Creem dos objectes de tipus File on assignem la ruta d'origen i la ruta destí.
        // (PER A LA CARPETA FOTOGRAFIAS) i canviem el nom
        File fotoOrigen = new File("C:\\Users\\Andreu\\OneDrive - Conselleria d'Educació\\DAW\\PROGRAMACION\\PROYECTOS\\Fitxers\\DOCS\\Fotografias");
        File fotoDesti = new File("C:\\Users\\Andreu\\OneDrive - Conselleria d'Educació\\DAW\\PROGRAMACION\\PROYECTOS\\Fitxers\\DOCS\\FOTOS");

        if (!fotoOrigen.exists()) {
            System.out.println("La carpeta 'Fotografias' no existe ");
        }
        //cambiem el nom de la carpeta
        if(fotoOrigen.renameTo(fotoDesti)) {
            System.out.println("La carpeta Fotografais ha sido renombrada correctamente ");
            imprimirLlistaArxius(fotoDesti);


            // Reanomenem els arxius, llevant les Extensions cridant a la funció llevarExtensionsArxius()
            llevarExtension(fotoDesti);



            // DESPRÉS d'eliminar les extensions, imprimim de nou la llista d'arxius ordenadacridant a la funció imprimirLlistaArxius()
            System.out.println();
            imprimirLlistaArxius(fotoDesti);

        }else{
            System.out.println("No se puede renombrar 'Fotografias', verifica la ruta");
        }

        // Creem dos objectes de tipus File on assignem la ruta d'origen i la ruta destí. // (PER A LA CARPETA LIBROS) i canviem el nom
        // CODI A COMPLETAR
        File libroOrigen = new File("C:\\Users\\Andreu\\OneDrive - Conselleria d'Educació\\DAW\\PROGRAMACION\\PROYECTOS\\Fitxers\\DOCS\\Libros");
        File libroDesti = new File("C:\\Users\\Andreu\\OneDrive - Conselleria d'Educació\\DAW\\PROGRAMACION\\PROYECTOS\\Fitxers\\DOCS\\LECTURAS");

        if (!libroOrigen.exists()) {
            System.out.println("La carpeta 'Libros' no existe ");
        }
        if(libroOrigen.renameTo(libroDesti)) {
            System.out.println("La carpeta libros ha sido renombrada correctamente");
        }else{
            System.out.println("No se pudo renombrar la carpeta Libros");
        }
        /* **********************************************************
         *  Llevem les extensions en FOTOS (REANOMENTANT ELS ARXIUS)
         ********************************************************** */

        // ABANS d'eliminar les extensions, imprimim la llista d'arxius ordenada cridant a la funció imprimirLlistaArxius()

    } // del main()


    // IMPRIMIR LLISTA ARXIUS
    public static void imprimirLlistaArxius(File carpeta) {
        File[] archius = carpeta.listFiles();//guardem una llista amb els archius del directori
        Arrays.sort(archius); //ordenem la llista de archius
        System.out.println("LLista de archius:");

        //for per a iterar en l'array y imprimir cuan siga un archiu i no un directori
        for (File archiu : archius) {
            //verifiquem que siga un archiu (.isfile)
            if (archiu.isFile()) {
                System.out.println(archiu.getName());//si es archiu imprimir
            }
        }
    }

    // LLEVAR EXTENSIONS ARXIUS
    public static void llevarExtension(File carpeta) {
        File[] archivos = carpeta.listFiles();

        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isFile()) {
                    // Dividimos el nombre en partes a partir del punto y las guardamos en un array
                    String[] partsNomFixer = archivo.getName().split("\\.(?=[^.]+$)"); // Split antes de la última parte

                    if (partsNomFixer.length > 1) {
                        String nomSenseExtensio = partsNomFixer[0];

                        // Creamos un nuevo objeto File sin la extensión
                        File nouArxiu = new File(archivo.getParent(), nomSenseExtensio);

                        // Renombramos el archivo anterior para que no existan los dos
                        boolean result = archivo.renameTo(nouArxiu);
                        if (result) {
                            System.out.println("Archivo renombrado con éxito a: " + nouArxiu.getName());
                        } else {
                            System.out.println("Error renombrando el archivo: " + archivo.getName());
                        }
                    }
                }
            }
        } else {
            System.out.println("No se pudieron listar los archivos de la carpeta.");
        }
    }

}






