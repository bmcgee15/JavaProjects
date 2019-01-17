/**
 * This class is the parent class to all of the characters,
 * and houses most of the methods used in the game.
 * @author Lovepreet Singh & Bret McGee
 */

public class Humanoid {

    /** Stores the name of the character **/
    private final String name;
    /** Stores the strength amount of the character **/
    private int strength;
    /** Stores the dexterity amount of the character **/
    private int dexterity;
    /** Stores the armor amount of the character **/
    private int armor;
    /** Stores the moxie amount of the character **/
    private int moxie;
    /** Stores the amount of coins the character has **/
    private int coins;
    /** Stores the health amount of the character **/
    private int health;
    /** Stores the living status of the character **/
    private String livingStatus;
    /** Stores the attack amount of the character **/
    private int attack;

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

    public Humanoid(String name, int strength, int dexterity, int armor, int moxie, int coins, int health){
        this.strength = strength; // initializes the parameter.
        this.dexterity = dexterity; // initializes the parameter.
        this.armor = armor; // initializes the parameter.
        this.moxie = moxie; // initializes the parameter.
        this.coins = coins; // initializes the parameter.
        this.health = health; // initializes the parameter.
        this.name = name; // initializes the parameter.
    }

    /**
     * Initialize every parameter of this class.
     * @param name takes the value for the characters name.
     */

    public Humanoid(String name){
        this.name = name; // initializes the parameter.
        this.strength = (int) (Math.random() * 20); // initializes the parameter with a random value between 0 & 20.
        this.dexterity = (int) (Math.random() * 20); // initializes the parameter with a random value between 0 & 20.
        this.armor = (int) (Math.random() * 20); // initializes the parameter with a random value between 0 & 20.
        this.moxie = (int) (Math.random() * 20); // initializes the parameter with a random value between 0 & 20.
        this.coins = (int) (Math.random() * 40); // initializes the parameter with a random value between 0 & 40.
        this.health = (int) (20 + Math.random() * 20);  // initializes the parameter with a random value between 20 & 40.
    }

    /**
     * This method checks if the character is dead or alive.
     * @return It returns the livingStatus of the character.
     */
    public String getLivingStatus() {
        if (health <= 0){
            livingStatus = "Dead";

        }else {
            livingStatus = "Alive";
        }
        return livingStatus; // returns livingStatus.
    }

    /**
     * This method returns name.
     * @return It returns the name of the character.
     */
    public String getName(){
        return name;
    }

    /**
     * This method returns strength.
     * @return It returns the strength of the character.
     */
    public int getStrength() {
        return strength;
    }

    /**
     * This method returns dexterity.
     * @return It returns the dexterity of the character.
     */
    public int getDexterity() {
        return dexterity;
    }

    /**
     * This method returns armor.
     * @return It returns the armor of the character.
     */
    public int getArmor() {
        return armor;
    }

    /**
     * This method returns attack.
     * @return It returns the attack of the character.
     */
    public int getAttack() {
        return attack;
    }

    /**
     * This method returns moxie.
     * @return It returns the moxie of the character.
     */
    public int getMoxie() {
        return moxie;
    }

    /**
     * This method returns coins.
     * @return It returns the coins of the character.
     */
    public int getCoins() {
        return coins;
    }

    /**
     * This method returns health.
     * @return It returns the health of the character.
     */
    public int getHealth() {
        return health;
    }

    /**
     * This method sets characters health.
     * @param attack takes the value for the characters attack.
     * @param magicRating takes the value for the characters magicRating.
     */
    public void setHealth(int attack, int magicRating){
        /** sets health rating **/
        this.health = health  + (int) (magicRating / 2);
        /** sets health rating by subtracting the last players attack **/
        this.health -= attack;

        /** doesn't let health rating go lower than 0 **/
        if (health <= 0){
            health = 0;
        }else {
            health = health;
        }

    }

    /**
     * This method sets characters coins.
     * @param steal takes the value for the characters steal.
     * @param type takes the value for the characters type.
     */
    public void setCoins(int steal, String type) {
        /** checks if player is a hobbit capable of stealing **/
        if (type.equals("hobbit")){
            this.coins += steal;
        /** steals coins from other types **/
        }else{
            this.coins -= steal;
        }
    }

    /**
     * This method sets the attack value based on character times variable.
     * The attack is calculated by the average of strength, dexterity & health.
     * Then multiplied by players times.
     * @param times takes the value for the characters times.
     */
    public void Attack(int times){
        this.attack = (int) (((getStrength() + getDexterity() + getHealth()) / 3) * times);
    }

    /**
     * This method sets the attack value when defended based on character armor.
     * The attack is calculated by the average of strength, dexterity & health.
     * Then divided by players armor.
     */
    public void Defend(){
        attack = (int) ((getStrength() + getDexterity() + getHealth()) / 3) / getArmor();
        if (attack < 1){
            attack = 1;
        }
    }

    /**
     * This method sets characters armor.
     * @param armor takes the value for the characters armor.
     */
    public void setArmor(int armor) {
        this.armor = armor;
    }

    /**
     * This method returns toString.
     * @return It returns the toString of the character.
     */
    public String toString(){
        return name + " [strength:" + strength + ", dexterity:" + dexterity + ", armor:" + armor + ", moxie:" + moxie + ", coins:" + coins + ", health:" + health + ", LivingStatus:" + getLivingStatus();
    }
}