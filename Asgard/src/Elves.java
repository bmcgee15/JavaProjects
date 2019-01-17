/**
 * This Class is the child class of Humanoid.
 * It has 2 constructors and the elf specific
 * methods or overrides. Elves can have either
 * a city or forest alliance. Elves have a friend.
 * @author Lovepreet Singh & Bret McGee
 */
public class Elves extends Humanoid{

    /** Stores the alliance of the character **/
    private final String alliance;
    /** Stores the friend of the character **/
    private String friend;

    /**
     * Initialize every parameter of this class.
     * @param strength takes the value for the characters strength.
     * @param dexterity takes the value for the characters dexterity.
     * @param armor takes the value for the characters armor.
     * @param moxie takes the value for the characters moxie.
     * @param coins takes the value for the characters coins.
     * @param health takes the value for the characters health.
     * @param name takes the value for the characters name.
     * @param alliance takes the value for the characters alliance.
     */
    public Elves(String name, int strength, int dexterity, int armor, int moxie, int coins, int health, String alliance){
        super(name, strength, dexterity, armor, moxie, coins, health);
        this.alliance = alliance;
    }

    /**
     * Initialize name parameter.
     * @param name takes the value for the characters name.
     */
    public Elves(String name){
        super(name);
        /** initialize the random value to choose which alliance the character will have **/
        int random = (int) (Math.random() * 10);
        /** character have forest alliance if random is less than or equal to 5 **/
        if (random <= 5){
            this.alliance = "forest";
        }
        /** character have forest alliance if random is greater than 5 **/
        else{
            this.alliance = "city";
        }
    }

    /**
     * This method returns alliance.
     * @return It returns the alliance of the character.
     */
    public String getAlliance() {
        return alliance;
    }

    /**
     * This method returns toString.
     * @return It returns the toString of the character.
     */
    public String toString(){
        /** initializes the random number to choose the characters friend **/
        int random = (int) (Math.random() * 100);
        /** character have frodo as best friend if random is less than or equal to 50 **/
        if (random <= 50){
            friend = "Frodo";
        }
        /** character have forest alliance if random is greater than 50 **/
        else{
            friend = "Bilbo";
        }
        return "Elf: " + super.toString() + ", Alliance:" + alliance + ", Friend:" + friend + " ]";
    }
}