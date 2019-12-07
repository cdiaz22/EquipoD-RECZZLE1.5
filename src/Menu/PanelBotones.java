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
public class PanelBotones extends JFrame{
    public PanelImagen2 panelB;
    private JButton bReturn;
    private JButton bIniciar;
    private JLabel textOrganico;
    private JLabel textAluminio;
    private JLabel textPapel;
    private JLabel textPlastico;
    private JLabel InstruccionOrganico;
    private JLabel InstruccionOrganico2;
    private JLabel InstruccionAluminio;
    private JLabel InstruccionAluminio2;
    private JLabel InstruccionPapel;
    private JLabel InstruccionPapel2;
    private JLabel InstruccionPlastico;
    private JLabel InstruccionPlastico2;

    public PanelBotones(){
        this.setSize(1707, 960); //Tamaño del JFrame
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Cierra por completo el JFrame
        this.setLocationRelativeTo(null); //Pone el JFrame al medio de la pantalla
        this.setTitle("Ayuda"); //titulo de la ventana
        this.setResizable(false);
        this.setUndecorated(true);
        open(true);

        iniciarComponentes();
    }

    private void open(boolean show){
        this.setVisible(show);
    }

    private void iniciarComponentes(){
        colocarPaneles();
        cosasControl();
        botonSiguiente();
        botonRegresar();
    }

    private void cosasControl(){
        parteTeclado();
        partePlay();
        parteXbox();
        imagenesControles();
    }

    private void imagenesControles(){
        imegenTeclado();
        imagenPlay();
        imagenXbox();
    }

    private void colocarPaneles(){
        panelB = new PanelImagen2(); //crea el JPanel
        panelB.setLayout(null); //desactiva el Layout(Diseño)
        this.getContentPane().add(panelB); //agrega el panel a la ventana
        this.setContentPane(panelB);//esto implementa la imagen de fondo del JFrame
    }

    private void parteTeclado(){
        //TECLADO Y MOUSE
        textOrganico = new JLabel(); //titulo de Organico
        textOrganico.setText("TECLADO Y MOUSE");//texto
        textOrganico.setBounds(100, 50, 500,60);//posicion del texto
        textOrganico.setHorizontalAlignment(SwingConstants.LEFT);//Alineacion de texto
        textOrganico.setForeground(Color.BLUE);//agrega color a la letra
        textOrganico.setFont(new Font("bahnschrift semibold", Font.PLAIN, 30));//establece la fuente del texto
        this.add(textOrganico);

        //Instruccion de Botones
        InstruccionOrganico = new JLabel();
        InstruccionOrganico.setText("BOTONES PARA MOVERSE");
        InstruccionOrganico.setBounds(600, 10, 500, 60);
        InstruccionOrganico.setHorizontalAlignment(SwingConstants.LEFT);
        InstruccionOrganico.setFont(new Font("bahnschrift semibold", Font.PLAIN, 30));//establece la fuente del texto
        InstruccionOrganico.setForeground(Color.BLUE);//agrega color a la letra
        this.add(InstruccionOrganico);
    }

    private void partePlay(){
        //PLAY STATION
        textAluminio = new JLabel(); //titulo de Organico
        textAluminio.setText("PLAYSTATION");//texto
        textAluminio.setBounds(600, 50, 500,60);
        textAluminio.setHorizontalAlignment(SwingConstants.LEFT);
        textAluminio.setFont(new Font("bahnschrift semibold", Font.PLAIN, 30));//establece la fuente del texto
        textAluminio.setForeground(Color.BLUE);//agrega color a la letra
        this.add(textAluminio);
    }

    private void parteXbox(){
        //XBOX
        textPapel = new JLabel(); //titulo de Organico
        textPapel.setText("XBOX");//texto
        textPapel.setBounds(1120, 50, 300,60);
        textPapel.setHorizontalAlignment(SwingConstants.LEFT);
        textPapel.setFont(new Font("bahnschrift semibold", Font.PLAIN, 30));//establece la fuente del texto
        textPapel.setForeground(Color.BLUE);//agrega color a la letra
        this.add(textPapel);
    }

    //Imagenes Teclado
    private void imegenTeclado(){
        //Fleacha Derecha
        JLabel iFDerecha = new JLabel(); //titulo de Organico
        iFDerecha.setIcon(new ImageIcon("src/Imagenes/fDerecha.png")); //agrega el icono
        iFDerecha.setBounds(-190, 130, 500,99);
        this.add(iFDerecha);
        JLabel textoFDerecha = new JLabel();
        textoFDerecha.setText(" mueve la basura hacia la derecha");//texto
        textoFDerecha.setBounds(100, 130, 500,99);//posicion del texto
        textoFDerecha.setHorizontalAlignment(SwingConstants.LEFT);//Alineacion de texto
        textoFDerecha.setForeground(Color.BLUE);//agrega color a la letra
        textoFDerecha.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        this.add(textoFDerecha);

        //Fleacha Izquierda
        JLabel iFIzquierda = new JLabel(); //titulo de Organico
        iFIzquierda.setIcon(new ImageIcon("src/Imagenes/fIzquierda.png")); //agrega el icono
        iFIzquierda.setBounds(-190, 230, 500,99);
        this.add(iFIzquierda);
        JLabel textoFIzquierda = new JLabel();
        textoFIzquierda.setText(" mueve la basura hacia la izquierda ");//texto
        textoFIzquierda.setBounds(100, 230, 500,99);//posicion del texto
        textoFIzquierda.setHorizontalAlignment(SwingConstants.LEFT);//Alineacion de texto
        textoFIzquierda.setForeground(Color.BLUE);//agrega color a la letra
        textoFIzquierda.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        this.add(textoFIzquierda);

        //Fleacha Abajo
        JLabel iFAbajo = new JLabel(); //titulo de Organico
        iFAbajo.setIcon(new ImageIcon("src/Imagenes/fAbajo.png")); //agrega el icono
        iFAbajo.setBounds(-190, 330, 500,99);
        this.add(iFAbajo);
        JLabel textoFAbajo = new JLabel();
        textoFAbajo.setText(" hace girar la basura hacia la izquierda ");//texto
        textoFAbajo.setBounds(100, 330, 500,99);//posicion del texto
        textoFAbajo.setHorizontalAlignment(SwingConstants.LEFT);//Alineacion de texto
        textoFAbajo.setForeground(Color.BLUE);//agrega color a la letra
        textoFAbajo.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        this.add(textoFAbajo);

        //Fleacha Arriba
        JLabel iFArriba = new JLabel(); //titulo de Organico
        iFArriba.setIcon(new ImageIcon("src/Imagenes/fArriba.png")); //agrega el icono
        iFArriba.setBounds(-190, 430, 500,99);
        this.add(iFArriba);
        JLabel textoFArriba = new JLabel();
        textoFArriba.setText(" hace girar la basura hacia la derecha ");//texto
        textoFArriba.setBounds(100, 430, 500,99);//posicion del texto
        textoFArriba.setHorizontalAlignment(SwingConstants.LEFT);//Alineacion de texto
        textoFArriba.setForeground(Color.BLUE);//agrega color a la letra
        textoFArriba.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        this.add(textoFArriba);

        //R Reinicia
        JLabel iReiniciar = new JLabel(); //titulo de Organico
        iReiniciar.setIcon(new ImageIcon("src/Imagenes/rReini.png")); //agrega el icono
        iReiniciar.setBounds(-190, 530, 500,99);
        this.add(iReiniciar);
        JLabel textoR = new JLabel();
        textoR.setText(" reinicia la partida");//texto
        textoR.setBounds(100, 530, 500,99);//posicion del texto
        textoR.setHorizontalAlignment(SwingConstants.LEFT);//Alineacion de texto
        textoR.setForeground(Color.BLUE);//agrega color a la letra
        textoR.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        this.add(textoR);

        //Q Salir
        JLabel iSalir = new JLabel(); //titulo de Organico
        iSalir.setIcon(new ImageIcon("src/Imagenes/qSali.png")); //agrega el icono
        iSalir.setBounds(-190, 630, 500,99);
        this.add(iSalir);
        JLabel textoQ = new JLabel();
        textoQ.setText(" se sale del juego");//texto
        textoQ.setBounds(100, 630, 500,99);//posicion del texto
        textoQ.setHorizontalAlignment(SwingConstants.LEFT);//Alineacion de texto
        textoQ.setForeground(Color.BLUE);//agrega color a la letra
        textoQ.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        this.add(textoQ);
    }

    //Imagenes Control de Play
    private void imagenPlay(){
        //Fleacha Derecha
        JLabel iFDerecha = new JLabel(); //titulo de Organico
        iFDerecha.setIcon(new ImageIcon("src/Imagenes/fDerecha.png")); //agrega el icono
        iFDerecha.setBounds(350, 130, 500,99);
        this.add(iFDerecha);
        JLabel textoFDerecha = new JLabel();
        textoFDerecha.setText(" mueve la basura hacia la derecha");//texto
        textoFDerecha.setBounds(650, 130, 500,99);//posicion del texto
        textoFDerecha.setHorizontalAlignment(SwingConstants.LEFT);//Alineacion de texto
        textoFDerecha.setForeground(Color.BLUE);//agrega color a la letra
        textoFDerecha.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        this.add(textoFDerecha);

        //Fleacha Izquierda
        JLabel iFIzquierda = new JLabel(); //titulo de Organico
        iFIzquierda.setIcon(new ImageIcon("src/Imagenes/fIzquierda.png")); //agrega el icono
        iFIzquierda.setBounds(350, 230, 500,99);
        this.add(iFIzquierda);
        JLabel textoFIzquierda = new JLabel();
        textoFIzquierda.setText(" mueve la basura hacia la izquierda ");//texto
        textoFIzquierda.setBounds(650, 230, 500,99);//posicion del texto
        textoFIzquierda.setHorizontalAlignment(SwingConstants.LEFT);//Alineacion de texto
        textoFIzquierda.setForeground(Color.BLUE);//agrega color a la letra
        textoFIzquierda.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        this.add(textoFIzquierda);

        //Fleacha Abajo
        JLabel iFAbajo = new JLabel(); //titulo de Organico
        iFAbajo.setIcon(new ImageIcon("src/Imagenes/fAbajo.png")); //agrega el icono
        iFAbajo.setBounds(350, 330, 500,99);
        this.add(iFAbajo);
        JLabel textoFAbajo = new JLabel();
        textoFAbajo.setText(" hace girar la basura hacia la izquierda ");//texto
        textoFAbajo.setBounds(650, 330, 500,99);//posicion del texto
        textoFAbajo.setHorizontalAlignment(SwingConstants.LEFT);//Alineacion de texto
        textoFAbajo.setForeground(Color.BLUE);//agrega color a la letra
        textoFAbajo.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        this.add(textoFAbajo);

        //Fleacha Arriba
        JLabel iFArriba = new JLabel(); //titulo de Organico
        iFArriba.setIcon(new ImageIcon("src/Imagenes/fArriba.png")); //agrega el icono
        iFArriba.setBounds(350, 430, 500,99);
        this.add(iFArriba);
        JLabel textoFArriba = new JLabel();
        textoFArriba.setText(" hace girar la basura hacia la derecha ");//texto
        textoFArriba.setBounds(650, 430, 500,99);//posicion del texto
        textoFArriba.setHorizontalAlignment(SwingConstants.LEFT);//Alineacion de texto
        textoFArriba.setForeground(Color.BLUE);//agrega color a la letra
        textoFArriba.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        this.add(textoFArriba);

        //Triangulo Reinicia
        JLabel iReiniciar = new JLabel(); //titulo de Organico
        iReiniciar.setIcon(new ImageIcon("src/Imagenes/tReini.png")); //agrega el icono
        iReiniciar.setBounds(350, 530, 500,99);
        this.add(iReiniciar);
        JLabel textoT = new JLabel();
        textoT.setText(" reinicia la partida");//texto
        textoT.setBounds(650, 530, 500,99);//posicion del texto
        textoT.setHorizontalAlignment(SwingConstants.LEFT);//Alineacion de texto
        textoT.setForeground(Color.BLUE);//agrega color a la letra
        textoT.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        this.add(textoT);

        //Circulo Salir
        JLabel iSalir = new JLabel(); //titulo de Organico
        iSalir.setIcon(new ImageIcon("src/Imagenes/oSalir.png")); //agrega el icono
        iSalir.setBounds(350, 630, 500,99);
        this.add(iSalir);
        JLabel textoO = new JLabel();
        textoO.setText(" se sale del juego");//texto
        textoO.setBounds(650, 630, 500,99);//posicion del texto
        textoO.setHorizontalAlignment(SwingConstants.LEFT);//Alineacion de texto
        textoO.setForeground(Color.BLUE);//agrega color a la letra
        textoO.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        this.add(textoO);

    }

    //Imagenes Control de Xbox
    private void imagenXbox(){
        //Fleacha Derecha
        JLabel iFDerecha = new JLabel(); //titulo de Organico
        iFDerecha.setIcon(new ImageIcon("src/Imagenes/fDerecha.png")); //agrega el icono
        iFDerecha.setBounds(880, 130, 500,99);
        this.add(iFDerecha);
        JLabel textoFDerecha = new JLabel();
        textoFDerecha.setText(" mueve la basura hacia la derecha");//texto
        textoFDerecha.setBounds(1180, 130, 500,99);//posicion del texto
        textoFDerecha.setHorizontalAlignment(SwingConstants.LEFT);//Alineacion de texto
        textoFDerecha.setForeground(Color.BLUE);//agrega color a la letra
        textoFDerecha.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        this.add(textoFDerecha);

        //Fleacha Izquierda
        JLabel iFIzquierda = new JLabel(); //titulo de Organico
        iFIzquierda.setIcon(new ImageIcon("src/Imagenes/fIzquierda.png")); //agrega el icono
        iFIzquierda.setBounds(880, 230, 500,99);
        this.add(iFIzquierda);
        JLabel textoFIzquierda = new JLabel();
        textoFIzquierda.setText(" mueve la basura hacia la izquierda ");//texto
        textoFIzquierda.setBounds(1180, 230, 500,99);//posicion del texto
        textoFIzquierda.setHorizontalAlignment(SwingConstants.LEFT);//Alineacion de texto
        textoFIzquierda.setForeground(Color.BLUE);//agrega color a la letra
        textoFIzquierda.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        this.add(textoFIzquierda);

        //Fleacha Abajo
        JLabel iFAbajo = new JLabel(); //titulo de Organico
        iFAbajo.setIcon(new ImageIcon("src/Imagenes/fAbajo.png")); //agrega el icono
        iFAbajo.setBounds(880, 330, 500,99);
        this.add(iFAbajo);
        JLabel textoFAbajo = new JLabel();
        textoFAbajo.setText(" hace girar la basura hacia la izquierda ");//texto
        textoFAbajo.setBounds(1180, 330, 500,99);//posicion del texto
        textoFAbajo.setHorizontalAlignment(SwingConstants.LEFT);//Alineacion de texto
        textoFAbajo.setForeground(Color.BLUE);//agrega color a la letra
        textoFAbajo.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        this.add(textoFAbajo);

        //Fleacha Arriba
        JLabel iFArriba = new JLabel(); //titulo de Organico
        iFArriba.setIcon(new ImageIcon("src/Imagenes/fArriba.png")); //agrega el icono
        iFArriba.setBounds(880, 430, 500,99);
        this.add(iFArriba);
        JLabel textoFArriba = new JLabel();
        textoFArriba.setText(" hace girar la basura hacia la derecha ");//texto
        textoFArriba.setBounds(1180, 430, 500,99);//posicion del texto
        textoFArriba.setHorizontalAlignment(SwingConstants.LEFT);//Alineacion de texto
        textoFArriba.setForeground(Color.BLUE);//agrega color a la letra
        textoFArriba.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        this.add(textoFArriba);

        //Y Reinicia
        JLabel iReiniciar = new JLabel(); //titulo de Organico
        iReiniciar.setIcon(new ImageIcon("src/Imagenes/yReini.png")); //agrega el icono
        iReiniciar.setBounds(880, 530, 500,99);
        this.add(iReiniciar);
        JLabel textoY = new JLabel();
        textoY.setText(" reinicia la partida");//texto
        textoY.setBounds(1180, 530, 500,99);//posicion del texto
        textoY.setHorizontalAlignment(SwingConstants.LEFT);//Alineacion de texto
        textoY.setForeground(Color.BLUE);//agrega color a la letra
        textoY.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        this.add(textoY);

        //B Salir
        JLabel iSalir = new JLabel(); //titulo de Organico
        iSalir.setIcon(new ImageIcon("src/Imagenes/bSali.png")); //agrega el icono
        iSalir.setBounds(880, 630, 500,99);
        this.add(iSalir);
        JLabel textoB = new JLabel();
        textoB.setText(" se sale del juego");//texto
        textoB.setBounds(1180, 630, 500,99);//posicion del texto
        textoB.setHorizontalAlignment(SwingConstants.LEFT);//Alineacion de texto
        textoB.setForeground(Color.BLUE);//agrega color a la letra
        textoB.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        this.add(textoB);
    }

    //Boton Siguiente
    private void botonSiguiente(){
        //Regreso
        bIniciar = new JButton();
        bIniciar.setIcon(new ImageIcon("src/Imagenes/sig2.png"));
        bIniciar.setBounds(1030, 830, 500,99);
        bIniciar.setOpaque(false);
        bIniciar.setContentAreaFilled(false); //le da el color del fondo
        bIniciar.setBorderPainted(false); //pinta el borde del boton
        this.add(bIniciar);

        ActionListener oyeSiguiente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelSeleccion menuS = new PanelSeleccion();
                open(false);
            }
        };
        bIniciar.addActionListener(oyeSiguiente);

        //fantasma
        JLabel text = new JLabel(); //titulo de Organico
        text.setText("");//texto
        text.setBounds(0, 0, 0,0);
        this.add(text);
    }

    //Boton Regresar
    private void botonRegresar(){
        //Regreso
        bReturn = new JButton();
        bReturn.setIcon(new ImageIcon("src/Imagenes/reg2.png"));
        bReturn.setBounds(-30, 830, 500,99);
        bReturn.setOpaque(false);
        bReturn.setContentAreaFilled(false); //le da el color del fondo
        bReturn.setBorderPainted(false); //pinta el borde del boton
        this.add(bReturn);

        ActionListener oyeReturn = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelAyuda2 menuA = new PanelAyuda2();
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
