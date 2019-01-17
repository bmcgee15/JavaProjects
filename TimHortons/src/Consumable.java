/**
 * This interface for
 * the Donut object
 * makes consumables by
 * objects having
 * calorie count and
 * consumption methods.
 * @author Bret McGee
 */

public interface Consumable {

    /**
     * Calorie Count
     */
    public abstract int getCalorieCount();

    /**
     * Consumption Method
     */
    public abstract String getConsumptionMethod();

}
