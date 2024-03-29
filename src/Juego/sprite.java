/*
 *RECZZLE 1.5
 *VIDEOJUEGO PARA COMPUTADORA EN JAVA PARA APRENDER A SEPARAR RESIDUOS
 *AUTORES: CASTAÑÓN PUGA MANUEL, BURGOS PONCE XAVIER ALBERTO, CABALLERO VILLASEÑOR BRYAN, DÍAZ PRIETO CARLOS EDUARDO, ZURITA MERINO CESAR LEONARDO
 *CORREO ELECTRONICO: puga@uabc.edu.mx, burgos.xavier@uabc.edu.mx, bryan.caballero.villasenor@uabc.edu.mx, cdiaz22@uabc.edu.mx, cesar.zurita@uabc.edu.mx
 *UNIVERSIDAD AUTÓNOMA DEL ESTADO DE BAJA CALIFORNIA
 *http://www.uabc.mx
 */

package Juego;

import java.awt.*;
import java.net.URL;

class sprite
{
    private int posX, posY;
    private int frame, nFrames;

    private boolean active;
    private Image sprites[];

    public sprite(int nFrames)
    {
        posX = 0;
        posY = 0;
        active = false;
        frame = 1;
        this.nFrames = nFrames;
        sprites = new Image[nFrames+1];
    }

    public int getX() {
        return posX;
    }

    public int getY() {
        return posY;
    }

    public int getW() {
        return sprites[nFrames].getWidth(null);
    }

    public int getH() {
        return sprites[nFrames].getHeight(null);
    }

    public int getFrame() {
        return frame;
    }

    public void setX(int value) {
        posX = value;
    }

    public void setY(int value) {
        posY = value;
    }

    public void on() {
        active = true;
    }

    public void off() {
        active = false;
    }

    public boolean isActive() {
        return active;
    }

    public void selFrame(int frameNum) {
        frame = frameNum;
    }

    public int frames() {
        return nFrames;
    }

    /*----------------------------------------
    addFrame()
    loads a.PNG file and adds it to our
    sprites array at the given frame
    ------------------------------------------*/
    public void addFrame(int frameNum, String path)
    {
        try {
            URL url = sprite.class.getResource(path);
            sprites[frameNum] = Toolkit.getDefaultToolkit().getImage(url);
        }
        catch(Exception ex) {
            System.err.println("Could not load image:" + path + " " + ex.toString());
        }
    }


    public boolean Colicion(sprite s)
    {
        int x1,x2,y1,y2,w1,w2,h1,h2;

        x1 = this.getX();
        y1 = this.getY();
        w1 = this.getW();
        h1 = this.getH();

        x2 = s.getX();
        y2 = s.getY();
        w2 = s.getW();
        h2 = s.getH();

        if(((x1+w1) > x2 ) && ((y1+h1) > y2) && ((x2+w2) > x1) && ((y2+h2) > y1))
            return true;
        else
            return false;
    }

    public void draw(Graphics g) {
        g.drawImage(sprites[frame], posX, posY, null);
    }
}
