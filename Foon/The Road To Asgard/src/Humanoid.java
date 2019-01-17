public class Humanoid {

    private String name;
    private String attributes;
    private String toString;
    private String charType;
    private String special;
    private String healthStr;
    private String strengthStr;
    private String dexterityStr;
    private String armorStr;
    private String coinsStr;
    private double strength;
    private double dexterity;
    private double armor;
    private double moxie;
    private double health;
    private double attack;
    private double defend;
    private String livingStatus = "Alive";
    private int coins;
    private int steal;
    public static int damage = 0;

    public Humanoid() {

    }

    public void createChar() {
        strength = 5 + (int)(Math.random() * 15);
        dexterity = 5 + (int)(Math.random() * 15);
        armor = 5 + (int)(Math.random() * 15);
        moxie = 5 + (int)(Math.random() * 15);
        health = 5 + (int)(Math.random() * 15);
        coins = 5 + (int)(Math.random() * 15);

    }

    public void setName(String name){
        this.name = name;
    }

    public void setCharType(String charType){
        this.charType = charType;
    }

    public String getCharType(){
        return charType;
    }

    public void setSpecial(String special){
        this.special = special;
    }

    public double getRealHealth(){
        return health;
    }

    public String getName() {
        return name;
    }

    public String getLivingStatus(){
        if (health < 1){
            livingStatus = "Dead";
        }
        return livingStatus;
    }

    public String getHealthStr(){
        if (health < 1){
            healthStr = "0.0";
        }else{
            healthStr = (int)health + ".0";
        }
        return healthStr;
    }

    public double getHealth(){
        health = (int)(health - damage);
        return health;
    }

    public String getDexterityStr(){
        dexterityStr = "" + dexterity;
        return dexterityStr;
    }

    public String getArmorStr(){
        armorStr = "" + armor;
        return armorStr;
    }

    public String getStrengthStr(){
        strengthStr = "" + strength;
        return strengthStr;
    }

    public String getCoinsStr(){
        coinsStr = "" + coins;
        return coinsStr;
    }

    public String getAttributes() {
        attributes = "Strength: " + strength + " | Dexterity: " + dexterity + " | Armor: " + armor + " | Moxie: " + moxie;
        return attributes;
    }

    public double attack() {
        attack = (strength + dexterity + health) / 3;
        damage = (int)attack;
        return attack;
    }

    public static int getDamage(){
        return damage;
    }



    public double defend(double attack) {
        this.attack = attack;
        defend = attack / armor;
        if (defend < 1) {
            defend = 1;
        }
        return defend;
    }

    public int steal() {
        steal = (int) dexterity / 2;
        return steal;
    }

    public String toString() {
        toString = "| Type: " + charType + " | Special: " + special + " | Name: " + name + " | Living Status: " + livingStatus + " |\n| Health: " + health + "| Strength: " + strength + " | Dexterity: " + dexterity + " | Armor " + armor + " | Coins: " + coins + " |  ";
        return toString;
    }

}
