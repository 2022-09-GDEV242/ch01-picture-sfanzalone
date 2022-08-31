PictureAnzalone.java

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
public class PictureAnzalone
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
    public PictureAnzalone()
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

    /**
     * Change picture to color display
     */
     // Note: this is a slightly backwards way of maintaining the shape
     // objects. It is carefully designed to keep the visible shape interfaces
     // in this project clean and simple for educational purposes.
    public void draw(Object referenceObject, String color, Shape shape)
    {
        objects.remove(referenceObject);   // just in case it was already there
        objects.add(referenceObject);      // add at the end
        shapes.put(referenceObject, new ShapeDescription(shape, color));
        redraw();
    }

    /**
     * Erase a given shape's from the screen.
     * @param  referenceObject  the shape object to be erased
     */
    public void erase(Object referenceObject)
    {
        objects.remove(referenceObject);   // just in case it was already there
        shapes.remove(referenceObject);
        redraw();
    }

    /**
     * Set the foreground color of the Canvas.
     * @param  newColor   the new color for the foreground of the Canvas
     */
    public void setForegroundColor(String colorString)
    {
        if(colorString.equals("red")) {
            graphic.setColor(new Color(235, 25, 25));
        }
        else if(colorString.equals("black")) {
            graphic.setColor(Color.black);
        }
        else if(colorString.equals("blue")) {
            graphic.setColor(new Color(30, 75, 220));
        }
        else if(colorString.equals("yellow")) {
            graphic.setColor(new Color(255, 230, 0));
        }
        else if(colorString.equals("green")) {
            graphic.setColor(new Color(80, 160, 60));
        }
        else if(colorString.equals("magenta")) {
            graphic.setColor(Color.magenta);
        }
        else if(colorString.equals("white")) {
            graphic.setColor(Color.white);
        }
        else {
            graphic.setColor(Color.black);
        }
    }

    /**
     * Wait for a specified number of milliseconds before finishing.
     * This provides an easy way to specify a small delay which can be
     * used when producing animations.
     * @param  milliseconds  the number
     */
    public void wait(int milliseconds)
    {
        try
        {
            Thread.sleep(milliseconds);
        }
        catch (Exception e)
        {
            // ignoring exception at the moment
        }
    }

    /**
     * Redraw ell shapes currently on the Canvas.
     */
    private void redraw()
    {
        erase();
        for(Object shape : objects) {
            shapes.get(shape).draw(graphic);
        }
        canvas.repaint();
    }

    /**
     * Erase the whole canvas. (Does not repaint.)
     */
    private void erase()
    {
        Color original = graphic.getColor();
        graphic.setColor(backgroundColor);
        Dimension size = canvas.getSize();
        graphic.fill(new Rectangle(0, 0, size.width, size.height));
        graphic.setColor(original);
    }


    /************************************************************************
     * Inner class CanvasPane - the actual canvas component contained in the
     * Canvas frame. This is essentially a JPanel with added capability to
     * refresh the image drawn on it.
     */
    private class CanvasPane extends JPanel
    {
        public void paint(Graphics g)
        {
            g.drawImage(canvasImage, 0, 0, null);
        }
    }

    /************************************************************************
     * Inner class CanvasPane - the actual canvas component contained in the
     * Canvas frame. This is essentially a JPanel with added capability to
     * refresh the image drawn on it.
     */
    private class ShapeDescription
    {
        private Shape shape;
        private String colorString;

        public ShapeDescription(Shape shape, String color)
        {
            this.shape = shape;
            colorString = color;
        }

        public void draw(Graphics2D graphic)
        {
            setForegroundColor(colorString);
            graphic.fill(shape);
        }
    }

}
