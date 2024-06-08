import java.io.File;
import java.io.IOException;

public class ExemplesFile {
    public static void main(String[] args) {

        //Ejemplo fichero
        File fichero = new File("ejemplo1.txt");

        if(fichero.exists())
            System.out.println("El fichero existe");
        else
            System.out.println("El fichero no existe");

        //Características
        System.out.println("Nombre: "+fichero.getName());
        System.out.println("Longitud: "+fichero.length());
        System.out.println("Ruta relativa: "+fichero.getPath());
        System.out.println("Ruta absoluta: "+fichero.getAbsolutePath());
        System.out.println("¿Se puede leer? "+fichero.canRead());
        System.out.println("¿Se puede escribir? "+fichero.canWrite());

        //Ejemplo carpeta
        File directorio = new File("prueba");

        if(directorio.exists())
            System.out.println("El directorio existe");
        else {
            try {
                System.out.println("El directorio no existe");
                if (!directorio.createNewFile())
                    System.out.println("No se ha podido crear el directorio");
            }
            catch (IOException ioe)
            {
                System.out.println(ioe.getMessage());
            };
        }

        //Características
        System.out.println("Nombre: "+directorio.getName());
        System.out.println("Longitud: "+directorio.length());
        System.out.println("Ruta relativa: "+directorio.getPath());
        System.out.println("Ruta absoluta: "+directorio.getAbsolutePath());
        System.out.println("¿Se puede leer? "+directorio.canRead());
        System.out.println("¿Se puede escribir? "+directorio.canWrite());

        //Ejemplo crear, borrar
        File archivo = new File("/home/v.mascarosalvarez/IdeaProjects/nuevoArchivo.txt");

        try
        {
            if(archivo.createNewFile())
                System.out.println("Archivo creado\n");
            else
                System.out.println("Archivo no creado\n");
        }
        catch (IOException io)
        {
            System.out.println(io.getMessage());
        }

        File carpeta = new File("/home/v.mascarosalvarez/IdeaProjects/nuevaCarpeta");
        if(carpeta.mkdir())
            System.out.println("Carpeta creada\n");
        else
            System.out.println("Carpeta no creada\n");

        File archivoBorrar = new File("/home/v.mascarosalvarez/IdeaProjects/nuevoArchivo.txt");
        if(archivoBorrar.delete())
            System.out.println("Archivo borrado\n");
        else
            System.out.println("archivo no borrado\n");

            }

}