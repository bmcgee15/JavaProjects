import java.util.Scanner;

/**
 * This class creates the TimsOrder
 * object and creates one or
 * many TimsProduct objects.
 * @author Bret McGee
 */

public class TimsOrder {

    /** Stores the size of the tims product **/
    private static int size;
    /** Stores the name of the tims product **/
    private static String name;
    /** Stores the amount due for the tims product **/
    private double AmountDue;
    /** stores an array of TimsProducts **/
    private TimsProduct[] items;
    /** stroes the string value for items array **/
    private String itemString = "";
    /** Creates the scanner input instance variable **/
    Scanner input = new Scanner(System.in);

    /**
     * Initialize name and size parameters of the TimsOrder class.
     * @param size takes the value for the products size.
     * @param name takes the value for the products name.
     */
    private TimsOrder(String name, int size){
        this.name = name; // initializes the parameter.
        this.size = size; // initializes the parameter.
        /** create new product array with the length of size **/
        items = new TimsProduct[size];
        /** Run the loop for the length of the order size **/
        for (int i = 0; i < size; i++){
            System.out.println("Item to be ordered? 1 - Hot Drink | 2 - Donut | 3 - Mug | 4 - Shirt");
            int choice = input.nextInt();
            System.out.println();
            /** This switch statement decides which type of product is chosen **/
            switch (choice){
                case 1:
                    HotDrink sub1 = HotDrink.create(); // object is created
                    AmountDue += sub1.getRetailPrice(); // price of object it tallied
                    items[i] = sub1; // object is addad to array
                    System.out.println("Order item:  |  " + items[i] + "\n");
                    break;
                case 2:
                    Donut sub2 = Donut.create(); // object is created
                    AmountDue += sub2.getRetailPrice(); // price of object it tallied
                    items[i] = sub2; // object is addad to array
                    System.out.println("Order item  |  " + items[i] + "\n");
                    break;
               case 3:
                    Mug sub3 = Mug.create(); // object is created
                    AmountDue += sub3.getRetailPrice(); // price of object it tallied
                    items[i] = sub3; // object is addad to array
                    System.out.println("Order item  |  " + items[i] + "\n");
                    break;
                case 4:
                    Shirt sub4 = Shirt.create(); // object is created
                    AmountDue += sub4.getRetailPrice(); // price of object it tallied
                    items[i] = sub4; // object is addad to array
                    System.out.println("Order item  |  " + items[i] + "\n");
                    break;
            }

        }

    }

    /**
     * This method calls on the TimsOrder constructor to create the object.
     * @return TimsOrder object
     */
    public static TimsOrder create(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        name = input.next();
        System.out.println();
        /** loop until a number is given of at least 1 **/
        do {
            System.out.println("How many items would you like to order? ");
            size = input.nextInt();
            System.out.println();
        }while (size < 1);
        TimsOrder order = new TimsOrder(name, size);
        return order;
    }

    /**
     * This method returns amount due.
     * @return It returns the amount due for the order.
     */
    public double getAmountDue(){
        AmountDue = 0;
        for (int i = 0; i < items.length; i++){
            AmountDue += items[i].getRetailPrice();
        }
        return AmountDue;
    }

    /**
     * This method returns item string.
     * @return It returns the item string for the order.
     */
    public String getItemString(){
        for (int i = 0; i < items.length; i++){
            itemString += items[i] + "\n";
        }
        return itemString;
    }

    /**
     * This method returns toString.
     * @return It returns the toString of the TimsOrder.
     */
    @Override
    public String toString() {
        getItemString();
        return "Order For: " + name +
                "\nNumber of Items = " + size +
                "\n\nItem Info: \n" + itemString;
    }
}
