import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author sam.scott1
 */
public class Assignment5 extends Application {

    // TODO: Instance Variables for View Components and Model
    private Model model;
    private Label lblTitle;
    private Label lblQuestion;
    private Button btnOK;
    private Button btnReset;
    private Label lblRight;
    private TextField txtInput;
    private TextField txtRight;
    private Label lblWrong;
    private TextField txtWrong;
    private Label lblClock;
    private TextField txtClock;
    private Label lblA1;
    private Label lblA2;
    private Label lblA3;
    private Label lblA4;
    private int questionCount;
    private String strQuestion;
    private int right;
    private int wrong;
//  private String average;





    // TODO: Private Event Handlers and Helper Methods
    private void setOkHandler(ActionEvent e) {

        int intInput = Integer.parseInt(txtInput.getText());
        Model model = new Model(intInput);
        model.checkAnswer();
        right += model.getRight();
        txtRight.setText(Integer.toString(right));
        wrong += model.getWrong();
        txtWrong.setText(Integer.toString(wrong));
        txtInput.setText("");
        questionCount = questionCount + 1;
        Questions x = new Questions(questionCount);
        strQuestion = x.getQuestion();
        lblQuestion.setText(strQuestion);
        lblA1.setText(x.getAnswerOne());
        lblA2.setText(x.getAnswerTwo());
        lblA3.setText(x.getAnswerThree());
        lblA4.setText(x.getAnswerFour());
//      right += model.getRight();
//      txtRight.setText(Integer.toString(model.getRight()));
//      wrong += model.getWrong();
//      txtWrong.setText(Integer.toString(model.getWrong()));
//      txtClock.setText(model.getAverage());
//      average = (right/questionCount * 100 + "%"); // ****
//      txtClock.setText(average);                   // ****

    }

    private void setResetHandler(ActionEvent e){
        lblQuestion.setText("What does the H stand for in H2O(water)?");
        lblA1.setText("1 - Hose");
        lblA2.setText("2 - Hinge");
        lblA3.setText("3 - Hobbit");
        lblA4.setText("4 - Hydrogen");
        txtRight.setText("0");
        txtWrong.setText("0");
//      txtClock.setText("0%");
        txtInput.setText("");
        questionCount = 0;
        right = 0;
        wrong = 0;

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
        Scene scene = new Scene(root, 800, 400); // set the size here
        stage.setTitle("Reindeer Games"); // set the window title here
        stage.setScene(scene);
        // TODO: Add your GUI-building code here

        // 1. Create the model
        //model = new Model(0);
        // 2. Create the GUI components
        txtInput = new TextField("");
//      txtClock = new TextField("0%");
        txtRight = new TextField("0");
        txtWrong = new TextField("0");
//      lblClock = new Label("Average");
        lblQuestion = new Label("What does the H stand for in H2O(water)?");
        lblRight = new Label("Right");
        lblWrong = new Label("Wrong");
        lblTitle = new Label("Who wants to be\n    a Millionaire");
        btnOK = new Button("OK");
        btnReset = new Button("Reset");
        lblA1 = new Label("1 - Hose");
        lblA2 = new Label("2 - Hinge");
        lblA3 = new Label("3 - Hobbit");
        lblA4 = new Label("4 - Hydrogen");

        // 3. Add components to the root
        root.getChildren().add(txtInput);
//      root.getChildren().add(txtClock);
        root.getChildren().addAll(txtRight);
        root.getChildren().addAll(txtWrong);
//      root.getChildren().addAll(lblClock);
        root.getChildren().addAll(lblQuestion);
        root.getChildren().addAll(lblRight);
        root.getChildren().addAll(lblTitle);
        root.getChildren().addAll(lblWrong);
        root.getChildren().addAll(btnOK);
        root.getChildren().addAll(btnReset);
        root.getChildren().add(lblA1);
        root.getChildren().add(lblA2);
        root.getChildren().add(lblA3);
        root.getChildren().add(lblA4);
        // 4. Configure the components (colors, fonts, size, location)
        lblQuestion.setLayoutY(150);
        lblQuestion.setLayoutX(70);
        lblQuestion.setFont(new Font(25));
        txtInput.setLayoutY(220);
        txtInput.setLayoutX(350);
        txtInput.setMaxWidth(250);
        txtInput.setFont(new Font(35));
        btnOK.setLayoutY(320);
        btnOK.setLayoutX(430);
        btnOK.setFont(new Font(35));
        btnReset.setLayoutY(360);
        btnReset.setLayoutX(690);
        txtRight.setLayoutY(10);
        txtRight.setLayoutX(710);
        txtRight.setMaxWidth(65);
        txtWrong.setLayoutY(45);
        txtWrong.setLayoutX(710);
        txtWrong.setMaxWidth(65);
//      txtClock.setLayoutY(80);
//      txtClock.setLayoutX(710);
//      txtClock.setMaxWidth(65);
        lblRight.setLayoutY(15);
        lblRight.setLayoutX(650);
        lblWrong.setLayoutY(50);
        lblWrong.setLayoutX(648);
//      lblClock.setLayoutY(85);
//      lblClock.setLayoutX(644);
        lblTitle.setFont(new Font(35));
        lblTitle.setLayoutY(25);
        lblTitle.setLayoutX(150);
        lblA1.setLayoutY(205);
        lblA1.setLayoutX(80);
        lblA1.setFont(new Font(30));
        lblA2.setLayoutY(250);
        lblA2.setLayoutX(80);
        lblA2.setFont(new Font(30));
        lblA3.setLayoutY(295);
        lblA3.setLayoutX(80);
        lblA3.setFont(new Font(30));
        lblA4.setLayoutY(340);
        lblA4.setLayoutX(80);
        lblA4.setFont(new Font(30));
        // 5. Add Event Handlers and do final setup
        btnOK.setOnAction(this::setOkHandler);
        btnReset.setOnAction(this::setResetHandler);
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
