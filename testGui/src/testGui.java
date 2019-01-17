import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author sam.scott1
 */
public class testGui extends Application {

    // Instance Variables for View Components and Model
    private modelGui model;
    private GraphicsContext gc;
    private Label output;
    private TextField radiusField;

    private void setRadHandler(ActionEvent e) {
        double newRad = Double.parseDouble(radiusField.getText());
        model.setRadius(newRad);
        drawCircle();
        radiusField.requestFocus();
    }

    private void drawCircle() {
        gc.setFill(Color.LIGHTBLUE);
        gc.fillRect(0, 0, 160, 100);
        model.draw(gc);
        output.setText("" + model);
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
        Pane root = new Pane();
        Scene scene = new Scene(root, 160, 200); // set the size here
        stage.setTitle("Circle!"); // set the window title here
        stage.setScene(scene);

        // 1. Create the model
        model = new modelGui(50, 80, 50);

        // 2. Create the GUI components
        Canvas canvas = new Canvas(160, 100);
        radiusField = new TextField("50");
        Button setRadButton = new Button("Set Radius");
        output = new Label("");
        output.setFont(new Font("System", 9));

        // 3. Add components to the root
        root.getChildren().add(canvas);
        root.getChildren().add(radiusField);
        root.getChildren().add(setRadButton);
        root.getChildren().add(output);

        // 4. Configure the components (colors, fonts, size, location)
        radiusField.setLayoutY(105);
        setRadButton.setLayoutY(135);
        output.setLayoutY(165);

        // 5. Add Listeners and do final setup
        setRadButton.setOnAction(this::setRadHandler);
        gc = canvas.getGraphicsContext2D();
        drawCircle();

        // 6. Show the stage
        stage.show();
    }

    /**
     * Make no changes here.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}