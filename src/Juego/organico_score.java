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
import java.awt.image.BufferedImage;


class organico_score extends Canvas implements Runnable
{
    //canvas max size
    final static int Ancho = 2;
    final static int Largo = 1;
    static int p;
    //max numero of Bloke on Score
    final static int MAX_Bloke = Ancho*Largo;
    public static int Score[][];
    private boolean playing;
    Image img;
    private Thread animator;
    private movimiento_basura Bloke[] = new movimiento_basura[MAX_Bloke];


    public organico_score()
    {
        Score = new int[Ancho+1][Largo+1];

        //set window size
        setBounds(1595, 745, 40, 15);
        setBackground(Color.darkGray);
        //show window and start game
        setVisible(true);
        startGame();
    }

    public void startGame()
    {
        if(!playing)
        {
            init();
            animator = new Thread(this);
            animator.start();
        }
    }

    public void stopGame() {
        playing = false;
        setVisible(false);
    }

    public void init()
    {
        int i,j;

        //init Score positions
        for(i=1; i<=Ancho; i++)
            for(j=1; j<=Largo; j++)
                Score[i][j] = -1;

        for(i=0; i<MAX_Bloke; i++)
        {
            Bloke[i] = new movimiento_basura(1);
            Bloke[i].off();
        }

        playing = true;

    }


    public boolean gameOver()
    {
        for(int i=1; i<Ancho; i++)
            if(Score[i][1] >= 0)
                return true;

        return false;
    }

    public void run()
    {
        while(playing)
        {

            if(gameOver())
                playing = false;

            //update screen
            repaint();

            //sleep this thread for a little while
            try{
                Thread.sleep(80);
            }
            catch(InterruptedException ex) {
                System.out.println(ex.toString());
            }
        }//while
    }


    public int getP() {
        return p;
    }

    public void setP(int pts) {
        this.p = pts;
    }


    public void paint(Graphics g)
    {
        //create a back buffer (off-screen) to draw in
        BufferedImage backbuffer = new BufferedImage(Ancho* movimiento_basura.Ancho,Largo* movimiento_basura.Largo,BufferedImage.TRANSLUCENT);
        Graphics2D g2 = (Graphics2D)backbuffer.getGraphics();

        if(!playing){}

        else {
            g2.clearRect(0,0, getWidth(),getHeight());
            int muestra = getP();

            String enteroString = Integer.toString(muestra);

            g2.setColor(Color.white);
            g2.setFont(new Font("Arial", Font.PLAIN,18));
            g2.drawString(enteroString,5,14);
        }

        //draw the back buffer
        g.drawImage(backbuffer,0,0,this);
    }
}