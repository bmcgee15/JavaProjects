import javafx.scene.control.TextField;

public class Model {
    private int intInput;
    private int question;
    private int right;
    private int wrong;
//  private String average = "0%";
    private int[] count = new int[10];
    int i;
    private int[] correct = new int[]{4, 2, 3, 4, 2, 2, 3, 2, 3, 1};

    public Model(int intInput) {
        this.intInput = intInput;
        for (i = 0; i < 10; i++){
            count[i] = intInput;
        }
    }

    public void checkAnswer() {
        while (question < 10) {
            switch (question) {
                case 0:
                    if (correct[question] == count[question]) {
                    right = right + 1;
                        question++;
                    } else {
                    wrong = wrong + 1;
                        question++;
                    }
                    break;
            }
            question++;
        }
//        question = question + 1;
//        Questions x = new Questions(question);
//        strQuestion = x.getQuestion();
//        answerOne = x.getAnswerOne();
//        answerTwo = x.getAnswerTwo();
//        answerThree = x.getAnswerThree();
//        answerFour = x.getAnswerFour();
    }

    public int getRight(){
        return right;
    }

    public int getWrong(){
        return wrong;
    }

//    public String getAverage(){
//        average = (right/question) * 100 + "%";
//        return average;
//    }
//
//    public String getStrQuestion(){
//        return strQuestion;
//    }
//
//    public String getAnswerOne(){
//        return answerOne;
//    }
//
//    public String getAnswerTwo(){
//        return answerTwo;
//    }
//
//    public String getAnswerThree(){
//        return answerThree;
//    }
//
//    public String getAnswerFour(){
//        return answerFour;
//    }










}
