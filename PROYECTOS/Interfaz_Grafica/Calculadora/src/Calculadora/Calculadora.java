package Calculadora;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//clase per a crear la finestra on es mostrara la calculadora que hereda de JFRame
public class Calculadora extends JFrame{
    //funcio principal
    public static void main(String[] args) {
        //inicialitza la finestra(calculadora)
        Calculadora calculadora = new Calculadora();
    }
    //constructor de la finestra
    public Calculadora(){
        //titol de la finestra
        setTitle("Calculadora Basica");
        //tamany de la finestra
        setSize(400,400);
        //icon de la finestra
        setIconImage(new ImageIcon("img/calculator_11110623.png").getImage());
        //tanquem els porcesos per defecte al tancar la finestra
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //centrem la finestra a la pantalla
        setLocationRelativeTo(null);
        //iniciem els component a la finestra
        iniciarComponents();
        //iniciem el menu Quant a
        menuAutor();
        //fem que siga visible
        setVisible(true);
    }

    //funcio per a inicialitzar els components
    public void iniciarComponents(){

        //creem etiquetes per a cada apartat
        JLabel etiquetaNum1 = new JLabel("Num 1: ");
        etiquetaNum1.setFont(new Font("Arial", Font.PLAIN, 12));
        JLabel etiquetaNum2 = new JLabel("Num 2: ");
        etiquetaNum2.setFont(new Font("Arial", Font.PLAIN, 12));
        JLabel etiquetaOperacion = new JLabel("Operació:");
        etiquetaOperacion.setFont(new Font("SanSerif", Font.PLAIN, 12));
        JLabel etiquetaResultado = new JLabel("Result:");
        etiquetaResultado.setFont(new Font("Monospaced", Font.PLAIN, 12));

        //camps de text per a indicar el primer numero
        JTextField campNum1 = new JTextField(10);
        //camp de text per aindicar el segon numero
        JTextField campNum2 = new JTextField(10);
        //camp de text per a mostrar el resultat de la operació que
        JTextField campResultat= new JTextField(10);
        //indicarem que no es pot editar (setEditable)
        campResultat.setEditable(false);

        //boto per a la operacio de sumar
        JButton botonSuma = new JButton("+");
        //event per a la suma
        botonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //añadim excepcions per a que acepte sols numeros
                try{
                    //agafa el text de cada camp (getText) y el parsejem a un dobule
                    double num1 = Double.parseDouble(campNum1.getText());
                    double num2 = Double.parseDouble(campNum2.getText());
                    double resultat = num1 + num2;
                    //afegim el resultat (seText) al camp resultat tornanlo a pasarjer a String
                    campResultat.setText(String.valueOf(resultat));
                }catch(NumberFormatException ex){
                    //misatge de error en un JoptionPane
                    JOptionPane.showMessageDialog(null, "Numero Incorrecte\nIntrodueix un numero correcte");
                }
            }
        });
        //boto per a la operacio de restar
        JButton botonResta = new JButton("-");
        botonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double num1 = Double.parseDouble(campNum1.getText());
                    double num2 = Double.parseDouble(campNum2.getText());
                    double resultat = num1 - num2;
                    campResultat.setText(String.valueOf(resultat));
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Numero Incorrecte\nIntrodueix un numero correcte");
                }
            }
        });
        //boto per a la operacio de multiplicar
        JButton botonMultiplicacio = new JButton("*");
        botonMultiplicacio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double num1 = Double.parseDouble(campNum1.getText());
                    double num2 = Double.parseDouble(campNum2.getText());
                    double resultat = num1 * num2;
                    campResultat.setText(String.valueOf(resultat));
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Numero Incorrecte\nIntrodueix un numero correcte");
                }
            }
        });
        //boto per a la operacio de dividir
        JButton botonDivision = new JButton("/");
        botonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double num1 = Double.parseDouble(campNum1.getText());
                    double num2 = Double.parseDouble(campNum2.getText());
                    double resultat = num1 / num2;
                    campResultat.setText(String.valueOf(resultat));
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Numero Incorrecte\nIntrodueix un numero correcte");
                }
            }
        });

        //titol del panell amb la font cambiada y centrat
        JLabel titol = new JLabel("Calculadora Basica", SwingConstants.CENTER);
        titol.setFont(new Font("Serif", Font.BOLD, 22)); //negreta tamany 30

        /*Organització dels components amb gridlayout
            Primera fila: campNum1, campNum2 (2 columnes)
            Segona fila: botoSumar, botoResta, botoMultiplicaio, botoDivisio (4columnes)
            Tercera fila: Camp del resultat(1columna tot el ample)
         */
        //creem el panel principal per a mostrar els component
        JPanel panel = new JPanel();
        //indicquem que el panell utilitze GridLayout
        //4 files, 1  columna per fila, 10px de separacio
        panel.setLayout(new GridLayout(5,1,10,10));

        //creem parenlls per a cada fila am FlowLayaout
        JPanel panel1Fila = new JPanel(new FlowLayout());
        JPanel panel2Fila = new JPanel(new FlowLayout());
        JPanel panel3Fila = new JPanel(new FlowLayout());

        //afegim el titol al panell
        panel.add(titol);

        //compnents primera fila
        panel1Fila.add(etiquetaNum1);
        panel1Fila.add(campNum1);
        panel1Fila.add(etiquetaNum2);
        panel1Fila.add(campNum2);

        //components segona fila
        panel2Fila.add(etiquetaOperacion);
        panel2Fila.add(botonSuma);
        panel2Fila.add(botonResta);
        panel2Fila.add(botonMultiplicacio);
        panel2Fila.add(botonDivision);

        //components tercera fila
        panel3Fila.add(etiquetaResultado);
        panel3Fila.add(campResultat);

        //añadim les files al panell grid
        panel.add(panel1Fila);
        panel.add(panel2Fila);
        panel.add(panel3Fila);

        //afegim el panell grid al JFrame
        add(panel);
    }

    //funcio per al menu Quant a...
    public void menuAutor(){
        //iniciem una barra de menu
        JMenuBar menuBar = new JMenuBar();
        //iniciem el que es mostrara a la barra
        JMenu menuQuantA = new JMenu("Quant a:");
        menuQuantA.setFont(new Font("Monospaced", Font.BOLD, 20));
        //iniciem el panell que ixira al fer click
        JMenuItem autor = new JMenuItem("Autor");
        autor.setFont(new Font("Monospaced", Font.BOLD, 20));
        //añadim el event al fer click
        autor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mostrarem un misatge am JOptionPanel
                JOptionPane.showMessageDialog(null, "Nombre: Andreu\nApellidos: Orenga Ramon");
            }
        });

        //añadim el menu dins del seu panell
        menuQuantA.add(autor);
        menuBar.add(menuQuantA);

        //añadim el panell al JFrame
        setJMenuBar(menuBar);
    }


}
