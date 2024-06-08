import java.util.Scanner;
import java.util.Date;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;


/* 
 * Métodes de la classe FILE:
 * 
 * getName()
 * length()
 * lastModified()
 * 
 * 
 * Per a ordenar alfabèticament un vector o llista (CLASSE ARRAYS):
 * Arrays.sort(lista);
 * 
 * Per transformar un número a format de Data:  (CLASSE DATA):
 *  new Date(número) --> cal usar-lo amb el métode lastModified()
 */

public class Exercici2 {

	public static void main(String[] args) {
	String ruta="";	 
	Scanner entrada = new Scanner (System.in);
	
	
		do {   //Mentres la ruta siga distinta a buit
			try {
				System.out.println("\n*****************************************");
				System.out.println("Introdueix la ruta del sistema de fitxers");
				System.out.println("*****************************************\n");
				System.out.print("Ruta: ");
				
				ruta=entrada.nextLine();
									
				// Sols creem la ruta i llancem l'exepció en cas de que la ruta NO estiga buida
				if(!ruta.equals("")){
					File fitxer=new File(ruta);			
					mostraRuta(fitxer, true);
				}
				
			}
			
			catch (FileNotFoundException | SecurityException e) {
				System.err.println(e);			
			}
			
		} while(!ruta.equals(""));		
		
	System.out.println("FI de programa");
		
	}
	
	public static void mostraRuta(File f, boolean mesInfo) throws FileNotFoundException {
		
		// Si la ruta no existeix, llancem l'exepció
		if (!f.exists()) 
            throw new FileNotFoundException("ERROR - Ruta no vàlida ");
		
		// Si la ruta és un arxiu, ens monstrarà el nom
		if(f.isFile())
			System.out.println("El nom del fitxer és: " + f.getName());
		
		// Si no, si la ruta es una carpeta, ens llistarà tots els seus elements, indicant si és un arxiu o una carpeta
		else if(f.isDirectory()) {
			
			// primer creem una llista d'objectes FILE amb el contingut de la carpeta
			File[] llistat=f.listFiles();
			
			// Ordenem la llista d'objectes FILE per ordre alfabètic
			Arrays.sort(llistat);
			
			// recorrem la llista mostrant els directoris ordenats
			for (int i=0; i<llistat.length;i++) {
				if (llistat[i].isDirectory()) {
					if(mesInfo)
						System.out.println("[D] "+llistat[i].getName() + "\t" + llistat[i].length() + " bytes\t"+ new Date(llistat[i].lastModified()));
					else 
						System.out.println("[D] "+llistat[i].getName());
				}
			}
			
			// recorrem la llista mostrant els directoris ordenats
			for (int i=0; i<llistat.length;i++) {
				if (llistat[i].isFile())
					if(mesInfo)
						System.out.println("[A] "+llistat[i].getName() + "\t" + llistat[i].length() + " bytes\t"+ new Date(llistat[i].lastModified()));
					else 
						System.out.println("[A] "+llistat[i].getName());
				
			}
			
			
		}
	
	}
	
}
