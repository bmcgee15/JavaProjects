
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/** This is the Door class that generates a door
 *  proportionate in size and in proper place of the house.
 *
 *  @author Bret McGee - 000207475  */

public class Door {
    /** initialize door x coordinate **/
    private static double x;
    /** initialize door y coordinate **/
    private static double y;
    /** initialize door height **/
    private static double height;

    /** Door Constructor **/
    public Door(double x, double y, double height) {
        /** sets this x **/
        this.x = x;
        /** sets this y **/
        this.y = y;
        /** sets this height **/
        this.height = height;

    }

    /** Draw Door Method **/
    public void draw(GraphicsContext gc) {
        /** sets door color **/
        gc.setFill(Color.WHITE);
        /** colors door **/
        gc.fillRect(x + (height * 1.3), y + (height),height / 2, height);
        /** draws door **/
        gc.strokeRect(x + (height * 1.3), y + (height),height / 2, height);
    }
}
