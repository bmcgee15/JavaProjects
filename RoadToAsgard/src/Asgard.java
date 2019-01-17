import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Asgard extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Pane root = new Pane();
        Scene scene = new Scene(root, 800, 800); // set the size here
        stage.setTitle("FX GUI Template"); // set the window title here
        stage.setScene(scene);
        // TODO: Add your GUI-building code here

        // 1. Create the model
        // 2. Create the GUI components
        // 3. Add components to the root
        // 4. Configure the components (colors, fonts, size, location)
        // 5. Add Event Handlers and do final setup
        // 6. Show the stage
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
