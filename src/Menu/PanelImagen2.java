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

@SuppressWarnings("ALL")
public class PanelImagen2 extends JPanel {
    private Image fondo;

    public PanelImagen2(){
        preInit();
        initComponent();
    }
    private  void preInit(){

    }

    private void initComponent() {
        fondo = new ImageIcon("src/Imagenes/fondocolor.jpg").getImage();
    }

    public void paint(Graphics g){

        if(this.fondo != null) {
            g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
        }
        this.setOpaque(false);
        super.paint(g);
    }
}
