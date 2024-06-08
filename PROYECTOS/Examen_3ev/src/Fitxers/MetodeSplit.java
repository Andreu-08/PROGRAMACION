package Fitxers;

public class MetodeSplit {
	
	/* El método split() divide un objeto de 
	 * tipo String en un array (vector) de cadenas 
	 * mediante la separación de la cadena en subcadenas.
	 */
	
	/* El método usa una expresión regular para separar
	 * la cadena de texto o string.
	 */
	
	
	
	public static void main(String[] args) {
		
		
		String s = "Nom.ext";
		
		String[] cadenaPartida = s.split("\\.");
		
		System.out.println(cadenaPartida[0]);
		System.out.println(cadenaPartida[1]);
	
		/* Nom 
		 * ext
		 */
		
				cadenaPartida = s.split("e");
		
		System.out.println(cadenaPartida[0]);
		System.out.println(cadenaPartida[1]);
		
		/*Nom. 
		 * xt
		 */
		
		
	}

}
