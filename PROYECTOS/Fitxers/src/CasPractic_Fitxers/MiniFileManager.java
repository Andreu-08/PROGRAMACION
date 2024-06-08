package CasPractic_Fitxers;

import java.io.*;
public class MiniFileManager {
    private File directorioActual; //directorio de trabajo

    //constructor de la clase
    public MiniFileManager() {
        //indicamos que directorioActual es el directorio donde se esta trabajando
        directorioActual = new File(System.getProperty("user.dir"));
        //imprime el directorio actual al iniciar la clase
        System.out.println("Directorio: " + this.directorioActual.getAbsolutePath());
    }

    //metodo para obtener el directorio actual (PWD)
    public String getPWD(){
        return directorioActual.getAbsolutePath();
    }

    //metodo para cambiar de directorio actual
    public boolean changePWD(String dir){
        //objeto file con el nuevo directorio apartir del directorio actual
        File nuevoDir = new File(directorioActual, dir);

        //verificamos si el nuevo directorio existe y si es un directorio
        if(nuevoDir.exists() && nuevoDir.isDirectory()){
            directorioActual = nuevoDir; //indicamos que el directorio actual es el directorio nuevo
            //imprimir el cambio de directorio
            System.out.println("Cambiando directorio: " + directorioActual.getAbsolutePath());
            return true; //si se verifica el cambio devuelve true
        }else{
            System.out.println("Directorio no encontrado: " + dir);
            return false;
        }
    }

    //metodo para listar el contenido del directorio
    public void printList(boolean info){
        //obtenemos un array con los archivos del directorio actual
        File[] archivos = directorioActual.listFiles();

        //verificamos que el array de archivos no esta vacio (null)
        if(archivos != null){
            //si no es null iteramos el array para listar el contenido
            for (File archivo : archivos) {
                //imprimirmos el nombre del archivo sobre el que estamos iterando
                System.out.println(archivo.getName());
                //si info es true y encuentra los archivos imprime informacion adicional
                if(info){
                    //tamaño del archivo
                    System.out.print(" | Tamaño: " + archivo.length());
                    //fecha de modificacion
                    System.out.print(" | Modificado: " + new java.util.Date(archivo.lastModified()));
                }
                System.out.println();//salto de linea para cada archivo
            }
        }else{
            //mensaje de error si no podemos listar los archivos
            System.err.println("Archivos no encontrados");
        }
    }

    //metodo para crear un nuevo directorio (mkdir)
    public void mkdir(String dir){
        //nuevo objero para crear un nuevo directorio
        File nuevoDir = new File(directorioActual, dir);

        //verificamos si existe para intentar crearlo
        if(!nuevoDir.exists()){
            //si no existe lo creamos con .mkdir
            if(nuevoDir.mkdir()){
                System.out.println("Directorio creado correctamente: " + dir );
            }else{
                System.err.println("Error al crear el directorio");
            }
            //mensaje si el directorio no existe
        }else {
            System.out.println("El directorio ya existe");
        }
    }

    //metodo para eliminar un archivo o directorio (rm) no elimina subdirectorios
    public void rm(String file){
        File archivo = new File(directorioActual, file);

        //verifica si el archivo es un directorio
        if(archivo.isDirectory()){
            //listamos los archivos dentro del directorio en un Array
            File[] archivosEnDirectorio = archivo.listFiles();
            if(archivosEnDirectorio != null){
                //iteramos el array para eliminar los archivos que no son directorios
                for(File f : archivosEnDirectorio){
                    if(!f.isDirectory()){
                        f.delete();
                    }
                }
            }
            //verificamos que el directorio esta vacio para eliminarlo
            if(archivo.listFiles().length == 0){
                archivo.delete();
                System.out.println("Directorio eliminado");
            }else{
                //mensaje si el directorio no se ha podido eliminar porque contiene subdirectorios
                System.err.println("No se puede eliminar el directorio (contiene subdirectorios)");
            }
        }else{
            //eliminamos el archivo
            if(archivo.delete()){
                System.out.println("Directorio eliminado: " + file);
            }else{
                //mensaje si no puede ser eliminado
                System.err.println("Error al eliminar el directorio");
            }
        }
    }

    //renombrar o mover un archivo o directorio
    public void mv(String file1, String file2){
        //archivo original
        File archivoOrigen = new File(directorioActual, file1);
        //archivo renombrado o de destino
        File archivoDestino = new File(directorioActual, file2);

        //movemos o renombramos el archivo utilizando el metodo rename to
        if (archivoOrigen.renameTo(archivoDestino)) {

            System.out.println("Archivo movido a: " + file2);
        }else{
            System.err.println("Error al mover el directorio");
        }
    }

}
