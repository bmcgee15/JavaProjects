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
 * This class describes a quiz application.
 * When created it brings the user through
 * 8 questions, tallying their right answers,
 * wrong answers, and average average. The
 * application can be restarted at any time.
 * @author Bret McGee
 */
public class GuiApp extends Application {

    /** new model object **/
    private Model model = new Model();
    /** new texfield component for input **/
    private TextField txtInput;
    /** new texfield component for right counter **/
    private TextField txtRight;
    /** new texfield component for wrong counter **/
    private TextField txtWrong;
    /** new texfield component for average counter **/
    private TextField txtAverage;
    /** new label component for prompt **/
    private Label lblPromt;
    /** new label component for wrong answer **/
    private Label lblWrong;
    /** new label component for right answer **/
    private Label lblRight;
    /** new label component for title **/
    private Label lblTitle;
    /** new label component for answer 1 **/
    private Label lblA1;
    /** new label component for answer 2 **/
    private Label lblA2;
    /** new label component for answer 3 **/
    private Label lblA3;
    /** new label component for answer 4 **/
    private Label lblA4;
    /** new label component for average **/
    private Label lblAverage;
    /** new label component for question **/
    private Label lblQuestion;
    /** new button component for ok **/
    private Button btnOK;
    /** new button component for reset **/
    private Button btnReset;

    /** answer double **/
    private double answer;
    /** answer string **/
    private String answers;
    /** answer count **/
    private static int ansno = 0;
    /** average double **/
    private  double avg;
    /** right count **/
    private static int right;
    /** wrong count **/
    private static int wrong;
    /** right string **/
    private String rightstr;
    /** wrong string **/
    private String wrongstr;






    /**
     *
     * An event handler for the ok button
     * @param e
     *
     **/
    private void setOkHandler(ActionEvent e) {
        answers = txtInput.getText(); // gets user input from text-box and saves the value into answers variable
        answer = Double.parseDouble(answers); // converts int answers into double answer variable
        model.clickOk(answer); // call clickOK method from model class
        txtAverage.setStyle(model.getAvgCol()); // changes color of average based on the percentage
        txtRight.setText(model.getRightstr()); // updates the right answer text field
        txtWrong.setText(model.getWrongstr()); // updates the wrong answer text field
        txtAverage.setText(model.getTxtAvg()); // updates the average text field
        lblQuestion.setText(model.question(model.getAnsno())); // updates current question
        lblA1.setText(model.optionOne(model.getAnsno())); // updates answer 1
        lblA2.setText(model.optionTwo(model.getAnsno())); // updates answer 2
        lblA3.setText(model.optionThree(model.getAnsno())); // updates answer 3
        lblA4.setText(model.optionFour(model.getAnsno())); // updates answer 4
        txtInput.clear(); // clear the input field
        txtInput.requestFocus(); // pull focus back to input field


        if(model.getAnsno() == 8){ // an if statement to alter the app after the last question
            txtInput.clear(); // clear the input field
            lblQuestion.setText(model.question(9)); // set question area for ending prompt
            model.clickLastOk(answer); // calls the last click ok method
            txtAverage.setStyle(model.getAvgCol()); // changes color of average based on the percentage
            txtRight.setText(model.getRightstr()); // updates the right answer text field
            txtWrong.setText(model.getWrongstr()); // updates the wrong answer text field
            txtAverage.setText(model.getTxtAvg()); // updates the average text field
            lblPromt.setText(""); // sets prompt label to empty string
            lblA1.setText(""); // sets answer 1 label to empty string
            lblA2.setText(""); // sets answer 2 label to empty string
            lblA3.setText(""); // sets answer 3 label to empty string
            lblA4.setText(""); // sets answer 4 label to empty string
            btnOK.setDisable(true); // disables okay button since quiz is over
            txtInput.setDisable(true); // disables input field since quiz is over
            btnReset.requestFocus(); // sets focus to reset button

        }


    }

    /**
     *
     * An event handler for the reset button
     * @param e
     *
     **/
    private void setResetHandler(ActionEvent e){
        model.clickReset(); // call reset method from model class
        txtRight.setText(model.getRightstr()); // updates the right answer text field back to the start
        txtWrong.setText(model.getWrongstr()); // updates the wrong answer text field back to the start
        txtAverage.setText(model.getTxtAvg()); // updates the average text field back to the start
        lblQuestion.setText(model.question(model.getAnsno())); // // updates the question label back to the start
        lblA1.setText(model.optionOne(model.getAnsno())); // sets answer 1 label to empty string back to the start
        lblA2.setText(model.optionTwo(model.getAnsno())); // sets answer 2 label to empty string back to the start
        lblA3.setText(model.optionThree(model.getAnsno())); // sets answer 3 label to empty string back to the start
        lblA4.setText(model.optionFour(model.getAnsno())); // sets answer 4 label to empty string back to the start
        txtInput.clear(); // clears input field
        txtInput.requestFocus(); // resets focus to input field
        btnOK.setDisable(false); // enables ok button if previously disabled
        txtInput.setDisable(false); // enables input text field if previously disabled
        txtAverage.setStyle("-fx-text-fill:black;"); // resets average color back to black
    }


    /**
     *
     * Stage Creation where the visual design happens
     * @param stage The main stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane(); // creating the pane
        Scene scene = new Scene(root, 800, 400); // set the size here
        stage.setTitle("Reindeer Games"); // set the window title here
        stage.setScene(scene); // set the scene here
        root.setStyle("-fx-background-color: lightblue"); // set the background color to blue

        lblTitle = new Label("Who wants to be\n    a Millionaire"); // initialize the tagline
        right = 0; // initialize the right variable
        wrong = 0; // initialize the wrong variable
        rightstr = String.valueOf(right); // save the value of right into right string
        wrongstr = String.valueOf(wrong); // save the value of wrong into wrong string
        txtInput = new TextField(""); // initialize the input text box to an empty string
        txtRight = new TextField(rightstr); // initialize the text field for right
        txtWrong = new TextField(wrongstr); // initialize the text field for wrong
        lblQuestion = new Label(model.question((int) ansno)); // initialize the question for the first question
        lblAverage = new Label("Average"); // initialize average label
        txtAverage = new TextField("0%"); // initialize average text
        lblRight = new Label("Right"); // initialize right label
        lblWrong = new Label("Wrong"); // inititalize wrong label
        lblPromt = new Label("Enter The\n  Correct\n  Number"); // initialize the enter number prompt

        btnOK = new Button("OK"); // initialize the ok button
        btnReset = new Button("Reset"); // initialize the reset button
        lblA1 = new Label(model.optionOne(ansno)); // initialize answer 1 label
        lblA2 = new Label(model.optionTwo(ansno)); // initialize answer 2 label
        lblA3 = new Label(model.optionThree(ansno)); // initialize answer 3 label
        lblA4 = new Label(model.optionFour(ansno)); // initialize answer 4 label

        // 3. Add components to the root
        root.getChildren().add(lblPromt); // add lblPromt component to root
        root.getChildren().add(txtInput); // add txtInput component to root
        root.getChildren().addAll(txtRight); // add txtRight component to root
        root.getChildren().addAll(txtWrong); // add txtWrong component to root
        root.getChildren().addAll(lblQuestion); // add lblQuestion component to root
        root.getChildren().addAll(lblRight); // add lblRight component to root
        root.getChildren().addAll(lblTitle); // add lblTitle component to root
        root.getChildren().addAll(lblWrong); // add lblWrong component to root
        root.getChildren().addAll(btnOK); // add btnOK component to root
        root.getChildren().addAll(btnReset); // add btnReset component to root
        root.getChildren().add(lblA1); // add lblA1 component to root
        root.getChildren().add(lblA2); // add lblA2 component to root
        root.getChildren().add(lblA3); // add lblA3 component to root
        root.getChildren().add(lblA4); // add lblA4 component to root
        root.getChildren().add(lblAverage); // add lblAverage component to root
        root.getChildren().add(txtAverage); // add txtAverage component to root

        // 4. Configure the components (colors, fonts, size, location)
        lblPromt.setStyle("-fx-text-fill:darkblue;"); // configure lbl styles
        lblPromt.setLayoutX(650); // configure lbl styles
        lblPromt.setLayoutY(210); // configure lbl styles
        lblPromt.setFont(new Font(25)); // configure lbl styles
        lblQuestion.setLayoutY(150); // configure lbl styles
        lblQuestion.setLayoutX(70); // configure lbl styles
        lblQuestion.setFont(new Font(25)); // configure lbl styles
        txtInput.setLayoutY(220); // configure txt styles
        txtInput.setLayoutX(350); // configure txt styles
        txtInput.setMaxWidth(250); // configure txt styles
        txtInput.setFont(new Font(35)); // configure txt styles
        btnOK.setLayoutY(320); // configure btn styles
        btnOK.setLayoutX(430); // configure btn styles
        btnOK.setFont(new Font(35)); // configure btn styles
        btnReset.setLayoutY(360); // configure btn styles
        btnReset.setLayoutX(690); // configure btn styles
        txtRight.setLayoutY(10); // configure txt styles
        txtRight.setLayoutX(710); // configure txt styles
        txtRight.setMaxWidth(65); // configure txt styles
        txtWrong.setLayoutY(45); // configure txt styles
        txtWrong.setLayoutX(710); // configure txt styles
        txtWrong.setMaxWidth(65); // configure txt styles
        lblRight.setLayoutY(15); // configure lbl styles
        lblRight.setLayoutX(650); // configure lbl styles
        lblWrong.setLayoutY(50); // configure lbl styles
        lblWrong.setLayoutX(648); // configure lbl styles
        lblTitle.setFont(new Font(35)); // configure lbl styles
        lblTitle.setLayoutY(25); // configure lbl styles
        lblTitle.setLayoutX(150); // configure lbl styles
        lblA1.setLayoutY(205); // configure lbl styles
        lblA1.setLayoutX(80); // configure lbl styles
        lblA1.setFont(new Font(30)); // configure lbl styles
        lblA2.setLayoutY(250); // configure lbl styles
        lblA2.setLayoutX(80); // configure lbl styles
        lblA2.setFont(new Font(30)); // configure lbl styles
        lblA3.setLayoutY(295); // configure lbl styles
        lblA3.setLayoutX(80); // configure lbl styles
        lblA3.setFont(new Font(30)); // configure lbl styles
        lblA4.setLayoutY(340); // configure lbl styles
        lblA4.setLayoutX(80); // configure lbl styles
        lblA4.setFont(new Font(30)); // configure lbl styles
        txtAverage.setLayoutY(80); // configure txt styles
        txtAverage.setLayoutX(710); // configure txt styles
        txtAverage.setMaxWidth(65); // configure txt styles
        lblAverage.setLayoutY(85); // configure lbl styles
        lblAverage.setLayoutX(644); // configure lbl styles

        // 5. Add Event Handlers and do final setup
        btnOK.setOnAction(this::setOkHandler); // set event handler for ok button
        btnReset.setOnAction(this::setResetHandler); // set event handler for reset button

        // 6. Show the stage
        stage.show();
    }

    /**
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}
