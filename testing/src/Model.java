public class Model {

    private String[] questions = { "What is Mans best friend?","What is the Capital of Ontario?","How many wheels are on a bus?","How many o's are in Fortinos?","How much wood could a woodchuck chuck?","What year is it?","When do warewolves turn?","What is 8 x 3?","What is Mel Gibsons Middle Name?","Thanks for playing, close window or hit reset!"};

    private String[] answerOne = {"1 - Brick", "1 - Belgium","1 - 9","1 - 0","1 - Wood","1 - 1969","1 - Christmas","1 - 11","1 - Zoltan"};

    private String[] answerTwo = {"2 - Shoe", "2 - Ottawa","2 - Children","2 - 14","2 - Chuck Norris","2 - 2018","2 - February 29th","2 - 24","2 - Francis"};

    private String[] answerThree = {"3 - God","3 - Brussels","3 - 6","3 - 6","3 - Enough","3 - 200BC","3 - Full Moon","3 - 8","3 - Colm-Cille"};

    private String[]answerFour = {"4 - Dog","4 - Waffles","4 - 1","4 - 2","4 - Garbage Truck","4 - 2055","4 - Halloween","4 - 16","4 - Jefferson"};

    private double[] Answer = new double[]{4, 2, 3, 4, 2, 2, 3, 2, 3, 1};

    private static int right;
    private static int wrong;
    private String rightstr;
    private String wrongstr;
    private String txtAvg;
    private String txtAvgCol;

    private double answer;
    private String answers;
    private static int ansno = 0;
    private  double avg;

    public String question(int i){
        return questions[i];

    }

    public String optionOne(int i){
        return answerOne[i];
    }

    public String optionTwo(int i){
        return answerTwo[i];
    }

    public String optionThree(int i){
        return answerThree[i];
    }

    public String optionFour(int i){
        return answerFour[i];
    }

    public double answer(int i){
        return Answer[i];
    }

    public String getRightstr(){
        return rightstr;
    }

    public String getWrongstr(){
        return wrongstr;
    }

    public String getTxtAvg(){
        return txtAvg;
    }

    public int getAnsno(){
        return ansno;
    }

    public String getAvgCol(){
        if (avg <= 50.0) {
            txtAvgCol = "-fx-text-fill:red;";
        }else  if (avg > 50 && avg < 75){
            txtAvgCol = "-fx-text-fill:orange;";
        }else{
            txtAvgCol = "-fx-text-fill:green;";
        }
        return txtAvgCol;
    }

    public void clickLastOk(double answer){
        this.answer = answer;
        if (answer(ansno) == answer){
            right += 1;
            rightstr = String.valueOf(right);
        }else {
            wrong += 1;
            wrongstr = String.valueOf(wrong);
        }
        ansno += 1;
        avg = ((double)right/(double)ansno) * 100;

    }


    public void clickOk(double answer){
        this.answer = answer;
        if (ansno < 8){
            if (answer(ansno) == answer){
                right += 1;
                rightstr = String.valueOf(right);

            }else {
                wrong += 1;
                wrongstr = String.valueOf(wrong);
            }
            ansno += 1;
            avg = ((double)right/(double)ansno) * 100;
            txtAvg = (int)avg + "%";

        }
    }

    public void clickReset(){
        ansno = 0;
        right = 0;
        wrong = 0;
        rightstr = String.valueOf(right);
        wrongstr = String.valueOf(wrong);
        avg = ((double)right/(double)ansno) * 100;
        txtAvg = "0%";
    }
}
