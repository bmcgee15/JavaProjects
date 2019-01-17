/** This is the DieCollection class that generates a collection of dies
 *  by calling on the Die Class which generates n amount of die with n
 *  number of sides, and simulates a roll with a number
 *  between 1 & n, n being the number of sides either once or 10000 times.
 *
 *  @author Bret McGee - 000207475  */

public class DieCollection {

    /** initializing dieCount variable **/
    public static int dieCount;
    /** initializing sides array **/
    private static int[] sides;
    /** initializing Collection String **/
    private static String Collection = "Dice Collection: ";
    /** initializing rollsum **/
    public static int rollSum;
    /** initializing rollMax **/
    public static int rollMax;

    /** Die Collection Constructor **/
    public DieCollection(int dieCount, int[] sides){
        this.dieCount = dieCount;
        this.sides = sides;

    }

    /** Run once Method that collects the sum of the dice along with max and min rolls **/
    public static void runOnce(){
        /** create new dice object **/
        Die[] dice = new Die[dieCount];
        /** reset rollsum **/
        rollSum = 0;
        /** initialize collection string **/
        Collection = "Dice Collection: ";
        /** reset rollMax **/
        rollMax = 0;
        /** setup loop for rolling once **/
        for(int i = 0; i < dieCount; i++){
            /** create new die object **/
            Die a = new Die(sides[i]);
            dice[i] = a;
            /** call the rolldie method from the die class **/
            a.RollDie();
            /** collection build with toString **/
            Collection += " " + a.toString();
            /** assign values to rollsum **/
            rollSum += a.getRoll();
            /** assign values to rollMax **/
            rollMax += sides[i];

        }
    }
    /** initialize rollsum getter **/
    public String getRollSum(){
        /** return rollsum **/
        return " Current = " + rollSum + "   ";
    }
    /** initialize rollMAX getter **/
    public String getRollMax(){
        /** return rollmax **/
        return " Max = " + rollMax + "   ";
    }
    /** initialize rollMin getter **/
    public String getRollMin(){
        return " Min = " + dieCount + "   ";
    }
    /** initialize toString **/
    public String toString(){
        return "\n" + Collection + "\n" + getRollMin() + getRollMax() + getRollSum();
    }



}
