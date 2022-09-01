Picture.java

/**
 * Canvas is a class to allow for simple graphical drawing on a canvas.
 * This is a modification of the general purpose Canvas, specially made for
 * the BlueJ "shapes" example.
 *
 *The picture will present a simple representation of a person working on a
 *computer using some simple shapes.
 *
 * @author: Salvatore Anzalone
 * @version: 08.31.2022
 */
public class Picture
{
    private Square table;
    private Square comPiece1;
    private Square comPiece2;
    private Square comScreen;
    private Triangle compitr;
    private Circle mouse;
    private Square background;
    private Person comuser;

    private static Canvas canvasSingleton;

    /**
     * Constructor for objects of class PictureAnzalone
     */
    public Picture()
    {
        table =  new Square();
        background =  new Square();
        comPiece1 =  new Square();
        comPiece2 =  new Square();
        comScreen =  new Square();
        compitr =  new Triangle();
        mouse = new Circle();
        comuser =  new Person();
    }

  /**
     * Draw picture.
     */
    public void draw()
    {
        table.changeColor("grey");
        table.moveHorizontal(-320);
        table.changeSize(225);
        table.makeVisible();

        background.changeColor("white");
        background.moveHorizontal(-340);
        background.moveVertical(-550);
        background.changeSize(550);
        background.makeVisible();

        comPiece1.changeColor("black");
        comPiece1.moveHorizontal(-165);
        comPiece1.moveVertical(-55);
        comPiece1.changeSize(90);
        comPiece1.makeVisible();

        comPiece2.changeColor("black");
        comPiece2.moveHorizontal(-85);
        comPiece2.moveVertical(-55);
        comPiece2.changeSize(95);
        comPiece2.makeVisible();

        comScreen.changeColor("skyblue");
        comScreen.moveHorizontal(-85);
        comScreen.moveVertical(-55);
        comScreen.changeSize(90);
        comScreen.makeVisible();

        compitr.changeColor("black");
        compitr.moveHorizontal(-80);
        compitr.moveVertical(-55);
        compitr.changeSize(40);
        compitr.makeVisible();

        mouse.changeColor("black");
        mouse.moveHorizontal(-170);
        mouse.moveVertical(-60);
        mouse.changeSize(70);
        mouse.makeVisible();

        comuser.changeColor("lightgrey");
        comuser.changeSize(80,40);
        comuser.moveHorizontal(-94);
        comuser.moveVertical(25);
        comuser.makeVisible();

    }

    /**
     * Change picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(background != null) //only if already painted
        {
            table.changeColor("darkgrey");
            background.changeColor("grey");
            comPiece1.changeColor("black");
            comPiece2.changeColor("black");
            comScreen.changeColor("white");
            compitr.changeColor("black");
            mouse.changeColor("black");
            comuser.changeColor("lightgrey");
        }
    }

}
