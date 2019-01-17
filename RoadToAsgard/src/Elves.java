public class Elves extends Humanoid{
    private String alliance;

    public Elves(String name, int strength, int dexterity, int armor, int moxie, int coins, int health, String alliance){
        super(name, strength, dexterity, armor, moxie, coins, health);
        this.alliance = alliance;
    }

    public Elves(String name){
        super(name);
        int random = (int) (Math.random() * 10);
        if (random <= 5){
            this.alliance = "forest";
        }
        else{
            this.alliance = "city";
        }
    }

    public String getAlliance() {
        return alliance;
    }

    public String toString(){
        return "Elf: " + super.toString() + ", Alliance:" + alliance + " ]";
    }
}
