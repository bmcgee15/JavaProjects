public class Questions {
    public int newQuestionNumber;
    public String question;
    private String answerOne;
    private String answerTwo;
    private String answerThree;
    private String answerFour;

    public Questions(int questionNumber){
        newQuestionNumber = questionNumber;
    }
    public String getQuestion(){

        if (newQuestionNumber == 1){
            question = "What is Mans best friend?";
        }

        if (newQuestionNumber == 2){
            question = "What is the Capital of Ontario?";
        }

        if (newQuestionNumber == 3){
            question = "How many wheels are on a bus?";
        }

        if (newQuestionNumber == 4){
            question = "How many o's are in Fortinos?";
        }

        if (newQuestionNumber == 5){
            question = "How much wood could a woodchuck chuck?";
        }

        if (newQuestionNumber == 6){
            question = "What year is it?";
        }

        if (newQuestionNumber == 7){
            question = "When do warewolves turn?";
        }

        if (newQuestionNumber == 8){
            question = "What is 8 x 3?";
        }

        if (newQuestionNumber == 9){
            question = "What is Mel Gibsons Middle Name?";
        }

        if (newQuestionNumber == 10){
            question = "Thanks for playing, close window or hit reset!";
        }

        return question;
    }

    public String getAnswerOne(){
        if (newQuestionNumber == 1){
            answerOne = "1 - Brick";
        }

        if (newQuestionNumber == 2){
            answerOne = "1 - Belgium";
        }

        if (newQuestionNumber == 3){
            answerOne = "1 - 9";
        }

        if (newQuestionNumber == 4){
            answerOne = "1 - 0";
        }

        if (newQuestionNumber == 5){
            answerOne = "1 - Wood";
        }

        if (newQuestionNumber == 6){
            answerOne = "1 - 1969";
        }

        if (newQuestionNumber == 7){
            answerOne = "1 - Christmas";
        }

        if (newQuestionNumber == 8){
            answerOne = "1 - 11";
        }

        if (newQuestionNumber == 9){
            answerOne = "1 - Zoltan";
        }

        return answerOne;
    }

    public String getAnswerTwo(){
        if (newQuestionNumber == 1){
            answerTwo = "2 - Shoe";
        }

        if (newQuestionNumber == 2){
            answerTwo = "2 - Waffles";
        }

        if (newQuestionNumber == 3){
            answerTwo = "2 - Children";
        }

        if (newQuestionNumber == 4){
            answerTwo = "2 - 14";
        }

        if (newQuestionNumber == 5){
            answerTwo = "2 - Garbage Truck";
        }

        if (newQuestionNumber == 6){
            answerTwo = "2 - 2055";
        }

        if (newQuestionNumber == 7){
            answerTwo = "2 - February 29th";
        }

        if (newQuestionNumber == 8){
            answerTwo = "2 - 16";
        }

        if (newQuestionNumber == 9){
            answerTwo = "2 - Francis";
        }

        return answerTwo;
    }

    public String getAnswerThree(){
        if (newQuestionNumber == 1){
            answerThree = "3 - God";
        }

        if (newQuestionNumber == 2){
            answerThree = "3 - Brussels";
        }

        if (newQuestionNumber == 3){
            answerThree = "3 - 1";
        }

        if (newQuestionNumber == 4){
            answerThree = "3 - 6";
        }

        if (newQuestionNumber == 5){
            answerThree = "3 - Enough";
        }

        if (newQuestionNumber == 6){
            answerThree = "3 - 200BC";
        }

        if (newQuestionNumber == 7){
            answerThree = "3 - Halloween";
        }

        if (newQuestionNumber == 8){
            answerThree = "3 - 8";
        }

        if (newQuestionNumber == 9){
            answerThree = "3 - Jefferson";
        }

        return answerThree;
    }

    public String getAnswerFour(){
        if (newQuestionNumber == 1){
            answerFour = "4 - Dog";
        }

        if (newQuestionNumber == 2){
            answerFour = "4 - Ottawa";
        }

        if (newQuestionNumber == 3){
            answerFour = "4 - 6";
        }

        if (newQuestionNumber == 4){
            answerFour = "4 - 2";
        }

        if (newQuestionNumber == 5){
            answerFour = "4 - Chuck Norris";
        }

        if (newQuestionNumber == 6){
            answerFour = "4 - 2018";
        }

        if (newQuestionNumber == 7){
            answerFour = "4 - Full Moon";
        }

        if (newQuestionNumber == 8){
            answerFour = "4 - 24";
        }

        if (newQuestionNumber == 9){
            answerFour = "4 - Colm-Cille";
        }

        return answerFour;
    }
}
