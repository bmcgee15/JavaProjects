

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/** This is the House class that generates a randomly sized and
 * placed house, randomly generates the number of occupants in each house, and
 * calls on the draw window and draw door class methods.
 *
 *  @author Bret McGee - 000207475  */

public class House{
    /** initialize house size **/
    private static double size = 50 + Math.random() * 25;
    /** initialize house x coordinate **/
    private static double x = 25 + Math.random() * 25;
    /** initialize house y coordinate **/
    private static double y = 120 - size;
    /** initialize house occupants **/
    private static int occupants = (int)(1 + Math.random() * 10);
    /** initialize house color **/
    private static Color color;

    /** Main Houses Constructor **/
    public House(double x, double y, double size, Color color) {
        /** sets this x **/
        this.x = x;
        /** sets this y **/
        this.y = y;
        /** sets this size **/
        this.size = size;
        /** sets this color **/
        this.color = color;

    }

    /** Kings Constructor **/
    public House(double x, double y){
        /** sets this x **/
        this.x = x;
        /** sets this y **/
        this.y = y;
        /** sets castle size **/
        size = 350;
        /** sets castle color **/
        color = Color.ORANGE;
        /** sets castle occupants **/
        occupants = 1;


    }

    /** Occupants Getter **/
    public int getOccupants(){
        /** returns occupants  **/
        return occupants;
    }

    /** Occupants Setter **/
    public void setOccupants(int occupants){
        /** sets occupants **/
        this.occupants = occupants;
    }

    /** Size Getter **/
    public double getSize(){
        /** returns size **/
        return size;
    }

    /** Draw Method - Draws house, calls on draw methods for door and window **/
    public void draw(GraphicsContext gc) {

        /** set house color **/
        gc.setFill(color);
        /** Color House **/
        gc.fillRect(x, y, size, size);
        /** Draw House **/
        gc.strokeRect(x, y, size, size);

        /** Initialize Windows x coordinate **/
        double windowX = x + (size * 0.1);
        /** Initialize Windows y coordinate **/
        double windowY = y + (size * 0.1);
        /** Initialize Windows diameter **/
        double windowDiameter = size / 5;
        /** Create new Window object **/
        Window w1 = new Window(windowX, windowY, windowDiameter);
        /** Draw Window **/
        w1.draw(gc);

        /** Initialize Doors x coordinate **/
        double doorX = x;
        /** Initialize Doors y coordinate **/
        double doorY = y;
        /** Initialize Doors height **/
        double doorHeight = size / 2;
        /** Create new door object **/
        Door D1 = new Door(doorX, doorY, doorHeight);
        /** Draw door **/
        D1.draw(gc);

    }
}