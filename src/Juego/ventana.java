/*
 *RECZZLE 1.5
 *VIDEOJUEGO PARA COMPUTADORA EN JAVA PARA APRENDER A SEPARAR RESIDUOS
 *AUTORES: CASTAÑÓN PUGA MANUEL, BURGOS PONCE XAVIER ALBERTO, CABALLERO VILLASEÑOR BRYAN, DÍAZ PRIETO CARLOS EDUARDO, ZURITA MERINO CESAR LEONARDO
 *CORREO ELECTRONICO: puga@uabc.edu.mx, burgos.xavier@uabc.edu.mx, bryan.caballero.villasenor@uabc.edu.mx, cdiaz22@uabc.edu.mx, cesar.zurita@uabc.edu.mx
 *UNIVERSIDAD AUTÓNOMA DEL ESTADO DE BAJA CALIFORNIA
 *http://www.uabc.mx
 */

package Juego;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class ventana extends Canvas implements Runnable
{
    //canvas max size
    final static int Ancho = 7;
    final static int Largo = 9;

    public static int difficulty; //variable to change difficulty in the menu
    final static int easy = 40;
    final static int normal = 30;
    final static int hard = 20;

    public String song1 = "/Music/bensound-theduel.wav";;

    public int puntos1 = 0;
    public int puntos2 = 0;
    public int puntos3 = 0;
    public int puntos4 = 0;
    public int p1 = 0; //organic
    public int p2 = 0; //paper
    public int p3 = 0; //plastic
    public int p4 = 0; //metal
    public int colrs; //1- paper, 2- organic, 3- metal, 4- plastic

    //max numero of Bloke on ventana
    final static int MAX_Bloke = Ancho*Largo;

    public static int Ventana[][];



    private boolean playing;
    Image img;
    private int cicle;
    private int speed;
    private int Bloke_falling;
    private int combo_counter;
    private Thread animator;
    private movimiento_basura Bloke[] = new movimiento_basura[MAX_Bloke];

    public void setDifficulty(int difficulty) { this.difficulty = difficulty;}

    public int getDifficulty() { return difficulty; }

    public ventana()
    {
        Ventana = new int[Ancho+1][Largo+1];

        //set window size
        setBounds(0, 0, Ancho* movimiento_basura.Ancho, Largo* movimiento_basura.Largo);
        setBackground(Color.darkGray);

        //show window and start game
        setVisible(true);
        startGame();
    }



    public void startGame()
    {
        if(!playing)
        {
            musica song = new musica();
            song.setclip(song1);
            song.play();

            init();
            animator = new Thread(this);
            animator.start();
        }
    }

    public void stopGame()
    {
        musica song = new musica();
        song.stop();

        playing = false;
    }

    public void resetGame()
    {
        if (playing == false)
        {
            startGame();
        }
    }

    public void quitGame()
    {
        if (playing == false) {
            musica song = new musica();
            song.stop();
            System.exit(0);
        }
    }

    public void init()
    {
        int i,j;

        //init ventana positions
        for(i=1; i<=Ancho; i++)
            for(j=1; j<=Largo; j++)
                Ventana[i][j] = -1;

        for(i=0; i<MAX_Bloke; i++)
        {
            Bloke[i] = new movimiento_basura(1);
            Bloke[i].off();
        }

        puntos1 = 0;
        puntos2 = 0;
        puntos3 = 0;
        puntos4 = 0;
        p1 = 0;
        p2 = 0;
        p3 = 0;
        p4 = 0;

        papel_score points1 = new papel_score();
        plastico_score points2 = new plastico_score();
        organico_score points3 = new organico_score();
        aluminio_score points4 = new aluminio_score();

        points1.setP(puntos1);
        points2.setP(puntos2);
        points3.setP(puntos3);
        points4.setP(puntos4);

        playing = true;
        cicle = 1;
        speed = 12;
        Bloke_falling = 0;
        combo_counter = 0;
    }

    public void BloqueUpdate()
    {
        int i,j;
        Random rand = new Random();

        //used to handle illegal moves and to know what Bloke
        //must be rolled back
        int index[] = {-1,-1};
        int count = 0;

        //update Bloke every X cicles
        if(cicle%speed == 0)
        {
            //look for 2 free slots
            if(Bloke_falling == 0)
            {
                for(i=0; i<MAX_Bloke; i++)
                {
                    if(!Bloke[i].isActive())
                    {
                        Bloke_falling++;
                        Bloke[i].on();
                        Bloke[i].visited(false);
                        Bloke[i].setState(movimiento_basura.FALLING);
                        Bloke[i].setX(1);

                        //pick a number between 0 and 3 (random recycle type)
                        int trash = java.lang.Math.abs(rand.nextInt()%4);
                        //pick a number between 0 and 2 (random trash)
                        int whichTrash = java.lang.Math.abs(rand.nextInt()%3);
                        switch(trash)  {
                            case movimiento_basura.ORGANIC:
                                Bloke[i].setTrash(movimiento_basura.ORGANIC);
                                switch(whichTrash)  {
                                    case 0: Bloke[i].addFrame(1,"/imagenes/nieve.png"); break;

                                    case 1: Bloke[i].addFrame(1,"/imagenes/chile.png"); break;

                                    case 2: Bloke[i].addFrame(1,"/imagenes/huevo.png"); break;
                                }
                                break;
                            case movimiento_basura.PLASTIC:
                                Bloke[i].setTrash(movimiento_basura.PLASTIC);
                                switch(whichTrash)  {
                                    case 0: Bloke[i].addFrame(1,"/imagenes/botella.png"); break;

                                    case 1: Bloke[i].addFrame(1,"/imagenes/ice.png"); break;

                                    case 2: Bloke[i].addFrame(1,"/imagenes/bolsa.png"); break;
                                }
                                break;
                            case movimiento_basura.PAPER:
                                Bloke[i].setTrash(movimiento_basura.PAPER);
                                switch(whichTrash)  {
                                    case 0: Bloke[i].addFrame(1,"/imagenes/papel.png"); break;

                                    case 1: Bloke[i].addFrame(1,"/imagenes/caja.png"); break;

                                    case 2: Bloke[i].addFrame(1,"/imagenes/caja2.png"); break;
                                }
                                break;
                            case movimiento_basura.METAL:
                                Bloke[i].setTrash(movimiento_basura.METAL);
                                switch(whichTrash)  {
                                    case 0: Bloke[i].addFrame(1,"/imagenes/lata.png"); break;

                                    case 1: Bloke[i].addFrame(1,"/imagenes/refresco.png"); break;

                                    case 2: Bloke[i].addFrame(1,"/imagenes/refresco2.png"); break;
                                }
                                break;
                        }

                        if(Bloke_falling == 1)
                        {
                            Bloke[i].setY(0);
                            Bloke[i].setPos(movimiento_basura.NONE);
                            Bloke[i].setRotable(false);
                        }
                        else if(Bloke_falling == 2)
                        {
                            Bloke[i].setY(-1);
                            Bloke[i].setPos(movimiento_basura.TOP);
                            Bloke[i].setRotable(true);
                            break;
                        }
                    }
                }//for
            }

            //move Bloke
            for(i=0,j=0; i<MAX_Bloke; i++)
            {
                if(Bloke[i].isActive() &&
                        (Bloke[i].getState() == movimiento_basura.FALLING ||
                                Bloke[i].getState() == movimiento_basura.FALLING_AUTO))
                {
                    //store all falling Bloke
                    index[j++] = i;
                    if(Bloke[i].moveDown() < 0)
                        count++;
                }
            }
            //when a movimiento_basura has reached the bottom or another STALLED
            //movimiento_basura, we have an illegal move... rollback.
            if(count == 2)
            {
                //two Bloke made illegal moves (aligned horizontally)
                rollBackMove(index[0],index[1]);
                checkExplosions(index[0]);
                checkExplosions(index[1]);
                checkCombos();
            }
            else if(count == 1)
            {
                if(index[0]>=0 && index[1]>=0)
                {
                    if(Bloke[index[0]].getY() == Bloke[index[1]].getY())
                    {
                        //Case #1: 2 Bloke aligned horizontally
                        //1 movimiento_basura blocked and the other keeps falling
                        i = Bloke[index[0]].getX();
                        j = Bloke[index[0]].getY();

                        if(Ventana[i][j] >= 0)
                        {
                            rollBackMove(index[0], -1);
                            Bloke[index[1]].setState(movimiento_basura.FALLING_AUTO);
                            Bloke[index[1]].setRotable(false);
                        }
                        else
                        {
                            rollBackMove(index[1], -1);
                            Bloke[index[0]].setState(movimiento_basura.FALLING_AUTO);
                            Bloke[index[0]].setRotable(false);
                        }

                        checkExplosions(index[0]);
                        checkExplosions(index[1]);
                        checkCombos();
                    }
                    else
                    {
                        //Case #2: 2 Bloke aligned vertically, one has
                        //an illegal position, the other does not
                        rollBackMove(index[0],index[1]);
                        checkExplosions(index[0]);
                        checkExplosions(index[1]);
                        checkCombos();
                    }
                }
                else
                {
                    //Case #3: 1 movimiento_basura falling alone
                    rollBackMove(index[0], -1);
                    checkExplosions(index[0]);
                    checkCombos();
                }
            }
            //else do nothing... legal move

        }//if cicle%speed
    }


    public void rollBackMove(int i1, int i2)
    {
        if(i1 >= 0)
        {
            Bloke[i1].moveUp();
            Bloke[i1].setState(movimiento_basura.STALLED);
            Ventana[Bloke[i1].getX()][Bloke[i1].getY()] = i1;
            Bloke_falling--;
        }

        if(i2 >= 0)
        {
            Bloke[i2].moveUp();
            Bloke[i2].setState(movimiento_basura.STALLED);
            Ventana[Bloke[i2].getX()][Bloke[i2].getY()] = i2;
            Bloke_falling--;
        }
    }

    public void BloqueExplode(int index, boolean delete)
    {
        int row, col;
        int color;
        int nextColor, nextIndex;

        //it should never get here
        if(index < 0)
            return;

        combo_counter++;
        col = Bloke[index].getX();
        row = Bloke[index].getY();
        color = Bloke[index].getTrash();
        Bloke[index].visited(true);
        nextIndex = nextColor = -1;

        //visit adjacent nodes
        switch(color) {

            case 0:
                colrs=0;
                //LEFT node
                if (col - 1 >= 1) {
                //get index and color of adjacent node
                nextIndex = Ventana[col - 1][row];
                if (nextIndex >= 0) {
                    nextColor = Bloke[nextIndex].getTrash();

                    //check if adjacent node has the same color and it hasn't
                    //been visited previously
                    if (color == nextColor && !Bloke[nextIndex].isVisited()) {
                        BloqueExplode(nextIndex, delete);
                        colrs=2;
                        p2++;
                    }
                }
                }
                //RIGHT node
                if (col + 1 <= Ancho) {
                nextIndex = Ventana[col + 1][row];
                if (nextIndex >= 0) {
                    nextColor = Bloke[nextIndex].getTrash();
                    if (color == nextColor && !Bloke[nextIndex].isVisited()) {
                        BloqueExplode(nextIndex, delete);
                        colrs=2;
                        p2++;
                    }
                }
                }
                //UP node
                if (row - 1 >= 1) {
                nextIndex = Ventana[col][row - 1];
                if (nextIndex >= 0) {
                    nextColor = Bloke[nextIndex].getTrash();
                    if (color == nextColor && !Bloke[nextIndex].isVisited()) {
                        BloqueExplode(nextIndex, delete);
                        colrs=2;
                        p2++;
                    }
                }
                }
                //BOTTOM node
                if (row + 1 <= Largo) {
                nextIndex = Ventana[col][row + 1];
                if (nextIndex >= 0) {
                    nextColor = Bloke[nextIndex].getTrash();
                    if (color == nextColor && !Bloke[nextIndex].isVisited()) {
                        BloqueExplode(nextIndex, delete);
                        colrs=2;
                        p2++;
                    }
                }
                }
            break;

            case 1:
                //LEFT node
                colrs=0;
                if (col - 1 >= 1) {
                    //get index and color of adjacent node
                    nextIndex = Ventana[col - 1][row];
                    if (nextIndex >= 0) {
                        nextColor = Bloke[nextIndex].getTrash();

                        //check if adjacent node has the same color and it hasn't
                        //been visited previously
                        if (color == nextColor && !Bloke[nextIndex].isVisited()) {
                            BloqueExplode(nextIndex, delete);
                            colrs=4;
                            p4++;
                        }
                    }
                }
                //RIGHT node
                if (col + 1 <= Ancho) {
                    nextIndex = Ventana[col + 1][row];
                    if (nextIndex >= 0) {
                        nextColor = Bloke[nextIndex].getTrash();
                        if (color == nextColor && !Bloke[nextIndex].isVisited()) {
                            BloqueExplode(nextIndex, delete);
                            colrs=4;
                            p4++;
                        }
                    }
                }
                //UP node
                if (row - 1 >= 1) {
                    nextIndex = Ventana[col][row - 1];
                    if (nextIndex >= 0) {
                        nextColor = Bloke[nextIndex].getTrash();
                        if (color == nextColor && !Bloke[nextIndex].isVisited()) {
                            BloqueExplode(nextIndex, delete);
                            colrs=4;
                            p4++;
                        }
                    }
                }
                //BOTTOM node
                if (row + 1 <= Largo) {
                    nextIndex = Ventana[col][row + 1];
                    if (nextIndex >= 0) {
                        nextColor = Bloke[nextIndex].getTrash();
                        if (color == nextColor && !Bloke[nextIndex].isVisited()) {
                            BloqueExplode(nextIndex, delete);
                            colrs=4;
                            p4++;
                        }
                    }
                }
                break;

            case 2:
                colrs=0;
                //LEFT node
                if (col - 1 >= 1) {
                    //get index and color of adjacent node
                    nextIndex = Ventana[col - 1][row];
                    if (nextIndex >= 0) {
                        nextColor = Bloke[nextIndex].getTrash();

                        //check if adjacent node has the same color and it hasn't
                        //been visited previously
                        if (color == nextColor && !Bloke[nextIndex].isVisited()) {
                            BloqueExplode(nextIndex, delete);
                            colrs=1;
                            p1++;
                        }
                    }
                }
                //RIGHT node
                if (col + 1 <= Ancho) {
                    nextIndex = Ventana[col + 1][row];
                    if (nextIndex >= 0) {
                        nextColor = Bloke[nextIndex].getTrash();
                        if (color == nextColor && !Bloke[nextIndex].isVisited()) {
                            BloqueExplode(nextIndex, delete);
                            colrs=1;
                            p1++;
                        }
                    }
                }
                //UP node
                if (row - 1 >= 1) {
                    nextIndex = Ventana[col][row - 1];
                    if (nextIndex >= 0) {
                        nextColor = Bloke[nextIndex].getTrash();
                        if (color == nextColor && !Bloke[nextIndex].isVisited()) {
                            BloqueExplode(nextIndex, delete);
                            p1++;
                            colrs=1;
                        }
                    }
                }
                //BOTTOM node
                if (row + 1 <= Largo) {
                    nextIndex = Ventana[col][row + 1];
                    if (nextIndex >= 0) {
                        nextColor = Bloke[nextIndex].getTrash();
                        if (color == nextColor && !Bloke[nextIndex].isVisited()) {
                            BloqueExplode(nextIndex, delete);
                            colrs=1;
                            p1++;
                        }
                    }
                }
                break;

            case 3:
                colrs = 0;
                //LEFT node
                if (col - 1 >= 1) {
                    //get index and color of adjacent node
                    nextIndex = Ventana[col - 1][row];
                    if (nextIndex >= 0) {
                        nextColor = Bloke[nextIndex].getTrash();

                        //check if adjacent node has the same color and it hasn't
                        //been visited previously
                        if (color == nextColor && !Bloke[nextIndex].isVisited()) {
                            BloqueExplode(nextIndex, delete);
                            p3++;
                            colrs=3;
                        }
                    }
                }
                //RIGHT node
                if (col + 1 <= Ancho) {
                    nextIndex = Ventana[col + 1][row];
                    if (nextIndex >= 0) {
                        nextColor = Bloke[nextIndex].getTrash();
                        if (color == nextColor && !Bloke[nextIndex].isVisited()) {
                            BloqueExplode(nextIndex, delete);
                            p3++;
                            colrs=3;
                        }
                    }
                }
                //UP node
                if (row - 1 >= 1) {
                    nextIndex = Ventana[col][row - 1];
                    if (nextIndex >= 0) {
                        nextColor = Bloke[nextIndex].getTrash();
                        if (color == nextColor && !Bloke[nextIndex].isVisited()) {
                            BloqueExplode(nextIndex, delete);
                            p3++;
                            colrs=3;
                        }
                    }
                }
                //BOTTOM node
                if (row + 1 <= Largo) {
                    nextIndex = Ventana[col][row + 1];
                    if (nextIndex >= 0) {
                        nextColor = Bloke[nextIndex].getTrash();
                        if (color == nextColor && !Bloke[nextIndex].isVisited()) {
                            BloqueExplode(nextIndex, delete);
                            p3++;
                            colrs=3;
                        }
                    }
                }
                break;
        }

        Bloke[index].visited(false);

        if(delete)
        {
            Bloke[index].off();
            Ventana[Bloke[index].getX()][Bloke[index].getY()] = -1;
        }
    }

    public boolean checkExplosions(int index)
    {
        combo_counter = 0;

        //count how many adjacent nodes of the same color
        BloqueExplode(index, false);
        papel_score points1 = new papel_score();
        plastico_score points2 = new plastico_score();
        organico_score points3 = new organico_score();
        aluminio_score points4 = new aluminio_score();
        //4 or more adjacent Bloke? delete them!
        if(combo_counter >= 4)
        {
            BloqueExplode(index, true);
            repaint();
            arrangeVentana();

            switch(colrs){
                case 1: puntos1 = p1+combo_counter; //paper
                        points1.setP(puntos1);
                        break;
                case 2: puntos2 = p2+combo_counter; //organic
                        points2.setP(puntos2);
                        break;
                case 3: puntos3 = p3+combo_counter; //metal
                        points3.setP(puntos3);
                        break;
                case 4: puntos4 = p4+combo_counter; //plastic
                        points4.setP(puntos4);
                        break;
            }

            return true;
        }

        return false;
    }

    void checkCombos()
    {
        int col,row;
        boolean cleared = false;

        while(!cleared)
        {
            for(row=1; row<=Largo; row++)
            {
                for(col=1; col<=Ancho; col++)
                {
                    if(Ventana[col][row] >= 0)
                    {
                        if(checkExplosions(Ventana[col][row])) {
                            //used to break both for loops and start over
                            row = col = Ancho*Largo;
                            cleared = false;
                        }
                        else
                            cleared = true;
                    }
                }
            }
        }//while
    }


    public void arrangeVentana()
    {
        int i,j,k;
        int count;

        try{
            Thread.sleep(220);
        }
        catch(InterruptedException ex) {
            System.out.println(ex.toString());
        }

        for(i=1; i<=Ancho; i++)
        {
            count = 0;
            for(j=Largo; j>=1; j--)
            {
                k = Ventana[i][j];
                if(k < 0)
                    count++;
                else if(count > 0)
                {
                    //pull down floating movimiento_basura
                    Bloke[k].setY(Bloke[k].getY()+count);

                    //clear previous position in ventana
                    Ventana[i][j] = -1;

                    //set new position in ventana
                    Ventana[Bloke[k].getX()][Bloke[k].getY()] = k;
                }
            }
        }
    }

    public void onKeyPressed(int key)
    {
        int i;
        boolean error = false;

        for(i=0; i<MAX_Bloke; i++)
        {
            if(Bloke[i].isActive())
            {
                switch(key)
                {
                    //Keyboard arrows
                    case KeyEvent.VK_LEFT:
                        if(Bloke[i].moveLeft() < 0)
                            error = true;
                        break;
                    case KeyEvent.VK_RIGHT:
                        if(Bloke[i].moveRight() < 0)
                            error = true;
                        break;
                    case KeyEvent.VK_UP:
                        Bloke[i].rotateLeft();
                        break;
                    case KeyEvent.VK_DOWN:
                        Bloke[i].rotateRight();
                        break;
                    //keyboard WASD
                    case KeyEvent.VK_A:
                        if(Bloke[i].moveLeft() < 0)
                            error = true;
                        break;
                    case KeyEvent.VK_D:
                        if(Bloke[i].moveRight() < 0)
                            error = true;
                        break;
                    case KeyEvent.VK_W:
                        Bloke[i].rotateLeft();
                        break;
                    case KeyEvent.VK_S:
                        Bloke[i].rotateRight();
                        break;
                    case KeyEvent.VK_R:
                        resetGame();
                        break;
                    case KeyEvent.VK_Q:
                        quitGame();
                        break;
                    case KeyEvent.VK_0: //emergency exit
                        System.exit(0);
                        break;
                    case KeyEvent.VK_9: //emergency exit
                        stopGame();
                        startGame();
                        break;
                    case KeyEvent.VK_NUMPAD0: //emergency exit
                        System.exit(0);
                        break;
                    case KeyEvent.VK_NUMPAD9: //emergency exit
                        stopGame();
                        startGame();
                        break;
                }//switch
            }//if
        }//for

        if(error)
        {
            //Rollback because an illegal move occurred;
            //this implementation is because we have
            //two Bloke moving out there...
            switch(key)
            {
                case KeyEvent.VK_LEFT:
                    onKeyPressed(KeyEvent.VK_RIGHT);
                    break;
                case KeyEvent.VK_RIGHT:
                    onKeyPressed(KeyEvent.VK_LEFT);
                    break;
            }
        }
    }


    public boolean gameOver()
    {
        for(int i=1; i<Ancho; i++)
            if(Ventana[i][1] >= 0)
                return true;

        return false;
    }


    public void run()
    {
        init();

        while(playing)
        {
            //update positions
            BloqueUpdate();

            //increment cicles
            cicle++;

            if(gameOver())
                stopGame();

            //update screen
            repaint();

            //sleep this thread for a little while

            try{
                switch(getDifficulty()) {  //trash fall speed
                    case 1: Thread.sleep(easy); break;
                    case 2: Thread.sleep(normal); break;
                    case 3: Thread.sleep(hard); break;
                }
            }
            catch(InterruptedException ex) {
                System.out.println(ex.toString());
            }
        }//while
    }



    public void paint(Graphics g)
    {
        String pathname = null;

        //create a back buffer (off-screen) to draw in
        BufferedImage backbuffer = new BufferedImage(Ancho* movimiento_basura.Ancho,Largo* movimiento_basura.Largo,BufferedImage.TRANSLUCENT);
        Graphics2D g2 = (Graphics2D)backbuffer.getGraphics();

       if(getDifficulty() == 1) {   //easy*/
           pathname = "src/Imagenes/Facil.jpg";
       }
        else if(getDifficulty() == 2) {  //normal
            pathname = "src/Imagenes/Medio.jpg";
        }
        else if(getDifficulty() == 3) {  //hard
            pathname = "src/Imagenes/Dificil.jpg";
        }

        //clear back buffer
        Image miImagen = null;
        File miRuta = new File(pathname);

        Image miImagen2 = null;
        File miRuta2 = new File("src/Imagenes/gameover.png");

        try{
            miImagen = ImageIO.read(miRuta);
            miImagen2 = ImageIO.read(miRuta2);
        }
        catch(IOException e){
            System.out.println("La imagen no se encuentra");
        }



        for(int i=0; i<MAX_Bloke; i++)
        {
            if(Bloke[i].isActive())
                Bloke[i].draw(g2);
        }

        if(!playing){
            //Letras de game over
            g2.drawImage(miImagen2,100,0,450,450,this);
        }


        //draw the back buffer
        g.drawImage(miImagen,0,0,1707,960,this);  // Fondo
        g.drawImage(backbuffer,500,100,690,785,this); // Pintado de cada basura
    }


    public void update(Graphics g) { paint(g); }
}

