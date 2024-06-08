import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class File_repaso {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la ruta del archivo");
        String ruta = sc.nextLine();

        File restaurants = new File(ruta);

        if (restaurants.exists() && restaurants.isFile()) {
            System.out.println("Existe el archivo");
            System.out.println("Nombre " + restaurants.getName());
            System.out.println("Tamaño " + restaurants.length());
            System.out.println("Permisos de lectura " + (restaurants.canRead() ? "SI" : "NO"));
            System.out.println("Permisos de escritura " + (restaurants.canWrite() ? "SI" : "NO"));
        }else if(restaurants.isDirectory()){
            System.out.println("Es un directorio");
        }else{
            System.out.println("No existe el archivo");
        }
        sc.close();
    }
}
