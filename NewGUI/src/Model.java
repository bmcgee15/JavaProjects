/**
 * This class holds all of the logic for
 * the quiz application.
 * @author Bret McGee
 */

public class Model {
    /** Initializing questions array **/
    private String[] questions = { "What is Mans best friend?","What is the Capital of Ontario?","How many wheels are on a bus?","How many o's are in Fortinos?","How much wood could a woodchuck chuck?","What year is it?","When do warewolves turn?","What is 8 x 3?","What is Mel Gibsons Middle Name?","Thanks for playing, close window or hit reset!"};
    /** Initializing answer 1 array **/
    private String[] answerOne = {"1 - Brick", "1 - Belgium","1 - 9","1 - 0","1 - Wood","1 - 1969","1 - Christmas","1 - 11","1 - Zoltan"};
    /** Initializing answer 2 array **/
    private String[] answerTwo = {"2 - Shoe", "2 - Ottawa","2 - Children","2 - 14","2 - Chuck Norris","2 - 2018","2 - February 29th","2 - 24","2 - Francis"};
    /** Initializing answer 3 array **/
    private String[] answerThree = {"3 - God","3 - Brussels","3 - 6","3 - 6","3 - Enough","3 - 200BC","3 - Full Moon","3 - 8","3 - Colm-Cille"};
    /** Initializing answer 4 array **/
    private String[]answerFour = {"4 - Dog","4 - Waffles","4 - 1","4 - 2","4 - Garbage Truck","4 - 2055","4 - Halloween","4 - 16","4 - Jefferson"};
    /** Initializing input answers array **/
    private double[] Answer = new double[]{4, 2, 3, 4, 2, 2, 3, 2, 3, 1};

    /** right int **/
    private static int right;
    /** wrong int **/
    private static int wrong;
    /** right string **/
    private String rightstr;
    /** wrong string **/
    private String wrongstr;
    /** average string **/
    private String txtAvg;
    /** average color **/
    private String txtAvgCol;
    /** answer double **/
    private double answer;
    /** answers string **/
    private String answers;
    /** ansno int **/
    private static int ansno = 0;
    /** avg double **/
    private  double avg;

    /**
     * @return The current question
     **/
    public String question(int i){
        return questions[i]; // return questions

    }

    /**
     * @return The current answer 1
     **/
    public String optionOne(int i){
        return answerOne[i]; // return answerOne
    }

    /**
     * @return The current answer 2
     **/
    public String optionTwo(int i){
        return answerTwo[i]; // return answerTwo
    }

    /**
     * @return The current answer 3
     **/
    public String optionThree(int i){
        return answerThree[i]; // return answerThree
    }

    /**
     * @return The current answer 4
     **/
    public String optionFour(int i){
        return answerFour[i]; // return answerFour
    }

    /**
     * @return The correct answer
     **/
    public double answer(int i){
        return Answer[i]; // return Answer
    }

    /**
     * @return The right string
     **/
    public String getRightstr(){
        return rightstr; // return rightstr
    }

    /**
     * @return The wrong string
     **/
    public String getWrongstr(){
        return wrongstr; // return wrongstr
    }

    /**
     * @return The average text
     **/
    public String getTxtAvg(){
        return txtAvg; // return txtAvg
    }

    /**
     * @return The current question number
     **/
    public int getAnsno(){
        return ansno; // return ansno
    }

    /**
     * A method to return the average color
     * @return average color
     **/
    public String getAvgCol(){
        if (avg <= 50.0) {  // if average less than 50
            txtAvgCol = "-fx-text-fill:red;";  // make average red
        }else  if (avg > 50 && avg < 75){  // if average between 50 & 75
            txtAvgCol = "-fx-text-fill:orange;";  // make average orange
        }else{
            txtAvgCol = "-fx-text-fill:green;";  // make average green
        }
        return txtAvgCol;
    }

    /**
     * A method to show the final message
     * @param answer
     **/
    public void clickLastOk(double answer){
        this.answer = answer;
        if (answer(ansno) == answer){
            rightstr = String.valueOf(right);  // asign value of right to right string
        }else {
            wrongstr = String.valueOf(wrong);  // asign value of wrong to wrong string
        }
        avg = ((double)right/(double)ansno) * 100;  // calculate the average and assign it to avg

    }

    /**
     * A method to update the current state of the quiz
     * @param answer
     **/
    public void clickOk(double answer){
        this.answer = answer;
        if (ansno < 8){
            if (answer(ansno) == answer){
                right += 1; // increase right by 1
                rightstr = String.valueOf(right); // assign value of right to right string

            }else {
                wrong += 1; // increase wrong by 1
                wrongstr = String.valueOf(wrong); // assign value of wrong to wrong string
            }
            ansno += 1; // increase ansno by 1
            avg = ((double)right/(double)ansno) * 100;  // calculate the average and assign it to avg
            txtAvg = (int)avg + "%"; // assign average to text average

        }
    }

    /**
     * A method to reset state of quiz to the beginning state
     **/
    public void clickReset(){
        ansno = 0; // reset ansno
        right = 0;  // reset right
        wrong = 0; // reset wrong
        rightstr = String.valueOf(right);  // reset rightstr
        wrongstr = String.valueOf(wrong); // reset wrongstr
        avg = ((double)right/(double)ansno) * 100; // reset avg
        txtAvg = "0%"; // reset txtavg
    }
}
