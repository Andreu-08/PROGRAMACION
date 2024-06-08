
//clase para construir el panel
package Formulari_DadesPersonals;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class Formulari_DadesPersonals {
    public static void main(String[] args) {
        FormulariGIU form1 = new FormulariGIU();
    }
}

// Clase para construir el panel
class FormulariGIU extends JFrame {
    public FormulariGIU() {
        setTitle("Formulari Dades Personals");// Título
        setSize(600, 800);// Tamaño
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Para finalizar procesos al cerrar
        setLocationRelativeTo(null);// Centrar la ventana al abrirla
        setIconImage(new ImageIcon("contract_684831.png").getImage());

        // Configurar el layout para organizar el contenido
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Creamos las etiquetas y los campos de texto
        String[] etiquetas = {"Nom:", "Cognoms:", "Adreça:", "Tlf:", "NIF:", "Codi Postal:", "Població:", "e-mail:", "Contraseña:"};
        JTextField[] etiquetaTextFields = new JTextField[etiquetas.length];

        // bucle for para añadir las etiquetas al panel con su campo de texto correspondiente
        for (int i = 0; i < etiquetas.length; i++) {
            JPanel panel = new JPanel(); //se crea un panel para cada etiqueta
            panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10)); //el floulayout nos permite poner el contenido a la izquierda
            panel.add(new JLabel(etiquetas[i]));
            etiquetaTextFields[i] = new JTextField(20); // Crear un campo de texto en esa posición
            panel.add(etiquetaTextFields[i]);
            add(panel); // Añadir el panel al JFrame
        }
        //ahora añadimos el resto de componentes utilizando los metodos creados para cada uno

        // Crear y añadir selección única de provincias
        add(crearComboBoxPanel("Província:", new String[]{"Barcelona", "Valencia", "Madrid", "Sevilla", "Zaragoza", "Málaga", "Murcia", "Palma", "Bilbao", "Alicante"}));

        // Crear y añadir la selección única de países
        add(crearComboBoxPanel("País:", new String[]{"España", "Francia", "Italia", "Alemania", "Portugal"}));

        // Crear y añadir los botones de opción para selección única de sexo circulares
        add(crearRadioButtonPanel("Sexe:", new String[]{"Home", "Dona", "Altres"}));

        // Crear y añadir las cajas de verificación para selección múltiple de idiomas cuadrados
        add(crearCheckBoxPanel("Idiomes:", new String[]{"Espanyol", "Anglès", "Francès", "Alemany", "Italià", "Altres"}));

        // Crear y añadir el área de texto para la carta de presentación
        add(crearTextAreaPanel("Carta de Presentació:", 10, 20));

        // Añadir botón de generar datos personales
        add(crearBotonPanel("Generar"));

        setVisible(true); // Para ver el panel
    }

    //cramos la caja de seleccion para las provincias y los paises
    private JPanel crearComboBoxPanel(String labelText, String[] options) {
        JPanel panel = new JPanel();//crea el nuevo panel
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));//posion del panel a la izquierda
        panel.add(new JLabel(labelText));//añadimos el area de texto de las etiquetas
        JComboBox<String> comboBox = new JComboBox<>(options); //crea un arrray con las opciones de la lista desplegable
        panel.add(comboBox);//añade la lista desplegable al panel
        return panel;//retorna el panel
    }

    //creamos los seleccionables circulares
    private JPanel crearRadioButtonPanel(String labelText, String[] options) {
        JPanel panel = new JPanel();//crea el panel para los radioButton
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));//lo alinea a la izquierda
        panel.add(new JLabel(labelText));
        ButtonGroup group = new ButtonGroup(); //nos asegurameos que solo podremos seleccionar uno
        //iteramos sobre las opciones que hemos indicado en el string
        for (String option : options) {
            //crea un boton radio para cada opcion
            JRadioButton radioButton = new JRadioButton(option);
            //lo añade al grupo de opciones
            group.add(radioButton);
            //lo añade al panel
            panel.add(radioButton);
        }
        return panel;
    }
    //cramos los seleccionables cuadrados (checkbox)
    private JPanel crearCheckBoxPanel(String labelText, String[] options) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        panel.add(new JLabel(labelText));
        //no hace falta hacer grupos ya que se podra seleccionar mas de una opcion
        //se itera sobre las opciones del estring y se van generando los checkbox
        for (String option : options) {
            JCheckBox checkBox = new JCheckBox(option);
            //se añaden al panel
            panel.add(checkBox);
        }
        return panel;
    }
    //creamos el textarea
    private JPanel crearTextAreaPanel(String labelText, int rows, int cols) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        panel.add(new JLabel(labelText));
        //creamos el text area que cogera las columnas y filas indicadas al crearlo
        JTextArea textArea = new JTextArea(rows, cols);
        //creamos un scrollpane donde añadiremos el texArea para que se pueda navegar en el
        JScrollPane scrollPane = new JScrollPane(textArea);
        //añadimos el scrollPane con el textArea dentro al panel
        panel.add(scrollPane);
        return panel;
    }
    //ceramos el boton para alinearlo a la izquierda con FlowLayout
    private JPanel crearBotonPanel(String buttonText) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        JButton button = new JButton(buttonText);
        panel.add(button);
        return panel;
    }
}