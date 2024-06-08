import javax.swing.*;
import java.awt.*;

public class Ejemplo_Flowlayout {
    public static void main(String[] args) {

        //Objeto ventana
        JFrame v = new JFrame("Ejemplo Flowlayout");

        //Container panel = v.getContentPane();//aprobechamos el contenedor del JFrame

        JPanel panel = new JPanel();//cremos un contenedor externo
        panel.setLayout(new FlowLayout());
        v.setContentPane(panel);//iniciamos el frame en el panel
        v.setTitle("Ejemplo Flowlayout");//titulo


        //instanciamos los componentes
        JButton boton = new JButton("Boton");
        JTextField text = new JTextField(10);
        JCheckBox check = new JCheckBox("Check");
        JLabel etiqueta = new JLabel("Etiqueta");

        //añadimos los componenetes al panel
        panel.add(boton);
        panel.add(text);
        panel.add(check);
        panel.add(etiqueta);

        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setLocationRelativeTo(null);//centrar
        //pack() hace que la ventana se adapte al tamaño segun los componentes que tiene
        v.pack();
        //muestra la ventana
        v.setVisible(true);
    }

}
