import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Use this template to create Apps with Graphical User Interfaces.
 *
 * @author sam.scott1
 */
public abstract class GUI extends Application{

    // TODO: Instance Variables for View Components and Model
    TextField txtfield1;
    Label lblOutput;
    int balance = 1000;
    String label = "Balance: $" + balance;
    String strName;
    int intNumber;
    // TODO: Private Event Handlers and Helper Methods
    private void myHandler(ActionEvent e){
       // System.out.println(txtfield1.getText());
//        intNumber = Integer.parseInt(strName);
//        label = "Balance: $" + (balance - intNumber);
//        System.out.println(strName);
        System.out.println("myHandler");
    }
    private void myHandler2(ActionEvent e){
        //System.out.println(txtfield1.getText());
//        intNumber = Integer.parseInt(strName);
//        label = "Balance: $" + (balance - intNumber);
//        System.out.println(strName);
        System.out.println("myHandler2");
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
        Scene scene = new Scene(root, 400, 150); // set the size here
        stage.setTitle("Bank Account Manager"); // set the window title here
        stage.setScene(scene);
        // TODO: Add your GUI-building code here

        // 1. Create the model
        // 2. Create the GUI components
        TextField txtfield1 = new TextField("0.00");
        Label lblOutput = new Label("hello");
        Button btnbutton = new Button("Withdraw");
        Button btnbutton2 = new Button("Deposit");
        // 3. Add components to the root
        root.getChildren().add(txtfield1);
        root.getChildren().add(btnbutton2);
        root.getChildren().add(btnbutton);
        root.getChildren().add(lblOutput);
        // 4. Configure the components (colors, fonts, size, location)
        lblOutput.setLayoutX(20);
        lblOutput.setLayoutY(40);
        lblOutput.setFont(new Font("System", 40));
        lblOutput.setStyle("-fx-text-fill: blue");
        txtfield1.setLayoutX(20);
        txtfield1.setLayoutY(100);
        btnbutton2.setLayoutY(100);
        btnbutton2.setLayoutX(210);

        btnbutton.setLayoutX(300);
        btnbutton.setLayoutY(100);

        // 5. Add Event Handlers and do final setup
        btnbutton.setOnAction(this::myHandler);
        btnbutton2.setOnAction(this::myHandler2);
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
