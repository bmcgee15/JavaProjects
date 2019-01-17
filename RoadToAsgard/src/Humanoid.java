public class Humanoid {

    private String name;
    private int strength;
    private int dexterity;
    private int armor;
    private int moxie;
    private int coins;
    private int health;
    private String livingStatus;
    private int attack;

    public Humanoid(String name, int strength, int dexterity, int armor, int moxie, int coins, int health){
        this.strength = strength;
        this.dexterity = dexterity;
        this.armor = armor;
        this.moxie = moxie;
        this.coins = coins;
        this.health = health;
        this.name = name;
    }

    public Humanoid(String name){
        this.name = name;
        this.strength = (int) (Math.random() * 20);
        this.dexterity = (int) (Math.random() * 20);
        this.armor = (int) (Math.random() * 20);
        this.moxie = (int) (Math.random() * 20);
        this.coins = (int) (Math.random() * 40);
        this.health = (int) (Math.random() * 40);
    }

    public String getLivingStatus() {
        if (health <= 0){
            livingStatus = "Dead";
        }else {
            livingStatus = "Alive";
        }
        return livingStatus;
    }

    public String getName(){
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getArmor() {
        return armor;
    }

    public int getAttack() {
        return attack;
    }

    public int getMoxie() {
        return moxie;
    }

    public int getCoins() {
        return coins;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int attack){
        if (attack == 0){
            this.health = health * 2;
        }else{
            health -= attack;
            if (health <= 0){
                health = 0;
            }
            else {
                health = health;
            }
        }
    }

    public void setCoins(int steal, String type) {
        if (type.equals("hobbit")){
            this.coins = coins;
        }else{
            this.coins -= steal;
        }
    }

    public void Attack(int times){
        this.attack = (int) ((getStrength() + getDexterity() + getHealth()) / 3);
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String toString(){
        return name + " [strength:" + strength + ", dexterity:" + dexterity + ", armor:" + armor + ", moxie:" + moxie + ", coins:" + coins + ", health:" + health + ", LivingStatus:" + getLivingStatus();
    }
}