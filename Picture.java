/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Salvatore Anzalone
 * @version 9.24.2022
 */
public class Picture
{
    private Square table;
    private Square comPiece1;
    private Square comPiece2;
    private Square comScreen;
    private Triangle compitr;
    private Circle mouse;
    private Person comuser;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        table =  new Square();
        comPiece1 =  new Square();
        comPiece2 =  new Square();
        comScreen =  new Square();
        compitr =  new Triangle();
        mouse = new Circle();
        comuser =  new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn)
        {
            table.changeColor("brown");
            table.moveHorizontal(-140);
            table.changeSize(113);
            table.makeVisible();

            comPiece1.changeColor("white");
            comPiece1.moveHorizontal(-165);
            comPiece1.moveVertical(-55);
            comPiece1.changeSize(45);
            comPiece1.makeVisible();

            comPiece2.changeColor("black");
            comPiece2.moveHorizontal(-85);
            comPiece2.moveVertical(-55);
            comPiece2.changeSize(48);
            comPiece2.makeVisible();

            comScreen.changeColor("blue");
            comScreen.moveHorizontal(-85);
            comScreen.moveVertical(-55);
            comScreen.changeSize(35);
            comScreen.makeVisible();

            compitr.changeColor("black");
            compitr.moveHorizontal(-80);
            compitr.moveVertical(-55);
            compitr.changeSize(20,40);
            compitr.makeVisible();

            mouse.changeColor("red");
            mouse.moveHorizontal(-96);
            mouse.moveVertical(23);
            mouse.changeSize(35);
            mouse.makeVisible();

            comuser.changeColor("green");
            comuser.changeSize(80,40);
            comuser.moveHorizontal(-94);
            comuser.moveVertical(25);
            comuser.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        table.changeColor("darkgrey");
        comPiece1.changeColor("black");
        comPiece2.changeColor("black");
        comScreen.changeColor("white");
        compitr.changeColor("black");
        mouse.changeColor("black");
        comuser.changeColor("lightgrey");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        table.changeColor("brown");
        comPiece1.changeColor("white");
        comPiece2.changeColor("black");
        comScreen.changeColor("blue");
        compitr.changeColor("black");
        mouse.changeColor("red");
        comuser.changeColor("green");
    }
}
