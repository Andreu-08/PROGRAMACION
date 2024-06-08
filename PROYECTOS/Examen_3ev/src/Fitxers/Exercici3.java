package Fitxers;

import java.io.File;
import java.util.Arrays;

/*
 * Mètodes de la classe FILE:
 * renameTo()
 * File[] listFiles()
 * 
 * Mètodes de la classe ARRAYS
 * sort()
 * 
 * Per imprimir els axrius i directoris de manera ordenada, crearem una funció anomenada imprimirLlistaArxius() 
 * Per esborrar les extensions crearem una funció anomenada llevarExtensionsArxius()
 * 
 */

public class Exercici3 {	

    /* **************************
     * Reanomenem les carpetes *
     * **************************/

// Creem dos objectes de tipus File on assignem la ruta d'origen i la ruta destí. (PER A LA CARPETA DOCUMENTS)  	
	public static void main (String args[]) {
		
		File docOrigen = new File("Documentos");
		File docDesti =new File("DOCS");
		
// Comprove que la carpetada DOCUMENTOS esta creada, simplement és per acotar errors
		if(!docOrigen.exists())
			System.out.println("COMPROVA QUE LA CARPETA DOCUMENTS ESTA CREADA I LA RUTA ES CORRECTA");
		
// Reanomenem la carpeta Documents
		docOrigen.renameTo(docDesti);
		
// Creem dos objectes de tipus File on assignem la ruta d'origen i la ruta destí. // (PER A LA CARPETA FOTOGRAFIAS) i canviem el nom		
		File fotoOrigen = new File("DOCS/Fotografias");
		File fotoDesti = new File("DOCS/FOTOS");
		fotoOrigen.renameTo(fotoDesti);
		
// Creem dos objectes de tipus File on assignem la ruta d'origen i la ruta destí. // (PER A LA CARPETA LIBROS) i canviem el nom		
		File llibreOrigen = new File("DOCS/Libros");
		File llibreDesti = new File("DOCS/LECTURES");
		llibreOrigen.renameTo(llibreDesti);
		

		/* **********************************************************
         *  Llevem les extensions en FOTOS (REANOMENTANT ELS ARXIUS)
           ********************************************************** */
        
// ABANS d'eliminar les extensions, imprimim la llista d'arxius ordenada
System.out.println("Llistat d'arxius de  " + llibreDesti + " abans de llevar les extension: ");
imprimirLlistaArxius(llibreDesti);
System.out.println("");

// Reanomenem els arxius, llenvant les Extensions
llevarExtensionsArxius(llibreDesti);

// DESPRES d'eliminar les extensions, imprimim la llista d'arxius ordenada
System.out.println("Llistat d'arxius de " + llibreDesti + " després de llevar les extension: ");
imprimirLlistaArxius(llibreDesti);
System.out.println("");


 } // DEL MAIN()

  // FUNCIÓ per a esborrar les extensions reanomenant els arxius    
    public static void llevarExtensionsArxius(File ruta) {    	
        // Recorre el llista d'arxius    	
        for (File f : ruta.listFiles()) {
            // trosseja el nom de l'arxiu en base al punt        	
            String[] TrossetsArxius = f.getName().split("\\.");
            File fDesti = new File(f.getParent() + "/" + TrossetsArxius[0]);
            
            // Reanomena l'arxiu            
            f.renameTo(fDesti);
        }
    }

    // FUNCIÓ que imprimeix la llsta d'arxius ordenada    
    public static void imprimirLlistaArxius(File ruta) {
        File[] llista = ruta.listFiles();
        // Ordena la llista alfabèticament
        Arrays.sort(llista);
        
        // Recorre la llista mostrant el nom dels arxius       
        for (File f : llista) {
            if (f.isFile()) {
                System.out.println(f.getName());
            }
        }
    }
	
	
	

} // de la classe
