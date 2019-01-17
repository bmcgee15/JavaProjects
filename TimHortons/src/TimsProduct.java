/**
 * This class creates
 * the TimsProduct
 * objects.
 * @author Bret McGee
 */

public abstract class TimsProduct implements Commodity{

    /** Stores the name of the TimsProduct **/
    private String name;
    /** Stores the cost of the TimsProduct **/
    private double cost;
    /** Stores the price of the TimsProduct **/
    private double price;

    /**
     * Initialize name, cost, and price parameters of the TimsProduct class.
     * @param cost takes the value for the products cost.
     * @param price takes the value for the products price.
     * @param name takes the value for the products name.
     */
    public TimsProduct(String name, double cost, double price){

    }

    /**
     * Initialize name, cost, and price parameters of the TimsProduct class.
     * Default Constructor
     */
    public TimsProduct(){
        System.out.println();
    }

    /**
     * This method returns name.
     * @return It returns the name of the product.
     */
    public String getName(){
        return name;
    }

    /**
     * This method returns cost.
     * @return It returns the production cost of the product.
     */
    public double getProductionCost(){
        return cost;
    }

    /**
     * This method returns price.
     * @return It returns the retail price of the product.
     */
    public double getRetailPrice(){

        return price;
    }
}
