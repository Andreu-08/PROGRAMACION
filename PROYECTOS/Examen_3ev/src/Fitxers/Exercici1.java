package Fitxers;

import java.util.Scanner;
import java.io.*;


/* Utilitzem de la classe FILE:
 * exists()
 * isFile()
 * isDirectori()
 * getName()
 * File[] listFiles();
 * 
 * Per a les exepcions:
 * Try-Cath amb FileNotFoundException
 * TROWS i TROW per llançar una exepció pròpia
 */

public class Exercici1 {

	public static void main(String[] args) {		
	
	String ruta="";	 
	Scanner entrada = new Scanner(System.in);
	
		do {   //Mentre la ruta siga distinta a buit
			try {
				
				System.out.println("\n*****************************************");
				System.out.println("Introdueix la ruta del sistema de fitxers");
				System.out.println("*****************************************\n");
				System.out.print("Ruta: ");
				
				ruta=entrada.nextLine();
				
				// Sols creem la ruta i llancem l'exepció en cas que la ruta NO estiga buida
				if(!ruta.equals("")){
					File fitxer=new File(ruta);			
					mostraRuta(fitxer);
				}
				
			}
			
			catch (FileNotFoundException | SecurityException e) {
				System.err.println(e);			
			}
			
		} while(!ruta.equals(""));		
		
	System.out.println("FI de programa");
		
	}
	
	public static void mostraRuta(File f) throws FileNotFoundException {
		
		// Si la ruta no existeix, llancem l'exepció
		if (!f.exists()) 
            		throw new FileNotFoundException("ERROR - Ruta no vàlida ");
		
		// Si la ruta és un arxiu, ens monstrarà el nom
		if(f.isFile())
			System.out.println("El nom del fitxer és: " + f.getName());
		
		// Si no, si la ruta és una carpeta, ens llistarà tots els seus elements, indicant si és un arxiu o una carpeta
		else if(f.isDirectory()) {			
			// primer creem una llista d'objectes FILE amb el contingut de la carpeta
			File[] llistat=f.listFiles();
			
			// després recorrem la llista diferenciant si és un arxiu o un directori
			for (int i=0; i<llistat.length;i++) {
				
				if (llistat[i].isFile())
					System.out.println("[A] "+llistat[i].getName());
				else if (llistat[i].isDirectory()) {
					System.out.println("[D] "+llistat[i].getName());
				}
			}
		}
	}
}
