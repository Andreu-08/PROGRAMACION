import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora_Rara extends JFrame {
    // Función principal
    public static void main(String[] args) {
        // Inicializa la ventana (calculadora)
        Calculadora_Rara calculadora = new Calculadora_Rara();
    }

    // Constructor de la ventana
    public Calculadora_Rara() {
        // Título de la ventana
        setTitle("Mini Calculadora II");
        // Tamaño de la ventana
        setSize(400, 200);
        // Icono de la ventana
        setIconImage(new ImageIcon("img/calculator_11110623.png").getImage());
        // Cerramos los procesos por defecto al cerrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Centramos la ventana en la pantalla
        setLocationRelativeTo(null);
        // Iniciamos los componentes en la ventana
        iniciarComponents();
        // Hacemos que sea visible
        setVisible(true);
    }

    // Función para inicializar los componentes
    public void iniciarComponents() {
        // Creación de los componentes
        JTextField input1 = new JTextField(5);
        JTextField input2 = new JTextField(5);
        JRadioButton sumatorio = new JRadioButton("Sumatorio");
        JRadioButton productorio = new JRadioButton("Productorio");
        JRadioButton exponencial = new JRadioButton("Exponencial");
        JButton calcular = new JButton("¡Calcula!");
        JLabel resultado = new JLabel("0");

        // Agrupación de los botones de radio
        ButtonGroup group = new ButtonGroup();
        group.add(sumatorio);
        group.add(productorio);
        group.add(exponencial);
        sumatorio.setSelected(true);

        // Configuración del diseño
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(input1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(input2, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 3;
        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(sumatorio);
        panel.add(productorio);
        panel.add(exponencial);
        add(panel, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        add(calcular, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        add(resultado, gbc);

        // Configuración de eventos
        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(input1.getText());
                    int num2 = Integer.parseInt(input2.getText());
                    int res = 0;

                    if (sumatorio.isSelected()) {
                        res = 0;
                        for (int i = num1; i <= num2; i++) {
                            res += i;
                        }
                    } else if (productorio.isSelected()) {
                        res = 1;
                        for (int i = num1; i <= num2; i++) {
                            res *= i;
                        }
                    } else if (exponencial.isSelected()) {
                        res = (int) Math.pow(num1, num2);
                    }

                    resultado.setText(String.valueOf(res));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, introduce números válidos.");
                }
            }
        });
    }
}

