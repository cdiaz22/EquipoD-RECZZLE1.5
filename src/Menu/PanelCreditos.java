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
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("ALL")
public class PanelCreditos extends JFrame {
    public PanelImagen2 panelC;
    private JLabel creadoPor;
    private JLabel diseLlador;
    private JLabel textXavi;
    private JLabel textBryan;
    private JLabel textCarlos;
    private JLabel textCesar;
    private JLabel textXavi2;
    private JButton bReturn;

    public PanelCreditos(){
        this.setSize(1707,960); //Tamaño del JFrame
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Cierra por completo el JFrame
        this.setLocationRelativeTo(null); //Pone el JFrame al medio de la pantalla
        this.setTitle("Creditos"); //titulo de la ventana
        this.setResizable(false);
        this.setUndecorated(true);
        open(true);

        //Fondo del JPanel
        //p = new PanelIma(); //llama a la clase PanelIma
        //this.setContentPane(p);//esto implementa la imagen de fondo del JFrame

        iniciarComponentees();
    }

    private void open(boolean show){
        this.setVisible(show);
    }

    private void iniciarComponentees(){
        colocarPaneles();
        creadoPor();
        xaVi();
        brYan();
        carLos();
        ceSar();
        botonRegresar();
    }

    private void colocarPaneles(){
        panelC = new PanelImagen2(); //crea el JPanel
        panelC.setLayout(null); //desactiva el Layout(Diseño)
        this.getContentPane().add(panelC); //agrega el panel a la ventana
        this.setContentPane(panelC);//esto implementa la imagen de fondo del JFrame
    }

    private void creadoPor(){
        //CreadoPor
        creadoPor = new JLabel(); //titulo de Organico
        creadoPor.setText("RECZZLE fue creado y desarrollado por");//texto
        creadoPor.setBounds(500, 50, 700,60);
        creadoPor.setHorizontalAlignment(SwingConstants.CENTER);
        creadoPor.setFont(new Font("bahnschrift semibold", Font.PLAIN, 30));//establece la fuente del texto
        creadoPor.setForeground(Color.BLUE);//agrega color a la letra
        this.add(creadoPor);

        //DiseñadorGrafico
        diseLlador = new JLabel(); //titulo de Organico
        diseLlador.setText("Diseñador gráfico");//texto
        diseLlador.setBounds(600, 400, 500,60);
        diseLlador.setHorizontalAlignment(SwingConstants.CENTER);
        diseLlador.setFont(new Font("bahnschrift semibold", Font.PLAIN, 30));//establece la fuente del texto
        diseLlador.setForeground(Color.BLUE);//agrega color a la letra
        this.add(diseLlador);
    }

    private void xaVi(){
        //Xavi
        textXavi = new JLabel(); //titulo de Organico
        textXavi.setText("Burgos Ponce Xavier Alberto");//texto
        textXavi.setBounds(600, 100, 500,60);
        textXavi.setHorizontalAlignment(SwingConstants.CENTER);
        textXavi.setFont(new Font("bahnschrift semibold", Font.PLAIN, 30));//establece la fuente del texto
        textXavi.setForeground(Color.BLUE);//agrega color a la letra
        this.add(textXavi);

        //Diseñador
        textXavi2 = new JLabel(); //titulo de Organico
        textXavi2.setText("Burgos Ponce Xavier Alberto");//texto
        textXavi2.setBounds(600, 450, 500,60);
        textXavi2.setHorizontalAlignment(SwingConstants.CENTER);
        textXavi2.setFont(new Font("bahnschrift semibold", Font.PLAIN, 30));//establece la fuente del texto
        textXavi2.setForeground(Color.BLUE);//agrega color a la letra
        this.add(textXavi2);
    }

    private void brYan(){
        //Bryan
        textBryan = new JLabel(); //titulo de Organico
        textBryan.setText("Caballero Villaseñor Bryan");//texto
        textBryan.setBounds(600, 150, 500,60);
        textBryan.setHorizontalAlignment(SwingConstants.CENTER);
        textBryan.setFont(new Font("bahnschrift semibold", Font.PLAIN, 30));//establece la fuente del texto
        textBryan.setForeground(Color.BLUE);//agrega color a la letra
        this.add(textBryan);
    }

    private void carLos(){
        //Carlos
        textCarlos = new JLabel(); //titulo de Organico
        textCarlos.setText("Díaz Prieto Carlos Eduardo");//texto
        textCarlos.setBounds(600, 200, 500,60);
        textCarlos.setHorizontalAlignment(SwingConstants.CENTER);
        textCarlos.setFont(new Font("bahnschrift semibold", Font.PLAIN, 30));//establece la fuente del texto
        textCarlos.setForeground(Color.BLUE);//agrega color a la letra
        this.add(textCarlos);
    }

    private void ceSar(){
        //Cesar
        textCesar = new JLabel(); //titulo de Organico
        textCesar.setText("Zurita Merino Cesar Leonardo");//texto
        textCesar.setBounds(600, 250, 500,60);
        textCesar.setHorizontalAlignment(SwingConstants.CENTER);
        textCesar.setFont(new Font("bahnschrift semibold", Font.PLAIN, 30));//establece la fuente del texto
        textCesar.setForeground(Color.BLUE);//agrega color a la letra
        this.add(textCesar);
    }

    private void botonRegresar(){
        //Regreso
        bReturn = new JButton();
        bReturn.setIcon(new ImageIcon("src/Imagenes/reg2.png"));
        bReturn.setBounds(600, 600, 500,99);
        bReturn.setOpaque(false);
        bReturn.setContentAreaFilled(false); //le da el color del fondo
        bReturn.setBorderPainted(false); //pinta el borde del boton
        this.add(bReturn);

        ActionListener oyeReturn = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
