package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Burguer_App extends JFrame {
    public static void main(String[] args) {
        //construccio la finestra en el main
        Burguer_App app = new Burguer_App();
    }
    //funcio per a crear la finestra (JFrame) principal
    public Burguer_App() {
        //titol aplicacio
       setTitle("Burguer Queen App");
       //tamañ de la finestra
       setSize(800, 600);
       //finalitzar procesos al tancar
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //centrar en la pantalla
       setLocationRelativeTo(null);
       //icon de la finestra
        setIconImage(new ImageIcon(("img/food_13641494.png")).getImage());
       //iniciem els components
       inicarComponents();
       //fer que siga visible
       setVisible(true);
    }

    //funcio per als components de la finestra
    public void inicarComponents(){
        //creem el panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));//orientació vertical

        //etiqueta per al titol del menu
        JLabel titol = new JLabel("Menú Basic [9,50€]");
        titol.setFont(new Font("Monospaced", Font.BOLD, 20));
        //centrem el titol
        titol.setAlignmentX(Component.CENTER_ALIGNMENT);
        //espacio en vertical para seguir añadiendo los componentes
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        //añadim el titol al panel principal
        panel.add(titol);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        //panel per a la seccio de menjar (Grid)
        JPanel panelMenjar = new JPanel();
        //inidiquem que el panell es Grid 1 fila, 3 columnes, 10 px de separacio
        panelMenjar.setLayout(new GridLayout(1,3,10,10));

        //seccio de hamburgueses
        JPanel hamburguesas = new JPanel();
        hamburguesas.setLayout(new GridLayout(0,1));
        //añadim un borde per a la seccio amb el titol
        hamburguesas.setBorder(BorderFactory.createTitledBorder("Hamburgueses"));
        //radiobuttons per a la seleccio de les opcions
        JRadioButton pollo = new JRadioButton("Pollastre");
        JRadioButton porc = new JRadioButton("Porc");
        JRadioButton ternera = new JRadioButton("Ternera [+1€]");
        JRadioButton vegana = new JRadioButton("Vegana [+1€]");
        pollo.setFont(new Font("Monospaced", Font.PLAIN, 14));
        porc.setFont(new Font("Monospaced", Font.PLAIN, 14));
        ternera.setFont(new Font("Monospaced", Font.PLAIN, 14));
        vegana.setFont(new Font("Monospaced", Font.PLAIN, 14));

        //añadim les opcions al seu panell (hamburgueses)
        hamburguesas.add(pollo);
        hamburguesas.add(ternera);
        hamburguesas.add(porc);
        hamburguesas.add(vegana);

        //seccio de Pá
        JPanel pa = new JPanel();
        pa.setLayout(new GridLayout(0,1));
        //añadim un borde per a la seccio amb el titol
        pa.setBorder(BorderFactory.createTitledBorder("Pá"));
        //radiobuttons per a la seleccio de les opcions
        JRadioButton normal = new JRadioButton("Normal");
        JRadioButton integral = new JRadioButton("Integral");
        JRadioButton centeno = new JRadioButton("Centeno");
        normal.setFont(new Font("Monospaced", Font.PLAIN, 14));
        integral.setFont(new Font("Monospaced", Font.PLAIN, 14));
        centeno.setFont(new Font("Monospaced", Font.PLAIN, 14));
        //añadim les opcions al seu panell (pa)
        pa.add(normal);
        pa.add(integral);
        pa.add(centeno);

        //seccio de Creilles
        JPanel creilles = new JPanel();
        creilles.setLayout(new GridLayout(0,1));
        //añadim un borde per a la seccio amb el titol
        creilles.setBorder(BorderFactory.createTitledBorder("Creïlles"));
        //radiobuttons per a la seleccio de les opcions
        JRadioButton fregides = new JRadioButton("Fregides");
        JRadioButton espiral = new JRadioButton("Espiral");
        JRadioButton caseres = new JRadioButton("Caseres [+1€]");
        fregides.setFont(new Font("Monospaced", Font.PLAIN, 14));
        espiral.setFont(new Font("Monospaced", Font.PLAIN, 14));
        caseres.setFont(new Font("Monospaced", Font.PLAIN, 14));
        //añadim les opcions al seu panell (hamburgueses)
        creilles.add(fregides);
        creilles.add(espiral);
        creilles.add(caseres);
        //anyadim coda seccio al panell de menjar
        panelMenjar.add(hamburguesas);
        panelMenjar.add(pa);
        panelMenjar.add(creilles);
        //afegim el panell de menjar al panell principal
        panel.add(panelMenjar);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        //seccio de beguda
        JPanel bebidasContenedor = new JPanel();
        bebidasContenedor.setLayout(new FlowLayout(FlowLayout.CENTER));
        JPanel bebidas = new JPanel();
        bebidas.setLayout(new FlowLayout(FlowLayout.CENTER));
        bebidas.setBorder(BorderFactory.createTitledBorder("Bebida"));
        JRadioButton cola = new JRadioButton("Cola");
        JRadioButton taronja = new JRadioButton("Taronja");
        JRadioButton llimo = new JRadioButton("Llimo");
        JRadioButton aigua = new JRadioButton("Aigua");
        JRadioButton cervesa = new JRadioButton("Cervesa");
        cola.setFont(new Font("Monospaced", Font.PLAIN, 14));
        taronja.setFont(new Font("Monospaced", Font.PLAIN, 14));
        llimo.setFont(new Font("Monospaced", Font.PLAIN, 14));
        aigua.setFont(new Font("Monospaced", Font.PLAIN, 14));
        cervesa.setFont(new Font("Monospaced", Font.PLAIN, 14));
        //afegim les begudes al panell de begudes
        bebidas.add(cola);
        bebidas.add(taronja);
        bebidas.add(llimo);
        bebidas.add(aigua);
        bebidas.add(cervesa);

        bebidasContenedor.add(bebidas);
        panel.add(bebidasContenedor);


        //seccio oppcions extra / salses
        JPanel extras_salsesCont = new JPanel();
        extras_salsesCont.setLayout(new FlowLayout(FlowLayout.CENTER));
        JPanel extres_salses = new JPanel();
        extres_salses.setLayout(new GridLayout(1,2,10,10));
        //seccio extres
        JPanel extres = new JPanel();
        extres.setLayout(new GridLayout(0,1));
        extres.setBorder(BorderFactory.createTitledBorder("Extres"));
        //opcions amb checkbox
        JCheckBox doble = new JCheckBox("Hamburguesa Doble [+2€]");
        JCheckBox formatge = new JCheckBox("Extra de Formatge [+0,50€]");
        JCheckBox extraCreilles = new JCheckBox("Extra de Creïlles [1€]");
        doble.setFont(new Font("Monospaced", Font.PLAIN, 14));
        formatge.setFont(new Font("Monospaced", Font.PLAIN, 14));
        extraCreilles.setFont(new Font("Monospaced", Font.PLAIN, 14));
        extres.add(doble);
        extres.add(formatge);
        extres.add(extraCreilles);

        JPanel salses = new JPanel();
        //posem dos columnes ya que volem posar una opcio al costat de l'altra
        salses.setLayout(new GridBagLayout());
        salses.setBorder(BorderFactory.createTitledBorder("Salses [+0,50€ Cada una]"));//borde amb tiol
        //cremm els component Spinner per a poder seleccionar cantitat junt amb la seua etiqueta
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2,2,2,2);//margen entre components
        JLabel ketchupLabel = new JLabel("Ketchup");
        ketchupLabel.setFont(new Font("Monospaced", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 0;
        salses.add(ketchupLabel, gbc);
        JSpinner ketchupSpinner = new JSpinner(new SpinnerNumberModel(0,0,10,1));
        gbc.gridx = 1;
        gbc.gridy = 0;
        salses.add(ketchupSpinner, gbc);
        JLabel mostazaLabel = new JLabel("Mostaza");
        mostazaLabel.setFont(new Font("Monospaced", Font.PLAIN, 14));
        gbc.gridx = 2;
        gbc.gridy = 0;
        salses.add(mostazaLabel, gbc);
        JSpinner mostazaSpinner = new JSpinner(new SpinnerNumberModel(0,0,10,1));
        gbc.gridx = 3;
        gbc.gridy = 0;
        salses.add(mostazaSpinner, gbc);
        JLabel barbacoaLabel = new JLabel("Barbacoa");
        barbacoaLabel.setFont(new Font("Monospaced", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 1;
        salses.add (barbacoaLabel, gbc);
        JSpinner barbacoaSpinner = new JSpinner(new SpinnerNumberModel(0,0,10,1));
        gbc.gridx = 1;
        gbc.gridy = 1;
        salses.add(barbacoaSpinner, gbc);
        JLabel thaiLabel = new JLabel("Thai");
        thaiLabel.setFont(new Font("Monospaced", Font.PLAIN, 14));
        gbc.gridx = 2;
        gbc.gridy = 1;
        salses.add(thaiLabel, gbc);
        JSpinner thaiSpinner = new JSpinner(new SpinnerNumberModel(0,0,10,1));
        gbc.gridx = 3;
        gbc.gridy = 1;
        salses.add(thaiSpinner, gbc);

        extres_salses.add(extres);
        extres_salses.add(salses);
        extras_salsesCont.add(extres_salses);
        //añadim el panell de extres al panell principal
        panel.add(extras_salsesCont);

        // Sección de reparto
        JPanel reparto = new JPanel();
        reparto.setLayout(new FlowLayout(FlowLayout.CENTER));
        JRadioButton domicilio = new JRadioButton("Reparto a domicilio");
        JRadioButton local = new JRadioButton("Recogida en local (-20% dto.)");
        domicilio.setFont(new Font("Monospaced", Font.PLAIN, 14));
        local.setFont(new Font("Monospaced", Font.PLAIN, 14));
        reparto.add(domicilio);
        reparto.add(local);

        panel.add(reparto);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Espacio vertical

        // Botón de calcular
        JButton calcular = new JButton("CALCULAR");
        calcular.setFont(new Font("Monospaced", Font.BOLD, 12));
        calcular.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(calcular);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Espacio vertical

        // Sección de precios
        JPanel precios = new JPanel();
        precios.setLayout(new GridLayout(2, 3, 10, 10)); // 2 filas, 3 columnas, 10px de separación

        JLabel precioLabel = new JLabel("PRECIO");
        precioLabel.setFont(new Font("Monospaced", Font.PLAIN, 15));
        JTextField precioField = new JTextField();
        precioField.setEditable(false);

        JLabel ivaLabel = new JLabel("IVA (21%)");
        ivaLabel.setFont(new Font("Monospaced", Font.PLAIN, 15));
        JTextField ivaField = new JTextField();
        ivaField.setEditable(false);

        JLabel pvpLabel = new JLabel("P.V.P");
        pvpLabel.setFont(new Font("Monospaced", Font.PLAIN, 15));
        JTextField pvpField = new JTextField();
        pvpField.setEditable(false);

        precios.add(precioLabel);
        precios.add(ivaLabel);
        precios.add(pvpLabel);
        precios.add(precioField);
        precios.add(ivaField);
        precios.add(pvpField);
        panel.add(precios);
        //Event del boto calcular per a mostrar el preu
        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double precioBase = 9.50;
                double precioExtras = 0.0;

                if (ternera.isSelected()) {
                    precioExtras += 1.0;
                }
                if (caseres.isSelected()) {
                    precioExtras += 1.0;
                }
                if (doble.isSelected()) {
                    precioExtras += 2.0;
                }
                if (formatge.isSelected()) {
                    precioExtras += 0.5;
                }
                if (extraCreilles.isSelected()) {
                    precioExtras += 1.0;
                }

                // Calcular el total de las salsas
                double precioSalsas = 0.5 *(
                        (Integer) ketchupSpinner.getValue() +
                                (Integer) mostazaSpinner.getValue() +
                                (Integer) barbacoaSpinner.getValue() +
                                (Integer) thaiSpinner.getValue()
                );

                double precioTotal = precioBase + precioExtras + precioSalsas;

                // Aplicar descuento del 20% si se selecciona recogida en local
                if (local.isSelected()) {
                    precioTotal *= 0.80; // Aplica el 20% de descuento
                }

                double iva = precioTotal * 0.21;
                double pvp = precioTotal + iva;

                // Actualizar los campos de precios
                precioField.setText(Double.toString(precioTotal) + "€");
                ivaField.setText(Double.toString(iva) + "€");
                pvpField.setText(Double.toString(pvp) + "€");
            }
        });

        //añadim el panel principal per a que es carregue al JFrame
        add(panel);
    }
}