
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import static javafx.application.Application.launch;
import java.util.Scanner;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;

/**
 * This is a constellation mapping program that asks for multiple star locations, then links them
 * together. It then asks you for the constellation name and displays it on a randomly generated
 * starry sky.
 *
 * @author Bret McGee - 000207475
 */
public class StarGazer extends Application {

    /**
     *
     * Yayyyyyyy
     * @param stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        // *** names constants
        final int CANVAS_WIDTH = 600;
        final int CANVAS_HEIGHT = 600;
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(CANVAS_WIDTH, CANVAS_HEIGHT); // Set canvas Size in Pixels
        stage.setTitle("StarGazer"); // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // YOUR CODE STARTS HERE
        gc.setFill(Color.BLACK);  //background color
        gc.fillRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT); // background size
        gc.setFill(Color.WHITE);  // moon fill color
        gc.fillOval(25, 100, 100, 100); // moon size and position
        int starCounter = 0; // initiated the loop counter for star backdrop

        // RANDOM STAR GENERATOR
        while (starCounter < 100){
            double x = Math.random() * CANVAS_WIDTH;
            double y = Math.random() * CANVAS_HEIGHT;
            // output - big back stars
            gc.setFill(Color.WHITE );
            gc.fillRect(x, y, 3, 3);
            double a = Math.random() * CANVAS_WIDTH;
            double b = Math.random() * CANVAS_HEIGHT;
            // output - medium back stars
            gc.setFill(Color.WHITE);
            gc.fillRect(a, b, 2, 2);
            double c = Math.random() * CANVAS_WIDTH;
            double d = Math.random() * CANVAS_HEIGHT;
            // output - small back stars
            gc.setFill(Color.WHITE);
            gc.fillRect(c, d, 1, 1);
            starCounter++; //counter incremented
        }


        Scanner input = new Scanner(System.in);
        int end;
        boolean gateKeeper = false; //Boolean Flag initiated

        // The Constellation Mapping Do While Loop

        do{
            // Constellation Star n
            System.out.print("Enter X & Y Values in pixels from 0 - 599, or type a number higher than 600 if you are doe mapping your constellation: ");
            double x1 = input.nextDouble(); // input
            double y1 = input.nextDouble(); // input
            double p1, t1, x2, y2;
            double firstX, firstY, p2, t2;

            if(x1 < CANVAS_WIDTH && y1 < CANVAS_WIDTH) {
                p1 = x1;
                t1 = y1;
                firstX = x1;
                firstY = y1;
                gc.setFill(Color.YELLOW); // output
                gc.fillRect(x1, y1, 5, 5); // output
                // Constellation Star n
                System.out.print("Enter X & Y Values in pixels from 0 - 599, or type a number higher than 600 if you are doe mapping your constellation: ");
                x2 = input.nextDouble(); // input
                y2 = input.nextDouble(); // input
            }else break;

                if (x2 < CANVAS_WIDTH && y2 < CANVAS_WIDTH) {
                    p2 = x2;
                    t2 = y2;
                    gc.setFill(Color.YELLOW); // output
                    gc.fillRect(x2, y2, 5, 5); // output
                    gc.setStroke(Color.YELLOW); // output
                    gc.strokeLine(p1, t1, p2, t2); // output
                }else break;

            // Constellation Star n
            System.out.print("Enter X & Y Values in pixels from 0 - 599, or type a number higher than 600 if you are done mapping your constellation: ");
            x1 = input.nextDouble(); // input
            y1 = input.nextDouble(); // input


            if(x1 < CANVAS_WIDTH && y1 < CANVAS_WIDTH) {
                p1 = x1;
                t1 = y1;
                gc.setFill(Color.YELLOW); // output
                gc.fillRect(x1, y1, 5, 5); // output
                // Constellation Star n
                System.out.print("Enter X & Y Values in pixels from 0 - 599, or type a number higher than 600 if you are doe mapping your constellation: ");
                x2 = input.nextDouble(); // input
                y2 = input.nextDouble(); // input
                gc.setStroke(Color.YELLOW); // output
                gc.strokeLine(p1, t1, p2, t2); // output
            }else break;

                if(x2 < CANVAS_WIDTH && y2 < CANVAS_WIDTH){
                    p2 = x2;
                    t2 = y2;
                    gc.setFill(Color.YELLOW); // output
                    gc.fillRect(x2, y2, 5, 5); // output
                    gc.setStroke(Color.YELLOW); // output
                    gc.strokeLine(p1, t1, p2, t2); // output
                }else break;



            System.out.print("Enter any number to continue, or 0 to if you are done mapping out your constellation: ");
            end = input.nextInt(); // input
            if (end == 0) {
                gateKeeper = false;

            } else{
                gateKeeper = true;
            }
            gc.setStroke(Color.YELLOW); // output
            gc.strokeLine(firstX, firstY, p2, t2); // output


        }while(gateKeeper);

        input.nextLine();
        System.out.print("What is the name of your constellation? ");
        String ConName = input.nextLine(); // input
        gc.setFont(Font.font("Times New Roman", 20)); // output
        gc.strokeText(ConName, 200, 550); // output


        gc.setFont(Font.font("Times New Roman", 20)); // output
        gc.strokeText("Programmed by Bret McGee", 300, 25); // output




        // YOUR CODE STOPS HERE
        stage.show();
    }

    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}