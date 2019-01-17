/**
 *
 *  This class is the slot machine mechanics, it is where all of the
 *   behind the scene processing happens with all created slot machine
 *   objects.
 *
 *   @author 000207475
 *
 */

public class Mechanics {

    /** Starting Cash in Slot Machine */
    double cash = 50.00;
    /** first of three slot spinners */
    String SpinnerOne = "";
    /** second of three spinners */
    String SpinnerTwo = "";
    /** third of three spinners */
    String SpinnerThree = "";

    /**
     * Adds a quarter to the total cash in slot machine.
     * Generates random choices per spinner.
     * Calculates the winnings if any.
     * Changes total cash accordingly.
     * Prints the winnings.
     */

    public void InsertQuarter(){
        System.out.println("You inserted a Quarter\n");
        int randomOne = (int)(Math.random()*7);
        int randomTwo = (int)(Math.random()*7);
        int randomThree = (int)(Math.random()*7);
        cash += .25;
        if (randomOne == 0){
            SpinnerOne = "Apple";
        }
        if (randomTwo == 0){
            SpinnerTwo = "Apple";
        }
        if (randomThree == 0){
            SpinnerThree = "Apple";
        }
        if (randomOne == 1){
            SpinnerOne = "Cherries";
        }
        if (randomTwo == 1){
            SpinnerTwo = "Cherries";
        }
        if (randomThree == 1){
            SpinnerThree = "Cherries";
        }
        if (randomOne == 2){
            SpinnerOne = "Grapes";
        }
        if (randomTwo == 2){
            SpinnerTwo = "Grapes";
        }
        if (randomThree == 2){
            SpinnerThree = "Grapes";
        }
        if (randomOne == 3){
            SpinnerOne = "Lemon";
        }
        if (randomTwo == 3){
            SpinnerTwo = "Lemon";
        }
        if (randomThree == 3){
            SpinnerThree = "Lemon";
        }
        if (randomOne == 4){
            SpinnerOne = "Orange";
        }
        if (randomTwo == 4){
            SpinnerTwo = "Orange";
        }
        if (randomThree == 4){
            SpinnerThree = "Orange";
        }
        if (randomOne == 5){
            SpinnerOne = "Pear";
        }
        if (randomTwo == 5){
            SpinnerTwo = "Pear";
        }
        if (randomThree == 5){
            SpinnerThree = "Pear";
        }
        if (randomOne == 6){
            SpinnerOne = "Watermellonr";
        }
        if (randomTwo == 6){
            SpinnerTwo = "Watermellonr";
        }
        if (randomThree == 6){
            SpinnerThree = "Watermellonr";
        }
        if (SpinnerOne.equals("Apple") && SpinnerTwo.equals("Apple") && SpinnerThree.equals("Apple")){
            System.out.println("You won your quarter back\n");
            cash -= 0.25;
        }
        if (SpinnerOne.equals("Cherries") && SpinnerTwo.equals("Cherries") && SpinnerThree.equals("Cherries")){
            System.out.println("You won $2.50\n");
            cash -= 2.50;
        }
        if (SpinnerOne.equals("Grapes") && SpinnerTwo.equals("Grapes") && SpinnerThree.equals("Grapes")){
            System.out.println("You won $5\n");
            cash -= 5.00;
        }
        if (SpinnerOne.equals("Lemon") && SpinnerTwo.equals("Lemon") && SpinnerThree.equals("Lemon")){
            System.out.println("You won $7.50\n");
            cash -= 7.50;
        }
        if (SpinnerOne.equals("Orange") && SpinnerTwo.equals("Orange") && SpinnerThree.equals("Orange")){
            System.out.println("You won $10\n");
            cash -= 10.00;
        }
        if (SpinnerOne.equals("Pear") && SpinnerTwo.equals("Pear") && SpinnerThree.equals("Pear")){
            System.out.println("You won $12.50\n");
            cash -= 12.50;
        }
        if (SpinnerOne.equals("Watermellon") && SpinnerTwo.equals("Watermellon") && SpinnerThree.equals("Watermellon")){
            System.out.println("You won $15\n");
            cash -= 15.00;
        }
        if (cash < 15.00){
            cash += 50.00;
        }
        if (!SpinnerOne.equals(SpinnerTwo) || !SpinnerOne.equals(SpinnerThree) || !SpinnerTwo.equals(SpinnerThree)){
            System.out.println("You did not win anything\n");
        }


    }

    /**
     * Prints the three fruits the spinners landed on last.
     */

    public void ViewMachine(){
        System.out.println(SpinnerOne + " " + SpinnerTwo + " " + SpinnerThree + "\n");


    }

    /**
     * Prints the total cash left in the slot machine.
     */
    public void CheckCash(){
        System.out.println("There is " + cash + "left\n");

    }

    /**
     * Adds $50 to the total cash in the slot machine then prints out the new total.
     */
    public void ReloadMachine(){
        System.out.println("Machine Reload Successful\n");
        cash += 50.00;

    }

}
