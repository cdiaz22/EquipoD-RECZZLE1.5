/*
 *RECZZLE 1.5
 *VIDEOJUEGO PARA COMPUTADORA EN JAVA PARA APRENDER A SEPARAR RESIDUOS
 *AUTORES: CASTAÑÓN PUGA MANUEL, BURGOS PONCE XAVIER ALBERTO, CABALLERO VILLASEÑOR BRYAN, DÍAZ PRIETO CARLOS EDUARDO, ZURITA MERINO CESAR LEONARDO
 *CORREO ELECTRONICO: puga@uabc.edu.mx, burgos.xavier@uabc.edu.mx, bryan.caballero.villasenor@uabc.edu.mx, cdiaz22@uabc.edu.mx, cesar.zurita@uabc.edu.mx
 *UNIVERSIDAD AUTÓNOMA DEL ESTADO DE BAJA CALIFORNIA
 *http://www.uabc.mx
 */

package Menu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("ALL")
public class PanelMenu extends JFrame {
    public PanelIma panelM;
    private JButton bInicio;
    private JButton bAyuda;
    private JButton bCredit;
    private JButton bSalir;
    private JButton bPuntuaje;

    public  PanelMenu(){
        this.setSize(1707,960); //Tamaño de la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Cierra por completo el JFrame
        this.setLocationRelativeTo(null); //Pone el JFrame al medio de la pantalla
        this.setTitle("Menu"); //titulo de la ventana
        this.setResizable(false);
        this.setUndecorated(true);
        iniciarComponentees();

        open(true);
    }

    private void open(boolean show){
        this.setVisible(show);
    }

    private void iniciarComponentees(){
        colocarPanel();
        menuSeleccion();
    }

    private  void colocarPanel(){
        panelM = new PanelIma(); //crea el JPanel
        panelM.setLayout(null); //desactiva el Layout(Diseño)
        this.getContentPane().add(panelM);
        this.setContentPane(panelM); //esto implementa la imagen de fondo del JFrame
    }

    private void menuSeleccion(){
        botonIniciar();
        botonCreditos();
        botonSalir();
        botonAyuda();
    }

    private void botonIniciar(){
        //Iniciar
        bInicio = new JButton();
        bInicio.setIcon(new ImageIcon("src/Imagenes/ini2.png"));
        bInicio.setBounds(600, 390, 500,99);
        bInicio.setOpaque(false);
        bInicio.setContentAreaFilled(false); //le da el color del fondo
        bInicio.setBorderPainted(false); //pinta el borde del boton
        this.add(bInicio);

        ActionListener oyeInicio = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelAyuda menuA2 = new PanelAyuda();
                //PanelSeleccion menuS = new PanelSeleccion();
                //open(false);
            }
        };
        bInicio.addActionListener(oyeInicio);
    }

    private void botonCreditos(){
        //Creditos
        bCredit = new JButton();
        bCredit.setIcon(new ImageIcon("src/Imagenes/cre2.png"));
        bCredit.setBounds(600, 490, 500,99);
        bCredit.setOpaque(false);
        bCredit.setContentAreaFilled(false); //le da el color del fondo
        bCredit.setBorderPainted(false); //pinta el borde del boton
        this.add(bCredit);

        ActionListener oyeCredito = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelCreditos menuC = new PanelCreditos();
                //frame.setVisible(false);
            }
        };
        bCredit.addActionListener(oyeCredito);
    }

    private void botonAyuda(){
        //Ayuda
        bAyuda = new JButton();
        bAyuda.setIcon(new ImageIcon("src/Imagenes/ayu2.png"));
        bAyuda.setBounds(600, 590, 500,99);
        bAyuda.setOpaque(false);
        bAyuda.setContentAreaFilled(false); //le da el color del fondo
        bAyuda.setBorderPainted(false); //pinta el borde del boton
        this.add(bAyuda);

        ActionListener oyeAyuda = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelAyuda menuA = new PanelAyuda();
            }
        };
        bAyuda.addActionListener(oyeAyuda);
    }

    private void botonSalir(){
        //Salir
        bSalir = new JButton();
        bSalir.setIcon(new ImageIcon("src/Imagenes/sal2.png"));
        bSalir.setBounds(600, 690, 500,99);
        bSalir.setOpaque(false);
        bSalir.setContentAreaFilled(false); //le da el color del fondo
        bSalir.setBorderPainted(false); //pinta el borde del boton
        this.add(bSalir);

        //ActionListener del boton salir
        ActionListener oyenteSalir = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        bSalir.addActionListener(oyenteSalir);

        //fantasma
        JLabel text = new JLabel(); //titulo de Organico
        text.setText("");//texto
        text.setBounds(0, 0, 0,0);
        this.add(text);
    }
}
