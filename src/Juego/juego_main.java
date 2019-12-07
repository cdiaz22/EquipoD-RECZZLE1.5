/*
 *RECZZLE 1.5
 *VIDEOJUEGO PARA COMPUTADORA EN JAVA PARA APRENDER A SEPARAR RESIDUOS
 *AUTORES: CASTAÑÓN PUGA MANUEL, BURGOS PONCE XAVIER ALBERTO, CABALLERO VILLASEÑOR BRYAN, DÍAZ PRIETO CARLOS EDUARDO, ZURITA MERINO CESAR LEONARDO
 *CORREO ELECTRONICO: puga@uabc.edu.mx, burgos.xavier@uabc.edu.mx, bryan.caballero.villasenor@uabc.edu.mx, cdiaz22@uabc.edu.mx, cesar.zurita@uabc.edu.mx
 *UNIVERSIDAD AUTÓNOMA DEL ESTADO DE BAJA CALIFORNIA
 *http://www.uabc.mx
 */

package Juego;
import java.awt.event.*;
import javax.swing.*;

public class juego_main extends JFrame
{
    public static int difficulty;

    public void setDifficulty(int difficulty) { this.difficulty = difficulty;}

    public int getDifficulty() { return difficulty; }

    public static void juego_maino()
    {
        //create the main drawable ventana
        final ventana puyoVentana = new ventana();
        final papel_score puntos1 = new papel_score();
        final plastico_score puntos2 = new plastico_score();
        final organico_score puntos3 = new organico_score();
        final aluminio_score puntos4 = new aluminio_score();
        //create an instance of juego_main
        puyoVentana.setDifficulty(difficulty);
        juego_main mainWindow = new juego_main();
        mainWindow.add(puntos1);
        mainWindow.add(puntos2);
        mainWindow.add(puntos3);
        mainWindow.add(puntos4);
        mainWindow.add(puyoVentana);
        mainWindow.setUndecorated(true);
        mainWindow.setVisible(true);

        //add a KeyListener to main window
        mainWindow.addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e){
                puyoVentana.onKeyPressed(e.getKeyCode());
            }
        });
    }

    //main window size
    final private int WIN_Ancho = 1707;
    final private int WIN_Largo = 960;

    public juego_main()
    {
        //constructor chaining
        this(null);
    }

    public juego_main(String title)
    {
        //create a JFrame with title
        super(title);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0,0,WIN_Ancho,WIN_Largo);
        setResizable(false);
    }


}
