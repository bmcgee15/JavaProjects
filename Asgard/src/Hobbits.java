/**
 * This Class is the child class of Humanoid.
 * It has 2 constructors and the hobbit specific
 * methods or overrides. Hobbits can steal coins.
 * @author Lovepreet Singh & Bret McGee
 */
public class Hobbits extends Humanoid{

    /** Stores the steal of the character **/
    private int steal;

    /**
     * Initialize every parameter of this class.
     * @param strength takes the value for the characters strength.
     * @param dexterity takes the value for the characters dexterity.
     * @param armor takes the value for the characters armor.
     * @param moxie takes the value for the characters moxie.
     * @param coins takes the value for the characters coins.
     * @param health takes the value for the characters health.
     * @param name takes the value for the characters name.
     */
    public Hobbits(String name, int strength, int dexterity, int armor, int moxie, int coins, int health){
        super(name, strength, dexterity, armor, moxie, coins, health);
    }

    /**
     * Initialize name parameter.
     * @param name takes the value for the characters name.
     */
    public Hobbits(String name){
        super(name);
    }

    /**
     * This method returns steal.
     * @return It returns the steal ammount of character.
     */
    public int getSteal() {
        return (int) (getDexterity() / 2);
    }

    /**
     * Initialize steal and type parameters.
     * @param steal takes the value for the characters name.
     * @param type takes the value for the characters name.
     */
    public void setCoins(int steal, String type){
        super.setCoins(steal, type);
    }

    /**
     * This method returns toString.
     * @return It returns the toString of character.
     */
    public String toString(){
        return "Hobbit: " + super.toString() +  " ]";
    }
}
