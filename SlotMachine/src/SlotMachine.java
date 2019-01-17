import java.util.Objects;
import java.util.Scanner;

/**
 * This is the main "casino" class that created multiple slot machine objects.
 * This is the class that interacts with the user, getting input, calling on the
 * mechanics class and displaying all of the appropriate information.
 */

public class SlotMachine {

    /**
     * The main method to run the slot machine objects.
     * @param args
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //creating scanner object to allow input from user
        String Response = ""; // initiating an empty string
        Mechanics slotOne = new Mechanics(); // creating slot machine object 1
        Mechanics slotTwo = new Mechanics(); // creating slot maching object 2

        /**
         * Running a loop to interact with user, getting constant input to
         * operate the two slot machine objects with until user quits program.
         *
         */

        while (!Response.equals("q") && !Response.equals("Q")) {
            System.out.println("P1 = Put a Quarter in Machine 1");
            System.out.println("P2 = Put a Quarter in Machine 2");
            System.out.println("V1 = View Machine 1");
            System.out.println("V2 = View Machine 2");
            System.out.println("C1 = Check Machine 1 Cash");
            System.out.println("C2 = Check Machine 2 Cash");
            System.out.println("R1 = Reload Machine 1");
            System.out.println("R2 = Reload Machine 2");
            System.out.println("Q = Quit");
            System.out.print("What would you like to do? ");
            Response = input.next();

            if (Response.equals("P1")){
                System.out.println("\nMachine 1\n");
                slotOne.InsertQuarter(); // calls insert quarter method for slot 1

            }
            if (Response.equals("P2")){
                System.out.println("\nMachine 2\n");
                slotTwo.InsertQuarter(); // calls insert quarter method for slot 2
            }
            if (Response.equals("V1")){
                System.out.println("\nView Machine 1\n");
                slotOne.ViewMachine(); // calls view machine method for slot 1
            }
            if (Response.equals("V2")){
                System.out.println("\nView Machine 2\n");
                slotTwo.ViewMachine(); // calls view machine method for slot 2
            }
            if (Response.equals("C1")){
                System.out.println("\nCheck Machine 1 Cash\n");
                slotOne.CheckCash(); // calls check cash method for slot 1
            }
            if (Response.equals("C2")){
                System.out.println("\nCheck Machine 2 Cash\n");
                slotTwo.CheckCash(); // calls check cash method for slot 2
            }
            if (Response.equals("R1")){
                System.out.println("\nReload Machine 1\n");
                slotOne.ReloadMachine(); // calls reload method for slot 1
            }
            if (Response.equals("R2")){
                System.out.println("\nReload Machine 2\n");
                slotTwo.ReloadMachine(); // calls reload method for slot 2
            }
        }

        // Displays goodbye message when user quits the program
        System.out.println("\nThanks for playing, cashout's are done in the back alley. Goodbye!\n");
    }
}
