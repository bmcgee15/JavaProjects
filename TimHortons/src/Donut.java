import java.util.Scanner;

/**
 * This class creates
 * a Donut object.
 * @author Bret McGee
 */

public class Donut extends TimsProduct implements Consumable{

    /** Stores the description of the donut **/
    private String description;
    /** Stores the calorieCount of the donut **/
    private int calorieCount;
    /** Stores the comsumption method of the donut **/
    private String ConsumptionMethod = "Eat it";
    /** Stores the cost of the donut **/
    private double cost;
    /** Stores the price of the donut **/
    private double price;
    /** Stores the choice of the donut **/
    private static Donut donutChoice;

    /**
     * Initialize name, cost, calories and price parameters of the Donut class.
     * @param name takes the value of the donuts name.
     * @param cost takes the value of the donuts cost.
     * @param price takes the value of the donuts price.
     * @param calories takes the value of the donuts calories.
     */
    private Donut(String name, double cost, double price, int calories){
        this.description = name; // initializes the parameter.
        this.cost = cost; // initializes the parameter.
        this.price = price; // initializes the parameter.
        this.calorieCount = calories; // initializes the parameter.
    }

    /**
     * This method calls on the donut constructor to create the object.
     * @return donut object
     */
    public static Donut create(){
        Scanner input = new Scanner(System.in);
        System.out.println("Which Donut: 1 - Chocolate Dip | 2 - Honey Dip | 3 - Boston Cream | 4 - Birthday Cake");
        int choice = input.nextInt();
        /** This switch statement decides which type of donut is chosen **/
        switch (choice){
            case 1:
                Donut donut1 = new Donut("Chocolate Dip", 0.35, 0.80, 215 );
                donutChoice = donut1;
                break;
            case 2:
                Donut donut2 = new Donut("Honey Dip", 0.35, 0.80, 245 );
                donutChoice = donut2;
                break;
            case 3:
                Donut donut3 = new Donut("Boston Cream", 0.35, 0.80, 290 );
                donutChoice = donut3;
                break;
            case 4:
                Donut donut4 = new Donut("Birthday Cake", 0.35, 0.80, 270 );
                donutChoice = donut4;
                break;
        }
        return donutChoice;
    }


    /**
     * This method returns price.
     * @return It returns the price of the donut.
     */
    @Override
    public double getRetailPrice() {
        return price;
    }

    /**
     * This method returns description.
     * @return It returns the description of the donut.
     */
    public String getDescription(){
        return description;
    }

    /**
     * This method returns calorieCount.
     * @return It returns the calorieCount of the donut.
     */
    public int getCalorieCount(){
        return calorieCount;
    }

    /**
     * This method returns consumption method.
     * @return It returns the consumption method of the donut.
     */
    public String getConsumptionMethod(){
        return ConsumptionMethod;
    }

    /**
     * This method returns toString.
     * @return It returns the toString of the Donut.
     */
    @Override
    public String toString() {
        return "Donut{" +
                "description='" + description + '\'' +
                ", calorieCount=" + calorieCount +
                ", ConsumptionMethod='" + ConsumptionMethod + '\'' +
                ", cost=" + cost +
                ", price=" + price +
                '}';
    }
}
