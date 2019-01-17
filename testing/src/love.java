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
public class love extends Application {

    // TODO: Instance Variables for View Components and Model
    private Model model = new Model();
    private Label lblQuestion;
    private TextField txtInput;
    private TextField txtRight;
    private static int right;
    private static int wrong;
    private String rightstr;
    private String wrongstr;
    private Label lblAverage;
    private TextField txtAverage;
    private Label lblPromt;
    private Label lblWrong;
    private Label lblRight;
    private Label lblTitle;


    private TextField txtWrong;
    private Label lblA1;
    private Label lblA2;
    private Label lblA3;
    private Label lblA4;
    private Button btnOK;
    private Button btnReset;

    private double answer;
    private String answers;
    private static int ansno = 0;
    private  double avg;
//  private String average;





    // TODO: Private Event Handlers and Helper Methods
    private void setOkHandler(ActionEvent e) {
        answers = txtInput.getText();
        answer = Double.parseDouble(answers);
            model.clickOk(answer);
            txtAverage.setStyle(model.getAvgCol());
            txtRight.setText(model.getRightstr());
            txtWrong.setText(model.getWrongstr());
            txtAverage.setText(model.getTxtAvg());
            lblQuestion.setText(model.question(model.getAnsno()));
            lblA1.setText(model.optionOne(model.getAnsno()));
            lblA2.setText(model.optionTwo(model.getAnsno()));
            lblA3.setText(model.optionThree(model.getAnsno()));
            lblA4.setText(model.optionFour(model.getAnsno()));
            txtInput.clear();
            txtInput.requestFocus();


        if(model.getAnsno() == 8){
            txtInput.clear();
            lblQuestion.setText(model.question(9));
            model.clickLastOk(answer);
            txtAverage.setStyle(model.getAvgCol());
            txtRight.setText(model.getRightstr());
            txtWrong.setText(model.getWrongstr());
            txtAverage.setText(model.getTxtAvg());
            lblPromt.setText("");
            lblA1.setText("");
            lblA2.setText("");
            lblA3.setText("");
            lblA4.setText("");
            btnOK.setDisable(true);
            txtInput.setDisable(true);
            btnReset.requestFocus();

        }


    }

    private void setResetHandler(ActionEvent e){
        model.clickReset();
        txtRight.setText(model.getRightstr());
        txtWrong.setText(model.getWrongstr());
        txtAverage.setText(model.getTxtAvg());
        lblQuestion.setText(model.question(model.getAnsno()));
        lblA1.setText(model.optionOne(model.getAnsno()));
        lblA2.setText(model.optionTwo(model.getAnsno()));
        lblA3.setText(model.optionThree(model.getAnsno()));
        lblA4.setText(model.optionFour(model.getAnsno()));
        txtInput.clear();
        txtInput.requestFocus();
        btnOK.setDisable(false);
        txtInput.setDisable(false);
        txtAverage.setStyle("-fx-text-fill:black;");
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
        //model = new Model();
        // 2. Create the GUI components
        lblTitle = new Label("Who wants to be\n    a Millionaire");
        right = 0;
        wrong = 0;
        rightstr = String.valueOf(right);
        wrongstr = String.valueOf(wrong);
        txtInput = new TextField("");
        txtRight = new TextField(rightstr);
        txtWrong = new TextField(wrongstr);
        lblQuestion = new Label(model.question((int) ansno));
        lblAverage = new Label("Average");
        txtAverage = new TextField("0%");
        lblRight = new Label("Right");
        lblWrong = new Label("Wrong");
        lblPromt = new Label("Enter The\n  Correct\n  Number");

        btnOK = new Button("OK");
        btnReset = new Button("Reset");
        lblA1 = new Label(model.optionOne(ansno));
        lblA2 = new Label(model.optionTwo(ansno));
        lblA3 = new Label(model.optionThree(ansno));
        lblA4 = new Label(model.optionFour(ansno));

        // 3. Add components to the root
        root.getChildren().add(lblPromt);
        root.getChildren().add(txtInput);
        root.getChildren().addAll(txtRight);
        root.getChildren().addAll(txtWrong);
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
        root.getChildren().add(lblAverage);
        root.getChildren().add(txtAverage);
        // 4. Configure the components (colors, fonts, size, location)
        lblPromt.setStyle("-fx-text-fill:darkblue;");
        lblPromt.setLayoutX(650);
        lblPromt.setLayoutY(210);
        lblPromt.setFont(new Font(25));
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
        lblRight.setLayoutY(15);
        lblRight.setLayoutX(650);
        lblWrong.setLayoutY(50);
        lblWrong.setLayoutX(648);
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
        txtAverage.setLayoutY(80);
        txtAverage.setLayoutX(710);
        txtAverage.setMaxWidth(65);
        lblAverage.setLayoutY(85);
        lblAverage.setLayoutX(644);

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
