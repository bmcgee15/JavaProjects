import java.util.Scanner;

/**
 * This class creates
 * a hot drink object.
 * @author Bret McGee
 */

public class HotDrink extends TimsProduct implements Consumable{

    /** Stores the description of the hot drink **/
    private String description;
    /** Stores the calorieCount of the hot drink **/
    private int calorieCount;
    /** Stores the comsumption method of the hot drink **/
    private String ConsumptionMethod = "Drink it";
    /** Stores the cost of the hot drink **/
    private double cost;
    /** Stores the price of the hot drink **/
    private double price;
    /** Stores the choice of the hot drink **/
    private static HotDrink HotDrinkChoice;

    /**
     * Initialize name, cost, calories and price parameters of the hot drink class.
     * @param name takes the value of the hot drinks name.
     * @param cost takes the value of the hot drinks cost.
     * @param price takes the value of the hot drinks price.
     * @param calories takes the value of the hot drinks calories.
     */
    private HotDrink(String name, double cost, double price, int calories){
        this.description = name; // initializes the parameter.
        this.cost = cost; // initializes the parameter.
        this.price = price; // initializes the parameter.
        this.calorieCount = calories; // initializes the parameter.
    }

    /**
     * This method calls on the hot drink constructor to create the object.
     * @return hot drink object
     */
    public static HotDrink create(){
        Scanner input = new Scanner(System.in);
        System.out.println("Which HotDrink: 1 - Hot Chocolate | 2 - Cappuccino | 3 - Coffee | 4 - Tea");
        int choice = input.nextInt();
        /** This switch statement decides which type of hot drink is chosen **/
        switch (choice){
            case 1:
                HotDrink hotDrink1 = new HotDrink("Hot Chocolate", 0.35, 2.20, 260 );
                HotDrinkChoice = hotDrink1;
                break;
            case 2:
                HotDrink hotDrink2 = new HotDrink("Cappuccino", 0.35, 2.20, 300 );
                HotDrinkChoice = hotDrink2;
                break;
            case 3:
                HotDrink hotDrink3 = new HotDrink("Coffee", 0.35, 1.80, 140 );
                HotDrinkChoice = hotDrink3;
                break;
            case 4:
                HotDrink hotDrink4 = new HotDrink("Tea", 0.35, 1.80, 140 );
                HotDrinkChoice = hotDrink4;
                break;
        }
        return HotDrinkChoice;
    }

    /**
     * This method returns description.
     * @return It returns the description of the hot drink.
     */
    public String getDescription(){
        return description;
    }

    /**
     * This method returns price.
     * @return It returns the price of the hot drink.
     */
    @Override
    public double getRetailPrice() {
        return price;
    }

    /**
     * This method returns calorieCount.
     * @return It returns the calorieCount of the hot drink.
     */
    public int getCalorieCount(){
        return calorieCount;
    }

    /**
     * This method returns consumtion method.
     * @return It returns the consumption method of the hot drink.
     */
    public String getConsumptionMethod(){
        return ConsumptionMethod;
    }

    /**
     * This method returns toString.
     * @return It returns the toString of the hot drink.
     */
    @Override
    public String toString() {
        return "HotDrink{" +
                "description='" + description + '\'' +
                ", calorieCount=" + calorieCount +
                ", ConsumptionMethod='" + ConsumptionMethod + '\'' +
                ", cost=" + cost +
                ", price=" + price +
                '}';
    }
}

