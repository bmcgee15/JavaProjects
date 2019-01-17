
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/** This is the Window class that generates a window
 *  proportionate in size and in proper place of the house.
 *
 *  @author Bret McGee - 000207475  */

public class Window{
    /** initialize window x coordinate **/
    private static double x;
    /** initialize window y coordinate **/
    private static double y;
    /** initialize window diameter **/
    private static double diameter;


    /** Window Constructor **/
    public Window(double x, double y, double diameter){
        /** sets this x **/
        this.x = x;
        /** sets this y **/
        this.y = y;
        /** sets this diameter **/
        this.diameter = diameter;

    }

    /** Draw Window Method **/
    public void draw(GraphicsContext gc){

        /** sets window color **/
        gc.setFill(Color.WHITE);
        /** color window **/
        gc.fillOval(x, y, diameter, diameter);
        /** draw window **/
        gc.strokeOval(x, y, diameter, diameter);

    }

}
