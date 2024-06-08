package proves;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class Escriptura {
	
	public static void main(String[] args) {
		
		String[] linees = { "Un", "Dos", "Tres", "Quatre", "Cinc", "Sis", "Set", "..." };
		
		FileWriter fitxer = null;
		try {

			fitxer = new FileWriter("fichero_escritura.txt");

			// Escrivim línea a línea en el fitxer
			
			for (String linea : linees) {
				
				fitxer.write(linea + "\n");
			}

			fitxer.close();

		} catch (Exception ex) {
			System.out.println("Em missatge de l'exepció és: " + ex.getMessage());
		}
	}
}
	

