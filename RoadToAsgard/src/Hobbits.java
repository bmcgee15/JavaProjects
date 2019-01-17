public class Hobbits extends Humanoid{
    private int steal;

    public Hobbits(String name, int strength, int dexterity, int armor, int moxie, int coins, int health){
        super(name, strength, dexterity, armor, moxie, coins, health);
    }

    public Hobbits(String name){
        super(name);
    }

    public int getSteal() {
        return (int) getDexterity() / 2;
    }

    public void setCoins(int steal, String type){
        super.setCoins(steal, "hobbit");
    }

    public String toString(){
        return "Hobbit: " + super.toString() +  " ]";
    }
}
