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
public class PanelAyuda2 extends JFrame {
    public PanelImagen2 panelA2;
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

    public PanelAyuda2(){
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
        imagenesOrganico();
        partePlastico();
        imagenesPlastico();
        parteAluminio();
        imagenesAluminio();
        partePapel();
        imagenesPapel();
    }

    private void imagenesOrganico(){
        imegenOrganico();
        imegenOrganico2();
        imegenOrganico3();
        imegenOrganico4();
        imegenOrganico5();
    }

    private void imagenesAluminio(){
        imagenAluminio();
        imagenAluminio2();
        imagenAluminio3();
        imagenAluminio4();
        imagenAluminio5();
    }

    private void imagenesPapel(){
        imagenPapel();
        imagenPapel2();
        imagenPapel3();
        imagenPapel4();
        imagenPapel5();
    }

    private void imagenesPlastico(){
        imagenPlastico();
        imagenPlastico2();
        imagenPlastico3();
        imagenPlastico4();
        imagenPlastico5();
    }

    private void colocarPaneles(){
        panelA2 = new PanelImagen2(); //crea el JPanel
        panelA2.setLayout(null); //desactiva el Layout(Diseño)
        this.getContentPane().add(panelA2); //agrega el panel a la ventana
        this.setContentPane(panelA2);//esto implementa la imagen de fondo del JFrame
    }

    private void parteOrganico(){
        //Organico
        textOrganico = new JLabel(); //titulo de Organico
        textOrganico.setText("Orgánico");//texto
        textOrganico.setBounds(100, 50, 300,60);//posicion del texto
        textOrganico.setHorizontalAlignment(SwingConstants.LEFT);//Alineacion de texto
        textOrganico.setForeground(Color.BLUE);//agrega color a la letra
        textOrganico.setFont(new Font("bahnschrift semibold", Font.PLAIN, 30));//establece la fuente del texto
        this.add(textOrganico);

        //Acomodo de Figuras
        InstruccionOrganico = new JLabel();
        InstruccionOrganico.setText("ALGUNAS MANERAS DE ACOMODAR LAS FIGURAS");
        InstruccionOrganico.setBounds(200, 10, 1300, 60);
        InstruccionOrganico.setHorizontalAlignment(SwingConstants.CENTER);
        InstruccionOrganico.setFont(new Font("bahnschrift semibold", Font.PLAIN, 30));//establece la fuente del texto
        InstruccionOrganico.setForeground(Color.BLUE);//agrega color a la letra
        this.add(InstruccionOrganico);
    }

    private void parteAluminio(){
        //Aluminio
        textAluminio = new JLabel(); //titulo de Organico
        textAluminio.setText("Aluminio");//texto
        textAluminio.setBounds(500, 50, 500,60);
        textAluminio.setHorizontalAlignment(SwingConstants.LEFT);
        textAluminio.setFont(new Font("bahnschrift semibold", Font.PLAIN, 30));//establece la fuente del texto
        textAluminio.setForeground(Color.BLUE);//agrega color a la letra
        this.add(textAluminio);
    }

    private void partePapel(){
        //Papel
        textPapel = new JLabel(); //titulo de Organico
        textPapel.setText("Papel");//texto
        textPapel.setBounds(970, 50, 500,60);
        textPapel.setHorizontalAlignment(SwingConstants.LEFT);
        textPapel.setFont(new Font("bahnschrift semibold", Font.PLAIN, 30));//establece la fuente del texto
        textPapel.setForeground(Color.BLUE);//agrega color a la letra
        this.add(textPapel);
    }

    private void partePlastico(){
        //Plastico
        textPlastico = new JLabel(); //titulo de Organico
        textPlastico.setText("Plástico");//texto
        textPlastico.setBounds(1400, 50, 500,60);
        textPlastico.setHorizontalAlignment(SwingConstants.LEFT);
        textPlastico.setFont(new Font("bahnschrift semibold", Font.PLAIN, 30));//establece la fuente del texto
        textPlastico.setForeground(Color.BLUE);//agrega color a la letra
        this.add(textPlastico);
    }

    //Imagenes de Organico
    private void imegenOrganico(){
        //Imagen Chile
        JLabel iChile = new JLabel(); //titulo de Organico
        iChile.setIcon(new ImageIcon("src/ImagenAyuda/chile.png")); //agrega el icono
        iChile.setBounds(30, 150, 65,65);
        this.add(iChile);

        //Imagen Chile2
        JLabel iChile2 = new JLabel(); //titulo de Organico
        iChile2.setIcon(new ImageIcon("src/ImagenAyuda/chile.png")); //agrega el icono
        iChile2.setBounds(100, 150, 65,65);
        this.add(iChile2);

        //Imagen Chile3
        JLabel iChile3 = new JLabel(); //titulo de Organico
        iChile3.setIcon(new ImageIcon("src/ImagenAyuda/chile.png")); //agrega el icono
        iChile3.setBounds(170, 150, 65,65);
        this.add(iChile3);

        //Imagen Chile4
        JLabel iChile4 = new JLabel(); //titulo de Organico
        iChile4.setIcon(new ImageIcon("src/ImagenAyuda/chile.png")); //agrega el icono
        iChile4.setBounds(250, 150, 65,65);
        this.add(iChile4);
    }

    private void imegenOrganico2(){
        //Imagen Huevo
        JLabel iHuevo = new JLabel(); //titulo de Organico
        iHuevo.setIcon(new ImageIcon("src/ImagenAyuda/huevo.png")); //agrega el icono
        iHuevo.setBounds(30, 250, 65,65);
        this.add(iHuevo);

        //Imagen Huevo2
        JLabel iHuevo2 = new JLabel(); //titulo de Organico
        iHuevo2.setIcon(new ImageIcon("src/ImagenAyuda/huevo.png")); //agrega el icono
        iHuevo2.setBounds(100, 250, 65,65);
        this.add(iHuevo2);

        //Imagen Huevo3
        JLabel iHuevo3 = new JLabel(); //titulo de Organico
        iHuevo3.setIcon(new ImageIcon("src/ImagenAyuda/huevo.png")); //agrega el icono
        iHuevo3.setBounds(170, 250, 65,65);
        this.add(iHuevo3);

        //Imagen Huevo4
        JLabel iHuevo4 = new JLabel(); //titulo de Organico
        iHuevo4.setIcon(new ImageIcon("src/ImagenAyuda/huevo.png")); //agrega el icono
        iHuevo4.setBounds(250, 250, 65,65);
        this.add(iHuevo4);
    }

    private void imegenOrganico3() {
        //Imagen Nieve
        JLabel iNieve = new JLabel(); //titulo de Organico
        iNieve.setIcon(new ImageIcon("src/ImagenAyuda/nieve.png")); //agrega el icono
        iNieve.setBounds(30, 350, 65, 65);
        this.add(iNieve);

        //Imagen Nieve2
        JLabel iNieve2 = new JLabel(); //titulo de Organico
        iNieve2.setIcon(new ImageIcon("src/ImagenAyuda/nieve.png")); //agrega el icono
        iNieve2.setBounds(100, 350, 65, 65);
        this.add(iNieve2);

        //Imagen Nieve3
        JLabel iNieve3 = new JLabel(); //titulo de Organico
        iNieve3.setIcon(new ImageIcon("src/ImagenAyuda/nieve.png")); //agrega el icono
        iNieve3.setBounds(170, 350, 65, 65);
        this.add(iNieve3);

        //Imagen Nieve4
        JLabel iNieve4 = new JLabel(); //titulo de Organico
        iNieve4.setIcon(new ImageIcon("src/ImagenAyuda/nieve.png")); //agrega el icono
        iNieve4.setBounds(250, 350, 65, 65);
        this.add(iNieve4);
    }

    private void imegenOrganico4(){
        //Imagen Chile
        JLabel iChile = new JLabel(); //titulo de Organico
        iChile.setIcon(new ImageIcon("src/ImagenAyuda/chile.png")); //agrega el icono
        iChile.setBounds(30, 450, 65,65);
        this.add(iChile);

        //Imagen Huevo
        JLabel iHuevo = new JLabel(); //titulo de Organico
        iHuevo.setIcon(new ImageIcon("src/ImagenAyuda/huevo.png")); //agrega el icono
        iHuevo.setBounds(100, 450, 65,65);
        this.add(iHuevo);

        //Imagen Nieve
        JLabel iNieve = new JLabel(); //titulo de Organico
        iNieve.setIcon(new ImageIcon("src/ImagenAyuda/nieve.png")); //agrega el icono
        iNieve.setBounds(170, 450, 65,65);
        this.add(iNieve);

        //Imagen Huevo2
        JLabel iHuevo2 = new JLabel(); //titulo de Organico
        iHuevo2.setIcon(new ImageIcon("src/ImagenAyuda/huevo.png")); //agrega el icono
        iHuevo2.setBounds(250, 450, 65,65);
        this.add(iHuevo2);
    }

    private void imegenOrganico5(){
        //Imagen Chile
        JLabel iChile = new JLabel(); //titulo de Organico
        iChile.setIcon(new ImageIcon("src/ImagenAyuda/chile.png")); //agrega el icono
        iChile.setBounds(30, 550, 65,65);
        this.add(iChile);

        //Imagen Huevo
        JLabel iHuevo = new JLabel(); //titulo de Organico
        iHuevo.setIcon(new ImageIcon("src/ImagenAyuda/huevo.png")); //agrega el icono
        iHuevo.setBounds(30, 650, 65,65);
        this.add(iHuevo);

        //Imagen Chile2
        JLabel iChile2 = new JLabel(); //titulo de Organico
        iChile2.setIcon(new ImageIcon("src/ImagenAyuda/chile.png")); //agrega el icono
        iChile2.setBounds(100, 650, 65,65);
        this.add(iChile2);

        //Imagen Nieve
        JLabel iNieve = new JLabel(); //titulo de Organico
        iNieve.setIcon(new ImageIcon("src/ImagenAyuda/nieve.png")); //agrega el icono
        iNieve.setBounds(100, 550, 65,65);
        this.add(iNieve);
    }

    //Imagenes de Papel
    private void imagenPapel(){
        //Imagen Papel
        JLabel iPapel = new JLabel(); //titulo de Organico
        iPapel.setIcon(new ImageIcon("src/ImagenAyuda/papel.png")); //agrega el icono
        iPapel.setBounds(850, 150, 65,65);
        this.add(iPapel);

        //Imagen Papel2
        JLabel iPapel2 = new JLabel(); //titulo de Organico
        iPapel2.setIcon(new ImageIcon("src/ImagenAyuda/papel.png")); //agrega el icono
        iPapel2.setBounds(930, 150, 65,65);
        this.add(iPapel2);

        //Imagen Papel3
        JLabel iPapel3 = new JLabel(); //titulo de Organico
        iPapel3.setIcon(new ImageIcon("src/ImagenAyuda/papel.png")); //agrega el icono
        iPapel3.setBounds(1010, 150, 65,65);
        this.add(iPapel3);

        //Imagen Papel4
        JLabel iPapel4 = new JLabel(); //titulo de Organico
        iPapel4.setIcon(new ImageIcon("src/ImagenAyuda/papel.png")); //agrega el icono
        iPapel4.setBounds(1090, 150, 65,65);
        this.add(iPapel4);
    }

    private void imagenPapel2(){
        //Imagen Caja
        JLabel iCaja3 = new JLabel(); //titulo de Organico
        iCaja3.setIcon(new ImageIcon("src/ImagenAyuda/caja.png")); //agrega el icono
        iCaja3.setBounds(850, 250, 65,65);
        this.add(iCaja3);

        //Imagen Caja2
        JLabel iCaja = new JLabel(); //titulo de Organico
        iCaja.setIcon(new ImageIcon("src/ImagenAyuda/caja.png")); //agrega el icono
        iCaja.setBounds(930, 250, 65,65);
        this.add(iCaja);

        //Imagen Caja3
        JLabel iCaja2 = new JLabel(); //titulo de Organico
        iCaja2.setIcon(new ImageIcon("src/ImagenAyuda/caja.png")); //agrega el icono
        iCaja2.setBounds(1010, 250, 65,65);
        this.add(iCaja2);

        //Imagen Caja4
        JLabel iCajaC2 = new JLabel(); //titulo de Organico
        iCajaC2.setIcon(new ImageIcon("src/ImagenAyuda/caja.png")); //agrega el icono
        iCajaC2.setBounds(1090, 250, 65,65);
        this.add(iCajaC2);
    }

    private void imagenPapel3(){
        //Imagen CajaV2
        JLabel iCaja3 = new JLabel(); //titulo de Organico
        iCaja3.setIcon(new ImageIcon("src/ImagenAyuda/caja2.png")); //agrega el icono
        iCaja3.setBounds(850, 350, 65,65);
        this.add(iCaja3);

        //Imagen CajaV22
        JLabel iCaja = new JLabel(); //titulo de Organico
        iCaja.setIcon(new ImageIcon("src/ImagenAyuda/caja2.png")); //agrega el icono
        iCaja.setBounds(930, 350, 65,65);
        this.add(iCaja);

        //Imagen CajaV23
        JLabel iCaja2 = new JLabel(); //titulo de Organico
        iCaja2.setIcon(new ImageIcon("src/ImagenAyuda/caja2.png")); //agrega el icono
        iCaja2.setBounds(1010, 350, 65,65);
        this.add(iCaja2);

        //Imagen CajaV24
        JLabel iCajaC2 = new JLabel(); //titulo de Organico
        iCajaC2.setIcon(new ImageIcon("src/ImagenAyuda/caja2.png")); //agrega el icono
        iCajaC2.setBounds(1090, 350, 65,65);
        this.add(iCajaC2);
    }

    private void imagenPapel4(){
        //Imagen Papel
        JLabel iPapel = new JLabel(); //titulo de Organico
        iPapel.setIcon(new ImageIcon("src/ImagenAyuda/papel.png")); //agrega el icono
        iPapel.setBounds(850, 450, 65,65);
        this.add(iPapel);

        //Imagen Caja
        JLabel iCaja = new JLabel(); //titulo de Organico
        iCaja.setIcon(new ImageIcon("src/ImagenAyuda/caja.png")); //agrega el icono
        iCaja.setBounds(930, 450, 65,65);
        this.add(iCaja);

        //Imagen Caja2
        JLabel iCaja2 = new JLabel(); //titulo de Organico
        iCaja2.setIcon(new ImageIcon("src/ImagenAyuda/caja2.png")); //agrega el icono
        iCaja2.setBounds(1010, 450, 65,65);
        this.add(iCaja2);

        //Imagen CajaC2
        JLabel iCajaC2 = new JLabel(); //titulo de Organico
        iCajaC2.setIcon(new ImageIcon("src/ImagenAyuda/caja.png")); //agrega el icono
        iCajaC2.setBounds(1090, 450, 65,65);
        this.add(iCajaC2);
    }

    private void imagenPapel5(){
        //Imagen Papel
        JLabel iPapel = new JLabel(); //titulo de Organico
        iPapel.setIcon(new ImageIcon("src/ImagenAyuda/papel.png")); //agrega el icono
        iPapel.setBounds(850, 550, 65,65);
        this.add(iPapel);

        //Imagen Caja
        JLabel iCaja = new JLabel(); //titulo de Organico
        iCaja.setIcon(new ImageIcon("src/ImagenAyuda/caja.png")); //agrega el icono
        iCaja.setBounds(850, 650, 65,65);
        this.add(iCaja);

        //Imagen Caja2
        JLabel iCaja2 = new JLabel(); //titulo de Organico
        iCaja2.setIcon(new ImageIcon("src/ImagenAyuda/caja2.png")); //agrega el icono
        iCaja2.setBounds(930, 650, 65,65);
        this.add(iCaja2);

        //Imagen Papel2
        JLabel iPapel2 = new JLabel(); //titulo de Organico
        iPapel2.setIcon(new ImageIcon("src/ImagenAyuda/papel.png")); //agrega el icono
        iPapel2.setBounds(930, 550, 65,65);
        this.add(iPapel2);
    }

    //Imagenes de Aluminio
    private void imagenAluminio(){
        //Imagen Lata
        JLabel iLata = new JLabel(); //titulo de Organico
        iLata.setIcon(new ImageIcon("src/ImagenAyuda/lata.png")); //agrega el icono
        iLata.setBounds(400, 150, 65,65);
        this.add(iLata);

        //Imagen Lata2
        JLabel iLata2 = new JLabel(); //titulo de Organico
        iLata2.setIcon(new ImageIcon("src/ImagenAyuda/lata.png")); //agrega el icono
        iLata2.setBounds(480, 150, 65,65);
        this.add(iLata2);

        //Imagen Lata3
        JLabel iLata3 = new JLabel(); //titulo de Organico
        iLata3.setIcon(new ImageIcon("src/ImagenAyuda/lata.png")); //agrega el icono
        iLata3.setBounds(570, 150, 65,65);
        this.add(iLata3);

        //Imagen Lata4
        JLabel iLata4 = new JLabel(); //titulo de Organico
        iLata4.setIcon(new ImageIcon("src/ImagenAyuda/lata.png")); //agrega el icono
        iLata4.setBounds(660, 150, 65,65);
        this.add(iLata4);
    }

    private void imagenAluminio2(){
        //Imagen Refresco
        JLabel iRefresco3 = new JLabel(); //titulo de Organico
        iRefresco3.setIcon(new ImageIcon("src/ImagenAyuda/refresco.png")); //agrega el icono
        iRefresco3.setBounds(400, 250, 65,65);
        this.add(iRefresco3);

        //Imagen Refresco2
        JLabel iRefresco = new JLabel(); //titulo de Organico
        iRefresco.setIcon(new ImageIcon("src/ImagenAyuda/refresco.png")); //agrega el icono
        iRefresco.setBounds(480, 250, 65,65);
        this.add(iRefresco);

        //Imagen Refresco3
        JLabel iRefresco2 = new JLabel(); //titulo de Organico
        iRefresco2.setIcon(new ImageIcon("src/ImagenAyuda/refresco.png")); //agrega el icono
        iRefresco2.setBounds(570, 250, 65,65);
        this.add(iRefresco2);

        //Imagen Refresco4
        JLabel iRefrescoC2 = new JLabel(); //titulo de Organico
        iRefrescoC2.setIcon(new ImageIcon("src/ImagenAyuda/refresco.png")); //agrega el icono
        iRefrescoC2.setBounds(660, 250, 65,65);
        this.add(iRefrescoC2);
    }

    private void imagenAluminio3(){
        //Imagen RefrescoV2
        JLabel iRefrescoc3 = new JLabel(); //titulo de Organico
        iRefrescoc3.setIcon(new ImageIcon("src/ImagenAyuda/refresco2.png")); //agrega el icono
        iRefrescoc3.setBounds(400, 350, 65,65);
        this.add(iRefrescoc3);

        //Imagen RefrescoV22
        JLabel iRefresco = new JLabel(); //titulo de Organico
        iRefresco.setIcon(new ImageIcon("src/ImagenAyuda/refresco2.png")); //agrega el icono
        iRefresco.setBounds(480, 350, 65,65);
        this.add(iRefresco);

        //Imagen RefrescoV23
        JLabel iRefresco2 = new JLabel(); //titulo de Organico
        iRefresco2.setIcon(new ImageIcon("src/ImagenAyuda/refresco2.png")); //agrega el icono
        iRefresco2.setBounds(570, 350, 65,65);
        this.add(iRefresco2);

        //Imagen RefrescoV24
        JLabel iRefrescoC2 = new JLabel(); //titulo de Organico
        iRefrescoC2.setIcon(new ImageIcon("src/ImagenAyuda/refresco2.png")); //agrega el icono
        iRefrescoC2.setBounds(660, 350, 65,65);
        this.add(iRefrescoC2);
    }

    private void imagenAluminio4(){
        //Imagen Lata
        JLabel iLata = new JLabel(); //titulo de Organico
        iLata.setIcon(new ImageIcon("src/ImagenAyuda/lata.png")); //agrega el icono
        iLata.setBounds(400, 450, 65,65);
        this.add(iLata);

        //Imagen Refresco
        JLabel iRefresco = new JLabel(); //titulo de Organico
        iRefresco.setIcon(new ImageIcon("src/ImagenAyuda/refresco.png")); //agrega el icono
        iRefresco.setBounds(480, 450, 65,65);
        this.add(iRefresco);

        //Imagen Refresco 2
        JLabel iRefresco2 = new JLabel(); //titulo de Organico
        iRefresco2.setIcon(new ImageIcon("src/ImagenAyuda/refresco2.png")); //agrega el icono
        iRefresco2.setBounds(570, 450, 65,65);
        this.add(iRefresco2);

        //Imagen RefrescoC2
        JLabel iRefrescoC2 = new JLabel(); //titulo de Organico
        iRefrescoC2.setIcon(new ImageIcon("src/ImagenAyuda/refresco2.png")); //agrega el icono
        iRefrescoC2.setBounds(660, 450, 65,65);
        this.add(iRefrescoC2);
    }

    private void imagenAluminio5(){
        //Imagen Lata
        JLabel iLata = new JLabel(); //titulo de Organico
        iLata.setIcon(new ImageIcon("src/ImagenAyuda/lata.png")); //agrega el icono
        iLata.setBounds(400, 550, 65,65);
        this.add(iLata);

        //Imagen Refresco
        JLabel iRefresco = new JLabel(); //titulo de Organico
        iRefresco.setIcon(new ImageIcon("src/ImagenAyuda/refresco.png")); //agrega el icono
        iRefresco.setBounds(400, 650, 65,65);
        this.add(iRefresco);

        //Imagen Refresco 2
        JLabel iRefresco2 = new JLabel(); //titulo de Organico
        iRefresco2.setIcon(new ImageIcon("src/ImagenAyuda/refresco2.png")); //agrega el icono
        iRefresco2.setBounds(480, 650, 65,65);
        this.add(iRefresco2);

        //Imagen RefrescoC2
        JLabel iRefrescoC2 = new JLabel(); //titulo de Organico
        iRefrescoC2.setIcon(new ImageIcon("src/ImagenAyuda/refresco.png")); //agrega el icono
        iRefrescoC2.setBounds(480, 550, 65,65);
        this.add(iRefrescoC2);
    }

    //Imagenes de Plastico
    private void imagenPlastico(){
        //Imagen ICE
        JLabel iICE = new JLabel(); //titulo de Organico
        iICE.setIcon(new ImageIcon("src/ImagenAyuda/ice.png")); //agrega el icono
        iICE.setBounds(1280, 150, 65,65);
        this.add(iICE);

        //Imagen ICE2
        JLabel iICE2 = new JLabel(); //titulo de Organico
        iICE2.setIcon(new ImageIcon("src/ImagenAyuda/ice.png")); //agrega el icono
        iICE2.setBounds(1380, 150, 65,65);
        this.add(iICE2);

        //Imagen ICE3
        JLabel iICE3 = new JLabel(); //titulo de Organico
        iICE3.setIcon(new ImageIcon("src/ImagenAyuda/ice.png")); //agrega el icono
        iICE3.setBounds(1480, 150, 65,65);
        this.add(iICE3);

        //Imagen ICE4
        JLabel iICE4 = new JLabel(); //titulo de Organico
        iICE4.setIcon(new ImageIcon("src/ImagenAyuda/ice.png")); //agrega el icono
        iICE4.setBounds(1580, 150, 65,65);
        this.add(iICE4);
    }

    private void imagenPlastico2(){
        //Imagen Bolsa
        JLabel iBolsa = new JLabel(); //titulo de Organico
        iBolsa.setIcon(new ImageIcon("src/ImagenAyuda/bolsa.png")); //agrega el icono
        iBolsa.setBounds(1280, 250, 65,65);
        this.add(iBolsa);

        //Imagen Bolsa2
        JLabel iBolsa2 = new JLabel(); //titulo de Organico
        iBolsa2.setIcon(new ImageIcon("src/ImagenAyuda/bolsa.png")); //agrega el icono
        iBolsa2.setBounds(1380, 250, 65,65);
        this.add(iBolsa2);

        //Imagen Bolsa3
        JLabel iBolsa3 = new JLabel(); //titulo de Organico
        iBolsa3.setIcon(new ImageIcon("src/ImagenAyuda/bolsa.png")); //agrega el icono
        iBolsa3.setBounds(1480, 250, 65,65);
        this.add(iBolsa3);

        //Imagen Bolsa4
        JLabel iBolsa4 = new JLabel(); //titulo de Organico
        iBolsa4.setIcon(new ImageIcon("src/ImagenAyuda/bolsa.png")); //agrega el icono
        iBolsa4.setBounds(1580, 250, 65,65);
        this.add(iBolsa4);
    }

    private void imagenPlastico3(){
        //Imagen Botella
        JLabel iBotella = new JLabel(); //titulo de Organico
        iBotella.setIcon(new ImageIcon("src/ImagenAyuda/botella.png")); //agrega el icono
        iBotella.setBounds(1280, 350, 65,65);
        this.add(iBotella);

        //Imagen Botella2
        JLabel iBotella2 = new JLabel(); //titulo de Organico
        iBotella2.setIcon(new ImageIcon("src/ImagenAyuda/botella.png")); //agrega el icono
        iBotella2.setBounds(1380, 350, 65,65);
        this.add(iBotella2);

        //Imagen Botella3
        JLabel iBotella3 = new JLabel(); //titulo de Organico
        iBotella3.setIcon(new ImageIcon("src/ImagenAyuda/botella.png")); //agrega el icono
        iBotella3.setBounds(1480, 350, 65,65);
        this.add(iBotella3);

        //Imagen Botella4
        JLabel iBotella4 = new JLabel(); //titulo de Organico
        iBotella4.setIcon(new ImageIcon("src/ImagenAyuda/botella.png")); //agrega el icono
        iBotella4.setBounds(1580, 350, 65,65);
        this.add(iBotella4);
    }

    private void imagenPlastico4(){
        //Imagen ICE
        JLabel iICE = new JLabel(); //titulo de Organico
        iICE.setIcon(new ImageIcon("src/ImagenAyuda/ice.png")); //agrega el icono
        iICE.setBounds(1280, 450, 65,65);
        this.add(iICE);

        //Imagen Bolsa
        JLabel iBolsa = new JLabel(); //titulo de Organico
        iBolsa.setIcon(new ImageIcon("src/ImagenAyuda/bolsa.png")); //agrega el icono
        iBolsa.setBounds(1380, 450, 65,65);
        this.add(iBolsa);

        //Imagen Botella
        JLabel iBotella = new JLabel(); //titulo de Organico
        iBotella.setIcon(new ImageIcon("src/ImagenAyuda/botella.png")); //agrega el icono
        iBotella.setBounds(1480, 450, 65,65);
        this.add(iBotella);

        //Imagen ICE2
        JLabel iICE2 = new JLabel(); //titulo de Organico
        iICE2.setIcon(new ImageIcon("src/ImagenAyuda/ice.png")); //agrega el icono
        iICE2.setBounds(1580, 450, 65,65);
        this.add(iICE2);
    }

    private void imagenPlastico5(){
        //Imagen ICE
        JLabel iICE = new JLabel(); //titulo de Organico
        iICE.setIcon(new ImageIcon("src/ImagenAyuda/ice.png")); //agrega el icono
        iICE.setBounds(1280, 550, 65,65);
        this.add(iICE);

        //Imagen Bolsa
        JLabel iBolsa = new JLabel(); //titulo de Organico
        iBolsa.setIcon(new ImageIcon("src/ImagenAyuda/bolsa.png")); //agrega el icono
        iBolsa.setBounds(1280, 650, 65,65);
        this.add(iBolsa);

        //Imagen Botella
        JLabel iBotella = new JLabel(); //titulo de Organico
        iBotella.setIcon(new ImageIcon("src/ImagenAyuda/botella.png")); //agrega el icono
        iBotella.setBounds(1380, 650, 65,65);
        this.add(iBotella);

        //Imagen Botella2
        JLabel iBotella2 = new JLabel(); //titulo de Organico
        iBotella2.setIcon(new ImageIcon("src/ImagenAyuda/botella.png")); //agrega el icono
        iBotella2.setBounds(1380, 550, 65,65);
        this.add(iBotella2);
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
                PanelBotones menuB = new PanelBotones();
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

    //Boton Salir
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
                PanelAyuda menuA = new PanelAyuda();
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
