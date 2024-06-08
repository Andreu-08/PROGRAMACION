package Fitxers;
import java.io.File;
public class Exercici4 {
    public static void main(String args[]) {
        // Creem instàncies de la classe FILE amb les RUTES RELATIVES de les carpetes que volem crear
        File lesMeuesCoses = new File("C:\\Users\\Andreu\\OneDrive - Conselleria d'Educació\\DAW\\PROGRAMACION\\PROYECTOS\\Fitxers\\Documentos\\Mis Cosas");
        File alfabet = new File("C:\\Users\\Andreu\\OneDrive - Conselleria d'Educació\\DAW\\PROGRAMACION\\PROYECTOS\\Fitxers\\Documentos\\Alfabeto");

        // Creem les carpetes i ho comprovem. (NOTA: les variables resultat1 i resultat2 són BOOLEANES
        //CODI A COMPLETAR: Crear carpeta "Mis cosas"
        boolean resultat1 = false;
        if (!lesMeuesCoses.exists()){//si no existeix el directori
            resultat1 =lesMeuesCoses.mkdir();//crea la carpeta dins del directori
        }
        System.out.println("S'ha creat la carpeta 'Documentos/Mis cosas'?? " + resultat1);

        //CODI A COMPLETAR: Crear carpeta "Alfabeto"
        boolean resultat2 = false;
        if(!alfabet.exists()){
            resultat2 = alfabet.mkdir();
        }
        System.out.println("S'ha creat la carpeta 'Documentos/Alfabeto'?? " + resultat2);

        // Anem a moure les carpetes. Primer creem instàncies d'Objectes de la classe FILE amb les rutes origen i destí
        File fotoOrigen = new File("C:\\Users\\Andreu\\OneDrive - Conselleria d'Educació\\DAW\\PROGRAMACION\\PROYECTOS\\Fitxers\\Documentos\\Fotografias");
        File fotoDesti = new File("C:\\Users\\Andreu\\OneDrive - Conselleria d'Educació\\DAW\\PROGRAMACION\\PROYECTOS\\Fitxers\\Documentos\\Mis cosas\\Fotografias");

        //CODI A COMPLETAR: Crea les instàncies Origen i Destí per a Libros
        File liboOrigen = new File ("C:\\Users\\Andreu\\OneDrive - Conselleria d'Educació\\DAW\\PROGRAMACION\\PROYECTOS\\Fitxers\\Documentos\\Libros");
        File liboDesti = new File ("C:\\Users\\Andreu\\OneDrive - Conselleria d'Educació\\DAW\\PROGRAMACION\\PROYECTOS\\Fitxers\\Documentos\\Mis cosas\\Libros");

        // Movem la carpeta 'Fotografias' dins de 'Mis cosas', i comprovem que s'ha mogut correctament
        if(fotoOrigen.exists() && lesMeuesCoses.exists()){
            resultat1 = fotoOrigen.renameTo(fotoDesti);
            System.out.println("S'ha mogut la carpeta 'Documentos/Fotografias' a 'Documentos/Mis cosas/Fotografias'? " + resultat1);
        }else{
            System.out.println("No se ha pogut moure el dricetori");
        }


        //CODI A COMPLETAR: Mou la carpeta libros
        if (liboOrigen.exists() && !liboDesti.exists()){
            resultat2 = liboOrigen.renameTo(liboDesti);
            System.out.println("S'ha mogut la carpeta 'Documetnos/Libros'a Docuementos/Mis cosas/Libros'? " + resultat2);
        }else{
            System.out.println("No se ha pogut moure el dricetori");
        }


        //CODI A COMPLETAR: Crea dins de la carpeta 'Alfabeto', una carpeta per cada una de les lletres de l'alfabet en majuscules.
        //AJUDA: consulta la taula de codi ASCII, utilitza un for i un CASTING d'enter a char.
        if(alfabet.exists()){
            //for que creaara totes les carpetes amb les lletres de A a Z
            for(int i = 65; i <= 90; i++){//valors ASCII per a les lletres de la A a la Z que seran el nom de les carpetes
                //utilitzem el constructor de File al que podem pasarli un fill
                //el fill de la carpeta alfabet sera una carpeta amb el caracter ASSCII de la posicio de i com a nom
                File carpetaLetra = new File(alfabet,"" +(char)i);
                //si no exiteix el directori el creem
                if(!carpetaLetra.exists()){
                    carpetaLetra.mkdir();
                }
            }
        }

        //CODI A COMPLETAR: Mostra per pantalla el contingut de la carpeta Alfabeto
        File[] contingutAlfabet = alfabet.listFiles();

        if(contingutAlfabet != null){
            System.out.println("Contingut de la carpeta alfabet: ");
            for(File f : contingutAlfabet){
                System.out.print("["+f.getName() + "]");
            }

        }

    }
}

