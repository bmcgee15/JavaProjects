public class Model {

    private  String[] questions = { "What is Mans best friend?","What is the Capital of Ontario?","How many wheels are on a bus?","How many o's are in Fortinos?","How much wood could a woodchuck chuck?","What year is it?","When do warewolves turn?","What is 8 x 3?","What is Mel Gibsons Middle Name?","Thanks for playing, close window or hit reset!"};

    private  String[] answerOne = {"1 - Brick", "1 - Belgium","1 - 9","1 - 0","1 - Wood","1 - 1969","1 - Christmas","1 - 11","1 - Zoltan"};

    private  String[] answerTwo = {"2 - Shoe", "2 - Waffles","2 - Children","2 - 14","2 - Garbage Truck","2 - 2055","2 - February 29th","2 - 16","2 - Francis"};

    private  String[] answerThree = {"3 - God","3 - Brussels","3 - 1","3 - 6","3 - Enough","3 - 200BC","3 - Halloween","3 - 8","3 - Jefferson"};

    private  String[]answerFour = {"4 - Dog","4 - Ottawa","4 - 6","4 - 2","4 - Chuck Norris","4 - 2018","4 - Full Moon","4 - 24","4 - Colm-Cille"};

    private  double[] Answer = new double[]{4, 2, 3, 4, 2, 2, 3, 2, 3, 1};

    public String question(int i){
        System.out.println(question);
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
}
