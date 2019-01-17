import java.util.Scanner;

/** This is the Main Class that gets user input then calls on the DieCollection Class
 *  to generate a collection of dies by calling on the Die Class which generates n
 *  amount of die with n number of sides, and simulates a roll with a number
 *  between 1 & n, n being the number of sides either once or 10000 times.
 *
 *  @author Bret McGee - 000207475  */

public class HighRoller {

    /**    * A method to test the object    * @param args unused    **/
    public static void main(String[] args) {

        /** initializing scanner **/
        Scanner input = new Scanner(System.in);

        /** getting user input for number of dice **/
        System.out.println("How many dice? ");

        /** initializing diCount variable from user input **/
        int dieCount = input.nextInt();

        /** getting user input for sides of dice **/
        System.out.println("\nEnter the number of sides of each die");

        /** initialize sides array **/
        int[] sides = new int[dieCount];

        /** assign values to sides array **/
        for (int i = 0; i < dieCount; i++) {
            sides[i] = input.nextInt();
        }

        /** create a new die collection object **/
        DieCollection a = new DieCollection(dieCount, sides);

        /** call the run once method from the die collection class **/
        a.runOnce();

        /** display the toString from the die collection object a **/
        System.out.println(a.toString());

        /** initialize variable int user input **/
        int userInput;

        /** start the loop to prompt for user interaction **/
        do {

            /** display message to prompt user **/
            System.out.println("\n1=roll once, 2=roll 100000 times, 3=quit: ");

            /** assign user input to the user input variable **/
            userInput = input.nextInt();

            /** choice 1 - run once **/
            if (userInput==1){

                /** call the run once method on object a **/
                a.runOnce();

                /** print the toString method on object a **/
                System.out.println(a.toString());
            }

            /** choice 2 - run 100000 times **/
            if (userInput==2){

                /** call the method runOneHundredThousand **/
                runOneHundredThousand();
            }

            /** choice 3 - quit **/
            if (userInput==3){

                /** print goodbye message **/
                System.out.println("\nBYE!!!");
            }

            /** set the loop condition **/
        }while (!(userInput==3));
    }

    /** a method to roll the dieCollection 100000 times  **/
    public static void runOneHundredThousand() {

        /** initialize the run 100000 array **/
        int[] theBigOne = new int[DieCollection.rollMax - DieCollection.dieCount + 1];

        /** run the run once method 100000 times **/
        for (int j = 0; j < 100000; j++) {
            DieCollection.runOnce();

            /** assign values to theBigOne array, incrementing the number rolled as they appear **/
            theBigOne[DieCollection.rollSum - DieCollection.dieCount]++;
        }

        /** loop to create the histogram **/
        for (int out = 0; out < theBigOne.length; out++) {

            /** displaying the information on number of times a number was rolled **/
            System.out.print((DieCollection.dieCount + out) + ":\t" + theBigOne[out]);

            /** checking count # to assign appropriate histogram **/
            if (theBigOne[out] <= 1000){
                System.out.println("   ");
            }

            /** checking count # to assign appropriate histogram **/
            if (theBigOne[out] > 1000 && theBigOne[out] <= 2000){
                System.out.println("   *");
            }

            /** checking count # to assign appropriate histogram **/
            if (theBigOne[out] > 2000 && theBigOne[out] <= 4000){
                System.out.println("   **");
            }

            /** checking count # to assign appropriate histogram **/
            if (theBigOne[out] > 4000 && theBigOne[out] <= 6000){
                System.out.println("   ***");
            }

            /** checking count # to assign appropriate histogram **/
            if (theBigOne[out] > 6000 && theBigOne[out] <= 8000){
                System.out.println("   ****");
            }

            /** checking count # to assign appropriate histogram **/
            if (theBigOne[out] > 8000 && theBigOne[out] <= 10000){
                System.out.println("   *****");
            }

            /** checking count # to assign appropriate histogram **/
            if (theBigOne[out] > 10000 && theBigOne[out] <= 12000){
                System.out.println("  ******");
            }

            /** checking count # to assign appropriate histogram **/
            if (theBigOne[out] > 12000 && theBigOne[out] <= 14000){
                System.out.println("  *******");
            }

            /** checking count # to assign appropriate histogram **/
            if (theBigOne[out] > 14000 && theBigOne[out] <= 16000){
                System.out.println("  ********");
            }

            /** checking count # to assign appropriate histogram **/
            if (theBigOne[out] > 16000 && theBigOne[out] <= 18000){
                System.out.println("  *********");
            }

            /** checking count # to assign appropriate histogram **/
            if (theBigOne[out] > 18000 && theBigOne[out] <= 20000){
                System.out.println("  **********");
            }

            /** checking count # to assign appropriate histogram **/
            if (theBigOne[out] > 20000 && theBigOne[out] <= 25000){
                System.out.println("  ***********");
            }

            /** checking count # to assign appropriate histogram **/
            if (theBigOne[out] > 25000){
                System.out.println("  ************");
            }



        }
    }
}

