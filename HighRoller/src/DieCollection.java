/** This is the DieCollection class that generates a collection of dies
 *  by calling on the Die Class which generates n amount of die with n
 *  number of sides, and simulates a roll with a number
 *  between 1 & n, n being the number of sides either once or 10000 times.
 *
 *  @author Bret McGee - 000207475  */

public class DieCollection {

    public static int dieCount;
    private static int[] sides;
    private static String Collection = "Dice Collection: ";
    public static int rollSum;
    public static int rollMax;


    public DieCollection(int dieCount, int[] sides){
        this.dieCount = dieCount;
        this.sides = sides;

    }

    public static void runOnce(){
        Die[] dice = new Die[dieCount];
        rollSum = 0;
        for(int i = 0; i < dieCount; i++){
            Die a = new Die(sides[i]);
            dice[i] = a;
            a.RollDie();
            Collection += " " + a.toString();
            rollSum += a.getRoll();
            rollMax += sides[i];

        }
    }

    public String getRollSum(){

        return " Current = " + rollSum + "   ";
    }

    public String getRollMax(){

        return " Max = " + rollMax + "   ";
    }

    public String getRollMin(){
        return " Min = " + dieCount + "   ";
    }

    public String toString(){
        return Collection + "\n" + getRollMin() + getRollMax() + getRollSum();
    }



}
