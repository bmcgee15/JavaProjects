import javafx.scene.paint.Color;

import java.util.Scanner;

/**
 * This class creates
 * a Mug object.
 * @author Bret McGee
 */

public class Mug extends TimsProduct{

    /** Stores the color of the Mug **/
    private Color color;
    /** Stores the cost of the Mug **/
    private double cost;
    /** Stores the price of the Mug **/
    private double price;
    /** Stored the choice of the mug **/
    private static Mug mugChoice;

    /**
     * Initialize color, cost, and price parameters of the Mug class.
     * @param color takes the value of the mugs color.
     * @param cost takes the value of the mugs cost.
     * @param price takes the value of the mugs price.
     */
    private Mug(Color color, double cost, double price){
        this.color = color; // initializes the parameter.
        this.cost = cost; // initializes the parameter.
        this.price = price; // initializes the parameter.

    }

    /**
     * This method calls on the Mug constructor to create the object.
     * @return Mug object
     */
    public static Mug create(){// asks for user input and created with constructor, and returns new product
        Scanner input = new Scanner(System.in);
        System.out.println("Which Mug: 1 - Yellow | 2 - Red | 3 - Green | 4 - Blue");
        int choice = input.nextInt();
        /** This switch statement decides which type of mug is chosen **/
        switch (choice){
            case 1:
                Mug mug1 = new Mug(Color.YELLOW, 3.25, 10.00 );
                mugChoice = mug1;
                break;
            case 2:
                Mug mug2 = new Mug(Color.RED, 3.25, 10.00 );
                mugChoice = mug2;
                break;
            case 3:
                Mug mug3 = new Mug(Color.GREEN, 3.25, 10.00 );
                mugChoice = mug3;
                break;
            case 4:
                Mug mug4 = new Mug(Color.BLUE, 3.25, 10.00 );
                mugChoice = mug4;
                break;
        }
        return mugChoice;
    }

    /**
     * This method returns price.
     * @return It returns the price of the mug.
     */
    @Override
    public double getRetailPrice() {
        return price;
    }


    /**
     * This method returns color.
     * @return It returns the color of the Mug.
     */
    public Color getColor(){
        return color;
    }

    /**
     * This method returns toString.
     * @return It returns the toString of the Mug.
     */
    @Override
    public String toString() {
        return "Mug{" +
                "color=" + color +
                ", cost=" + cost +
                ", price=" + price +
                '}';
    }
}
