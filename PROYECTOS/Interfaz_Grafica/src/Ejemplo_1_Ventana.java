import javax.swing.*;
import java.awt.*;

public class Ejemplo_1_Ventana {
    public static void main(String[] args) {

        //con herencia desde el constructor que hemos creado

        MySympleGUI panel1 = new MySympleGUI();
        panel1.setLocationRelativeTo(null);//coloca la ventana en el centro de la pantalla

       /* sin herencia (directamente utilizando la clase JFrame)
        //esta ventana tienes que ir indicandole los parametros que quieras que tenga en el programa
        JFrame frame = new JFrame("Ejemplo 1, Sin Herencia");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cierra la ventana y finaliza procesos
        frame.setVisible(true);*/
    }

    //constructor de la interfaz grafica con herencia
    //aqui puedes crear la ventana personalizada con los parametros que quieras para luego llamarla creando un objeto
    static class MySympleGUI extends JFrame {//tipo de ventana (JFrame)
        public MySympleGUI() {
            setSize(400, 400); //tamaño
            setTitle("Mi Primera ventana tipo JFrame"); //titulo
            iniciarComponentes();//llamamos al metodo para iniciar los componentes
            setVisible(true);//true para que se muestre (este activa) recordar siempre
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finaliza los procesos al cerrar
            setIconImage(new ImageIcon("skull-bones_8078653.png").getImage());
        }
        //iniciar los componenetes en el objeto con metodo
        public void iniciarComponentes(){
            //añadimos componentes
            JLabel etiqueta = new JLabel("Mensaje de la etiqueta "); //etiqueta
            JTextField campoTexto = new JTextField(20); //cuadro de texto de 20 columnas
            JButton boton = new JButton("Aceptar");//boton con el texto 'Aceptar'

            //contenedor intermedio para la organizacion de los componentes
            JPanel panel = new JPanel();

            //asignamos los componenetes para que se ejecuten con el constructor
            //se mostran todos pero uno encima del otro si no ponem un panel intermedio
            panel.add(etiqueta);
            panel.add(campoTexto);
            panel.add(boton);

            setContentPane(panel);
        }
    }
}
