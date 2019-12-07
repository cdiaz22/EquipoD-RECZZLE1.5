/*
 *RECZZLE 1.5
 *VIDEOJUEGO PARA COMPUTADORA EN JAVA PARA APRENDER A SEPARAR RESIDUOS
 *AUTORES: CASTAÑÓN PUGA MANUEL, BURGOS PONCE XAVIER ALBERTO, CABALLERO VILLASEÑOR BRYAN, DÍAZ PRIETO CARLOS EDUARDO, ZURITA MERINO CESAR LEONARDO
 *CORREO ELECTRONICO: puga@uabc.edu.mx, burgos.xavier@uabc.edu.mx, bryan.caballero.villasenor@uabc.edu.mx, cdiaz22@uabc.edu.mx, cesar.zurita@uabc.edu.mx
 *UNIVERSIDAD AUTÓNOMA DEL ESTADO DE BAJA CALIFORNIA
 *http://www.uabc.mx
 */

package Juego;

class movimiento_basura extends sprite
{
    //positions for rotation
    final static int TOP    = 0;
    final static int RIGHT  = 1;
    final static int BOTTOM = 2;
    final static int LEFT   = 3;
    final static int NONE   = 4;

    //movimiento_basura colors
    final static int ORGANIC   = 0;
    final static int PLASTIC   = 1;
    final static int PAPER     = 2;
    final static int METAL     = 3;

    //movimiento_basura states
    final static int FALLING = 0;
    final static int STALLED = 1;
    final static int FALLING_AUTO = 2;

    //movimiento_basura sprite size
    final static int Ancho = 120;
    final static int Largo = 120;

    private int trash;		//movimiento_basura color (red, blue, ...)
    private int state;		//movimiento_basura state (falling, etc)
    private int pos;		//position for rotation
    private boolean rotable;	//can be rotated?
    private boolean visited;	//has been visited? (used when checking for combos)

    public movimiento_basura(int nFrames) {
        super(nFrames);
    }

    public int getState() {
        return state;
    }

    public int getTrash() {
        return trash;
    }

    public int getPos() {
        return pos;
    }

    public boolean isVisited() {
        return visited;
    }

    public boolean isRotable() {
        return rotable;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setTrash(int trash) {
        this.trash = trash;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public void visited(boolean visited) {
        this.visited = visited;
    }

    public void setRotable(boolean rotable) {
        this.rotable = rotable;
    }

    public void setX(int value) {
        super.setX((value-1)*Ancho);
    }

    public void setY(int value) {
        super.setY((value-1)*Largo);
    }

    public int getX() {
        return (super.getX()/Ancho) + 1;
    }

    public int getY() {
        return (super.getY()/Largo) + 1;
    }


    public void rotateRight()
    {
        if(!isRotable())
            return;

        if(getState() == STALLED)
            return;

        switch(pos)
        {
            case TOP:
                if(getX() == ventana.Ancho)
                    return;
                setPos(RIGHT);
                setX(getX()+1);
                setY(getY()+1);
                break;
            case RIGHT:
                setPos(BOTTOM);
                setX(getX()-1);
                setY(getY()+1);
                break;
            case BOTTOM:
                if(getX() == 1)
                    return;
                setPos(LEFT);
                setX(getX()-1);
                setY(getY()-1);
                break;
            case LEFT:
                setPos(TOP);
                setX(getX()+1);
                setY(getY()-1);
                break;
        }
    }


    public void rotateLeft()
    {
        if(!isRotable())
            return;

        if(getState() == STALLED)
            return;

        switch(pos)
        {
            case TOP:
                if(getX() == 1)
                    return;
                setPos(LEFT);
                setX(getX()-1);
                setY(getY()+1);
                break;
            case LEFT:
                setPos(BOTTOM);
                setX(getX()+1);
                setY(getY()+1);
                break;
            case BOTTOM:
                if(getX() == ventana.Ancho)
                    return;
                setPos(RIGHT);
                setX(getX()+1);
                setY(getY()-1);
                break;
            case RIGHT:
                setPos(TOP);
                setX(getX()-1);
                setY(getY()-1);
                break;
        }
    }

    public int moveDown()
    {
        int row,col;
        boolean collision = false;

        setY(getY() +1);

        //
        row = getY();
        col = getX();
        if(row >= 1 && row <= ventana.Largo && col >= 1 && col <= ventana.Ancho)
            if(ventana.Ventana[col][row] >= 0)
                collision = true;

        if(getY() > ventana.Largo || collision)
            return -1;
        else
            return 1;
    }

    public void moveUp() {
        setY(getY() -1);
    }

    public int moveLeft()
    {
        int row,col;
        boolean collision = false;

        if(getState() == STALLED || getState() == FALLING_AUTO)
            return 0;

        setX(getX() -1);

        //check if we have touched another movimiento_basura
        row = getY();
        col = getX();
        if(row >= 1 && row <= ventana.Largo && col >= 1 && col <= ventana.Ancho)
            if(ventana.Ventana[col][row] >= 0)
                collision = true;

        if(getX() < 1 || collision)
            return -1;
        else
            return 1;
    }

    public int moveRight()
    {
        int row,col;
        boolean collision = false;

        if(getState() == STALLED || getState() == FALLING_AUTO)
            return 0;

        setX(getX() + 1);


        row = getY();
        col = getX();
        if(row >= 1 && row <= ventana.Largo && col >= 1 && col <= ventana.Ancho)
            if(ventana.Ventana[col][row] >= 0)
                collision = true;

        if(getX() > ventana.Ancho || collision)
            return -1;
        else
            return 1;
    }
}