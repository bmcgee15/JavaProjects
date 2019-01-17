import javafx.scene.paint.Color;

import java.util.Scanner;

/**
 * This class creates
 * a shirt object.
 * @author Bret McGee
 */

public class Shirt extends TimsProduct{

    /** Stores the color of the shirt **/
    private Color color;
    /** Stores the cost of the shirt **/
    private double cost;
    /** Stores the price of the shirt **/
    private double price;
    /** Stored the choice of the shirt **/
    private static Shirt shirtChoice;

    /**
     * Initialize color, cost, and price parameters of the shirt class.
     * @param color takes the value of the shirt color.
     * @param cost takes the value of the shirt cost.
     * @param price takes the value of the shirt price.
     */
    private Shirt(Color color, double cost, double price){
        this.color = color; // initializes the parameter.
        this.cost = cost; // initializes the parameter.
        this.price = price; // initializes the parameter.

    }

    /**
     * This method calls on the shirt constructor to create the object.
     * @return shirt object
     */
    public static Shirt create(){// asks for user input and created eith constructor, and returns new product
        Scanner input = new Scanner(System.in);
        System.out.println("Which Mug: 1 - Yellow | 2 - Red | 3 - Green | 4 - Blue");
        int choice = input.nextInt();
        /** This switch statement decides which type of shirt is chosen **/
        switch (choice){
            case 1:
                Shirt shirt1 = new Shirt(Color.YELLOW, 6.25, 15.00 );
                shirtChoice = shirt1;
                break;
            case 2:
                Shirt shirt2 = new Shirt(Color.RED, 6.25, 15.00 );
                shirtChoice = shirt2;
                break;
            case 3:
                Shirt shirt3 = new Shirt(Color.GREEN, 6.25, 15.00 );
                shirtChoice = shirt3;
                break;
            case 4:
                Shirt shirt4 = new Shirt(Color.BLUE, 6.25, 15.00 );
                shirtChoice = shirt4;
                break;
        }
        return shirtChoice;
    }


    /**
     * This method returns price.
     * @return It returns the price of the shirt.
     */
    @Override
    public double getRetailPrice() {
        return price;
    }


    /**
     * This method returns color.
     * @return It returns the color of the shirt.
     */
    public Color getColor(){
        return color;
    }

    /**
     * This method returns toString.
     * @return It returns the toString of the shirt.
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
