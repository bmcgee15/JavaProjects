import java.util.Scanner;

/** This is the Main Class that gets user input then calls on the DieCollection Class
 *  to generate a collection of dies by calling on the Die Class which generates n
 *  amount of die with n number of sides, and simulates a roll with a number
 *  between 1 & n, n being the number of sides either once or 10000 times.
 *
 *  @author Bret McGee - 000207475  */

public class HighRoller {
    public static void main(String[] args) {

        /* initializing scanner */
        Scanner input = new Scanner(System.in);

        /* getting user input for number of dice */
        System.out.println("How many dice? ");

        /* initializing diCount variable from user input */
        int dieCount = input.nextInt();

        /* getting user input for sides of dice */
        System.out.println("Enter the number of sides of each die");

        /* initialize sides array */
        int[] sides = new int[dieCount];

        /* assign values to sides array */
        for(int i = 0; i < dieCount; i++){
            sides[i] = input.nextInt();
        }

        /* create the die collection */
        DieCollection a = new DieCollection(dieCount, sides);
        a.runOnce();
        System.out.println(a.toString());
        runOneHundredThousand();



    }

    public static void runOneHundredThousand() {
        int[] theBigOne = new int[100000];
        int[] frequency = new int[DieCollection.rollMax - DieCollection.dieCount + 1];
        for (int j = 0; j < 100000; j++) {
            DieCollection.runOnce();
            theBigOne[j] = DieCollection.rollSum;
            //System.out.println(theBigOne[j]);
            frequency[theBigOne[j]-DieCollection.dieCount]++;

        }

        for(int out = 0; out < frequency.length; out++){
            System.out.println((DieCollection.dieCount + out) + ":\t" + frequency[out]);

        }
    }

}
