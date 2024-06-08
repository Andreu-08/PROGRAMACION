package Fitxers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex2 {
    public static void main(String[] args) {
        comptarParaules("Documentos\\frases.txt");
    }

    public static void comptarParaules(String nomArxiu)
    {
        try
        {
            int paraules = 0;
            String linia;
            File f = new File(nomArxiu);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            while ((linia = br.readLine()) != null)
            {
                //l'expressió "\s" significa espai en blanc
                String[] paraulesXLinia = linia.split("\\s");
                paraules += paraulesXLinia.length;
            }
            //al tancar el BufferReader es tanca també el FileReader
            br.close();
            System.out.println("L''arxiu "+f.getName()+ " te un total de "+paraules+" paraules.");
        }
        catch (IOException ioe)
        {
            System.out.println("Error al llegir l'arxiu: "+ ioe.getMessage());
        }
    }
}
