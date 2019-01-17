import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/** This is the main class that populates 2 vilages and a castle.
 * Each village generates 3 randomly sized and placed houses,
 * randomly generates the number of occupants in each house, and
 * displays the name of the village, its length & its population.
 * The kings castle is generated much larger and off on its own.
 *
 *  @author Bret McGee - 000207475  */

public class TwoVillages extends Application
{
    /** Village X Coordinate **/
    private static double x = 25;
    /** Village Y Coordinate **/
    private static double y = 200;
    /** Village Size **/
    private static double size = 200;
    /** Village Color **/
    private static Color color = Color.RED;
    /** Village Name **/
    private static String name = "RedVillage";
    /** Canvas Width **/
    public static final int WINDOW_WIDTH = 1920;
    /** Canvas Height **/
    public static final int WINDOW_HEIGHT = 1080;

    /**
     *  A method to launch the args.
     *  @param args
     */
    public static void main(String[] args)
    {
        launch(args);
    }

    /**
     *  A method that creates the stage & draw the villages & castle.
     */

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        /** Create new Group **/
        Group root = new Group();
        /** Create new Scene **/
        Scene scene = new Scene(root);
        /** Create new canvas **/
        Canvas canvas = new Canvas(WINDOW_WIDTH, WINDOW_HEIGHT);
        /** Initialize Graphics Context **/
        GraphicsContext gc = canvas.getGraphicsContext2D();
        /** Fill the canvas with color **/
        gc.setFill(Color.AQUA);
        gc.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);


        /** Create village 1 object **/
        Village v1 = new Village(name, x, y, size, color);
        /** Draw Village 1 **/
        v1.draw(gc);


        /** Change Village name for village 2 **/
        name = "BlueVillage";
        /** Change Village color for village 2 **/
        color = Color.BLUE;
        /** Change Village x coordinate for village 2 **/
        x = 400;
        /** Change Village y coordinate for village 2 **/
        y = 750;
        /** Create village 2 object **/
        Village v2 = new Village(name, x, y, size, color);
        /** Draw village 2 **/
        v2.draw(gc);


        /** Create Castle object **/
        House Castle = new House(1400, 200);
        /** Draw Castle **/
        Castle.draw(gc);

        /** Get Children **/
        root.getChildren().add(canvas);
        /** Set Title **/
        primaryStage.setTitle("MultipleFaces in JavaFX");
        /** Set Scene **/
        primaryStage.setScene(scene);
        /** Show Stage **/
        primaryStage.show();
    }
}