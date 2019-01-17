import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Model {
    private static Button btnAdd;
    private static TextField txtNum1, txtNum2;
    private static Label lblSum;


    public void Model(TextField txtNum1, TextField txtNum2, Label lblSum) {
        this.txtNum1 = txtNum1;
        this.txtNum2 = txtNum2;
        this.lblSum = lblSum;

    }

    public Label Sum(){
        int num1 = Integer.parseInt(txtNum1.getText());
        int num2 = Integer.parseInt(txtNum2.getText());
        int sum = num1 + num2;
        lblSum.setText("The sum is " + sum);
        return lblSum;
    }
}