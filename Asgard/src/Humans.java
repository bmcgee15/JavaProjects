/**
 * This Class is the child class of Humanoid.
 * It has 2 constructors and the human specific
 * methods or overrides. Humans can be either
 * a wizard or a fighter. Humans have an enemy.
 * @author Lovepreet Singh & Bret McGee
 */
public class Humans extends Humanoid {
    /** Stores the kind of the character **/
    private String kind;
    /** Stores the magicRating of the character **/
    private int magicRating;
    /** Stores the enemy of the character **/
    private final String enemy;

    /**
     * Initialize every parameter of this class.
     * @param strength takes the value for the characters strength.
     * @param dexterity takes the value for the characters dexterity.
     * @param armor takes the value for the characters armor.
     * @param moxie takes the value for the characters moxie.
     * @param coins takes the value for the characters coins.
     * @param health takes the value for the characters health.
     * @param name takes the value for the characters name.
     * @param magicRating takes the value for the characters magicRating.
     * @param kind takes the value for the characters kind.
     */
    public Humans(String name, int strength, int dexterity, int armor, int moxie, int coins, int health, String kind, int magicRating){
        super(name, strength, dexterity, armor, moxie, coins, health );
        this.kind = kind; // initializes parameter
        enemy = "Legolas";
        /** sets characters magic to 0 if fighter and to the value in magicRating if wizard **/
        if (kind.equals("Fighter")){
            this.magicRating = 0;
        }else {
            this.magicRating = magicRating;

        }
    }

    /**
     * Initialize name parameter of this class.
     * @param name takes the value for the characters name.
     */
    public Humans(String name){
        super(name); // get name from parent class
        /** initialize random variable to pick human type **/
        int random = (int) (Math.random() * 10);
        enemy = "Arwen"; // initialize parameter
        /** chooses Fighter if random is less than or equal to 5 **/
        if (random <= 5){
            this.kind = "Fighter";
            magicRating = 0;
        }
        /** chooses Wizard if random is greater than 5 **/
        else{
            this.kind = "Wizard";
            magicRating = (int) (Math.random() * 20);
        }
    }

    /**
     * This method returns kind.
     * @return It returns the kind of character.
     */
    public String getKind() {
        return kind;
    }

    /**
     * This method sets characters attack.
     * @param times takes the value for the characters times.
     */
    public void Attack(int times){
        /** if character is a fighter, attack times is 2 **/
        if (kind.equals("Fighter")) {
            super.Attack(2);
        }
        /** if character is not a fighter, attack times is times **/
        else {
            super.Attack(times);
        }
    }

    /**
     * This method returns magicRating.
     * @return It returns the magicRating of the character.
     */
    public int getMagicRating() {
        return magicRating;
    }

    /**
     * This method sets characters magicRating decrease.
     * @param decrease takes the value for the characters magicRating decrease.
     */
    public void setMagicRating(int decrease) {
        this.magicRating = magicRating - decrease;
    }

    /**
     * This method sets characters magicRating.
     * @param magicRating takes the value for the characters magicRating.
     */
    public void setHealth(int ll, int magicRating){
        /** if character is a fighter, magic rating = 0 **/
        if (kind.equals("Fighter")){
            super.setHealth(ll, 0);
        }
        else{
            super.setHealth(ll, magicRating);
            setMagicRating(3);
        }
    }
    /**
     * This method returns toString.
     * @return It returns the toString of the character.
     */
    @Override
    public String toString() {
        if (kind.equals("Wizard")){
            return "Human: " + super.toString() + ", Kind:" + kind + ", MagicRating:" + magicRating +  ", Enemy:" + enemy + " ]";
        }else{
            return "Human: " + super.toString() + ", Kind:" + kind + ", Enemy:" + enemy + " ]";
        }
    }
}
