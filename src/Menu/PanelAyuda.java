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
public class PanelAyuda extends JFrame {
    public PanelImagen2 panelA;
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

    public PanelAyuda(){
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
        cosasReciclaje();
        botonSiguiente();
        botonRegresar();
    }

    private void cosasReciclaje(){
        parteOrganico();
        imegenOrganico();
        partePlastico();
        imagenPlastico();
        parteAluminio();
        imagenAluminio();
        partePapel();
        imagenPapel();
    }

    private void colocarPaneles(){
        panelA = new PanelImagen2(); //crea el JPanel
        panelA.setLayout(null); //desactiva el Layout(Diseño)
        this.getContentPane().add(panelA); //agrega el panel a la ventana
        this.setContentPane(panelA);//esto implementa la imagen de fondo del JFrame
    }

    private void parteOrganico(){
        //Organico
        textOrganico = new JLabel(); //titulo de Organico
        textOrganico.setText("Orgánico");//texto
        textOrganico.setBounds(100, 140, 300,30);//posicion del texto
        textOrganico.setHorizontalAlignment(SwingConstants.LEFT);//Alineacion de texto
        textOrganico.setForeground(Color.BLUE);//agrega color a la letra
        textOrganico.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        this.add(textOrganico);

        //Instruccion de Organico 1
        InstruccionOrganico = new JLabel();
        InstruccionOrganico.setText("Para formar grupos de basura Orgánica se deben de hacer grupos de 4 basuras");
        InstruccionOrganico.setBounds(250, 120, 1300, 30);
        InstruccionOrganico.setHorizontalAlignment(SwingConstants.LEFT);
        InstruccionOrganico.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        InstruccionOrganico.setForeground(Color.BLUE);//agrega color a la letra
        this.add(InstruccionOrganico);

        //Instruccion de Organico 2
        InstruccionOrganico2 = new JLabel();
        InstruccionOrganico2.setText("Banana, Manzana y un Sándwich, juntando grupos de las basuras ya mencionados");
        InstruccionOrganico2.setBounds(250, 160, 1300, 30);
        InstruccionOrganico2.setHorizontalAlignment(SwingConstants.LEFT);
        InstruccionOrganico2.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        InstruccionOrganico2.setForeground(Color.BLUE);//agrega color a la letra
        this.add(InstruccionOrganico2);
    }

    private void parteAluminio(){
        //Aluminio
        textAluminio = new JLabel(); //titulo de Organico
        textAluminio.setText("Aluminio");//texto
        textAluminio.setBounds(100, 320, 300,30);
        textAluminio.setHorizontalAlignment(SwingConstants.LEFT);
        textAluminio.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        textAluminio.setForeground(Color.BLUE);//agrega color a la letra
        this.add(textAluminio);

        //Instruccion de Aluminio 1
        InstruccionAluminio = new JLabel();
        InstruccionAluminio.setText("Para formar grupos de basura de Aluminio se deben de hacer grupos de 4 basuras");
        InstruccionAluminio.setBounds(250, 300, 1300, 30);
        InstruccionAluminio.setHorizontalAlignment(SwingConstants.LEFT);
        InstruccionAluminio.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        InstruccionAluminio.setForeground(Color.BLUE);//agrega color a la letra
        this.add(InstruccionAluminio);

        //Instruccion de Aluminio 2
        InstruccionAluminio2 = new JLabel();
        InstruccionAluminio2.setText("Lata de aluminio y la Lata de refresco, de la basura ya mencionada");
        InstruccionAluminio2.setBounds(250, 360, 1300, 30);
        InstruccionAluminio2.setHorizontalAlignment(SwingConstants.LEFT);
        InstruccionAluminio2.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        InstruccionAluminio2.setForeground(Color.BLUE);//agrega color a la letra
        this.add(InstruccionAluminio2);
    }

    private void partePapel(){
        //Papel
        textPapel = new JLabel(); //titulo de Organico
        textPapel.setText("Papel");//texto
        textPapel.setBounds(100, 530, 300,30);
        textPapel.setHorizontalAlignment(SwingConstants.LEFT);
        textPapel.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        textPapel.setForeground(Color.BLUE);//agrega color a la letra
        this.add(textPapel);

        //Instruccion de Papel 1
        InstruccionPapel = new JLabel();
        InstruccionPapel.setText("Para formar grupos de basura de Papel se deben de hacer grupos de 4 basuras");
        InstruccionPapel.setBounds(250, 510, 1300, 30);
        InstruccionPapel.setHorizontalAlignment(SwingConstants.LEFT);
        InstruccionPapel.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        InstruccionPapel.setForeground(Color.BLUE);//agrega color a la letra
        this.add(InstruccionPapel);

        //Instruccion de Papel 2
        InstruccionPapel2 = new JLabel();
        InstruccionPapel2.setText("Periódico, Cuaderno juntando grupos de las basuras ya mencionados");
        InstruccionPapel2.setBounds(250, 550, 1300, 30);
        InstruccionPapel2.setHorizontalAlignment(SwingConstants.LEFT);
        InstruccionPapel2.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        InstruccionPapel2.setForeground(Color.BLUE);//agrega color a la letra
        this.add(InstruccionPapel2);
    }

    private void partePlastico(){
        //Plastico
        textPlastico = new JLabel(); //titulo de Organico
        textPlastico.setText("Plástico");//texto
        textPlastico.setBounds(100, 720, 200,30);
        textPlastico.setHorizontalAlignment(SwingConstants.LEFT);
        textPlastico.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        textPlastico.setForeground(Color.BLUE);//agrega color a la letra
        this.add(textPlastico);

        //Instruccion de Plastico 1
        InstruccionPlastico = new JLabel();
        InstruccionPlastico.setText("Para formar grupos de basura Plástica se deben de hacer grupos de 4 basuras");
        InstruccionPlastico.setBounds(250, 700, 1300, 30);
        InstruccionPlastico.setHorizontalAlignment(SwingConstants.LEFT);
        InstruccionPlastico.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        InstruccionPlastico.setForeground(Color.BLUE);//agrega color a la letra
        this.add(InstruccionPlastico);

        //Instruccion de Plastico 2
        InstruccionPlastico2 = new JLabel();
        InstruccionPlastico2.setText("Bolsa de plástico, Botella de plástico y el Envase de ICE, juntando grupos de las basuras ya mencionados");
        InstruccionPlastico2.setBounds(250, 740, 1300, 30);
        InstruccionPlastico2.setHorizontalAlignment(SwingConstants.LEFT);
        InstruccionPlastico2.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));//establece la fuente del texto
        InstruccionPlastico2.setForeground(Color.BLUE);//agrega color a la letra
        this.add(InstruccionPlastico2);
    }

    private void imegenOrganico(){
        //Imagen Chile
        JLabel iChile = new JLabel(); //titulo de Organico
        iChile.setIcon(new ImageIcon("src/ImagenAyuda/chile.png")); //agrega el icono
        iChile.setBounds(1200, 130, 65,65);
        this.add(iChile);

        //Imagen Huevo
        JLabel iHuevo = new JLabel(); //titulo de Organico
        iHuevo.setIcon(new ImageIcon("src/ImagenAyuda/huevo.png")); //agrega el icono
        iHuevo.setBounds(1300, 130, 65,65);
        this.add(iHuevo);

        //Imagen Nieve
        JLabel iNieve = new JLabel(); //titulo de Organico
        iNieve.setIcon(new ImageIcon("src/ImagenAyuda/nieve.png")); //agrega el icono
        iNieve.setBounds(1400, 130, 65,65);
        this.add(iNieve);
    }

    private void imagenPapel(){
        //Imagen Papel
        JLabel iPapel = new JLabel(); //titulo de Organico
        iPapel.setIcon(new ImageIcon("src/ImagenAyuda/papel.png")); //agrega el icono
        iPapel.setBounds(1200, 520, 65,65);
        this.add(iPapel);

        //Imagen Caja
        JLabel iCaja = new JLabel(); //titulo de Organico
        iCaja.setIcon(new ImageIcon("src/ImagenAyuda/caja.png")); //agrega el icono
        iCaja.setBounds(1300, 520, 65,65);
        this.add(iCaja);

        //Imagen Caja2
        JLabel iCaja2 = new JLabel(); //titulo de Organico
        iCaja2.setIcon(new ImageIcon("src/ImagenAyuda/caja2.png")); //agrega el icono
        iCaja2.setBounds(1400, 520, 65,65);
        this.add(iCaja2);
    }

    private void imagenAluminio(){
        //Imagen Lata
        JLabel iLata = new JLabel(); //titulo de Organico
        iLata.setIcon(new ImageIcon("src/ImagenAyuda/lata.png")); //agrega el icono
        iLata.setBounds(1200, 325, 65,65);
        this.add(iLata);

        //Imagen Refresco
        JLabel iRefresco = new JLabel(); //titulo de Organico
        iRefresco.setIcon(new ImageIcon("src/ImagenAyuda/refresco.png")); //agrega el icono
        iRefresco.setBounds(1300, 325, 65,65);
        this.add(iRefresco);

        //Imagen Refresco 2
        JLabel iRefresco2 = new JLabel(); //titulo de Organico
        iRefresco2.setIcon(new ImageIcon("src/ImagenAyuda/refresco2.png")); //agrega el icono
        iRefresco2.setBounds(1400, 325, 65,65);
        this.add(iRefresco2);
    }

    private void imagenPlastico(){
        //Imagen ICE
        JLabel iICE = new JLabel(); //titulo de Organico
        iICE.setIcon(new ImageIcon("src/ImagenAyuda/ice.png")); //agrega el icono
        iICE.setBounds(1200, 670, 65,65);
        this.add(iICE);

        //Imagen Bolsa
        JLabel iBolsa = new JLabel(); //titulo de Organico
        iBolsa.setIcon(new ImageIcon("src/ImagenAyuda/bolsa.png")); //agrega el icono
        iBolsa.setBounds(1300, 670, 65,65);
        this.add(iBolsa);

        //Imagen Botella
        JLabel iBotella = new JLabel(); //titulo de Organico
        iBotella.setIcon(new ImageIcon("src/ImagenAyuda/botella.png")); //agrega el icono
        iBotella.setBounds(1400, 670, 65,65);
        this.add(iBotella);
    }

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
                PanelAyuda2 menuA = new PanelAyuda2();
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
