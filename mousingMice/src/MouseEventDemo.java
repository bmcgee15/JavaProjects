import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import static javafx.scene.text.TextAlignment.CENTER;

/**
 *
 * This class Creates a coloring application
 * that the user can choose the size and color
 * of their circle, and choose to click/drag
 * to draw, shift click/drag to erase, or to
 * input x & y value and click a button to
 * create their circle on the canvas. All
 * exceptions are caught.
 * @author Bret McGee
 *
 */
public class MouseEventDemo extends Application {

    /** New Circle Component **/
    private Circle circ;
    /** New canvas Component **/
    private Canvas can;
    /** new Graphics Content Component **/
    GraphicsContext gc;
    /** new Color Component **/
    private Color mainC = Color.BLACK;
    /** radius int **/
    private int radius = 50;
    /** new button component for radius 5 **/
    private Button btnRad5;
    /** new button component for radius 10 **/
    private Button btnRad10;
    /** new button component for radius 20 **/
    private Button btnRad20;
    /** new button component for radius 30 **/
    private Button btnRad30;
    /** new button component for radius 40 **/
    private Button btnRad40;
    /** new button component for radius 50 **/
    private Button btnRad50;
    /** new button component for blue **/
    private Button btnColBlue;
    /** new button component for red **/
    private Button btnColRed;
    /** new button component for green **/
    private Button btnColGreen;
    /** new button component for orange **/
    private Button btnColOrange;
    /** new button component for pink **/
    private Button btnColPink;
    /** new button component for black **/
    private Button btnColBlack;
    /** new label for radius **/
    private Label lblRadius;
    /** new label for color **/
    private Label lblColor;
    /** new label for title **/
    private Label lblTitle;
    /** new label for errors **/
    private Label lblError;
    /** new button for draw **/
    private Button btnDrawIt;
    /** new label for location **/
    private Label lblLocation;
    /** new textfield for location x **/
    private TextField txtLocX;
    /** new textfield for location y **/
    private TextField txtLocY;
    /** Location x string **/
    private String StrLocX;
    /** Location y string **/
    private String StrLocY;
    /** Location x int **/
    private int IntLocX;
    /** Location x int **/
    private int IntLocY;

    /**
     *
     * An event handler for the mouse event
     * @param me
     *
     **/
    private void pressHandler(MouseEvent me) {
        System.out.println("Pressed " + me.getButton() + " at (" + me.getX() + "," + me.getY() + ")."); // Displays action description to console
        if(me.isShiftDown()){
            System.out.println("Erasing..."); // Displays action description to console
            System.out.println(me.getX() + " " + me.getY()); // Displays action description to console
            gc.setFill(Color.WHITE); // sets the circle color to white  (eraser)
            gc.fillOval(me.getX() - radius, me.getY() - radius, radius * 2, radius * 2); // fills circle
            lblError.setText("                                                                                                     No Errors"); // sets the error label text
            lblError.setTextFill(Color.GREEN); // sets the error label color
        }else{
            System.out.println("Dragging... "); // Displays action description to console
            System.out.println(me.getX() + " " + me.getY()); // Displays action description to console
            gc.setFill(mainC); // sets the circle color
            gc.fillOval(me.getX() - radius, me.getY() - radius, radius * 2, radius * 2); // fills circle
            lblError.setText("                                                                                                     No Errors"); // sets the error label text
            lblError.setTextFill(Color.GREEN); // sets the error label color
        }

    }

    /**
     *
     * An event handler for the mouse event
     * @param me
     *
     **/
    private void releaseHandler(MouseEvent me) {
        System.out.println("Released " + me.getButton() + " at (" + me.getX() + "," + me.getY() + ")."); // Displays action description to console
    }

    /**
     *
     * An event handler for the mouse event
     * @param me
     *
     **/
    private void dragHandler(MouseEvent me){
        if(me.isShiftDown()){
            System.out.println("Erasing..."); // Displays action description to console
            System.out.println(me.getX() + " " + me.getY()); // Displays action description to console
            gc.setFill(Color.WHITE);  // sets the circle color to white  (eraser)
            gc.fillOval(me.getX() - radius, me.getY() - radius, radius * 2, radius * 2); // fills circle
            lblError.setText("                                                                                                     No Errors"); // sets the error label text
            lblError.setTextFill(Color.GREEN); // sets the error label color
        }else{
            System.out.println("Dragging"); // Displays action description to console
            System.out.println(me.getX() + " " + me.getY()); // Displays action description to console
            gc.setFill(mainC); // sets the circle color
            gc.fillOval(me.getX() - radius, me.getY() - radius, radius * 2, radius * 2); // fills circle
            lblError.setText("                                                                                                     No Errors"); // sets the error label text
            lblError.setTextFill(Color.GREEN); // sets the error label color
        }
    }

    /**
     *
     * An event handler for the mouse event
     * @param me
     *
     **/
    private void clickHandler(MouseEvent me){
        System.out.println("\"Click\""); // Displays action description to console
        System.out.println("Click Count: " + me.getClickCount()); // Displays action description to console
        System.out.println("EventType " + me.getEventType()); // Displays action description to console
        System.out.println("Button: " + me.getButton()); // Displays action description to console
    }

    /**
     *
     * An event handler for the action event
     * @param e
     *
     **/
    private void drawItHandler(ActionEvent e){
        try {
                StrLocX = txtLocX.getText(); // saves location x value to string
                IntLocX = Integer.parseInt(StrLocX); // converts location x value string to int
                StrLocY = txtLocY.getText(); // saves location y value to string
                IntLocY = Integer.parseInt(StrLocY); // converts location y value string to int
                gc.setFill(mainC); // sets the circle color
                gc.fillOval(IntLocX + 50, IntLocY + 50, radius * 2, radius * 2); // fills circle
                lblError.setText("                                                                                                     NO ERRORS"); // sets the error label text
                lblError.setTextFill(Color.GREEN); // sets the error label color

        }catch (NumberFormatException f){ // catch if the input includes a value other than an integer
            lblError.setText("                                                     ERROR: BAD VALUE FOR LOCATION - PLEASE USE INTEGER VALUES"); // sets the error label text
            lblError.setTextFill(Color.RED); // sets the error label color
        }catch (Exception f){ // Catch all other errors that could occur in the location input
            lblError.setText("                                                 UNKNOWN ERROR FROM LOCATION INPUT - PLEASE USE INTEGER VALUES"); // sets the error label text
            lblError.setTextFill(Color.RED); // sets the error label color
        }

    }

    /**
     *
     * An event handler for the action event
     * @param e
     *
     **/
    private void rad5Handler(ActionEvent e){
        radius = 5; // initializes radius variable
    }

    /**
     *
     * An event handler for the action event
     * @param e
     *
     **/
    private void rad10Handler(ActionEvent e){
        radius = 10; // initializes radius variable
    }

    /**
     *
     * An event handler for the action event
     * @param e
     *
     **/
    private void rad20Handler(ActionEvent e){
        radius = 20; // initializes radius variable
    }

    /**
     *
     * An event handler for the action event
     * @param e
     *
     **/
    private void rad30Handler(ActionEvent e){
        radius = 30; // initializes radius variable
    }

    /**
     *
     * An event handler for the action event
     * @param e
     *
     **/
    private void rad40Handler(ActionEvent e){
        radius = 40; // initializes radius variable
    }

    /**
     *
     * An event handler for the action event
     * @param e
     *
     **/
    private void rad50Handler(ActionEvent e){
        radius = 50; // initializes radius variable
    }

    /**
     *
     * An event handler for the action event
     * @param e
     *
     **/
    private void blueHandler(ActionEvent e){
        mainC = Color.BLUE; // initializes color variable
    }

    /**
     *
     * An event handler for the action event
     * @param e
     *
     **/
    private void redHandler(ActionEvent e){
        mainC = Color.RED; // initializes color variable
    }

    /**
     *
     * An event handler for the action event
     * @param e
     *
     **/
    private void greenHandler(ActionEvent e){
        mainC = Color.GREEN; // initializes color variable
    }

    /**
     *
     * An event handler for the action event
     * @param e
     *
     **/
    private void orangeHandler(ActionEvent e){
        mainC = Color.ORANGE; // initializes color variable
    }

    /**
     *
     * An event handler for the action event
     * @param e
     *
     **/
    private void pinkHandler(ActionEvent e){
        mainC = Color.PINK; // initializes color variable
    }

    /**
     *
     * An event handler for the action event
     * @param e
     *
     **/
    private void blackHandler(ActionEvent e){
        mainC = Color.BLACK; // initializes color variable
    }

    /**
     * This is where you create your components and the model and add event
     * handlers.
     *
     * @param stage The main stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane(); // new pane is created
        Scene scene = new Scene(root, 800, 625); // new scene is created
        stage.setTitle("Color Me Quick"); // sets the window title
        stage.setScene(scene); // sets scene
        root.setStyle("-fx-background-color: lightgray"); // sets background color

        can = new Canvas(700, 450); // creates new canvas
        can.setLayoutX(50);  // configure styles
        can.setLayoutY(50);  // configure styles
        circ = new Circle(); // creates new circle
        circ.setFill(mainC); // sets circle color
        circ.setLayoutX(50);  // configure styles
        circ.setLayoutY(50);  // configure styles

        lblTitle = new Label("Left Click to Draw | Hold Shift to Erase | Choose Color | Choose Radius"); // creates new label
        lblTitle.setLayoutX(33);  // configure styles
        lblTitle.setLayoutY(10);  // configure styles
        lblTitle.setFont(new Font(22));  // configure styles

        lblError = new Label("                                                                                                     No Errors"); // creates new label
        lblError.setTextAlignment(CENTER);  // configure styles
        lblError.setStyle("-fx-background-color: aliceblue");  // configure styles
        lblError.setTextFill(Color.GREEN);  // configure styles
        lblError.setLayoutY(600);  // configure styles
        lblError.setMinWidth(800);  // configure styles
        lblError.setMaxWidth(800);  // configure styles

        lblLocation = new Label("                    Location"); // creates new label
        lblLocation.setTextAlignment(CENTER);  // configure styles
        lblLocation.setStyle("-fx-background-color: dimgrey");  // configure styles
        lblLocation.setTextFill(Color.WHITE);  // configure styles
        lblLocation.setMinWidth(200);  // configure styles
        lblLocation.setMaxWidth(200);  // configure styles
        lblLocation.setLayoutX(550);  // configure styles
        lblLocation.setLayoutY(505);  // configure styles

        txtLocX = new TextField(); // creates new text field
        txtLocX.setMaxWidth(50);  // configure styles
        txtLocX.setMinWidth(50);  // configure styles
        txtLocX.setLayoutX(550);  // configure styles
        txtLocX.setLayoutY(525);  // configure styles

        txtLocY = new TextField(); // creates new text field
        txtLocY.setMaxWidth(50);  // configure styles
        txtLocY.setMinWidth(50);  // configure styles
        txtLocY.setLayoutX(625);  // configure styles
        txtLocY.setLayoutY(525);  // configure styles

        btnDrawIt = new Button("Draw"); // created new button
        btnDrawIt.setMaxWidth(0);  // configure styles
        btnDrawIt.setMinWidth(50);  // configure styles
        btnDrawIt.setLayoutX(700);  // configure styles
        btnDrawIt.setLayoutY(525);  // configure styles

        btnRad5 = new Button("5"); // created new button
        btnRad5.setTextAlignment(CENTER);  // configure styles
        btnRad5.setLayoutX(50);  // configure styles
        btnRad5.setLayoutY(525);  // configure styles
        btnRad5.setMinWidth(50);  // configure styles
        btnRad10 = new Button("10"); // created new button
        btnRad10.setTextAlignment(CENTER);  // configure styles
        btnRad10.setLayoutX(125);  // configure styles
        btnRad10.setLayoutY(525);  // configure styles
        btnRad10.setMinWidth(50);  // configure styles
        btnRad20 = new Button("20"); // created new button
        btnRad20.setTextAlignment(CENTER);  // configure styles
        btnRad20.setLayoutX(200);  // configure styles
        btnRad20.setLayoutY(525);  // configure styles
        btnRad20.setMinWidth(50);  // configure styles
        btnRad30 = new Button("30"); // created new button
        btnRad30.setTextAlignment(CENTER);  // configure styles
        btnRad30.setLayoutX(275);  // configure styles
        btnRad30.setLayoutY(525);  // configure styles
        btnRad30.setMinWidth(50);  // configure styles
        btnRad40 = new Button("40"); // created new button
        btnRad40.setTextAlignment(CENTER);  // configure styles
        btnRad40.setLayoutX(350);  // configure styles
        btnRad40.setLayoutY(525);  // configure styles
        btnRad40.setMinWidth(50);  // configure styles
        btnRad50 = new Button("50"); // created new button
        btnRad50.setTextAlignment(CENTER);  // configure styles
        btnRad50.setLayoutX(425);  // configure styles
        btnRad50.setLayoutY(525);  // configure styles
        btnRad50.setMinWidth(50);  // configure styles
        btnRad50.requestFocus();  // configure styles
        lblRadius = new Label("                                               Circle Radius"); // creates new label
        lblRadius.setTextAlignment(CENTER);  // configure styles
        lblRadius.setStyle("-fx-background-color: dimgrey");  // configure styles
        lblRadius.setTextFill(Color.WHITE);  // configure styles
        lblRadius.setMinWidth(425);  // configure styles
        lblRadius.setLayoutX(50);  // configure styles
        lblRadius.setLayoutY(505);  // configure styles

        lblColor = new Label("  Color"); // creates new label
        lblColor.setTextAlignment(CENTER);  // configure styles
        lblColor.setStyle("-fx-background-color: dimgrey");  // configure styles
        lblColor.setTextFill(Color.WHITE);  // configure styles
        lblColor.setMinWidth(50);  // configure styles
        lblColor.setMaxWidth(50);  // configure styles
        lblColor.setLayoutX(0);  // configure styles
        lblColor.setLayoutY(50);  // configure styles
        btnColBlue = new Button(); // created new button
        btnColBlue.setStyle("-fx-background-color: blue");  // configure styles
        btnColBlue.setMinWidth(30);  // configure styles
        btnColBlue.setLayoutX(10);  // configure styles
        btnColBlue.setLayoutY(110);  // configure styles
        btnColRed = new Button(); // created new button
        btnColRed.setStyle("-fx-background-color: crimson");  // configure styles
        btnColRed.setMinWidth(30);  // configure styles
        btnColRed.setLayoutX(10);  // configure styles
        btnColRed.setLayoutY(180);  // configure styles
        btnColGreen = new Button(); // created new button
        btnColGreen.setStyle("-fx-background-color: green");  // configure styles
        btnColGreen.setMinWidth(30);  // configure styles
        btnColGreen.setLayoutX(10);  // configure styles
        btnColGreen.setLayoutY(250);  // configure styles
        btnColOrange = new Button(); // created new button
        btnColOrange.setStyle("-fx-background-color: darkorange");  // configure styles
        btnColOrange.setMinWidth(30);  // configure styles
        btnColOrange.setLayoutX(10);  // configure styles
        btnColOrange.setLayoutY(320);  // configure styles
        btnColPink = new Button(); // created new button
        btnColPink.setStyle("-fx-background-color: lightpink");  // configure styles
        btnColPink.setMinWidth(30);  // configure styles
        btnColPink.setLayoutX(10);  // configure styles
        btnColPink.setLayoutY(390);  // configure styles
        btnColBlack = new Button(); // created new button
        btnColBlack.setStyle("-fx-background-color: black");  // configure styles
        btnColBlack.setMinWidth(30);  // configure styles
        btnColBlack.setLayoutX(10);  // configure styles
        btnColBlack.setLayoutY(460);  // configure styles

        root.getChildren().add(can); // add component to root
        root.getChildren().add(circ); // add component to root
        root.getChildren().add(btnRad5); // add component to root
        root.getChildren().add(btnRad10); // add component to root
        root.getChildren().add(btnRad20); // add component to root
        root.getChildren().add(btnRad30); // add component to root
        root.getChildren().add(btnRad40); // add component to root
        root.getChildren().add(btnRad50); // add component to root
        root.getChildren().add(lblRadius); // add component to root
        root.getChildren().add(btnColBlue); // add component to root
        root.getChildren().add(btnColRed); // add component to root
        root.getChildren().add(btnColGreen); // add component to root
        root.getChildren().add(btnColOrange); // add component to root
        root.getChildren().add(btnColPink); // add component to root
        root.getChildren().add(lblColor); // add component to root
        root.getChildren().add(btnColBlack); // add component to root
        root.getChildren().add(lblTitle); // add component to root
        root.getChildren().add(lblError); // add component to root
        root.getChildren().add(lblLocation); // add component to root
        root.getChildren().add(txtLocX); // add component to root
        root.getChildren().add(txtLocY); // add component to root
        root.getChildren().add(btnDrawIt); // add component to root

        gc = can.getGraphicsContext2D(); // sets gc
        gc.setFill(Color.WHITE); // sets gc color
        gc.fillRect(0, 0, 700, 450); // sets gc size

        can.addEventHandler(MouseEvent.MOUSE_PRESSED, this::pressHandler); // set event handler
        can.addEventHandler(MouseEvent.MOUSE_RELEASED, this::releaseHandler); // set event handler
        can.addEventHandler(MouseEvent.MOUSE_CLICKED, this::clickHandler); // set event handler
        can.addEventHandler(MouseEvent.MOUSE_DRAGGED, this::dragHandler); // set event handler

        btnRad5.setOnAction(this::rad5Handler); // set event handler
        btnRad10.setOnAction(this::rad10Handler); // set event handler
        btnRad20.setOnAction(this::rad20Handler); // set event handler
        btnRad30.setOnAction(this::rad30Handler); // set event handler
        btnRad40.setOnAction(this::rad40Handler); // set event handler
        btnRad50.setOnAction(this::rad50Handler); // set event handler

        btnColBlack.setOnAction(this::blackHandler); // set event handler
        btnColPink.setOnAction(this::pinkHandler); // set event handler
        btnColOrange.setOnAction(this::orangeHandler); // set event handler
        btnColGreen.setOnAction(this::greenHandler); // set event handler
        btnColRed.setOnAction(this::redHandler); // set event handler
        btnColBlue.setOnAction(this::blueHandler); // set event handler
        btnDrawIt.setOnAction(this::drawItHandler); // set event handler

        stage.show(); // Shows Stage
    }

    /**
     * Main Method
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}