/*
 *RECZZLE 1.5
 *VIDEOJUEGO PARA COMPUTADORA EN JAVA PARA APRENDER A SEPARAR RESIDUOS
 *AUTORES: CASTAÑÓN PUGA MANUEL, BURGOS PONCE XAVIER ALBERTO, CABALLERO VILLASEÑOR BRYAN, DÍAZ PRIETO CARLOS EDUARDO, ZURITA MERINO CESAR LEONARDO
 *CORREO ELECTRONICO: puga@uabc.edu.mx, burgos.xavier@uabc.edu.mx, bryan.caballero.villasenor@uabc.edu.mx, cdiaz22@uabc.edu.mx, cesar.zurita@uabc.edu.mx
 *UNIVERSIDAD AUTÓNOMA DEL ESTADO DE BAJA CALIFORNIA
 *http://www.uabc.mx
 */

package Menu;

import Juego.juego_main;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelSeleccion extends JFrame {
    public PanelImagen2 panelS;
    //public JPanel panelS;
    private JButton bFacil;
    private JButton bMedio;
    private JButton bDificil;
    private JButton bReturn;

    public PanelSeleccion(){
        this.setSize(1707, 960); //Tamaño de la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Cierra por completo el JFrame
        this.setLocationRelativeTo(null); //Pone el JFrame al medio de la pantalla
        this.setTitle("Menu"); //titulo de la ventana
        this.setResizable(false);
        this.setUndecorated(true);
        open(true);

        //Fondo del JPanel
        //p = new PanelIma(); //llama a la clase PanelIma
        //this.setContentPane(p); //esto implementa la imagen de fondo del JFrame

        iniciarComponentes();
    }

    private void open(boolean show){
        this.setVisible(show);
    }

    private void iniciarComponentes(){
        colocarPaneles();
        menuDificultad();
    }

    private void colocarPaneles(){
        panelS = new PanelImagen2(); //crea el JPanel
        panelS.setLayout(null); //desactiva el Layout(Diseño)
        this.getContentPane().add(panelS);
        this.setContentPane(panelS); //esto implementa la imagen de fondo del JFrame
    }

    private void menuDificultad(){
        botonFacil();
        boonMedio();
        botonDificil();
        botonRegresar();
    }
    private void botonFacil(){
        //Facil
        bFacil = new JButton();
        bFacil.setIcon(new ImageIcon("src/Imagenes/fac2.png"));
        bFacil.setText("Facil");
        bFacil.setBounds(600, 170, 500,99);
        bFacil.setOpaque(false);
        bFacil.setContentAreaFilled(false); //le da el color del fondo
        bFacil.setBorderPainted(false); //pinta el borde del boton
        this.add(bFacil);

        ActionListener oyeFacil = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                juego_main mainWindow = new juego_main();
                mainWindow.setDifficulty(1);
                mainWindow.juego_maino();

                open(false);
            }
        };
        bFacil.addActionListener(oyeFacil);
    }

    private void boonMedio(){
        //Medio
        bMedio = new JButton();
        bMedio.setIcon(new ImageIcon("src/Imagenes/med2.png"));
        bMedio.setText("MEdio");
        bMedio.setBounds(600, 270, 500,99);
        bMedio.setOpaque(false);
        bMedio.setContentAreaFilled(false); //le da el color del fondo
        bMedio.setBorderPainted(false); //pinta el borde del boton
        this.add(bMedio);

        ActionListener oyeMedio = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                juego_main mainWindow = new juego_main();
                mainWindow.setDifficulty(2);
                mainWindow.juego_maino();

                open(false);
            }
        };
        bMedio.addActionListener(oyeMedio);
    }

    private void botonDificil(){
        //Dificil
        bDificil = new JButton();
        bDificil.setIcon(new ImageIcon("src/Imagenes/dif2.png"));
        bDificil.setText("Dificil");
        bDificil.setBounds(600, 370, 500,99);
        bDificil.setOpaque(false);
        bDificil.setContentAreaFilled(false); //le da el color del fondo
        bDificil.setBorderPainted(false); //pinta el borde del boton
        this.add(bDificil);

        ActionListener oyeDificil = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                juego_main mainWindow = new juego_main();
                mainWindow.setDifficulty(3);
                mainWindow.juego_maino();

                open(false);
            }
        };
        bDificil.addActionListener(oyeDificil);
    }

    public void botonRegresar(){
        //Regreso
        bReturn = new JButton();
        bReturn.setIcon(new ImageIcon("src/Imagenes/reg2.png"));
        bReturn.setBounds(600, 470, 500,99);
        bReturn.setOpaque(false);
        bReturn.setContentAreaFilled(false); //le da el color del fondo
        bReturn.setBorderPainted(false); //pinta el borde del boton
        this.add(bReturn);

        ActionListener oyeReturn = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelBotones menuB = new PanelBotones();
                open(false);
            }

        };
        bReturn.addActionListener(oyeReturn);

        //fantasma
        JLabel text = new JLabel(); //titulo de Organico
        text.setText("");//texto
        text.setBounds(0, 0, 0,0);
        this.add(text);
    }
}
