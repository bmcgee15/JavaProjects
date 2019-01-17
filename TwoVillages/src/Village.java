
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/** This is the Village class that generates 3 randomly sized and
 * placed houses, randomly generates the number of occupants in each house, and
 * displays the name of the village, its length & its population.
 *
 *  @author Bret McGee - 000207475  */

public class Village {
    /** initialize village x coordinate **/
    private static double x = 25 + Math.random() * 25;
    /** initialize village size **/
    private static double size = 50 + Math.random() * 25;
    /** initialize village y coordinate **/
    private static double y = 120 - size;
    /** initialize village color coordinate **/
    private static Color color = Color.RED;
    /** initialize village name coordinate **/
    private static String name;

    /** Village Constructor **/
    public Village(String name, double x, double y, double size, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.name = name;
        this.size = size;



    }

    /** Draw Method - draws 3 randomly sized and
     * placed houses, randomly generates the number of occupants in each house, and
     * displays the name of the village, its length & its population.**/
    public void draw(GraphicsContext gc) {


        /** creates a random space before the first house **/
        double randomStart = Math.random() * 25;
        /** Create House 1 object **/
        House h1 = new House(x + randomStart, y, size, color);
        /** Draw House 1 **/
        h1.draw(gc);
        /** Color House 1 **/
        gc.setFill(color);
        /** Set occupants for House 1 **/
        h1.setOccupants((int)(Math.random() *10));
        /** get occupants for House 1 **/
        int occupants1 = h1.getOccupants();
        /** get size of House 1 **/
        double size1 = h1.getSize();


        /** creates a random space between house 1 & 2 **/
        double randomSpace1 = 250 + Math.random() * 50;
        /** creates a random size of house 2 **/
        double randomSize1 = -100 + Math.random() * 200;
        /** Create House 2 object **/
        House h2 = new House(x + randomSpace1, y - randomSize1, size + randomSize1, color);
        /** Draw house 2 **/
        h2.draw(gc);
        /** Color house 2 **/
        gc.setFill(color);
        /** set occupants for house 2 **/
        h2.setOccupants((int)(Math.random() *10));
        /** get occupants for house 2 **/
        int occupants2 = h2.getOccupants();
        /** set size for house 2 **/
        double size2 = h2.getSize();


        /** creates a random space between house 2 & 3 **/
        double randomSpace2 = 600 + Math.random() * 50;
        /** creates a random size of house 3 **/
        double randomSize2 = -100 + Math.random() * 200;
        /** Create House 3 object **/
        House h3 = new House(x + randomSpace2, y - randomSize2, size + randomSize2, color);
        /** Draw House 3 **/
        h3.draw(gc);
        /** Color House 3 **/
        gc.setFill(color);
        /** set occupants for house 3 **/
        h3.setOccupants((int)(Math.random() *10));
        /** get occupants for house 3 **/
        int occupants3 = h3.getOccupants();
        /** get size for house 3 **/
        double size3 = h3.getSize();

        /** calculate total size **/
        double totalSize = (size1 + size2 + size3 + randomStart + randomSize1 + randomSize2) * 20 / 100;
        /** calculate total occupants **/
        int totalOccupants = occupants1 + occupants2 + occupants3;
        /** create string to display village name, size and population **/
        String text = name + "(Size " + (int)totalSize + "m, population " + totalOccupants + ")";
        /** set font and size **/
        gc.setFont(Font.font("Times New Roman", 20));
        /** draw the village name, size and population **/
        gc.strokeText(text, x + randomStart, y + size + 40);







    }
}

