import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
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
public class Asgard extends Application {


    private Label lblTitle = new Label("  Welcome to the\nBattle for ASGARD"); // initialize the tagline

    private int startInt = (int)(Math.random() * 20);
    private int startInt2 = (int)(Math.random() * 20);
    private int turnCount = 0;

    private TextField txtType1 = new TextField("");
    private TextField txtName1 = new TextField("");
    private TextField txtStatus1 = new TextField("");
    private TextField txtHealth1 = new TextField("");
    private TextField txtStrength1 = new TextField("");
    private TextField txtDexterity1 = new TextField("");
    private TextField txtArmor1 = new TextField("");
    private TextField txtCoins1 = new TextField("");

    private TextField txtType2 = new TextField("");
    private TextField txtName2 = new TextField("");
    private TextField txtStatus2 = new TextField("");
    private TextField txtHealth2 = new TextField("");
    private TextField txtStrength2 = new TextField("");
    private TextField txtDexterity2 = new TextField("");
    private TextField txtArmor2 = new TextField("");
    private TextField txtCoins2 = new TextField("");

    private Label lblType1 = new Label("Type");
    private Label lblName1 = new Label("Name");
    private Label lblStatus1 = new Label("Living Status");
    private Label lblHealth1 = new Label("Health");
    private Label lblStrength1 = new Label("Strength");
    private Label lblDexterity1 = new Label("Dexterity");
    private Label lblArmor1 = new Label("Armor");
    private Label lblCoins1 = new Label("Coins");

    private Label lblType2 = new Label("Type");
    private Label lblName2 = new Label("Name");
    private Label lblStatus2 = new Label("Living Status");
    private Label lblHealth2 = new Label("Health");
    private Label lblStrength2 = new Label("Strength");
    private Label lblDexterity2 = new Label("Dexterity");
    private Label lblArmor2 = new Label("Armor");
    private Label lblCoins2 = new Label("Coins");

    private Button btnAttack1 = new Button("Start");
//    private Button btnAttack2 = new Button("Attack");
    private Button btnSpecial1 = new Button("Special");
//    private Button btnSpecial2 = new Button("Special");

//    /** new model object **/
//    private Battleground model = new Battleground();
    private Hobbit x = new Hobbit();
    private Elf y = new Elf();
    private Fighter z = new Fighter();
    private Wizard w = new Wizard();
    private Hobbit x2 = new Hobbit();
    private Elf y2 = new Elf();
    private Fighter z2 = new Fighter();
    private Wizard w2 = new Wizard();
    private int player1;
    private int player2;







    /**
     *
     * An event handler for the ok button
     * @param e
     *
     **/
    private void setAttack1Handler(ActionEvent e) {

//        while (x.getHealth() > 0 && x2.getHealth() > 0 && y.getHealth() > 0 && y2.getHealth() > 0 && z.getHealth() > 0 && z2.getHealth() > 0 && w.getHealth() > 0 && w2.getHealth() > 0) {
            if (turnCount == 0) {
                if (startInt >= 0 && startInt < 5) {
                    x.createChar();
                    x.createSpecial();
                    txtType1.setText(x.getCharType());
                    txtName1.setText(x.getName());
                    txtStatus1.setText(x.getLivingStatus());
                    txtHealth1.setText(x.getHealthStr());
                    txtStrength1.setText(x.getStrengthStr());
                    txtDexterity1.setText(x.getDexterityStr());
                    txtArmor1.setText(x.getArmorStr());
                    txtCoins1.setText(x.getCoinsStr());
                    player1 = 1;
                    turnCount++;
                    btnAttack1.setText("Attack");
                    System.out.println(turnCount);
                    System.out.println("I am x create");
                } else if (startInt >= 5 && startInt < 10) {
                    y.createChar();
                    y.createSpecial();
                    txtType1.setText(y.getCharType());
                    txtName1.setText(y.getName());
                    txtStatus1.setText(y.getLivingStatus());
                    txtHealth1.setText(y.getHealthStr());
                    txtStrength1.setText(y.getStrengthStr());
                    txtDexterity1.setText(y.getDexterityStr());
                    txtArmor1.setText(y.getArmorStr());
                    txtCoins1.setText(y.getCoinsStr());
                    player1 = 2;
                    turnCount++;
                    btnAttack1.setText("Attack");
                    System.out.println(turnCount);
                    System.out.println("I am y create");
                } else if (startInt >= 10 && startInt < 15) {
                    z.createChar();
                    z.createSpecial();
                    txtType1.setText(z.getCharType());
                    txtName1.setText(z.getName());
                    txtStatus1.setText(z.getLivingStatus());
                    txtHealth1.setText(z.getHealthStr());
                    txtStrength1.setText(z.getStrengthStr());
                    txtDexterity1.setText(z.getDexterityStr());
                    txtArmor1.setText(z.getArmorStr());
                    txtCoins1.setText(z.getCoinsStr());
                    player1 = 3;
                    turnCount++;
                    btnAttack1.setText("Attack");
                    System.out.println(turnCount);
                    System.out.println("I am z create");
                } else {
                    w.createChar();
                    w.createSpecial();
                    txtType1.setText(w.getCharType());
                    txtName1.setText(w.getName());
                    txtStatus1.setText(w.getLivingStatus());
                    txtHealth1.setText(w.getHealthStr());
                    txtStrength1.setText(w.getStrengthStr());
                    txtDexterity1.setText(w.getDexterityStr());
                    txtArmor1.setText(w.getArmorStr());
                    txtCoins1.setText(w.getCoinsStr());
                    player1 = 4;
                    turnCount++;
                    btnAttack1.setText("Attack");
                    System.out.println(turnCount);
                    System.out.println("I am w create");
                }

                if (startInt2 >= 0 && startInt2 < 5) {
                    x2.createChar();
                    x2.createSpecial();
                    txtType2.setText(x2.getCharType());
                    txtName2.setText(x2.getName());
                    txtStatus2.setText(x2.getLivingStatus());
                    txtHealth2.setText(x2.getHealthStr());
                    txtStrength2.setText(x2.getStrengthStr());
                    txtDexterity2.setText(x2.getDexterityStr());
                    txtArmor2.setText(x2.getArmorStr());
                    txtCoins2.setText(x2.getCoinsStr());
                    player2 = 5;
                    turnCount++;
                    System.out.println(turnCount);
                    System.out.println("I am x2 create");
                } else if (startInt2 >= 5 && startInt2 < 10) {
                    y2.createChar();
                    y2.createSpecial();
                    txtType2.setText(y2.getCharType());
                    txtName2.setText(y2.getName());
                    txtStatus2.setText(y2.getLivingStatus());
                    txtHealth2.setText(y2.getHealthStr());
                    txtStrength2.setText(y2.getStrengthStr());
                    txtDexterity2.setText(y2.getDexterityStr());
                    txtArmor2.setText(y2.getArmorStr());
                    txtCoins2.setText(y2.getCoinsStr());
                    player2 = 6;
                    turnCount++;
                    System.out.println(turnCount);
                    System.out.println("I am y2 create");
                } else if (startInt2 >= 10 && startInt2 < 15) {
                    z2.createChar();
                    z2.createSpecial();
                    txtType2.setText(z2.getCharType());
                    txtName2.setText(z2.getName());
                    txtStatus2.setText(z2.getLivingStatus());
                    txtHealth2.setText(z2.getHealthStr());
                    txtStrength2.setText(z2.getStrengthStr());
                    txtDexterity2.setText(z2.getDexterityStr());
                    txtArmor2.setText(z2.getArmorStr());
                    txtCoins2.setText(z2.getCoinsStr());
                    player2 = 7;
                    turnCount++;
                    System.out.println(turnCount);
                    System.out.println("I am z2 create");
                } else {
                    w2.createChar();
                    w2.createSpecial();
                    txtType2.setText(w2.getCharType());
                    txtName2.setText(w2.getName());
                    txtStatus2.setText(w2.getLivingStatus());
                    txtHealth2.setText(w2.getHealthStr());
                    txtStrength2.setText(w2.getStrengthStr());
                    txtDexterity2.setText(w2.getDexterityStr());
                    txtArmor2.setText(w2.getArmorStr());
                    txtCoins2.setText(w2.getCoinsStr());
                    player2 = 8;
                    turnCount++;
                    System.out.println(turnCount);
                    System.out.println("I am w2 create");
                }
            }else{
                  if (turnCount % 2 == 1) {
                      if (player1 == 1) {
                          if (!(x.getHealthStr().equals("0.0"))) {
                              txtCoins1.setText(x.getCoinsStr());
                              x.attack();
                              x2.getHealth();
                              y2.getHealth();
                              z2.getHealth();
                              w2.getHealth();
                              txtHealth2.setText(x2.getHealthStr());
                              txtHealth2.setText(y2.getHealthStr());
                              txtHealth2.setText(z2.getHealthStr());
                              txtHealth2.setText(w2.getHealthStr());
                              txtStatus2.setText(x2.getLivingStatus());
                              txtStatus2.setText(y2.getLivingStatus());
                              txtStatus2.setText(z2.getLivingStatus());
                              txtStatus2.setText(w2.getLivingStatus());
                              turnCount++;
                              System.out.println(turnCount);
                              System.out.println("I am x hit");
                              System.out.println(Humanoid.getDamage());
                              System.out.println(x + "\n" + y + "\n" + z + "\n" + w + "\n" + x2 + "\n" + y2 + "\n" + z2 + "\n" + w2);
                          }else {
                              btnAttack1.setDisable(true);
                              btnSpecial1.setDisable(true);
                          }
                      } else if (player1 == 2) {
                           if (!(y.getHealthStr().equals("0.0"))){
                               txtCoins1.setText(y.getCoinsStr());
                               y.attack();
                               x2.getHealth();
                               y2.getHealth();
                               z2.getHealth();
                               w2.getHealth();
                               txtHealth2.setText(x2.getHealthStr());
                               txtHealth2.setText(y2.getHealthStr());
                               txtHealth2.setText(z2.getHealthStr());
                               txtHealth2.setText(w2.getHealthStr());
                               txtStatus2.setText(x2.getLivingStatus());
                               txtStatus2.setText(y2.getLivingStatus());
                               txtStatus2.setText(z2.getLivingStatus());
                               txtStatus2.setText(w2.getLivingStatus());
                               turnCount++;
                               System.out.println(turnCount);
                               System.out.println("I am y hit");
                               System.out.println(Humanoid.getDamage());
                               System.out.println(x + "\n" + y + "\n" + z + "\n" + w + "\n" + x2 + "\n" + y2 + "\n" + z2 + "\n" + w2);
                          }else {
                               btnAttack1.setDisable(true);
                               btnSpecial1.setDisable(true);
                           }
                      } else if (player1 == 3) {
                          if (!(z.getHealthStr().equals("0.0"))){
                              txtCoins1.setText(z.getCoinsStr());
                              z.attack();
                              x2.getHealth();
                              y2.getHealth();
                              z2.getHealth();
                              w2.getHealth();
                              txtHealth2.setText(x2.getHealthStr());
                              txtHealth2.setText(y2.getHealthStr());
                              txtHealth2.setText(z2.getHealthStr());
                              txtHealth2.setText(w2.getHealthStr());
                              txtStatus2.setText(x2.getLivingStatus());
                              txtStatus2.setText(y2.getLivingStatus());
                              txtStatus2.setText(z2.getLivingStatus());
                              txtStatus2.setText(w2.getLivingStatus());
                              turnCount++;
                              System.out.println(turnCount);
                              System.out.println("I am z hit");
                              System.out.println(Humanoid.getDamage());
                              System.out.println(x + "\n" + y + "\n" + z + "\n" + w + "\n" + x2 + "\n" + y2 + "\n" + z2 + "\n" + w2);
                          }else {
                              btnAttack1.setDisable(true);
                              btnSpecial1.setDisable(true);
                          }
                      } else {
                          if (!(w.getHealthStr().equals("0.0"))){
                              txtCoins1.setText(w.getCoinsStr());
                              w.attack();
                              x2.getHealth();
                              y2.getHealth();
                              z2.getHealth();
                              w2.getHealth();
                              txtHealth2.setText(x2.getHealthStr());
                              txtHealth2.setText(y2.getHealthStr());
                              txtHealth2.setText(z2.getHealthStr());
                              txtHealth2.setText(w2.getHealthStr());
                              txtStatus2.setText(x2.getLivingStatus());
                              txtStatus2.setText(y2.getLivingStatus());
                              txtStatus2.setText(z2.getLivingStatus());
                              txtStatus2.setText(w2.getLivingStatus());
                              turnCount++;
                              System.out.println(turnCount);
                              System.out.println("I am w hit");
                              System.out.println(Humanoid.getDamage());
                              System.out.println(x + "\n" + y + "\n" + z + "\n" + w + "\n" + x2 + "\n" + y2 + "\n" + z2 + "\n" + w2);
                          }else {
                              btnAttack1.setDisable(true);
                              btnSpecial1.setDisable(true);
                          }
                      }
                  }else{

                          if (player2 == 5) {
                              if (!(x2.getHealthStr().equals("0.0"))){
                                  txtCoins2.setText(x2.getCoinsStr());
                                  x2.attack();
                                  x.getHealth();
                                  y.getHealth();
                                  z.getHealth();
                                  w.getHealth();
                                  txtHealth1.setText(x.getHealthStr());
                                  txtHealth1.setText(y.getHealthStr());
                                  txtHealth1.setText(z.getHealthStr());
                                  txtHealth1.setText(w.getHealthStr());
                                  txtStatus1.setText(x.getLivingStatus());
                                  txtStatus1.setText(y.getLivingStatus());
                                  txtStatus1.setText(z.getLivingStatus());
                                  txtStatus1.setText(w.getLivingStatus());
                                  turnCount++;
                                  System.out.println(turnCount);
                                  System.out.println("I am x2 hit");
                                  System.out.println(Humanoid.getDamage());
                                  System.out.println(x + "\n" + y + "\n" + z + "\n" + w + "\n" + x2 + "\n" + y2 + "\n" + z2 + "\n" + w2);
                              }else {
                                  btnAttack1.setDisable(true);
                                  btnSpecial1.setDisable(true);
                              }
                          } else if (player2 == 6) {
                              if (!(y2.getHealthStr().equals("0.0"))){
                                  txtCoins2.setText(y2.getCoinsStr());
                                  y2.attack();
                                  x.getHealth();
                                  y.getHealth();
                                  z.getHealth();
                                  w.getHealth();
                                  txtHealth1.setText(x.getHealthStr());
                                  txtHealth1.setText(y.getHealthStr());
                                  txtHealth1.setText(z.getHealthStr());
                                  txtHealth1.setText(w.getHealthStr());
                                  txtStatus1.setText(x.getLivingStatus());
                                  txtStatus1.setText(y.getLivingStatus());
                                  txtStatus1.setText(z.getLivingStatus());
                                  txtStatus1.setText(w.getLivingStatus());
                                  turnCount++;
                                  System.out.println(turnCount);
                                  System.out.println("I am y2 hit");
                                  System.out.println(Humanoid.getDamage());
                                  System.out.println(x + "\n" + y + "\n" + z + "\n" + w + "\n" + x2 + "\n" + y2 + "\n" + z2 + "\n" + w2);
                              }else {
                                  btnAttack1.setDisable(true);
                                  btnSpecial1.setDisable(true);
                              }
                          } else if (player2 == 7) {
                              if (!(z2.getHealthStr().equals("0.0"))){
                                  txtCoins2.setText(z2.getCoinsStr());
                                  z2.attack();
                                  x.getHealth();
                                  y.getHealth();
                                  z.getHealth();
                                  w.getHealth();
                                  txtHealth1.setText(x.getHealthStr());
                                  txtHealth1.setText(y.getHealthStr());
                                  txtHealth1.setText(z.getHealthStr());
                                  txtHealth1.setText(w.getHealthStr());
                                  txtStatus1.setText(x.getLivingStatus());
                                  txtStatus1.setText(y.getLivingStatus());
                                  txtStatus1.setText(z.getLivingStatus());
                                  txtStatus1.setText(w.getLivingStatus());
                                  turnCount++;
                                  System.out.println(turnCount);
                                  System.out.println("I am z2 hit");
                                  System.out.println(Humanoid.getDamage());
                                  System.out.println(x + "\n" + y + "\n" + z + "\n" + w + "\n" + x2 + "\n" + y2 + "\n" + z2 + "\n" + w2);
                              }else {
                                  btnAttack1.setDisable(true);
                                  btnSpecial1.setDisable(true);
                              }
                          } else {
                              if (!(w2.getHealthStr().equals("0.0"))){
                                  txtCoins2.setText(w2.getCoinsStr());
                                  w2.attack();
                                  x.getHealth();
                                  y.getHealth();
                                  z.getHealth();
                                  w.getHealth();
                                  txtHealth1.setText(x.getHealthStr());
                                  txtHealth1.setText(y.getHealthStr());
                                  txtHealth1.setText(z.getHealthStr());
                                  txtHealth1.setText(w.getHealthStr());
                                  txtStatus1.setText(x.getLivingStatus());
                                  txtStatus1.setText(y.getLivingStatus());
                                  txtStatus1.setText(z.getLivingStatus());
                                  txtStatus1.setText(w.getLivingStatus());
                                  turnCount++;
                                  System.out.println(turnCount);
                                  System.out.println("I am w2 hit");
                                  System.out.println(Humanoid.getDamage());
                                  System.out.println(x + "\n" + y + "\n" + z + "\n" + w + "\n" + x2 + "\n" + y2 + "\n" + z2 + "\n" + w2);
                              }else {
                                  btnAttack1.setDisable(true);
                                  btnSpecial1.setDisable(true);
                              }
                          }
                      }
                  }
            }
 //       }

//        answers = txtInput.getText(); // gets user input from text-box and saves the value into answers variable
//        answer = Double.parseDouble(answers); // converts int answers into double answer variable
//        model.clickOk(answer); // call clickOK method from model class
//        txtAverage.setStyle(model.getAvgCol()); // changes color of average based on the percentage
//        txtRight.setText(model.getRightstr()); // updates the right answer text field
//        txtWrong.setText(model.getWrongstr()); // updates the wrong answer text field
//        txtAverage.setText(model.getTxtAvg()); // updates the average text field
//        lblQuestion.setText(model.question(model.getAnsno())); // updates current question
//        lblA1.setText(model.optionOne(model.getAnsno())); // updates answer 1
//        lblA2.setText(model.optionTwo(model.getAnsno())); // updates answer 2
//        lblA3.setText(model.optionThree(model.getAnsno())); // updates answer 3
//        lblA4.setText(model.optionFour(model.getAnsno())); // updates answer 4
//        txtInput.clear(); // clear the input field
//        txtInput.requestFocus(); // pull focus back to input field
//
//
//        if(model.getAnsno() == 8){ // an if statement to alter the app after the last question
//            txtInput.clear(); // clear the input field
//            lblQuestion.setText(model.question(9)); // set question area for ending prompt
//            model.clickLastOk(answer); // calls the last click ok method
//            txtAverage.setStyle(model.getAvgCol()); // changes color of average based on the percentage
//            txtRight.setText(model.getRightstr()); // updates the right answer text field
//            txtWrong.setText(model.getWrongstr()); // updates the wrong answer text field
//            txtAverage.setText(model.getTxtAvg()); // updates the average text field
//            lblPromt.setText(""); // sets prompt label to empty string
//            lblA1.setText(""); // sets answer 1 label to empty string
//            lblA2.setText(""); // sets answer 2 label to empty string
//            lblA3.setText(""); // sets answer 3 label to empty string
//            lblA4.setText(""); // sets answer 4 label to empty string
//            btnOK.setDisable(true); // disables okay button since quiz is over
//            txtInput.setDisable(true); // disables input field since quiz is over
//            btnReset.requestFocus(); // sets focus to reset button
//
//        }
//
//


    /**
     *
     * An event handler for the reset button
     * @param e
     *
     **/
    private void setSpecial1Handler(ActionEvent e){
//        model.clickReset(); // call reset method from model class
//        txtRight.setText(model.getRightstr()); // updates the right answer text field back to the start
//        txtWrong.setText(model.getWrongstr()); // updates the wrong answer text field back to the start
//        txtAverage.setText(model.getTxtAvg()); // updates the average text field back to the start
//        lblQuestion.setText(model.question(model.getAnsno())); // // updates the question label back to the start
//        lblA1.setText(model.optionOne(model.getAnsno())); // sets answer 1 label to empty string back to the start
//        lblA2.setText(model.optionTwo(model.getAnsno())); // sets answer 2 label to empty string back to the start
//        lblA3.setText(model.optionThree(model.getAnsno())); // sets answer 3 label to empty string back to the start
//        lblA4.setText(model.optionFour(model.getAnsno())); // sets answer 4 label to empty string back to the start
//        txtInput.clear(); // clears input field
//        txtInput.requestFocus(); // resets focus to input field
//        btnOK.setDisable(false); // enables ok button if previously disabled
//        txtInput.setDisable(false); // enables input text field if previously disabled
//        txtAverage.setStyle("-fx-text-fill:black;"); // resets average color back to black
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
        Scene scene = new Scene(root, 1080, 1080); // set the size here
        stage.setTitle("Reindeer Games"); // set the window title here
        stage.setScene(scene); // set the scene here
        root.setStyle("-fx-background-color: lightgray"); // set the background color to blue


                // 3. Add components to the root

        root.getChildren().addAll(lblTitle); // add lblTitle component to root

        root.getChildren().add(txtArmor1);
        root.getChildren().add(txtArmor2);
        root.getChildren().add(txtCoins1);
        root.getChildren().add(txtCoins2);
        root.getChildren().add(txtDexterity1);
        root.getChildren().add(txtDexterity2);
        root.getChildren().add(txtHealth1);
        root.getChildren().add(txtHealth2);
        root.getChildren().add(txtName1);
        root.getChildren().add(txtName2);
        root.getChildren().add(txtStatus1);
        root.getChildren().add(txtStatus2);
        root.getChildren().add(txtStrength1);
        root.getChildren().add(txtStrength2);
        root.getChildren().add(txtType1);
        root.getChildren().add(txtType2);
        root.getChildren().add(lblArmor1);
        root.getChildren().add(lblArmor2);
        root.getChildren().add(lblCoins1);
        root.getChildren().add(lblCoins2);
        root.getChildren().add(lblDexterity1);
        root.getChildren().add(lblDexterity2);
        root.getChildren().add(lblHealth1);
        root.getChildren().add(lblHealth2);
        root.getChildren().add(lblName1);
        root.getChildren().add(lblName2);
        root.getChildren().add(lblStatus1);
        root.getChildren().add(lblStatus2);
        root.getChildren().add(lblStrength1);
        root.getChildren().add(lblStrength2);
        root.getChildren().add(lblType1);
        root.getChildren().add(lblType2);
        root.getChildren().add(btnAttack1);
//        root.getChildren().add(btnAttack2);
        root.getChildren().add(btnSpecial1);
//        root.getChildren().add(btnSpecial2);

        // 4. Configure the components (colors, fonts, size, location)

        lblTitle.setFont(new Font(35)); // configure lbl styles
        lblTitle.setLayoutY(475); // configure lbl styles
        lblTitle.setLayoutX(400); // configure lbl styles

        lblType1.setLayoutX(103);
        lblType1.setLayoutY(40);
        txtType1.setLayoutX(75);
        txtType1.setLayoutY(10);
        txtType1.setMaxWidth(90);
        txtType1.setAlignment(Pos.CENTER);
        lblName1.setLayoutX(220);
        lblName1.setLayoutY(40);
        txtName1.setLayoutX(195);
        txtName1.setLayoutY(10);
        txtName1.setMaxWidth(90);
        txtName1.setAlignment(Pos.CENTER_LEFT);
        lblStatus1.setLayoutX(322);
        lblStatus1.setLayoutY(40);
        txtStatus1.setLayoutX(315);
        txtStatus1.setLayoutY(10);
        txtStatus1.setMaxWidth(90);
        txtStatus1.setAlignment(Pos.CENTER);
        lblHealth1.setLayoutX(457);
        lblHealth1.setLayoutY(40);
        txtHealth1.setLayoutX(435);
        txtHealth1.setLayoutY(10);
        txtHealth1.setMaxWidth(90);
        txtHealth1.setAlignment(Pos.CENTER);
        lblStrength1.setLayoutX(575);
        lblStrength1.setLayoutY(40);
        txtStrength1.setLayoutX(555);
        txtStrength1.setLayoutY(10);
        txtStrength1.setMaxWidth(90);
        txtStrength1.setAlignment(Pos.CENTER);
        lblDexterity1.setLayoutX(695);
        lblDexterity1.setLayoutY(40);
        txtDexterity1.setLayoutX(675);
        txtDexterity1.setLayoutY(10);
        txtDexterity1.setMaxWidth(90);
        txtDexterity1.setAlignment(Pos.CENTER);
        lblArmor1.setLayoutX(822);
        lblArmor1.setLayoutY(40);
        txtArmor1.setLayoutX(795);
        txtArmor1.setLayoutY(10);
        txtArmor1.setMaxWidth(90);
        txtArmor1.setAlignment(Pos.CENTER);
        lblCoins1.setLayoutX(945);
        lblCoins1.setLayoutY(40);
        txtCoins1.setLayoutX(915);
        txtCoins1.setLayoutY(10);
        txtCoins1.setMaxWidth(90);
        txtCoins1.setAlignment(Pos.CENTER);

        lblType2.setLayoutX(103);
        lblType2.setLayoutY(1018);
        txtType2.setLayoutX(75);
        txtType2.setLayoutY(1040);
        txtType2.setMaxWidth(90);
        txtType2.setAlignment(Pos.CENTER);
        lblName2.setLayoutX(220);
        lblName2.setLayoutY(1018);
        txtName2.setLayoutX(195);
        txtName2.setLayoutY(1040);
        txtName2.setMaxWidth(90);
        txtName2.setAlignment(Pos.CENTER_LEFT);
        lblStatus2.setLayoutX(322);
        lblStatus2.setLayoutY(1018);
        txtStatus2.setLayoutX(315);
        txtStatus2.setLayoutY(1040);
        txtStatus2.setMaxWidth(90);
        txtStatus2.setAlignment(Pos.CENTER);
        lblHealth2.setLayoutX(457);
        lblHealth2.setLayoutY(1018);
        txtHealth2.setLayoutX(435);
        txtHealth2.setLayoutY(1040);
        txtHealth2.setMaxWidth(90);
        txtHealth2.setAlignment(Pos.CENTER);
        lblStrength2.setLayoutX(575);
        lblStrength2.setLayoutY(1018);
        txtStrength2.setLayoutX(555);
        txtStrength2.setLayoutY(1040);
        txtStrength2.setMaxWidth(90);
        txtStrength2.setAlignment(Pos.CENTER);
        lblDexterity2.setLayoutX(695);
        lblDexterity2.setLayoutY(1018);
        txtDexterity2.setLayoutX(675);
        txtDexterity2.setLayoutY(1040);
        txtDexterity2.setMaxWidth(90);
        txtDexterity2.setAlignment(Pos.CENTER);
        lblArmor2.setLayoutX(822);
        lblArmor2.setLayoutY(1018);
        txtArmor2.setLayoutX(795);
        txtArmor2.setLayoutY(1040);
        txtArmor2.setMaxWidth(90);
        txtArmor2.setAlignment(Pos.CENTER);
        lblCoins2.setLayoutX(945);
        lblCoins2.setLayoutY(1018);
        txtCoins2.setLayoutX(915);
        txtCoins2.setLayoutY(1040);
        txtCoins2.setMaxWidth(90);
        txtCoins2.setAlignment(Pos.CENTER);

        btnAttack1.setLayoutX(675);
        btnAttack1.setLayoutY(900);
        btnAttack1.setFont(new Font(35));
        btnAttack1.requestFocus();
        btnSpecial1.setLayoutX(850);
        btnSpecial1.setLayoutY(910);
        btnSpecial1.setFont(new Font(25));


        // 5. Add Event Handlers and do final setup
        btnAttack1.setOnAction(this::setAttack1Handler); // set event handler for ok button
        btnSpecial1.setOnAction(this::setSpecial1Handler); // set event handler for reset button

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
