/**
 * This class runs the tim
 * hortons simulation and
 * creates the TimsOrder
 * object.
 * @author Bret McGee
 */

public class TimHortons {

    /**
     * creates the TimsOrder object.
     * @param args the command line arguments
     */

    public static void main(String[] args) {
            /** TimsOrder Object is created **/
            TimsOrder t = TimsOrder.create();
            System.out.println(t); // displays the tims order object
            System.out.printf("Total Price: $%.2f\n", t.getAmountDue()); // displays the total price of the order

    }
}
